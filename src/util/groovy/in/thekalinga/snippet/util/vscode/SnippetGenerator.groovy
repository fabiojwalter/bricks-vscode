package in.thekalinga.snippet.util.vscode

import com.fasterxml.jackson.databind.ObjectMapper
import in.thekalinga.snippet.util.Icons
import org.apache.commons.io.IOUtils
import org.springframework.core.io.support.PathMatchingResourcePatternResolver

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT
import static java.nio.charset.Charset.defaultCharset

class SnippetGenerator {

    public static final DEFAULT_PREFIX = "bx"
    public static final FONT_AWESOME_PREFIX = "fa"
    public static final MATERIAL_ICONS_PREFIX = "mi"
    public static final MATERIAL_ICONS_COMMUNITY_PREFIX = "mc"

    static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper()
        Map<String, Snippet> descriptionToSnippet = new LinkedHashMap<>()

        def templateStr
        def triggerPattern
        def helpMsg

        // Bricks
        PathMatchingResourcePatternResolver resourceLoader = new PathMatchingResourcePatternResolver();
        def snippetResources = Arrays.asList(resourceLoader.getResources("/bricks/**/*.jsx"))
        snippetResources.forEach({ snippetResource ->
            StringWriter writer = new StringWriter()
            IOUtils.copy(snippetResource.getInputStream(), writer, defaultCharset())
            def contentUntouched = writer.toString()

            def fileParent = new File(snippetResource.file.parent).name
            def fileBaseName = snippetResource.file.name.take(snippetResource.getFile().name.lastIndexOf('.'))

            templateStr = contentUntouched

            triggerPattern = fileBaseName != "\$" ? "$DEFAULT_PREFIX-${fileParent}-${fileBaseName}" : "${DEFAULT_PREFIX}-\$"
            templateStr = templateStr.contains("\$END\$") ? templateStr.trim().replaceAll("\\\$END\\\$", '\\\$0') : "${templateStr.trim()}\$0"
            helpMsg = fileBaseName != '$' ? "${fileParent} ${fileBaseName}".replace(/-/, ' ') : 'Bricks master template'

            def snippet = Snippet.builder().prefix(triggerPattern).body(templateStr).description(helpMsg).scope('').build()
            descriptionToSnippet.put(helpMsg, snippet)
        })

        // Font awesome
        def iconsContainer = mapper.readValue(getClass().getResourceAsStream('/font-awesome.json'), Icons.class)
        iconsContainer.icons.forEach({ iconStr ->
            putSnippet(descriptionToSnippet, "$FONT_AWESOME_PREFIX-${iconStr}", iconStr, iconStr)
        })

        // Material Icons
        def materialIcons = mapper.readValue(getClass().getResourceAsStream('/material-icons.json'), Icons.class)
        materialIcons.icons.forEach({ iconStr ->
            putSnippet(descriptionToSnippet, "$MATERIAL_ICONS_PREFIX-${iconStr}", iconStr, iconStr)
        })

        // Material Design Cummunity Icons
        def materialCommunity = mapper.readValue(getClass().getResourceAsStream('/material-icons-community.json'), Icons.class)
        materialCommunity.icons.forEach({ iconStr ->
            putSnippet(descriptionToSnippet, "$MATERIAL_ICONS_COMMUNITY_PREFIX-${iconStr}", iconStr, iconStr)
        })

        mapper = new ObjectMapper()
        mapper.enable(INDENT_OUTPUT)
        File file = new File("snippets.json")

        mapper.writeValue(file, descriptionToSnippet)
        println "Regenerated snippets. Saved to ${file.absolutePath}"
    }

    static void putSnippet(Map<String, Snippet> descriptionToSnippetTarget, String triggerPattern, String templateStr, String helpMsg) {
        descriptionToSnippetTarget.put(helpMsg, Snippet.builder().prefix(triggerPattern).body(templateStr).description(helpMsg).scope('').build())
    }
}
