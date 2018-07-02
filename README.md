Bricks snippets for Visual studio code
===========================

Visual Studio Code snippet plugin containing Bricks Components, Font Awesome Icons, Material Icons, Material Design Icons Community

![Plugin in action](images/bricks-vscode.gif)


## Setup (in 2 easy steps)

1. Install plugin
  1. Press `F1`, paste `ext install bricks-vscode` & then press `enter` (or)
  2. Goto extensions by pressing `Ctrl-Shift-X` (Windows/Linux) or `Cmd-Shift-X` (Mac) & Search for `Bricks Components snippets`, click on install
2. Reload your editor
3. **You are good to go...**

## Usage

To use the bootstrap snippets, open a HTML file, and start typing `bx-`, followed by pressing `Ctrl+Space`. A list of bootstrap snippets will show up

To use font awesome snippets, open a source file, and start typing `fa-`, the editor will show you all the snippets

To use Material Icons snippets, source file, and start typing `mi-`, the editor will show you all the snippets

To use Material Design Community Icons snippets, open source file, and start typing `mc-`, the editor will show you all the snippets

To use Material Design color codes, open source file, and start typing `mp-`, the editor will show you all the snippets

The detailed list of supported actions are listed below under documentation section

## Contribution guidelines

1. Clone this repo
2. To modify bootstrap snippets, you can find the templates for each snippet under `src/util/resources/bootstrap`. These Html snippets must follow [sublime text snippet](http://docs.sublimetext.info/en/latest/extensibility/snippets.html) format. There is no need to update `snippets.json` manually. The build will take care of regenerating this file from template files.
3. If you need to change `README.md` (or) `package.json`, you should modify their templates (which are used to generate the root level files) under `src/util/resources`. For eg., If you want `package.json` at the root to be modified, you should change `package-template.json` under `src/util/resources`. These root level `package.json` & `README.md` are regenerated for every build from their corresponding templates.
4. To modify font awesome snippets, you would need to modify `font-awesome.json` under `src/util/resources`
5. Send me a pull request

## Changelog
See [here](CHANGELOG.md)

## Documentation

### Font awesome

|Trigger|Icon
|---|---
|500px|<i class="fa fa-500px"/>
|adjust|<i class="fa fa-adjust"/>
|adn|<i class="fa fa-adn"/>
|align-center|<i class="fa fa-align-center"/>
|align-justify|<i class="fa fa-align-justify"/>
|align-left|<i class="fa fa-align-left"/>
|align-right|<i class="fa fa-align-right"/>
|amazon|<i class="fa fa-amazon"/>
|ambulance|<i class="fa fa-ambulance"/>
|anchor|<i class="fa fa-anchor"/>
|android|<i class="fa fa-android"/>
|angellist|<i class="fa fa-angellist"/>
|angle-double-down|<i class="fa fa-angle-double-down"/>
|angle-double-left|<i class="fa fa-angle-double-left"/>
|angle-double-right|<i class="fa fa-angle-double-right"/>
|angle-double-up|<i class="fa fa-angle-double-up"/>
|angle-down|<i class="fa fa-angle-down"/>
|angle-left|<i class="fa fa-angle-left"/>
|angle-right|<i class="fa fa-angle-right"/>
|angle-up|<i class="fa fa-angle-up"/>
|apple|<i class="fa fa-apple"/>
|archive|<i class="fa fa-archive"/>
|area-chart|<i class="fa fa-area-chart"/>
|arrow-circle-down|<i class="fa fa-arrow-circle-down"/>
|arrow-circle-left|<i class="fa fa-arrow-circle-left"/>
|arrow-circle-o-down|<i class="fa fa-arrow-circle-o-down"/>
|arrow-circle-o-left|<i class="fa fa-arrow-circle-o-left"/>
|arrow-circle-o-right|<i class="fa fa-arrow-circle-o-right"/>
|arrow-circle-o-up|<i class="fa fa-arrow-circle-o-up"/>
|arrow-circle-right|<i class="fa fa-arrow-circle-right"/>
|arrow-circle-up|<i class="fa fa-arrow-circle-up"/>
|arrow-down|<i class="fa fa-arrow-down"/>
|arrow-left|<i class="fa fa-arrow-left"/>
|arrow-right|<i class="fa fa-arrow-right"/>
|arrow-up|<i class="fa fa-arrow-up"/>
|arrows|<i class="fa fa-arrows"/>
|arrows-alt|<i class="fa fa-arrows-alt"/>
|arrows-h|<i class="fa fa-arrows-h"/>
|arrows-v|<i class="fa fa-arrows-v"/>
|asterisk|<i class="fa fa-asterisk"/>
|at|<i class="fa fa-at"/>
|backward|<i class="fa fa-backward"/>
|balance-scale|<i class="fa fa-balance-scale"/>
|ban|<i class="fa fa-ban"/>
|bar-chart|<i class="fa fa-bar-chart"/>
|barcode|<i class="fa fa-barcode"/>
|bars|<i class="fa fa-bars"/>
|battery-empty|<i class="fa fa-battery-empty"/>
|battery-full|<i class="fa fa-battery-full"/>
|battery-half|<i class="fa fa-battery-half"/>
|battery-quarter|<i class="fa fa-battery-quarter"/>
|battery-three-quarters|<i class="fa fa-battery-three-quarters"/>
|bed|<i class="fa fa-bed"/>
|beer|<i class="fa fa-beer"/>
|behance|<i class="fa fa-behance"/>
|behance-square|<i class="fa fa-behance-square"/>
|bell|<i class="fa fa-bell"/>
|bell-o|<i class="fa fa-bell-o"/>
|bell-slash|<i class="fa fa-bell-slash"/>
|bell-slash-o|<i class="fa fa-bell-slash-o"/>
|bicycle|<i class="fa fa-bicycle"/>
|binoculars|<i class="fa fa-binoculars"/>
|birthday-cake|<i class="fa fa-birthday-cake"/>
|bitbucket|<i class="fa fa-bitbucket"/>
|bitbucket-square|<i class="fa fa-bitbucket-square"/>
|black-tie|<i class="fa fa-black-tie"/>
|bold|<i class="fa fa-bold"/>
|bolt|<i class="fa fa-bolt"/>
|bomb|<i class="fa fa-bomb"/>
|book|<i class="fa fa-book"/>
|bookmark|<i class="fa fa-bookmark"/>
|bookmark-o|<i class="fa fa-bookmark-o"/>
|briefcase|<i class="fa fa-briefcase"/>
|btc|<i class="fa fa-btc"/>
|bug|<i class="fa fa-bug"/>
|building|<i class="fa fa-building"/>
|building-o|<i class="fa fa-building-o"/>
|bullhorn|<i class="fa fa-bullhorn"/>
|bullseye|<i class="fa fa-bullseye"/>
|bus|<i class="fa fa-bus"/>
|buysellads|<i class="fa fa-buysellads"/>
|calculator|<i class="fa fa-calculator"/>
|calendar|<i class="fa fa-calendar"/>
|calendar-check-o|<i class="fa fa-calendar-check-o"/>
|calendar-minus-o|<i class="fa fa-calendar-minus-o"/>
|calendar-o|<i class="fa fa-calendar-o"/>
|calendar-plus-o|<i class="fa fa-calendar-plus-o"/>
|calendar-times-o|<i class="fa fa-calendar-times-o"/>
|camera|<i class="fa fa-camera"/>
|camera-retro|<i class="fa fa-camera-retro"/>
|car|<i class="fa fa-car"/>
|caret-down|<i class="fa fa-caret-down"/>
|caret-left|<i class="fa fa-caret-left"/>
|caret-right|<i class="fa fa-caret-right"/>
|caret-square-o-down|<i class="fa fa-caret-square-o-down"/>
|caret-square-o-left|<i class="fa fa-caret-square-o-left"/>
|caret-square-o-right|<i class="fa fa-caret-square-o-right"/>
|caret-square-o-up|<i class="fa fa-caret-square-o-up"/>
|caret-up|<i class="fa fa-caret-up"/>
|cart-arrow-down|<i class="fa fa-cart-arrow-down"/>
|cart-plus|<i class="fa fa-cart-plus"/>
|cc|<i class="fa fa-cc"/>
|cc-amex|<i class="fa fa-cc-amex"/>
|cc-diners-club|<i class="fa fa-cc-diners-club"/>
|cc-discover|<i class="fa fa-cc-discover"/>
|cc-jcb|<i class="fa fa-cc-jcb"/>
|cc-mastercard|<i class="fa fa-cc-mastercard"/>
|cc-paypal|<i class="fa fa-cc-paypal"/>
|cc-stripe|<i class="fa fa-cc-stripe"/>
|cc-visa|<i class="fa fa-cc-visa"/>
|certificate|<i class="fa fa-certificate"/>
|chain-broken|<i class="fa fa-chain-broken"/>
|check|<i class="fa fa-check"/>
|check-circle|<i class="fa fa-check-circle"/>
|check-circle-o|<i class="fa fa-check-circle-o"/>
|check-square|<i class="fa fa-check-square"/>
|check-square-o|<i class="fa fa-check-square-o"/>
|chevron-circle-down|<i class="fa fa-chevron-circle-down"/>
|chevron-circle-left|<i class="fa fa-chevron-circle-left"/>
|chevron-circle-right|<i class="fa fa-chevron-circle-right"/>
|chevron-circle-up|<i class="fa fa-chevron-circle-up"/>
|chevron-down|<i class="fa fa-chevron-down"/>
|chevron-left|<i class="fa fa-chevron-left"/>
|chevron-right|<i class="fa fa-chevron-right"/>
|chevron-up|<i class="fa fa-chevron-up"/>
|child|<i class="fa fa-child"/>
|chrome|<i class="fa fa-chrome"/>
|circle|<i class="fa fa-circle"/>
|circle-o|<i class="fa fa-circle-o"/>
|circle-o-notch|<i class="fa fa-circle-o-notch"/>
|circle-thin|<i class="fa fa-circle-thin"/>
|clipboard|<i class="fa fa-clipboard"/>
|clock-o|<i class="fa fa-clock-o"/>
|clone|<i class="fa fa-clone"/>
|cloud|<i class="fa fa-cloud"/>
|cloud-download|<i class="fa fa-cloud-download"/>
|cloud-upload|<i class="fa fa-cloud-upload"/>
|code|<i class="fa fa-code"/>
|code-fork|<i class="fa fa-code-fork"/>
|codepen|<i class="fa fa-codepen"/>
|coffee|<i class="fa fa-coffee"/>
|cog|<i class="fa fa-cog"/>
|cogs|<i class="fa fa-cogs"/>
|columns|<i class="fa fa-columns"/>
|comment|<i class="fa fa-comment"/>
|comment-o|<i class="fa fa-comment-o"/>
|commenting|<i class="fa fa-commenting"/>
|commenting-o|<i class="fa fa-commenting-o"/>
|comments|<i class="fa fa-comments"/>
|comments-o|<i class="fa fa-comments-o"/>
|compass|<i class="fa fa-compass"/>
|compress|<i class="fa fa-compress"/>
|connectdevelop|<i class="fa fa-connectdevelop"/>
|contao|<i class="fa fa-contao"/>
|copyright|<i class="fa fa-copyright"/>
|creative-commons|<i class="fa fa-creative-commons"/>
|credit-card|<i class="fa fa-credit-card"/>
|crop|<i class="fa fa-crop"/>
|crosshairs|<i class="fa fa-crosshairs"/>
|css3|<i class="fa fa-css3"/>
|cube|<i class="fa fa-cube"/>
|cubes|<i class="fa fa-cubes"/>
|cutlery|<i class="fa fa-cutlery"/>
|dashcube|<i class="fa fa-dashcube"/>
|database|<i class="fa fa-database"/>
|delicious|<i class="fa fa-delicious"/>
|desktop|<i class="fa fa-desktop"/>
|deviantart|<i class="fa fa-deviantart"/>
|diamond|<i class="fa fa-diamond"/>
|digg|<i class="fa fa-digg"/>
|dot-circle-o|<i class="fa fa-dot-circle-o"/>
|download|<i class="fa fa-download"/>
|dribbble|<i class="fa fa-dribbble"/>
|dropbox|<i class="fa fa-dropbox"/>
|drupal|<i class="fa fa-drupal"/>
|eject|<i class="fa fa-eject"/>
|ellipsis-h|<i class="fa fa-ellipsis-h"/>
|ellipsis-v|<i class="fa fa-ellipsis-v"/>
|empire|<i class="fa fa-empire"/>
|envelope|<i class="fa fa-envelope"/>
|envelope-o|<i class="fa fa-envelope-o"/>
|envelope-square|<i class="fa fa-envelope-square"/>
|eraser|<i class="fa fa-eraser"/>
|eur|<i class="fa fa-eur"/>
|exchange|<i class="fa fa-exchange"/>
|exclamation|<i class="fa fa-exclamation"/>
|exclamation-circle|<i class="fa fa-exclamation-circle"/>
|exclamation-triangle|<i class="fa fa-exclamation-triangle"/>
|expand|<i class="fa fa-expand"/>
|expeditedssl|<i class="fa fa-expeditedssl"/>
|external-link|<i class="fa fa-external-link"/>
|external-link-square|<i class="fa fa-external-link-square"/>
|eye|<i class="fa fa-eye"/>
|eye-slash|<i class="fa fa-eye-slash"/>
|eyedropper|<i class="fa fa-eyedropper"/>
|facebook|<i class="fa fa-facebook"/>
|facebook-official|<i class="fa fa-facebook-official"/>
|facebook-square|<i class="fa fa-facebook-square"/>
|fast-backward|<i class="fa fa-fast-backward"/>
|fast-forward|<i class="fa fa-fast-forward"/>
|fax|<i class="fa fa-fax"/>
|female|<i class="fa fa-female"/>
|fighter-jet|<i class="fa fa-fighter-jet"/>
|file|<i class="fa fa-file"/>
|file-archive-o|<i class="fa fa-file-archive-o"/>
|file-audio-o|<i class="fa fa-file-audio-o"/>
|file-code-o|<i class="fa fa-file-code-o"/>
|file-excel-o|<i class="fa fa-file-excel-o"/>
|file-image-o|<i class="fa fa-file-image-o"/>
|file-o|<i class="fa fa-file-o"/>
|file-pdf-o|<i class="fa fa-file-pdf-o"/>
|file-powerpoint-o|<i class="fa fa-file-powerpoint-o"/>
|file-text|<i class="fa fa-file-text"/>
|file-text-o|<i class="fa fa-file-text-o"/>
|file-video-o|<i class="fa fa-file-video-o"/>
|file-word-o|<i class="fa fa-file-word-o"/>
|files-o|<i class="fa fa-files-o"/>
|film|<i class="fa fa-film"/>
|filter|<i class="fa fa-filter"/>
|fire|<i class="fa fa-fire"/>
|fire-extinguisher|<i class="fa fa-fire-extinguisher"/>
|firefox|<i class="fa fa-firefox"/>
|flag|<i class="fa fa-flag"/>
|flag-checkered|<i class="fa fa-flag-checkered"/>
|flag-o|<i class="fa fa-flag-o"/>
|flask|<i class="fa fa-flask"/>
|flickr|<i class="fa fa-flickr"/>
|floppy-o|<i class="fa fa-floppy-o"/>
|folder|<i class="fa fa-folder"/>
|folder-o|<i class="fa fa-folder-o"/>
|folder-open|<i class="fa fa-folder-open"/>
|folder-open-o|<i class="fa fa-folder-open-o"/>
|font|<i class="fa fa-font"/>
|fonticons|<i class="fa fa-fonticons"/>
|forumbee|<i class="fa fa-forumbee"/>
|forward|<i class="fa fa-forward"/>
|foursquare|<i class="fa fa-foursquare"/>
|frown-o|<i class="fa fa-frown-o"/>
|futbol-o|<i class="fa fa-futbol-o"/>
|gamepad|<i class="fa fa-gamepad"/>
|gavel|<i class="fa fa-gavel"/>
|gbp|<i class="fa fa-gbp"/>
|genderless|<i class="fa fa-genderless"/>
|get-pocket|<i class="fa fa-get-pocket"/>
|gg|<i class="fa fa-gg"/>
|gg-circle|<i class="fa fa-gg-circle"/>
|gift|<i class="fa fa-gift"/>
|git|<i class="fa fa-git"/>
|git-square|<i class="fa fa-git-square"/>
|github|<i class="fa fa-github"/>
|github-alt|<i class="fa fa-github-alt"/>
|github-square|<i class="fa fa-github-square"/>
|globe|<i class="fa fa-globe"/>
|google|<i class="fa fa-google"/>
|google-plus|<i class="fa fa-google-plus"/>
|google-plus-square|<i class="fa fa-google-plus-square"/>
|google-wallet|<i class="fa fa-google-wallet"/>
|graduation-cap|<i class="fa fa-graduation-cap"/>
|gratipay|<i class="fa fa-gratipay"/>
|h-square|<i class="fa fa-h-square"/>
|hacker-news|<i class="fa fa-hacker-news"/>
|hand-lizard-o|<i class="fa fa-hand-lizard-o"/>
|hand-o-down|<i class="fa fa-hand-o-down"/>
|hand-o-left|<i class="fa fa-hand-o-left"/>
|hand-o-right|<i class="fa fa-hand-o-right"/>
|hand-o-up|<i class="fa fa-hand-o-up"/>
|hand-paper-o|<i class="fa fa-hand-paper-o"/>
|hand-peace-o|<i class="fa fa-hand-peace-o"/>
|hand-pointer-o|<i class="fa fa-hand-pointer-o"/>
|hand-rock-o|<i class="fa fa-hand-rock-o"/>
|hand-scissors-o|<i class="fa fa-hand-scissors-o"/>
|hand-spock-o|<i class="fa fa-hand-spock-o"/>
|hdd-o|<i class="fa fa-hdd-o"/>
|header|<i class="fa fa-header"/>
|headphones|<i class="fa fa-headphones"/>
|heart|<i class="fa fa-heart"/>
|heart-o|<i class="fa fa-heart-o"/>
|heartbeat|<i class="fa fa-heartbeat"/>
|history|<i class="fa fa-history"/>
|home|<i class="fa fa-home"/>
|hospital-o|<i class="fa fa-hospital-o"/>
|hourglass|<i class="fa fa-hourglass"/>
|hourglass-end|<i class="fa fa-hourglass-end"/>
|hourglass-half|<i class="fa fa-hourglass-half"/>
|hourglass-o|<i class="fa fa-hourglass-o"/>
|hourglass-start|<i class="fa fa-hourglass-start"/>
|houzz|<i class="fa fa-houzz"/>
|html5|<i class="fa fa-html5"/>
|i-cursor|<i class="fa fa-i-cursor"/>
|ils|<i class="fa fa-ils"/>
|inbox|<i class="fa fa-inbox"/>
|indent|<i class="fa fa-indent"/>
|industry|<i class="fa fa-industry"/>
|info|<i class="fa fa-info"/>
|info-circle|<i class="fa fa-info-circle"/>
|inr|<i class="fa fa-inr"/>
|instagram|<i class="fa fa-instagram"/>
|internet-explorer|<i class="fa fa-internet-explorer"/>
|ioxhost|<i class="fa fa-ioxhost"/>
|italic|<i class="fa fa-italic"/>
|joomla|<i class="fa fa-joomla"/>
|jpy|<i class="fa fa-jpy"/>
|jsfiddle|<i class="fa fa-jsfiddle"/>
|key|<i class="fa fa-key"/>
|keyboard-o|<i class="fa fa-keyboard-o"/>
|krw|<i class="fa fa-krw"/>
|language|<i class="fa fa-language"/>
|laptop|<i class="fa fa-laptop"/>
|lastfm|<i class="fa fa-lastfm"/>
|lastfm-square|<i class="fa fa-lastfm-square"/>
|leaf|<i class="fa fa-leaf"/>
|leanpub|<i class="fa fa-leanpub"/>
|lemon-o|<i class="fa fa-lemon-o"/>
|level-down|<i class="fa fa-level-down"/>
|level-up|<i class="fa fa-level-up"/>
|life-ring|<i class="fa fa-life-ring"/>
|lightbulb-o|<i class="fa fa-lightbulb-o"/>
|line-chart|<i class="fa fa-line-chart"/>
|link|<i class="fa fa-link"/>
|linkedin|<i class="fa fa-linkedin"/>
|linkedin-square|<i class="fa fa-linkedin-square"/>
|linux|<i class="fa fa-linux"/>
|list|<i class="fa fa-list"/>
|list-alt|<i class="fa fa-list-alt"/>
|list-ol|<i class="fa fa-list-ol"/>
|list-ul|<i class="fa fa-list-ul"/>
|location-arrow|<i class="fa fa-location-arrow"/>
|lock|<i class="fa fa-lock"/>
|long-arrow-down|<i class="fa fa-long-arrow-down"/>
|long-arrow-left|<i class="fa fa-long-arrow-left"/>
|long-arrow-right|<i class="fa fa-long-arrow-right"/>
|long-arrow-up|<i class="fa fa-long-arrow-up"/>
|magic|<i class="fa fa-magic"/>
|magnet|<i class="fa fa-magnet"/>
|male|<i class="fa fa-male"/>
|map|<i class="fa fa-map"/>
|map-marker|<i class="fa fa-map-marker"/>
|map-o|<i class="fa fa-map-o"/>
|map-pin|<i class="fa fa-map-pin"/>
|map-signs|<i class="fa fa-map-signs"/>
|mars|<i class="fa fa-mars"/>
|mars-double|<i class="fa fa-mars-double"/>
|mars-stroke|<i class="fa fa-mars-stroke"/>
|mars-stroke-h|<i class="fa fa-mars-stroke-h"/>
|mars-stroke-v|<i class="fa fa-mars-stroke-v"/>
|maxcdn|<i class="fa fa-maxcdn"/>
|meanpath|<i class="fa fa-meanpath"/>
|medium|<i class="fa fa-medium"/>
|medkit|<i class="fa fa-medkit"/>
|meh-o|<i class="fa fa-meh-o"/>
|mercury|<i class="fa fa-mercury"/>
|microphone|<i class="fa fa-microphone"/>
|microphone-slash|<i class="fa fa-microphone-slash"/>
|minus|<i class="fa fa-minus"/>
|minus-circle|<i class="fa fa-minus-circle"/>
|minus-square|<i class="fa fa-minus-square"/>
|minus-square-o|<i class="fa fa-minus-square-o"/>
|mobile|<i class="fa fa-mobile"/>
|money|<i class="fa fa-money"/>
|moon-o|<i class="fa fa-moon-o"/>
|motorcycle|<i class="fa fa-motorcycle"/>
|mouse-pointer|<i class="fa fa-mouse-pointer"/>
|music|<i class="fa fa-music"/>
|neuter|<i class="fa fa-neuter"/>
|newspaper-o|<i class="fa fa-newspaper-o"/>
|object-group|<i class="fa fa-object-group"/>
|object-ungroup|<i class="fa fa-object-ungroup"/>
|odnoklassniki|<i class="fa fa-odnoklassniki"/>
|odnoklassniki-square|<i class="fa fa-odnoklassniki-square"/>
|opencart|<i class="fa fa-opencart"/>
|openid|<i class="fa fa-openid"/>
|opera|<i class="fa fa-opera"/>
|optin-monster|<i class="fa fa-optin-monster"/>
|outdent|<i class="fa fa-outdent"/>
|pagelines|<i class="fa fa-pagelines"/>
|paint-brush|<i class="fa fa-paint-brush"/>
|paper-plane|<i class="fa fa-paper-plane"/>
|paper-plane-o|<i class="fa fa-paper-plane-o"/>
|paperclip|<i class="fa fa-paperclip"/>
|paragraph|<i class="fa fa-paragraph"/>
|pause|<i class="fa fa-pause"/>
|paw|<i class="fa fa-paw"/>
|paypal|<i class="fa fa-paypal"/>
|pencil|<i class="fa fa-pencil"/>
|pencil-square|<i class="fa fa-pencil-square"/>
|pencil-square-o|<i class="fa fa-pencil-square-o"/>
|phone|<i class="fa fa-phone"/>
|phone-square|<i class="fa fa-phone-square"/>
|picture-o|<i class="fa fa-picture-o"/>
|pie-chart|<i class="fa fa-pie-chart"/>
|pied-piper|<i class="fa fa-pied-piper"/>
|pied-piper-alt|<i class="fa fa-pied-piper-alt"/>
|pinterest|<i class="fa fa-pinterest"/>
|pinterest-p|<i class="fa fa-pinterest-p"/>
|pinterest-square|<i class="fa fa-pinterest-square"/>
|plane|<i class="fa fa-plane"/>
|play|<i class="fa fa-play"/>
|play-circle|<i class="fa fa-play-circle"/>
|play-circle-o|<i class="fa fa-play-circle-o"/>
|plug|<i class="fa fa-plug"/>
|plus|<i class="fa fa-plus"/>
|plus-circle|<i class="fa fa-plus-circle"/>
|plus-square|<i class="fa fa-plus-square"/>
|plus-square-o|<i class="fa fa-plus-square-o"/>
|power-off|<i class="fa fa-power-off"/>
|print|<i class="fa fa-print"/>
|puzzle-piece|<i class="fa fa-puzzle-piece"/>
|qq|<i class="fa fa-qq"/>
|qrcode|<i class="fa fa-qrcode"/>
|question|<i class="fa fa-question"/>
|question-circle|<i class="fa fa-question-circle"/>
|quote-left|<i class="fa fa-quote-left"/>
|quote-right|<i class="fa fa-quote-right"/>
|random|<i class="fa fa-random"/>
|rebel|<i class="fa fa-rebel"/>
|recycle|<i class="fa fa-recycle"/>
|reddit|<i class="fa fa-reddit"/>
|reddit-square|<i class="fa fa-reddit-square"/>
|refresh|<i class="fa fa-refresh"/>
|registered|<i class="fa fa-registered"/>
|renren|<i class="fa fa-renren"/>
|repeat|<i class="fa fa-repeat"/>
|reply|<i class="fa fa-reply"/>
|reply-all|<i class="fa fa-reply-all"/>
|retweet|<i class="fa fa-retweet"/>
|road|<i class="fa fa-road"/>
|rocket|<i class="fa fa-rocket"/>
|rss|<i class="fa fa-rss"/>
|rss-square|<i class="fa fa-rss-square"/>
|rub|<i class="fa fa-rub"/>
|safari|<i class="fa fa-safari"/>
|scissors|<i class="fa fa-scissors"/>
|search|<i class="fa fa-search"/>
|search-minus|<i class="fa fa-search-minus"/>
|search-plus|<i class="fa fa-search-plus"/>
|sellsy|<i class="fa fa-sellsy"/>
|server|<i class="fa fa-server"/>
|share|<i class="fa fa-share"/>
|share-alt|<i class="fa fa-share-alt"/>
|share-alt-square|<i class="fa fa-share-alt-square"/>
|share-square|<i class="fa fa-share-square"/>
|share-square-o|<i class="fa fa-share-square-o"/>
|shield|<i class="fa fa-shield"/>
|ship|<i class="fa fa-ship"/>
|shirtsinbulk|<i class="fa fa-shirtsinbulk"/>
|shopping-cart|<i class="fa fa-shopping-cart"/>
|sign-in|<i class="fa fa-sign-in"/>
|sign-out|<i class="fa fa-sign-out"/>
|signal|<i class="fa fa-signal"/>
|simplybuilt|<i class="fa fa-simplybuilt"/>
|sitemap|<i class="fa fa-sitemap"/>
|skyatlas|<i class="fa fa-skyatlas"/>
|skype|<i class="fa fa-skype"/>
|slack|<i class="fa fa-slack"/>
|sliders|<i class="fa fa-sliders"/>
|slideshare|<i class="fa fa-slideshare"/>
|smile-o|<i class="fa fa-smile-o"/>
|sort|<i class="fa fa-sort"/>
|sort-alpha-asc|<i class="fa fa-sort-alpha-asc"/>
|sort-alpha-desc|<i class="fa fa-sort-alpha-desc"/>
|sort-amount-asc|<i class="fa fa-sort-amount-asc"/>
|sort-amount-desc|<i class="fa fa-sort-amount-desc"/>
|sort-asc|<i class="fa fa-sort-asc"/>
|sort-desc|<i class="fa fa-sort-desc"/>
|sort-numeric-asc|<i class="fa fa-sort-numeric-asc"/>
|sort-numeric-desc|<i class="fa fa-sort-numeric-desc"/>
|soundcloud|<i class="fa fa-soundcloud"/>
|space-shuttle|<i class="fa fa-space-shuttle"/>
|spinner|<i class="fa fa-spinner"/>
|spoon|<i class="fa fa-spoon"/>
|spotify|<i class="fa fa-spotify"/>
|square|<i class="fa fa-square"/>
|square-o|<i class="fa fa-square-o"/>
|stack-exchange|<i class="fa fa-stack-exchange"/>
|stack-overflow|<i class="fa fa-stack-overflow"/>
|star|<i class="fa fa-star"/>
|star-half|<i class="fa fa-star-half"/>
|star-half-o|<i class="fa fa-star-half-o"/>
|star-o|<i class="fa fa-star-o"/>
|steam|<i class="fa fa-steam"/>
|steam-square|<i class="fa fa-steam-square"/>
|step-backward|<i class="fa fa-step-backward"/>
|step-forward|<i class="fa fa-step-forward"/>
|stethoscope|<i class="fa fa-stethoscope"/>
|sticky-note|<i class="fa fa-sticky-note"/>
|sticky-note-o|<i class="fa fa-sticky-note-o"/>
|stop|<i class="fa fa-stop"/>
|street-view|<i class="fa fa-street-view"/>
|strikethrough|<i class="fa fa-strikethrough"/>
|stumbleupon|<i class="fa fa-stumbleupon"/>
|stumbleupon-circle|<i class="fa fa-stumbleupon-circle"/>
|subscript|<i class="fa fa-subscript"/>
|subway|<i class="fa fa-subway"/>
|suitcase|<i class="fa fa-suitcase"/>
|sun-o|<i class="fa fa-sun-o"/>
|superscript|<i class="fa fa-superscript"/>
|table|<i class="fa fa-table"/>
|tablet|<i class="fa fa-tablet"/>
|tachometer|<i class="fa fa-tachometer"/>
|tag|<i class="fa fa-tag"/>
|tags|<i class="fa fa-tags"/>
|tasks|<i class="fa fa-tasks"/>
|taxi|<i class="fa fa-taxi"/>
|television|<i class="fa fa-television"/>
|tencent-weibo|<i class="fa fa-tencent-weibo"/>
|terminal|<i class="fa fa-terminal"/>
|text-height|<i class="fa fa-text-height"/>
|text-width|<i class="fa fa-text-width"/>
|th|<i class="fa fa-th"/>
|th-large|<i class="fa fa-th-large"/>
|th-list|<i class="fa fa-th-list"/>
|thumb-tack|<i class="fa fa-thumb-tack"/>
|thumbs-down|<i class="fa fa-thumbs-down"/>
|thumbs-o-down|<i class="fa fa-thumbs-o-down"/>
|thumbs-o-up|<i class="fa fa-thumbs-o-up"/>
|thumbs-up|<i class="fa fa-thumbs-up"/>
|ticket|<i class="fa fa-ticket"/>
|times|<i class="fa fa-times"/>
|times-circle|<i class="fa fa-times-circle"/>
|times-circle-o|<i class="fa fa-times-circle-o"/>
|tint|<i class="fa fa-tint"/>
|toggle-off|<i class="fa fa-toggle-off"/>
|toggle-on|<i class="fa fa-toggle-on"/>
|trademark|<i class="fa fa-trademark"/>
|train|<i class="fa fa-train"/>
|transgender|<i class="fa fa-transgender"/>
|transgender-alt|<i class="fa fa-transgender-alt"/>
|trash|<i class="fa fa-trash"/>
|trash-o|<i class="fa fa-trash-o"/>
|tree|<i class="fa fa-tree"/>
|trello|<i class="fa fa-trello"/>
|tripadvisor|<i class="fa fa-tripadvisor"/>
|trophy|<i class="fa fa-trophy"/>
|truck|<i class="fa fa-truck"/>
|try|<i class="fa fa-try"/>
|tty|<i class="fa fa-tty"/>
|tumblr|<i class="fa fa-tumblr"/>
|tumblr-square|<i class="fa fa-tumblr-square"/>
|twitch|<i class="fa fa-twitch"/>
|twitter|<i class="fa fa-twitter"/>
|twitter-square|<i class="fa fa-twitter-square"/>
|umbrella|<i class="fa fa-umbrella"/>
|underline|<i class="fa fa-underline"/>
|undo|<i class="fa fa-undo"/>
|university|<i class="fa fa-university"/>
|unlock|<i class="fa fa-unlock"/>
|unlock-alt|<i class="fa fa-unlock-alt"/>
|upload|<i class="fa fa-upload"/>
|usd|<i class="fa fa-usd"/>
|user|<i class="fa fa-user"/>
|user-md|<i class="fa fa-user-md"/>
|user-plus|<i class="fa fa-user-plus"/>
|user-secret|<i class="fa fa-user-secret"/>
|user-times|<i class="fa fa-user-times"/>
|users|<i class="fa fa-users"/>
|venus|<i class="fa fa-venus"/>
|venus-double|<i class="fa fa-venus-double"/>
|venus-mars|<i class="fa fa-venus-mars"/>
|viacoin|<i class="fa fa-viacoin"/>
|video-camera|<i class="fa fa-video-camera"/>
|vimeo|<i class="fa fa-vimeo"/>
|vimeo-square|<i class="fa fa-vimeo-square"/>
|vine|<i class="fa fa-vine"/>
|vk|<i class="fa fa-vk"/>
|volume-down|<i class="fa fa-volume-down"/>
|volume-off|<i class="fa fa-volume-off"/>
|volume-up|<i class="fa fa-volume-up"/>
|weibo|<i class="fa fa-weibo"/>
|weixin|<i class="fa fa-weixin"/>
|whatsapp|<i class="fa fa-whatsapp"/>
|wheelchair|<i class="fa fa-wheelchair"/>
|wifi|<i class="fa fa-wifi"/>
|wikipedia-w|<i class="fa fa-wikipedia-w"/>
|windows|<i class="fa fa-windows"/>
|wordpress|<i class="fa fa-wordpress"/>
|wrench|<i class="fa fa-wrench"/>
|xing|<i class="fa fa-xing"/>
|xing-square|<i class="fa fa-xing-square"/>
|y-combinator|<i class="fa fa-y-combinator"/>
|yahoo|<i class="fa fa-yahoo"/>
|yelp|<i class="fa fa-yelp"/>
|youtube|<i class="fa fa-youtube"/>
|youtube-play|<i class="fa fa-youtube-play"/>
|youtube-square|<i class="fa fa-youtube-square"/>
|glass|<i class="fa fa-glass"/>

### Material Icons

|Trigger|
|---|
|3d_rotation|
|accessibility|
|accessibility_new|
|accessible|
|accessible_forward|
|account_balance|
|account_balance_wallet|
|account_box|
|account_circle|
|add_shopping_cart|
|alarm|
|alarm_add|
|alarm_off|
|alarm_on|
|all_inbox|
|all_out|
|android|
|announcement|
|arrow_right_alt|
|aspect_ratio|
|assessment|
|assignment|
|assignment_ind|
|assignment_late|
|assignment_return|
|assignment_returned|
|assignment_turned_in|
|autorenew|
|backup|
|book|
|bookmark|
|bookmark_border|
|bookmarks|
|bug_report|
|build|
|cached|
|calendar_today|
|calendar_view_day|
|camera_enhance|
|card_giftcard|
|card_membership|
|card_travel|
|change_history|
|check_circle|
|check_circle_outline|
|chrome_reader_mode|
|class|
|code|
|commute|
|compare_arrows|
|contact_support|
|copyright|
|credit_card|
|dashboard|
|date_range|
|delete|
|delete_forever|
|delete_outline|
|description|
|dns|
|done|
|done_all|
|done_outline|
|donut_large|
|donut_small|
|drag_indicator|
|eject|
|euro_symbol|
|event|
|event_seat|
|exit_to_app|
|explore|
|explore_off|
|extension|
|face|
|favorite|
|favorite_border|
|feedback|
|find_in_page|
|find_replace|
|fingerprint|
|flight_land|
|flight_takeoff|
|flip_to_back|
|flip_to_front|
|g_translate|
|gavel|
|get_app|
|gif|
|grade|
|group_work|
|help|
|help_outline|
|highlight_off|
|history|
|home|
|horizontal_split|
|hourglass_empty|
|hourglass_full|
|http|
|https|
|important_devices|
|info|
|input|
|invert_colors|
|label|
|label_important|
|label_off|
|language|
|launch|
|line_style|
|line_weight|
|list|
|lock|
|lock_open|
|loyalty|
|markunread_mailbox|
|maximize|
|minimize|
|motorcycle|
|note_add|
|offline_bolt|
|offline_pin|
|opacity|
|open_in_browser|
|open_in_new|
|open_with|
|pageview|
|pan_tool|
|payment|
|perm_camera_mic|
|perm_contact_calendar|
|perm_data_setting|
|perm_device_information|
|perm_identity|
|perm_media|
|perm_phone_msg|
|perm_scan_wifi|
|pets|
|picture_in_picture|
|picture_in_picture_alt|
|play_for_work|
|polymer|
|power_settings_new|
|pregnant_woman|
|print|
|query_builder|
|question_answer|
|receipt|
|record_voice_over|
|redeem|
|remove_shopping_cart|
|reorder|
|report_problem|
|restore|
|restore_from_trash|
|restore_page|
|room|
|rounded_corner|
|rowing|
|schedule|
|search|
|settings|
|settings_applications|
|settings_backup_restore|
|settings_bluetooth|
|settings_brightness|
|settings_cell|
|settings_ethernet|
|settings_input_antenna|
|settings_input_component|
|settings_input_composite|
|settings_input_hdmi|
|settings_input_svideo|
|settings_overscan|
|settings_phone|
|settings_power|
|settings_remote|
|settings_voice|
|shop|
|shop_two|
|shopping_basket|
|shopping_cart|
|speaker_notes|
|speaker_notes_off|
|spellcheck|
|star_rate|
|stars|
|store|
|subject|
|supervised_user_circle|
|supervisor_account|
|swap_horiz|
|swap_horizontal_circle|
|swap_vert|
|swap_vertical_circle|
|tab|
|tab_unselected|
|text_rotate_up|
|text_rotate_vertical|
|text_rotation_down|
|text_rotation_none|
|theaters|
|thumb_down|
|thumb_up|
|thumbs_up_down|
|timeline|
|toc|
|today|
|toll|
|touch_app|
|track_changes|
|translate|
|trending_down|
|trending_flat|
|trending_up|
|turned_in|
|turned_in_not|
|update|
|verified_user|
|vertical_split|
|view_agenda|
|view_array|
|view_carousel|
|view_column|
|view_day|
|view_headline|
|view_list|
|view_module|
|view_quilt|
|view_stream|
|view_week|
|visibility|
|visibility_off|
|voice_over_off|
|watch_later|
|work|
|work_off|
|work_outline|
|youtube_searched_for|
|zoom_in|
|zoom_out|
|add_alert|
|error|
|error_outline|
|notification_important|
|warning|
|4k|
|add_to_queue|
|airplay|
|album|
|art_track|
|av_timer|
|branding_watermark|
|call_to_action|
|closed_caption|
|control_camera|
|equalizer|
|explicit|
|fast_forward|
|fast_rewind|
|featured_play_list|
|featured_video|
|fiber_dvr|
|fiber_manual_record|
|fiber_new|
|fiber_pin|
|fiber_smart_record|
|forward_10|
|forward_30|
|forward_5|
|games|
|hd|
|hearing|
|high_quality|
|library_add|
|library_books|
|library_music|
|loop|
|mic|
|mic_none|
|mic_off|
|missed_video_call|
|movie|
|music_video|
|new_releases|
|not_interested|
|note|
|pause|
|pause_circle_filled|
|pause_circle_outline|
|play_arrow|
|play_circle_filled|
|play_circle_filled_white|
|play_circle_outline|
|playlist_add|
|playlist_add_check|
|playlist_play|
|queue|
|queue_music|
|queue_play_next|
|radio|
|recent_actors|
|remove_from_queue|
|repeat|
|repeat_one|
|replay|
|replay_10|
|replay_30|
|replay_5|
|shuffle|
|skip_next|
|skip_previous|
|slow_motion_video|
|snooze|
|sort_by_alpha|
|stop|
|subscriptions|
|subtitles|
|surround_sound|
|video_call|
|video_label|
|video_library|
|videocam|
|videocam_off|
|volume_down|
|volume_mute|
|volume_off|
|volume_up|
|web|
|web_asset|
|alternate_email|
|business|
|call|
|call_end|
|call_made|
|call_merge|
|call_missed|
|call_missed_outgoing|
|call_received|
|call_split|
|cancel_presentation|
|cell_wifi|
|chat|
|chat_bubble|
|chat_bubble_outline|
|clear_all|
|comment|
|contact_mail|
|contact_phone|
|contacts|
|desktop_access_disabled|
|dialer_sip|
|dialpad|
|domain_disabled|
|duo|
|email|
|forum|
|import_contacts|
|import_export|
|invert_colors_off|
|list_alt|
|live_help|
|location_off|
|location_on|
|mail_outline|
|message|
|mobile_screen_share|
|no_sim|
|pause_presentation|
|person_add_disabled|
|phone|
|phonelink_erase|
|phonelink_lock|
|phonelink_ring|
|phonelink_setup|
|portable_wifi_off|
|present_to_all|
|print_disabled|
|ring_volume|
|rss_feed|
|screen_share|
|sentiment_satisfied_alt|
|speaker_phone|
|stay_current_landscape|
|stay_current_portrait|
|stay_primary_landscape|
|stay_primary_portrait|
|stop_screen_share|
|swap_calls|
|textsms|
|unsubscribe|
|voicemail|
|vpn_key|
|add|
|add_box|
|add_circle|
|add_circle_outline|
|archive|
|backspace|
|ballot|
|block|
|clear|
|create|
|delete_sweep|
|drafts|
|file_copy|
|filter_list|
|flag|
|font_download|
|forward|
|gesture|
|how_to_reg|
|how_to_vote|
|inbox|
|link|
|link_off|
|low_priority|
|mail|
|markunread|
|move_to_inbox|
|next_week|
|outlined_flag|
|redo|
|remove|
|remove_circle|
|remove_circle_outline|
|reply|
|reply_all|
|report|
|report_off|
|save|
|save_alt|
|select_all|
|send|
|sort|
|text_format|
|unarchive|
|undo|
|waves|
|weekend|
|where_to_vote|
|access_alarm|
|access_alarms|
|access_time|
|add_alarm|
|add_to_home_screen|
|airplanemode_active|
|airplanemode_inactive|
|battery_20|
|battery_30|
|battery_50|
|battery_60|
|battery_80|
|battery_90|
|battery_alert|
|battery_charging_20|
|battery_charging_30|
|battery_charging_50|
|battery_charging_60|
|battery_charging_80|
|battery_charging_90|
|battery_charging_full|
|battery_full|
|battery_std|
|battery_unknown|
|bluetooth|
|bluetooth_connected|
|bluetooth_disabled|
|bluetooth_searching|
|brightness_auto|
|brightness_high|
|brightness_low|
|brightness_medium|
|data_usage|
|developer_mode|
|devices|
|dvr|
|gps_fixed|
|gps_not_fixed|
|gps_off|
|graphic_eq|
|location_disabled|
|location_searching|
|mobile_friendly|
|mobile_off|
|network_cell|
|network_wifi|
|nfc|
|screen_lock_landscape|
|screen_lock_portrait|
|screen_lock_rotation|
|screen_rotation|
|sd_storage|
|settings_system_daydream|
|signal_cellular_0_bar|
|signal_cellular_1_bar|
|signal_cellular_2_bar|
|signal_cellular_3_bar|
|signal_cellular_4_bar|
|signal_cellular_alt|
|signal_cellular_connected_no_internet_0_bar|
|signal_cellular_connected_no_internet_1_bar|
|signal_cellular_connected_no_internet_2_bar|
|signal_cellular_connected_no_internet_3_bar|
|signal_cellular_connected_no_internet_4_bar|
|signal_cellular_no_sim|
|signal_cellular_null|
|signal_cellular_off|
|signal_wifi_0_bar|
|signal_wifi_1_bar|
|signal_wifi_1_bar_lock|
|signal_wifi_2_bar|
|signal_wifi_2_bar_lock|
|signal_wifi_3_bar|
|signal_wifi_3_bar_lock|
|signal_wifi_4_bar|
|signal_wifi_4_bar_lock|
|signal_wifi_off|
|storage|
|usb|
|wallpaper|
|widgets|
|wifi_lock|
|wifi_tethering|
|add_comment|
|attach_file|
|attach_money|
|bar_chart|
|border_all|
|border_bottom|
|border_clear|
|border_color|
|border_horizontal|
|border_inner|
|border_left|
|border_outer|
|border_right|
|border_style|
|border_top|
|border_vertical|
|bubble_chart|
|drag_handle|
|format_align_center|
|format_align_justify|
|format_align_left|
|format_align_right|
|format_bold|
|format_clear|
|format_color_fill|
|format_color_reset|
|format_color_text|
|format_indent_decrease|
|format_indent_increase|
|format_italic|
|format_line_spacing|
|format_list_bulleted|
|format_list_numbered|
|format_list_numbered_rtl|
|format_paint|
|format_quote|
|format_shapes|
|format_size|
|format_strikethrough|
|format_textdirection_l_to_r|
|format_textdirection_r_to_l|
|format_underlined|
|functions|
|highlight|
|insert_chart|
|insert_chart_outlined|
|insert_comment|
|insert_drive_file|
|insert_emoticon|
|insert_invitation|
|insert_link|
|insert_photo|
|linear_scale|
|merge_type|
|mode_comment|
|monetization_on|
|money_off|
|multiline_chart|
|notes|
|pie_chart|
|publish|
|scatter_plot|
|score|
|short_text|
|show_chart|
|space_bar|
|strikethrough_s|
|table_chart|
|text_fields|
|title|
|vertical_align_bottom|
|vertical_align_center|
|vertical_align_top|
|wrap_text|
|attachment|
|cloud|
|cloud_circle|
|cloud_done|
|cloud_download|
|cloud_off|
|cloud_queue|
|cloud_upload|
|create_new_folder|
|folder|
|folder_open|
|folder_shared|
|cast|
|cast_connected|
|cast_for_education|
|computer|
|desktop_mac|
|desktop_windows|
|developer_board|
|device_hub|
|device_unknown|
|devices_other|
|dock|
|gamepad|
|headset|
|headset_mic|
|keyboard|
|keyboard_arrow_down|
|keyboard_arrow_left|
|keyboard_arrow_right|
|keyboard_arrow_up|
|keyboard_backspace|
|keyboard_capslock|
|keyboard_hide|
|keyboard_return|
|keyboard_tab|
|keyboard_voice|
|laptop|
|laptop_chromebook|
|laptop_mac|
|laptop_windows|
|memory|
|mouse|
|phone_android|
|phone_iphone|
|phonelink|
|phonelink_off|
|power_input|
|router|
|scanner|
|security|
|sim_card|
|smartphone|
|speaker|
|speaker_group|
|tablet|
|tablet_android|
|tablet_mac|
|toys|
|tv|
|videogame_asset|
|watch|
|add_a_photo|
|add_photo_alternate|
|add_to_photos|
|adjust|
|assistant|
|assistant_photo|
|audiotrack|
|blur_circular|
|blur_linear|
|blur_off|
|blur_on|
|brightness_1|
|brightness_2|
|brightness_3|
|brightness_4|
|brightness_5|
|brightness_6|
|brightness_7|
|broken_image|
|brush|
|burst_mode|
|camera|
|camera_alt|
|camera_front|
|camera_rear|
|camera_roll|
|center_focus_strong|
|center_focus_weak|
|collections|
|collections_bookmark|
|color_lens|
|colorize|
|compare|
|control_point|
|control_point_duplicate|
|crop|
|crop_16_9|
|crop_3_2|
|crop_5_4|
|crop_7_5|
|crop_din|
|crop_free|
|crop_landscape|
|crop_original|
|crop_portrait|
|crop_rotate|
|crop_square|
|dehaze|
|details|
|edit|
|exposure|
|exposure_neg_1|
|exposure_neg_2|
|exposure_plus_1|
|exposure_plus_2|
|exposure_zero|
|filter|
|filter_1|
|filter_2|
|filter_3|
|filter_4|
|filter_5|
|filter_6|
|filter_7|
|filter_8|
|filter_9|
|filter_9_plus|
|filter_b_and_w|
|filter_center_focus|
|filter_drama|
|filter_frames|
|filter_hdr|
|filter_none|
|filter_tilt_shift|
|filter_vintage|
|flare|
|flash_auto|
|flash_off|
|flash_on|
|flip|
|gradient|
|grain|
|grid_off|
|grid_on|
|hdr_off|
|hdr_on|
|hdr_strong|
|hdr_weak|
|healing|
|image|
|image_aspect_ratio|
|image_search|
|iso|
|landscape|
|leak_add|
|leak_remove|
|lens|
|linked_camera|
|looks|
|looks_3|
|looks_4|
|looks_5|
|looks_6|
|looks_one|
|looks_two|
|loupe|
|monochrome_photos|
|movie_creation|
|movie_filter|
|music_note|
|music_off|
|nature|
|nature_people|
|navigate_before|
|navigate_next|
|palette|
|panorama|
|panorama_fish_eye|
|panorama_horizontal|
|panorama_vertical|
|panorama_wide_angle|
|photo|
|photo_album|
|photo_camera|
|photo_filter|
|photo_library|
|photo_size_select_actual|
|photo_size_select_large|
|photo_size_select_small|
|picture_as_pdf|
|portrait|
|remove_red_eye|
|rotate_90_degrees_ccw|
|rotate_left|
|rotate_right|
|shutter_speed|
|slideshow|
|straighten|
|style|
|switch_camera|
|switch_video|
|tag_faces|
|texture|
|timelapse|
|timer|
|timer_10|
|timer_3|
|timer_off|
|tonality|
|transform|
|tune|
|view_comfy|
|view_compact|
|vignette|
|wb_auto|
|wb_cloudy|
|wb_incandescent|
|wb_iridescent|
|wb_sunny|
|360|
|add_location|
|atm|
|beenhere|
|category|
|compass_calibration|
|departure_board|
|directions|
|directions_bike|
|directions_boat|
|directions_bus|
|directions_car|
|directions_railway|
|directions_run|
|directions_subway|
|directions_transit|
|directions_walk|
|edit_attributes|
|edit_location|
|ev_station|
|fastfood|
|flight|
|hotel|
|layers|
|layers_clear|
|local_activity|
|local_airport|
|local_atm|
|local_bar|
|local_cafe|
|local_car_wash|
|local_convenience_store|
|local_dining|
|local_drink|
|local_florist|
|local_gas_station|
|local_grocery_store|
|local_hospital|
|local_hotel|
|local_laundry_service|
|local_library|
|local_mall|
|local_movies|
|local_offer|
|local_parking|
|local_pharmacy|
|local_phone|
|local_pizza|
|local_play|
|local_post_office|
|local_printshop|
|local_see|
|local_shipping|
|local_taxi|
|map|
|money|
|my_location|
|navigation|
|near_me|
|not_listed_location|
|person_pin|
|person_pin_circle|
|pin_drop|
|place|
|rate_review|
|restaurant|
|restaurant_menu|
|satellite|
|store_mall_directory|
|streetview|
|subway|
|terrain|
|traffic|
|train|
|tram|
|transfer_within_a_station|
|transit_enterexit|
|trip_origin|
|zoom_out_map|
|apps|
|arrow_back|
|arrow_back_ios|
|arrow_downward|
|arrow_drop_down|
|arrow_drop_down_circle|
|arrow_drop_up|
|arrow_forward|
|arrow_forward_ios|
|arrow_left|
|arrow_right|
|arrow_upward|
|cancel|
|check|
|chevron_left|
|chevron_right|
|close|
|expand_less|
|expand_more|
|first_page|
|fullscreen|
|fullscreen_exit|
|last_page|
|menu|
|more_horiz|
|more_vert|
|refresh|
|subdirectory_arrow_left|
|subdirectory_arrow_right|
|unfold_less|
|unfold_more|
|adb|
|airline_seat_flat|
|airline_seat_flat_angled|
|airline_seat_individual_suite|
|airline_seat_legroom_extra|
|airline_seat_legroom_normal|
|airline_seat_legroom_reduced|
|airline_seat_recline_extra|
|airline_seat_recline_normal|
|bluetooth_audio|
|confirmation_number|
|disc_full|
|drive_eta|
|enhanced_encryption|
|event_available|
|event_busy|
|event_note|
|folder_special|
|live_tv|
|mms|
|more|
|network_check|
|network_locked|
|no_encryption|
|ondemand_video|
|personal_video|
|phone_bluetooth_speaker|
|phone_callback|
|phone_forwarded|
|phone_in_talk|
|phone_locked|
|phone_missed|
|phone_paused|
|power|
|power_off|
|priority_high|
|sd_card|
|sms|
|sms_failed|
|sync|
|sync_disabled|
|sync_problem|
|system_update|
|tap_and_play|
|time_to_leave|
|tv_off|
|vibration|
|voice_chat|
|vpn_lock|
|wc|
|wifi|
|wifi_off|
|ac_unit|
|airport_shuttle|
|all_inclusive|
|beach_access|
|business_center|
|casino|
|child_care|
|child_friendly|
|fitness_center|
|free_breakfast|
|golf_course|
|hot_tub|
|kitchen|
|meeting_room|
|no_meeting_room|
|pool|
|room_service|
|rv_hookup|
|smoke_free|
|smoking_rooms|
|spa|
|cake|
|domain|
|group|
|group_add|
|location_city|
|mood|
|mood_bad|
|notifications|
|notifications_active|
|notifications_none|
|notifications_off|
|notifications_paused|
|pages|
|party_mode|
|people|
|people_outline|
|person|
|person_add|
|person_outline|
|plus_one|
|poll|
|public|
|school|
|sentiment_dissatisfied|
|sentiment_satisfied|
|sentiment_very_dissatisfied|
|sentiment_very_satisfied|
|share|
|thumb_down_alt|
|thumb_up_alt|
|whatshot|
|check_box|
|check_box_outline_blank|
|indeterminate_check_box|
|radio_button_checked|
|radio_button_unchecked|
|star|
|star_border|
|star_half|
|toggle_off|
|toggle_on|

### Material Design Community Icons

|Trigger|
|---|
|access-point|
|access-point-network|
|account|
|account-alert|
|account-box|
|account-box-multiple|
|account-box-outline|
|account-card-details|
|account-check|
|account-circle|
|account-convert|
|account-edit|
|account-group|
|account-heart|
|account-key|
|account-location|
|account-minus|
|account-multiple|
|account-multiple-check|
|account-multiple-minus|
|account-multiple-outline|
|account-multiple-plus|
|account-multiple-plus-outline|
|account-network|
|account-off|
|account-outline|
|account-plus|
|account-plus-outline|
|account-remove|
|account-search|
|account-search-outline|
|account-settings|
|account-settings-variant|
|account-star|
|account-switch|
|accusoft|
|adjust|
|adobe|
|air-conditioner|
|airballoon|
|airplane|
|airplane-landing|
|airplane-off|
|airplane-takeoff|
|airplay|
|airport|
|alarm|
|alarm-bell|
|alarm-check|
|alarm-light|
|alarm-multiple|
|alarm-off|
|alarm-plus|
|alarm-snooze|
|album|
|alert|
|alert-box|
|alert-circle|
|alert-circle-outline|
|alert-decagram|
|alert-octagon|
|alert-octagram|
|alert-outline|
|alien|
|all-inclusive|
|alpha|
|alphabetical|
|altimeter|
|amazon|
|amazon-alexa|
|amazon-drive|
|ambulance|
|amplifier|
|anchor|
|android|
|android-debug-bridge|
|android-head|
|android-studio|
|angle-acute|
|angle-obtuse|
|angle-right|
|angular|
|angularjs|
|animation|
|animation-play|
|anvil|
|apple|
|apple-finder|
|apple-icloud|
|apple-ios|
|apple-keyboard-caps|
|apple-keyboard-command|
|apple-keyboard-control|
|apple-keyboard-option|
|apple-keyboard-shift|
|apple-safari|
|application|
|approval|
|apps|
|arch|
|archive|
|arrange-bring-forward|
|arrange-bring-to-front|
|arrange-send-backward|
|arrange-send-to-back|
|arrow-all|
|arrow-bottom-left|
|arrow-bottom-right|
|arrow-collapse|
|arrow-collapse-all|
|arrow-collapse-down|
|arrow-collapse-horizontal|
|arrow-collapse-left|
|arrow-collapse-right|
|arrow-collapse-up|
|arrow-collapse-vertical|
|arrow-decision|
|arrow-decision-auto|
|arrow-decision-auto-outline|
|arrow-decision-outline|
|arrow-down|
|arrow-down-bold|
|arrow-down-bold-box|
|arrow-down-bold-box-outline|
|arrow-down-bold-circle|
|arrow-down-bold-circle-outline|
|arrow-down-bold-hexagon-outline|
|arrow-down-box|
|arrow-down-drop-circle|
|arrow-down-drop-circle-outline|
|arrow-down-thick|
|arrow-expand|
|arrow-expand-all|
|arrow-expand-down|
|arrow-expand-horizontal|
|arrow-expand-left|
|arrow-expand-right|
|arrow-expand-up|
|arrow-expand-vertical|
|arrow-left|
|arrow-left-bold|
|arrow-left-bold-box|
|arrow-left-bold-box-outline|
|arrow-left-bold-circle|
|arrow-left-bold-circle-outline|
|arrow-left-bold-hexagon-outline|
|arrow-left-box|
|arrow-left-drop-circle|
|arrow-left-drop-circle-outline|
|arrow-left-thick|
|arrow-right|
|arrow-right-bold|
|arrow-right-bold-box|
|arrow-right-bold-box-outline|
|arrow-right-bold-circle|
|arrow-right-bold-circle-outline|
|arrow-right-bold-hexagon-outline|
|arrow-right-box|
|arrow-right-drop-circle|
|arrow-right-drop-circle-outline|
|arrow-right-thick|
|arrow-split-horizontal|
|arrow-split-vertical|
|arrow-top-left|
|arrow-top-right|
|arrow-up|
|arrow-up-bold|
|arrow-up-bold-box|
|arrow-up-bold-box-outline|
|arrow-up-bold-circle|
|arrow-up-bold-circle-outline|
|arrow-up-bold-hexagon-outline|
|arrow-up-box|
|arrow-up-drop-circle|
|arrow-up-drop-circle-outline|
|arrow-up-thick|
|artist|
|assistant|
|asterisk|
|at|
|atlassian|
|atom|
|attachment|
|audio-video|
|audiobook|
|augmented-reality|
|auto-fix|
|auto-upload|
|autorenew|
|av-timer|
|axe|
|azure|
|baby|
|baby-buggy|
|backburger|
|backspace|
|backup-restore|
|badminton|
|ballot|
|ballot-outline|
|bandcamp|
|bank|
|barcode|
|barcode-scan|
|barley|
|barrel|
|baseball|
|baseball-bat|
|basecamp|
|basket|
|basket-fill|
|basket-unfill|
|basketball|
|battery|
|battery-10|
|battery-10-bluetooth|
|battery-20|
|battery-20-bluetooth|
|battery-30|
|battery-30-bluetooth|
|battery-40|
|battery-40-bluetooth|
|battery-50|
|battery-50-bluetooth|
|battery-60|
|battery-60-bluetooth|
|battery-70|
|battery-70-bluetooth|
|battery-80|
|battery-80-bluetooth|
|battery-90|
|battery-90-bluetooth|
|battery-alert|
|battery-alert-bluetooth|
|battery-bluetooth|
|battery-bluetooth-variant|
|battery-charging|
|battery-charging-10|
|battery-charging-100|
|battery-charging-20|
|battery-charging-30|
|battery-charging-40|
|battery-charging-50|
|battery-charging-60|
|battery-charging-70|
|battery-charging-80|
|battery-charging-90|
|battery-charging-outline|
|battery-charging-wireless|
|battery-charging-wireless-10|
|battery-charging-wireless-20|
|battery-charging-wireless-30|
|battery-charging-wireless-40|
|battery-charging-wireless-50|
|battery-charging-wireless-60|
|battery-charging-wireless-70|
|battery-charging-wireless-80|
|battery-charging-wireless-90|
|battery-charging-wireless-alert|
|battery-charging-wireless-outline|
|battery-minus|
|battery-negative|
|battery-outline|
|battery-plus|
|battery-positive|
|battery-unknown|
|battery-unknown-bluetooth|
|beach|
|beaker|
|beats|
|bed-empty|
|beer|
|behance|
|bell|
|bell-off|
|bell-outline|
|bell-plus|
|bell-ring|
|bell-ring-outline|
|bell-sleep|
|beta|
|betamax|
|bible|
|bike|
|bing|
|binoculars|
|bio|
|biohazard|
|bitbucket|
|bitcoin|
|black-mesa|
|blackberry|
|blender|
|blinds|
|block-helper|
|blogger|
|bluetooth|
|bluetooth-audio|
|bluetooth-connect|
|bluetooth-off|
|bluetooth-settings|
|bluetooth-transfer|
|blur|
|blur-linear|
|blur-off|
|blur-radial|
|bomb|
|bomb-off|
|bone|
|book|
|book-minus|
|book-multiple|
|book-multiple-variant|
|book-open|
|book-open-page-variant|
|book-open-variant|
|book-plus|
|book-secure|
|book-unsecure|
|book-variant|
|bookmark|
|bookmark-check|
|bookmark-minus|
|bookmark-minus-outline|
|bookmark-music|
|bookmark-off|
|bookmark-off-outline|
|bookmark-outline|
|bookmark-plus|
|bookmark-plus-outline|
|bookmark-remove|
|boombox|
|bootstrap|
|border-all|
|border-all-variant|
|border-bottom|
|border-bottom-variant|
|border-color|
|border-horizontal|
|border-inside|
|border-left|
|border-left-variant|
|border-none|
|border-none-variant|
|border-outside|
|border-right|
|border-right-variant|
|border-style|
|border-top|
|border-top-variant|
|border-vertical|
|bottle-wine|
|bow-tie|
|bowl|
|bowling|
|box|
|box-cutter|
|box-shadow|
|braille|
|brain|
|bridge|
|briefcase|
|briefcase-check|
|briefcase-download|
|briefcase-outline|
|briefcase-upload|
|brightness-1|
|brightness-2|
|brightness-3|
|brightness-4|
|brightness-5|
|brightness-6|
|brightness-7|
|brightness-auto|
|broom|
|brush|
|buddhism|
|buffer|
|bug|
|bulletin-board|
|bullhorn|
|bullseye|
|bullseye-arrow|
|bus|
|bus-articulated-end|
|bus-articulated-front|
|bus-clock|
|bus-double-decker|
|bus-school|
|bus-side|
|cached|
|cake|
|cake-layered|
|cake-variant|
|calculator|
|calendar|
|calendar-blank|
|calendar-check|
|calendar-clock|
|calendar-edit|
|calendar-heart|
|calendar-multiple|
|calendar-multiple-check|
|calendar-plus|
|calendar-question|
|calendar-range|
|calendar-remove|
|calendar-search|
|calendar-star|
|calendar-text|
|calendar-today|
|call-made|
|call-merge|
|call-missed|
|call-received|
|call-split|
|camcorder|
|camcorder-box|
|camcorder-box-off|
|camcorder-off|
|camera|
|camera-account|
|camera-burst|
|camera-enhance|
|camera-front|
|camera-front-variant|
|camera-gopro|
|camera-image|
|camera-iris|
|camera-metering-center|
|camera-metering-matrix|
|camera-metering-partial|
|camera-metering-spot|
|camera-off|
|camera-party-mode|
|camera-rear|
|camera-rear-variant|
|camera-switch|
|camera-timer|
|cancel|
|candle|
|candycane|
|cannabis|
|car|
|car-battery|
|car-connected|
|car-convertible|
|car-estate|
|car-hatchback|
|car-limousine|
|car-pickup|
|car-side|
|car-sports|
|car-wash|
|caravan|
|cards|
|cards-club|
|cards-diamond|
|cards-heart|
|cards-outline|
|cards-playing-outline|
|cards-spade|
|cards-variant|
|carrot|
|cart|
|cart-off|
|cart-outline|
|cart-plus|
|case-sensitive-alt|
|cash|
|cash-100|
|cash-multiple|
|cash-usd|
|cassette|
|cast|
|cast-connected|
|cast-off|
|castle|
|cat|
|cctv|
|ceiling-light|
|cellphone|
|cellphone-android|
|cellphone-arrow-down|
|cellphone-basic|
|cellphone-dock|
|cellphone-erase|
|cellphone-iphone|
|cellphone-key|
|cellphone-link|
|cellphone-link-off|
|cellphone-lock|
|cellphone-message|
|cellphone-off|
|cellphone-settings|
|cellphone-settings-variant|
|cellphone-sound|
|cellphone-text|
|cellphone-wireless|
|certificate|
|chair-school|
|chart-arc|
|chart-areaspline|
|chart-bar|
|chart-bar-stacked|
|chart-bubble|
|chart-donut|
|chart-donut-variant|
|chart-gantt|
|chart-histogram|
|chart-line|
|chart-line-stacked|
|chart-line-variant|
|chart-multiline|
|chart-pie|
|chart-scatterplot-hexbin|
|chart-timeline|
|check|
|check-all|
|check-circle|
|check-circle-outline|
|check-outline|
|checkbox-blank|
|checkbox-blank-circle|
|checkbox-blank-circle-outline|
|checkbox-blank-outline|
|checkbox-intermediate|
|checkbox-marked|
|checkbox-marked-circle|
|checkbox-marked-circle-outline|
|checkbox-marked-outline|
|checkbox-multiple-blank|
|checkbox-multiple-blank-circle|
|checkbox-multiple-blank-circle-outline|
|checkbox-multiple-blank-outline|
|checkbox-multiple-marked|
|checkbox-multiple-marked-circle|
|checkbox-multiple-marked-circle-outline|
|checkbox-multiple-marked-outline|
|checkerboard|
|chemical-weapon|
|chess-bishop|
|chess-king|
|chess-knight|
|chess-pawn|
|chess-queen|
|chess-rook|
|chevron-double-down|
|chevron-double-left|
|chevron-double-right|
|chevron-double-up|
|chevron-down|
|chevron-down-box|
|chevron-down-box-outline|
|chevron-left|
|chevron-left-box|
|chevron-left-box-outline|
|chevron-right|
|chevron-right-box|
|chevron-right-box-outline|
|chevron-up|
|chevron-up-box|
|chevron-up-box-outline|
|chili-hot|
|chili-medium|
|chili-mild|
|chip|
|christianity|
|church|
|circle|
|circle-edit-outline|
|circle-outline|
|cisco-webex|
|city|
|clipboard|
|clipboard-account|
|clipboard-alert|
|clipboard-arrow-down|
|clipboard-arrow-left|
|clipboard-check|
|clipboard-check-outline|
|clipboard-flow|
|clipboard-outline|
|clipboard-plus|
|clipboard-pulse|
|clipboard-pulse-outline|
|clipboard-text|
|clippy|
|clock|
|clock-alert|
|clock-alert-outline|
|clock-end|
|clock-fast|
|clock-in|
|clock-out|
|clock-outline|
|clock-start|
|close|
|close-box|
|close-box-outline|
|close-circle|
|close-circle-outline|
|close-network|
|close-octagon|
|close-octagon-outline|
|close-outline|
|closed-caption|
|cloud|
|cloud-alert|
|cloud-braces|
|cloud-check|
|cloud-circle|
|cloud-download|
|cloud-off-outline|
|cloud-outline|
|cloud-print|
|cloud-print-outline|
|cloud-search|
|cloud-search-outline|
|cloud-sync|
|cloud-tags|
|cloud-upload|
|clover|
|code-array|
|code-braces|
|code-brackets|
|code-equal|
|code-greater-than|
|code-greater-than-or-equal|
|code-less-than|
|code-less-than-or-equal|
|code-not-equal|
|code-not-equal-variant|
|code-parentheses|
|code-string|
|code-tags|
|code-tags-check|
|codepen|
|coffee|
|coffee-outline|
|coffee-to-go|
|cogs|
|coin|
|coins|
|collage|
|color-helper|
|comment|
|comment-account|
|comment-account-outline|
|comment-alert|
|comment-alert-outline|
|comment-arrow-left|
|comment-arrow-left-outline|
|comment-arrow-right|
|comment-arrow-right-outline|
|comment-check|
|comment-check-outline|
|comment-multiple|
|comment-multiple-outline|
|comment-outline|
|comment-plus|
|comment-plus-outline|
|comment-processing|
|comment-processing-outline|
|comment-question|
|comment-question-outline|
|comment-remove|
|comment-remove-outline|
|comment-text|
|comment-text-multiple|
|comment-text-multiple-outline|
|comment-text-outline|
|compare|
|compass|
|compass-outline|
|console|
|console-line|
|console-network|
|contact-mail|
|contacts|
|content-copy|
|content-cut|
|content-duplicate|
|content-paste|
|content-save|
|content-save-all|
|content-save-outline|
|content-save-settings|
|contrast|
|contrast-box|
|contrast-circle|
|cookie|
|copyright|
|cordova|
|corn|
|counter|
|cow|
|crane|
|creation|
|credit-card|
|credit-card-multiple|
|credit-card-off|
|credit-card-plus|
|credit-card-scan|
|credit-card-settings|
|crop|
|crop-free|
|crop-landscape|
|crop-portrait|
|crop-rotate|
|crop-square|
|crosshairs|
|crosshairs-gps|
|crown|
|cryengine|
|cube|
|cube-outline|
|cube-send|
|cube-unfolded|
|cup|
|cup-off|
|cup-water|
|cupcake|
|curling|
|currency-bdt|
|currency-btc|
|currency-chf|
|currency-cny|
|currency-eth|
|currency-eur|
|currency-gbp|
|currency-inr|
|currency-jpy|
|currency-krw|
|currency-kzt|
|currency-ngn|
|currency-php|
|currency-rub|
|currency-sign|
|currency-try|
|currency-twd|
|currency-usd|
|currency-usd-off|
|current-ac|
|current-dc|
|cursor-default|
|cursor-default-outline|
|cursor-move|
|cursor-pointer|
|cursor-text|
|database|
|database-export|
|database-import|
|database-minus|
|database-plus|
|database-search|
|death-star|
|death-star-variant|
|debian|
|debug-step-into|
|debug-step-out|
|debug-step-over|
|decagram|
|decagram-outline|
|decimal-decrease|
|decimal-increase|
|delete|
|delete-circle|
|delete-empty|
|delete-forever|
|delete-outline|
|delete-restore|
|delete-sweep|
|delete-variant|
|delta|
|desk-lamp|
|deskphone|
|desktop-classic|
|desktop-mac|
|desktop-mac-dashboard|
|desktop-tower|
|details|
|developer-board|
|deviantart|
|dialpad|
|diamond|
|dice-1|
|dice-2|
|dice-3|
|dice-4|
|dice-5|
|dice-6|
|dice-d10|
|dice-d12|
|dice-d20|
|dice-d4|
|dice-d6|
|dice-d8|
|dice-multiple|
|dictionary|
|dip-switch|
|directions|
|directions-fork|
|disc|
|disc-alert|
|disc-player|
|discord|
|disqus|
|disqus-outline|
|division|
|division-box|
|dna|
|dns|
|do-not-disturb|
|do-not-disturb-off|
|docker|
|dolby|
|domain|
|donkey|
|door|
|door-closed|
|door-open|
|doorbell-video|
|dots-horizontal|
|dots-horizontal-circle|
|dots-vertical|
|dots-vertical-circle|
|douban|
|download|
|download-multiple|
|download-network|
|drag|
|drag-horizontal|
|drag-vertical|
|drawing|
|drawing-box|
|dribbble|
|dribbble-box|
|drone|
|dropbox|
|drupal|
|duck|
|dumbbell|
|ear-hearing|
|earth|
|earth-box|
|earth-box-off|
|earth-off|
|edge|
|eight-track|
|eject|
|elephant|
|elevation-decline|
|elevation-rise|
|elevator|
|email|
|email-alert|
|email-open|
|email-open-outline|
|email-outline|
|email-search|
|email-search-outline|
|email-secure|
|email-variant|
|emby|
|emoticon|
|emoticon-cool|
|emoticon-dead|
|emoticon-devil|
|emoticon-excited|
|emoticon-happy|
|emoticon-neutral|
|emoticon-poop|
|emoticon-sad|
|emoticon-tongue|
|engine|
|engine-outline|
|equal|
|equal-box|
|eraser|
|eraser-variant|
|escalator|
|ethereum|
|ethernet|
|ethernet-cable|
|ethernet-cable-off|
|etsy|
|ev-station|
|eventbrite|
|evernote|
|exclamation|
|exit-to-app|
|exponent|
|exponent-box|
|export|
|eye|
|eye-off|
|eye-off-outline|
|eye-outline|
|eye-plus|
|eye-plus-outline|
|eye-settings|
|eye-settings-outline|
|eyedropper|
|eyedropper-variant|
|face|
|face-profile|
|facebook|
|facebook-box|
|facebook-messenger|
|factory|
|fan|
|fan-off|
|fast-forward|
|fast-forward-outline|
|fax|
|feather|
|fedora|
|ferry|
|file|
|file-account|
|file-chart|
|file-check|
|file-cloud|
|file-compare|
|file-delimited|
|file-document|
|file-document-box|
|file-document-box-outline|
|file-document-outline|
|file-download|
|file-download-outline|
|file-excel|
|file-excel-box|
|file-export|
|file-find|
|file-hidden|
|file-image|
|file-import|
|file-lock|
|file-multiple|
|file-music|
|file-outline|
|file-pdf|
|file-pdf-box|
|file-percent|
|file-plus|
|file-powerpoint|
|file-powerpoint-box|
|file-presentation-box|
|file-question|
|file-restore|
|file-send|
|file-tree|
|file-undo|
|file-video|
|file-word|
|file-word-box|
|file-xml|
|film|
|filmstrip|
|filmstrip-off|
|filter|
|filter-outline|
|filter-remove|
|filter-remove-outline|
|filter-variant|
|finance|
|find-replace|
|fingerprint|
|fire|
|fire-truck|
|firebase|
|firefox|
|fish|
|flag|
|flag-checkered|
|flag-outline|
|flag-triangle|
|flag-variant|
|flag-variant-outline|
|flash|
|flash-auto|
|flash-circle|
|flash-off|
|flash-outline|
|flash-red-eye|
|flashlight|
|flashlight-off|
|flask|
|flask-empty|
|flask-empty-outline|
|flask-outline|
|flattr|
|flip-to-back|
|flip-to-front|
|floor-lamp|
|floor-plan|
|floppy|
|floppy-variant|
|flower|
|flower-outline|
|folder|
|folder-account|
|folder-download|
|folder-edit|
|folder-google-drive|
|folder-image|
|folder-key|
|folder-key-network|
|folder-lock|
|folder-lock-open|
|folder-move|
|folder-multiple|
|folder-multiple-image|
|folder-multiple-outline|
|folder-network|
|folder-open|
|folder-outline|
|folder-plus|
|folder-remove|
|folder-search|
|folder-search-outline|
|folder-star|
|folder-upload|
|font-awesome|
|food|
|food-apple|
|food-croissant|
|food-fork-drink|
|food-off|
|food-variant|
|football|
|football-australian|
|football-helmet|
|forklift|
|format-align-bottom|
|format-align-center|
|format-align-justify|
|format-align-left|
|format-align-middle|
|format-align-right|
|format-align-top|
|format-annotation-plus|
|format-bold|
|format-clear|
|format-color-fill|
|format-color-text|
|format-columns|
|format-float-center|
|format-float-left|
|format-float-none|
|format-float-right|
|format-font|
|format-header-1|
|format-header-2|
|format-header-3|
|format-header-4|
|format-header-5|
|format-header-6|
|format-header-decrease|
|format-header-equal|
|format-header-increase|
|format-header-pound|
|format-horizontal-align-center|
|format-horizontal-align-left|
|format-horizontal-align-right|
|format-indent-decrease|
|format-indent-increase|
|format-italic|
|format-line-spacing|
|format-line-style|
|format-line-weight|
|format-list-bulleted|
|format-list-bulleted-type|
|format-list-checkbox|
|format-list-checks|
|format-list-numbers|
|format-page-break|
|format-paint|
|format-paragraph|
|format-pilcrow|
|format-quote-close|
|format-quote-open|
|format-rotate-90|
|format-section|
|format-size|
|format-strikethrough|
|format-strikethrough-variant|
|format-subscript|
|format-superscript|
|format-text|
|format-textdirection-l-to-r|
|format-textdirection-r-to-l|
|format-title|
|format-underline|
|format-vertical-align-bottom|
|format-vertical-align-center|
|format-vertical-align-top|
|format-wrap-inline|
|format-wrap-square|
|format-wrap-tight|
|format-wrap-top-bottom|
|forum|
|forum-outline|
|forward|
|fountain|
|foursquare|
|freebsd|
|fridge|
|fridge-filled|
|fridge-filled-bottom|
|fridge-filled-top|
|fuel|
|fullscreen|
|fullscreen-exit|
|function|
|function-variant|
|gamepad|
|gamepad-variant|
|garage|
|garage-alert|
|garage-open|
|gas-cylinder|
|gas-station|
|gate|
|gate-and|
|gate-nand|
|gate-nor|
|gate-not|
|gate-or|
|gate-xnor|
|gate-xor|
|gauge|
|gauge-empty|
|gauge-full|
|gauge-low|
|gavel|
|gender-female|
|gender-male|
|gender-male-female|
|gender-transgender|
|gentoo|
|gesture|
|gesture-double-tap|
|gesture-swipe-down|
|gesture-swipe-left|
|gesture-swipe-right|
|gesture-swipe-up|
|gesture-tap|
|gesture-two-double-tap|
|gesture-two-tap|
|ghost|
|ghost-off|
|gift|
|git|
|github-box|
|github-circle|
|github-face|
|glass-cocktail|
|glass-flute|
|glass-mug|
|glass-stange|
|glass-tulip|
|glass-wine|
|glassdoor|
|glasses|
|globe-model|
|gmail|
|gnome|
|golf|
|gondola|
|google|
|google-allo|
|google-analytics|
|google-assistant|
|google-cardboard|
|google-chrome|
|google-circles|
|google-circles-communities|
|google-circles-extended|
|google-circles-group|
|google-controller|
|google-controller-off|
|google-drive|
|google-earth|
|google-fit|
|google-glass|
|google-hangouts|
|google-home|
|google-keep|
|google-lens|
|google-maps|
|google-nearby|
|google-pages|
|google-photos|
|google-physical-web|
|google-play|
|google-plus|
|google-plus-box|
|google-translate|
|google-wallet|
|gpu|
|gradient|
|graphql|
|grease-pencil|
|greater-than|
|greater-than-or-equal|
|grid|
|grid-large|
|grid-off|
|group|
|guitar-acoustic|
|guitar-electric|
|guitar-pick|
|guitar-pick-outline|
|guy-fawkes-mask|
|hackernews|
|hamburger|
|hammer|
|hand-pointing-right|
|hanger|
|hard-hat|
|harddisk|
|headphones|
|headphones-bluetooth|
|headphones-box|
|headphones-off|
|headphones-settings|
|headset|
|headset-dock|
|headset-off|
|heart|
|heart-box|
|heart-box-outline|
|heart-broken|
|heart-circle|
|heart-circle-outline|
|heart-half|
|heart-half-full|
|heart-half-outline|
|heart-off|
|heart-outline|
|heart-pulse|
|help|
|help-box|
|help-circle|
|help-circle-outline|
|help-network|
|hexagon|
|hexagon-multiple|
|hexagon-outline|
|high-definition|
|high-definition-box|
|highway|
|hinduism|
|history|
|hockey-puck|
|hockey-sticks|
|hololens|
|home|
|home-account|
|home-alert|
|home-assistant|
|home-automation|
|home-circle|
|home-currency-usd|
|home-heart|
|home-lock|
|home-lock-open|
|home-map-marker|
|home-minus|
|home-modern|
|home-outline|
|home-plus|
|home-variant|
|hook|
|hook-off|
|hops|
|hospital|
|hospital-building|
|hospital-marker|
|hot-tub|
|hotel|
|houzz|
|houzz-box|
|hulu|
|human|
|human-child|
|human-female|
|human-greeting|
|human-handsdown|
|human-handsup|
|human-male|
|human-male-female|
|human-pregnant|
|humble-bundle|
|ice-cream|
|image|
|image-album|
|image-area|
|image-area-close|
|image-broken|
|image-broken-variant|
|image-filter|
|image-filter-black-white|
|image-filter-center-focus|
|image-filter-center-focus-weak|
|image-filter-drama|
|image-filter-frames|
|image-filter-hdr|
|image-filter-none|
|image-filter-tilt-shift|
|image-filter-vintage|
|image-multiple|
|image-off|
|image-outline|
|image-plus|
|image-search|
|image-search-outline|
|import|
|inbox|
|inbox-arrow-down|
|inbox-arrow-up|
|inbox-multiple|
|incognito|
|infinity|
|information|
|information-outline|
|information-variant|
|instagram|
|instapaper|
|internet-explorer|
|invert-colors|
|islam|
|itunes|
|jeepney|
|jira|
|jquery|
|jsfiddle|
|json|
|judaism|
|karate|
|keg|
|kettle|
|key|
|key-change|
|key-minus|
|key-plus|
|key-remove|
|key-variant|
|keyboard|
|keyboard-backspace|
|keyboard-caps|
|keyboard-close|
|keyboard-off|
|keyboard-outline|
|keyboard-return|
|keyboard-settings|
|keyboard-settings-outline|
|keyboard-tab|
|keyboard-variant|
|kickstarter|
|knife|
|knife-military|
|kodi|
|label|
|label-outline|
|ladybug|
|lambda|
|lamp|
|lan|
|lan-connect|
|lan-disconnect|
|lan-pending|
|language-c|
|language-cpp|
|language-csharp|
|language-css3|
|language-go|
|language-html5|
|language-javascript|
|language-lua|
|language-php|
|language-python|
|language-python-text|
|language-r|
|language-swift|
|language-typescript|
|laptop|
|laptop-chromebook|
|laptop-mac|
|laptop-off|
|laptop-windows|
|lastfm|
|lastpass|
|launch|
|lava-lamp|
|layers|
|layers-off|
|lead-pencil|
|leaf|
|led-off|
|led-on|
|led-outline|
|led-strip|
|led-variant-off|
|led-variant-on|
|led-variant-outline|
|less-than|
|less-than-or-equal|
|library|
|library-books|
|library-music|
|library-plus|
|lifebuoy|
|light-switch|
|lightbulb|
|lightbulb-on|
|lightbulb-on-outline|
|lightbulb-outline|
|lighthouse|
|lighthouse-on|
|link|
|link-off|
|link-variant|
|link-variant-off|
|linkedin|
|linkedin-box|
|linux|
|linux-mint|
|loading|
|lock|
|lock-alert|
|lock-clock|
|lock-open|
|lock-open-outline|
|lock-outline|
|lock-pattern|
|lock-plus|
|lock-question|
|lock-reset|
|lock-smart|
|locker|
|locker-multiple|
|login|
|login-variant|
|logout|
|logout-variant|
|looks|
|loop|
|loupe|
|lumx|
|magnet|
|magnet-on|
|magnify|
|magnify-close|
|magnify-minus|
|magnify-minus-outline|
|magnify-plus|
|magnify-plus-outline|
|mail-ru|
|mailbox|
|map|
|map-marker|
|map-marker-circle|
|map-marker-distance|
|map-marker-minus|
|map-marker-multiple|
|map-marker-off|
|map-marker-outline|
|map-marker-plus|
|map-marker-radius|
|map-minus|
|map-outline|
|map-plus|
|map-search|
|map-search-outline|
|margin|
|markdown|
|marker|
|marker-check|
|material-design|
|material-ui|
|math-compass|
|matrix|
|maxcdn|
|medal|
|medical-bag|
|medium|
|memory|
|menu|
|menu-down|
|menu-down-outline|
|menu-left|
|menu-left-outline|
|menu-right|
|menu-right-outline|
|menu-up|
|menu-up-outline|
|message|
|message-alert|
|message-alert-outline|
|message-bulleted|
|message-bulleted-off|
|message-draw|
|message-image|
|message-outline|
|message-plus|
|message-processing|
|message-reply|
|message-reply-text|
|message-settings|
|message-settings-variant|
|message-text|
|message-text-outline|
|message-video|
|meteor|
|metronome|
|metronome-tick|
|micro-sd|
|microphone|
|microphone-minus|
|microphone-off|
|microphone-outline|
|microphone-plus|
|microphone-settings|
|microphone-variant|
|microphone-variant-off|
|microscope|
|microsoft|
|microsoft-dynamics|
|midi|
|midi-port|
|minecraft|
|mini-sd|
|minidisc|
|minus|
|minus-box|
|minus-box-outline|
|minus-circle|
|minus-circle-outline|
|minus-network|
|mixcloud|
|mixed-reality|
|mixer|
|monitor|
|monitor-cellphone|
|monitor-cellphone-star|
|monitor-dashboard|
|monitor-multiple|
|more|
|motorbike|
|mouse|
|mouse-bluetooth|
|mouse-off|
|mouse-variant|
|mouse-variant-off|
|move-resize|
|move-resize-variant|
|movie|
|movie-roll|
|muffin|
|multiplication|
|multiplication-box|
|mushroom|
|mushroom-outline|
|music|
|music-box|
|music-box-outline|
|music-circle|
|music-note|
|music-note-bluetooth|
|music-note-bluetooth-off|
|music-note-eighth|
|music-note-half|
|music-note-off|
|music-note-quarter|
|music-note-sixteenth|
|music-note-whole|
|music-off|
|nas|
|nativescript|
|nature|
|nature-people|
|navigation|
|near-me|
|needle|
|netflix|
|network|
|network-strength-1|
|network-strength-1-alert|
|network-strength-2|
|network-strength-2-alert|
|network-strength-3|
|network-strength-3-alert|
|network-strength-4|
|network-strength-4-alert|
|network-strength-off|
|network-strength-off-outline|
|network-strength-outline|
|new-box|
|newspaper|
|nfc|
|nfc-tap|
|nfc-variant|
|ninja|
|nintendo-switch|
|nodejs|
|not-equal|
|not-equal-variant|
|note|
|note-multiple|
|note-multiple-outline|
|note-outline|
|note-plus|
|note-plus-outline|
|note-text|
|notebook|
|notification-clear-all|
|npm|
|npm-variant|
|npm-variant-outline|
|nuke|
|null|
|numeric|
|numeric-0-box|
|numeric-0-box-multiple-outline|
|numeric-0-box-outline|
|numeric-1-box|
|numeric-1-box-multiple-outline|
|numeric-1-box-outline|
|numeric-2-box|
|numeric-2-box-multiple-outline|
|numeric-2-box-outline|
|numeric-3-box|
|numeric-3-box-multiple-outline|
|numeric-3-box-outline|
|numeric-4-box|
|numeric-4-box-multiple-outline|
|numeric-4-box-outline|
|numeric-5-box|
|numeric-5-box-multiple-outline|
|numeric-5-box-outline|
|numeric-6-box|
|numeric-6-box-multiple-outline|
|numeric-6-box-outline|
|numeric-7-box|
|numeric-7-box-multiple-outline|
|numeric-7-box-outline|
|numeric-8-box|
|numeric-8-box-multiple-outline|
|numeric-8-box-outline|
|numeric-9-box|
|numeric-9-box-multiple-outline|
|numeric-9-box-outline|
|numeric-9-plus-box|
|numeric-9-plus-box-multiple-outline|
|numeric-9-plus-box-outline|
|nut|
|nutrition|
|oar|
|octagon|
|octagon-outline|
|octagram|
|octagram-outline|
|odnoklassniki|
|office|
|office-building|
|oil|
|oil-temperature|
|omega|
|onedrive|
|onenote|
|onepassword|
|opacity|
|open-in-app|
|open-in-new|
|openid|
|opera|
|orbit|
|ornament|
|ornament-variant|
|owl|
|package|
|package-down|
|package-up|
|package-variant|
|package-variant-closed|
|page-first|
|page-last|
|page-layout-body|
|page-layout-footer|
|page-layout-header|
|page-layout-sidebar-left|
|page-layout-sidebar-right|
|palette|
|palette-advanced|
|palette-swatch|
|panda|
|pandora|
|panorama|
|panorama-fisheye|
|panorama-horizontal|
|panorama-vertical|
|panorama-wide-angle|
|paper-cut-vertical|
|paperclip|
|parking|
|passport|
|patreon|
|pause|
|pause-circle|
|pause-circle-outline|
|pause-octagon|
|pause-octagon-outline|
|paw|
|paw-off|
|paypal|
|peace|
|pen|
|pencil|
|pencil-box|
|pencil-box-outline|
|pencil-circle|
|pencil-circle-outline|
|pencil-lock|
|pencil-off|
|pentagon|
|pentagon-outline|
|percent|
|periodic-table|
|periodic-table-co2|
|periscope|
|pharmacy|
|phone|
|phone-bluetooth|
|phone-classic|
|phone-forward|
|phone-hangup|
|phone-in-talk|
|phone-incoming|
|phone-locked|
|phone-log|
|phone-minus|
|phone-missed|
|phone-outgoing|
|phone-paused|
|phone-plus|
|phone-return|
|phone-rotate-landscape|
|phone-rotate-portrait|
|phone-settings|
|phone-voip|
|pi|
|pi-box|
|piano|
|pickaxe|
|pier|
|pier-crane|
|pig|
|pill|
|pillar|
|pin|
|pin-off|
|pin-off-outline|
|pin-outline|
|pine-tree|
|pine-tree-box|
|pinterest|
|pinterest-box|
|pipe|
|pipe-disconnected|
|pipe-leak|
|pistol|
|piston|
|pizza|
|plane-shield|
|play|
|play-box-outline|
|play-circle|
|play-circle-outline|
|play-network|
|play-pause|
|play-protected-content|
|play-speed|
|playlist-check|
|playlist-edit|
|playlist-minus|
|playlist-play|
|playlist-plus|
|playlist-remove|
|playstation|
|plex|
|plus|
|plus-box|
|plus-box-outline|
|plus-circle|
|plus-circle-multiple-outline|
|plus-circle-outline|
|plus-minus|
|plus-minus-box|
|plus-network|
|plus-one|
|plus-outline|
|pocket|
|podcast|
|pokeball|
|pokemon-go|
|poker-chip|
|polaroid|
|poll|
|poll-box|
|polymer|
|pool|
|popcorn|
|pot|
|pot-mix|
|pound|
|pound-box|
|power|
|power-cycle|
|power-off|
|power-on|
|power-plug|
|power-plug-off|
|power-settings|
|power-sleep|
|power-socket|
|power-socket-au|
|power-socket-eu|
|power-socket-uk|
|power-socket-us|
|power-standby|
|powershell|
|prescription|
|presentation|
|presentation-play|
|printer|
|printer-3d|
|printer-alert|
|printer-settings|
|printer-wireless|
|priority-high|
|priority-low|
|professional-hexagon|
|progress-check|
|progress-clock|
|progress-download|
|progress-upload|
|projector|
|projector-screen|
|publish|
|pulse|
|puzzle|
|qi|
|qqchat|
|qrcode|
|qrcode-edit|
|qrcode-scan|
|quadcopter|
|quality-high|
|quality-low|
|quality-medium|
|quicktime|
|rabbit|
|radar|
|radiator|
|radio|
|radio-handheld|
|radio-tower|
|radioactive|
|radiobox-blank|
|radiobox-marked|
|raspberrypi|
|ray-end|
|ray-end-arrow|
|ray-start|
|ray-start-arrow|
|ray-start-end|
|ray-vertex|
|react|
|read|
|receipt|
|record|
|record-player|
|record-rec|
|recycle|
|reddit|
|redo|
|redo-variant|
|refresh|
|regex|
|relative-scale|
|reload|
|reminder|
|remote|
|remote-desktop|
|rename-box|
|reorder-horizontal|
|reorder-vertical|
|repeat|
|repeat-off|
|repeat-once|
|replay|
|reply|
|reply-all|
|reproduction|
|resize-bottom-right|
|responsive|
|restart|
|restore|
|restore-clock|
|rewind|
|rewind-outline|
|rhombus|
|rhombus-outline|
|ribbon|
|rice|
|ring|
|road|
|road-variant|
|robot|
|robot-vacuum|
|robot-vacuum-variant|
|rocket|
|room-service|
|rotate-3d|
|rotate-left|
|rotate-left-variant|
|rotate-right|
|rotate-right-variant|
|rounded-corner|
|router-wireless|
|routes|
|rowing|
|rss|
|rss-box|
|ruler|
|run|
|run-fast|
|sale|
|salesforce|
|sass|
|satellite|
|satellite-uplink|
|satellite-variant|
|sausage|
|saxophone|
|scale|
|scale-balance|
|scale-bathroom|
|scanner|
|scanner-off|
|school|
|screen-rotation|
|screen-rotation-lock|
|screwdriver|
|script|
|sd|
|seal|
|search-web|
|seat-flat|
|seat-flat-angled|
|seat-individual-suite|
|seat-legroom-extra|
|seat-legroom-normal|
|seat-legroom-reduced|
|seat-recline-extra|
|seat-recline-normal|
|security|
|security-account|
|security-close|
|security-home|
|security-lock|
|security-network|
|security-off|
|select|
|select-all|
|select-inverse|
|select-off|
|selection|
|selection-off|
|send|
|send-secure|
|serial-port|
|server|
|server-minus|
|server-network|
|server-network-off|
|server-off|
|server-plus|
|server-remove|
|server-security|
|set-all|
|set-center|
|set-center-right|
|set-left|
|set-left-center|
|set-left-right|
|set-none|
|set-right|
|set-top-box|
|settings|
|settings-box|
|settings-outline|
|shape|
|shape-circle-plus|
|shape-outline|
|shape-plus|
|shape-polygon-plus|
|shape-rectangle-plus|
|shape-square-plus|
|share|
|share-outline|
|share-variant|
|shield|
|shield-half-full|
|shield-outline|
|ship-wheel|
|shopping|
|shopping-music|
|shovel|
|shovel-off|
|shower|
|shower-head|
|shredder|
|shuffle|
|shuffle-disabled|
|shuffle-variant|
|sigma|
|sigma-lower|
|sign-caution|
|sign-direction|
|sign-text|
|signal|
|signal-2g|
|signal-3g|
|signal-4g|
|signal-cellular-1|
|signal-cellular-2|
|signal-cellular-3|
|signal-cellular-outline|
|signal-hspa|
|signal-hspa-plus|
|signal-off|
|signal-variant|
|silverware|
|silverware-fork|
|silverware-spoon|
|silverware-variant|
|sim|
|sim-alert|
|sim-off|
|sitemap|
|skip-backward|
|skip-forward|
|skip-next|
|skip-next-circle|
|skip-next-circle-outline|
|skip-previous|
|skip-previous-circle|
|skip-previous-circle-outline|
|skull|
|skype|
|skype-business|
|slack|
|slackware|
|sleep|
|sleep-off|
|smoke-detector|
|smoking|
|smoking-off|
|snapchat|
|snowflake|
|snowman|
|soccer|
|soccer-field|
|sofa|
|solid|
|sort|
|sort-alphabetical|
|sort-ascending|
|sort-descending|
|sort-numeric|
|sort-variant|
|soundcloud|
|source-branch|
|source-commit|
|source-commit-end|
|source-commit-end-local|
|source-commit-local|
|source-commit-next-local|
|source-commit-start|
|source-commit-start-next-local|
|source-fork|
|source-merge|
|source-pull|
|soy-sauce|
|speaker|
|speaker-bluetooth|
|speaker-off|
|speaker-wireless|
|speedometer|
|spellcheck|
|spotify|
|spotlight|
|spotlight-beam|
|spray|
|square|
|square-edit-outline|
|square-inc|
|square-inc-cash|
|square-outline|
|square-root|
|square-root-box|
|ssh|
|stack-exchange|
|stack-overflow|
|stadium|
|stairs|
|standard-definition|
|star|
|star-circle|
|star-circle-outline|
|star-face|
|star-half|
|star-off|
|star-outline|
|steam|
|steam-box|
|steering|
|steering-off|
|step-backward|
|step-backward-2|
|step-forward|
|step-forward-2|
|stethoscope|
|sticker|
|sticker-emoji|
|stocking|
|stop|
|stop-circle|
|stop-circle-outline|
|store|
|store-24-hour|
|stove|
|subdirectory-arrow-left|
|subdirectory-arrow-right|
|subtitles|
|subtitles-outline|
|subway|
|subway-variant|
|summit|
|sunglasses|
|surround-sound|
|surround-sound-2-0|
|surround-sound-3-1|
|surround-sound-5-1|
|surround-sound-7-1|
|svg|
|swap-horizontal|
|swap-horizontal-variant|
|swap-vertical|
|swap-vertical-variant|
|swim|
|switch|
|sword|
|sword-cross|
|sync|
|sync-alert|
|sync-off|
|tab|
|tab-plus|
|tab-unselected|
|table|
|table-column|
|table-column-plus-after|
|table-column-plus-before|
|table-column-remove|
|table-column-width|
|table-edit|
|table-large|
|table-merge-cells|
|table-of-contents|
|table-row|
|table-row-height|
|table-row-plus-after|
|table-row-plus-before|
|table-row-remove|
|table-search|
|table-settings|
|tablet|
|tablet-android|
|tablet-cellphone|
|tablet-ipad|
|taco|
|tag|
|tag-faces|
|tag-heart|
|tag-minus|
|tag-multiple|
|tag-outline|
|tag-plus|
|tag-remove|
|tag-text-outline|
|target|
|taxi|
|teach|
|teamviewer|
|telegram|
|television|
|television-box|
|television-classic|
|television-classic-off|
|television-guide|
|television-off|
|temperature-celsius|
|temperature-fahrenheit|
|temperature-kelvin|
|tennis|
|tent|
|terrain|
|test-tube|
|test-tube-empty|
|test-tube-off|
|text|
|text-shadow|
|text-short|
|text-subject|
|text-to-speech|
|text-to-speech-off|
|textbox|
|textbox-password|
|texture|
|theater|
|theme-light-dark|
|thermometer|
|thermometer-lines|
|thermostat|
|thermostat-box|
|thought-bubble|
|thought-bubble-outline|
|thumb-down|
|thumb-down-outline|
|thumb-up|
|thumb-up-outline|
|thumbs-up-down|
|ticket|
|ticket-account|
|ticket-confirmation|
|ticket-outline|
|ticket-percent|
|tie|
|tilde|
|timelapse|
|timer|
|timer-10|
|timer-3|
|timer-off|
|timer-sand|
|timer-sand-empty|
|timer-sand-full|
|timetable|
|toggle-switch|
|toggle-switch-off|
|toggle-switch-off-outline|
|toggle-switch-outline|
|toilet|
|toolbox|
|toolbox-outline|
|tooltip|
|tooltip-edit|
|tooltip-image|
|tooltip-outline|
|tooltip-outline-plus|
|tooltip-text|
|tooth|
|tooth-outline|
|tor|
|tournament|
|tower-beach|
|tower-fire|
|towing|
|track-light|
|trackpad|
|trackpad-lock|
|tractor|
|traffic-light|
|train|
|train-variant|
|tram|
|transcribe|
|transcribe-close|
|transfer|
|transit-transfer|
|transition|
|transition-masked|
|translate|
|treasure-chest|
|tree|
|trello|
|trending-down|
|trending-neutral|
|trending-up|
|triangle|
|triangle-outline|
|trophy|
|trophy-award|
|trophy-outline|
|trophy-variant|
|trophy-variant-outline|
|truck|
|truck-delivery|
|truck-fast|
|truck-trailer|
|tshirt-crew|
|tshirt-v|
|tumble-dryer|
|tumblr|
|tumblr-box|
|tumblr-reblog|
|tune|
|tune-vertical|
|twitch|
|twitter|
|twitter-box|
|twitter-circle|
|twitter-retweet|
|two-factor-authentication|
|uber|
|ubuntu|
|ultra-high-definition|
|umbraco|
|umbrella|
|umbrella-closed|
|umbrella-outline|
|undo|
|undo-variant|
|unfold-less-horizontal|
|unfold-less-vertical|
|unfold-more-horizontal|
|unfold-more-vertical|
|ungroup|
|unity|
|unreal|
|untappd|
|update|
|upload|
|upload-multiple|
|upload-network|
|usb|
|van-passenger|
|van-utility|
|vanish|
|vector-arrange-above|
|vector-arrange-below|
|vector-circle|
|vector-circle-variant|
|vector-combine|
|vector-curve|
|vector-difference|
|vector-difference-ab|
|vector-difference-ba|
|vector-ellipse|
|vector-intersection|
|vector-line|
|vector-point|
|vector-polygon|
|vector-polyline|
|vector-radius|
|vector-rectangle|
|vector-selection|
|vector-square|
|vector-triangle|
|vector-union|
|venmo|
|verified|
|vhs|
|vibrate|
|video|
|video-3d|
|video-4k-box|
|video-account|
|video-image|
|video-input-antenna|
|video-input-component|
|video-input-hdmi|
|video-input-svideo|
|video-minus|
|video-off|
|video-plus|
|video-stabilization|
|video-switch|
|video-vintage|
|view-agenda|
|view-array|
|view-carousel|
|view-column|
|view-dashboard|
|view-dashboard-outline|
|view-dashboard-variant|
|view-day|
|view-grid|
|view-headline|
|view-list|
|view-module|
|view-parallel|
|view-quilt|
|view-sequential|
|view-stream|
|view-week|
|vimeo|
|violin|
|virtual-reality|
|visual-studio|
|visual-studio-code|
|vk|
|vk-box|
|vk-circle|
|vlc|
|voice|
|voicemail|
|volleyball|
|volume-high|
|volume-low|
|volume-medium|
|volume-minus|
|volume-mute|
|volume-off|
|volume-plus|
|vote|
|vote-outline|
|vpn|
|vuejs|
|walk|
|wall|
|wall-sconce|
|wall-sconce-flat|
|wall-sconce-variant|
|wallet|
|wallet-giftcard|
|wallet-membership|
|wallet-travel|
|wan|
|washing-machine|
|watch|
|watch-export|
|watch-export-variant|
|watch-import|
|watch-import-variant|
|watch-variant|
|watch-vibrate|
|water|
|water-off|
|water-percent|
|water-pump|
|watermark|
|waves|
|weather-cloudy|
|weather-fog|
|weather-hail|
|weather-hurricane|
|weather-lightning|
|weather-lightning-rainy|
|weather-night|
|weather-partlycloudy|
|weather-pouring|
|weather-rainy|
|weather-snowy|
|weather-snowy-rainy|
|weather-sunny|
|weather-sunset|
|weather-sunset-down|
|weather-sunset-up|
|weather-windy|
|weather-windy-variant|
|web|
|webcam|
|webhook|
|webpack|
|wechat|
|weight|
|weight-kilogram|
|weight-pound|
|whatsapp|
|wheelchair-accessibility|
|whistle|
|white-balance-auto|
|white-balance-incandescent|
|white-balance-iridescent|
|white-balance-sunny|
|widgets|
|wifi|
|wifi-off|
|wifi-strength-1|
|wifi-strength-1-alert|
|wifi-strength-1-lock|
|wifi-strength-2|
|wifi-strength-2-alert|
|wifi-strength-2-lock|
|wifi-strength-3|
|wifi-strength-3-alert|
|wifi-strength-3-lock|
|wifi-strength-4|
|wifi-strength-4-alert|
|wifi-strength-4-lock|
|wifi-strength-alert-outline|
|wifi-strength-lock-outline|
|wifi-strength-off|
|wifi-strength-off-outline|
|wifi-strength-outline|
|wii|
|wiiu|
|wikipedia|
|window-close|
|window-closed|
|window-maximize|
|window-minimize|
|window-open|
|window-restore|
|windows|
|windows-classic|
|wordpress|
|worker|
|wrap|
|wrench|
|wunderlist|
|xamarin|
|xamarin-outline|
|xaml|
|xbox|
|xbox-controller|
|xbox-controller-battery-alert|
|xbox-controller-battery-empty|
|xbox-controller-battery-full|
|xbox-controller-battery-low|
|xbox-controller-battery-medium|
|xbox-controller-battery-unknown|
|xbox-controller-off|
|xda|
|xing|
|xing-box|
|xing-circle|
|xml|
|xmpp|
|yammer|
|yeast|
|yelp|
|yin-yang|
|youtube|
|youtube-creator-studio|
|youtube-gaming|
|youtube-tv|
|zip-box|
|zip-disk|

### Material Design Color Pallete

|Color Name|
|---|
|amber-50|
|amber-100|
|amber-200|
|amber-300|
|amber-400|
|amber-500|
|amber-600|
|amber-700|
|amber-800|
|amber-900|
|amber-A100|
|amber-A200|
|amber-A400|
|amber-A700|
|black|
|blue-50|
|blue-100|
|blue-200|
|blue-300|
|blue-400|
|blue-500|
|blue-600|
|blue-700|
|blue-800|
|blue-900|
|blue-A100|
|blue-A200|
|blue-A400|
|blue-A700|
|blue-gray-50|
|blue-gray-100|
|blue-gray-200|
|blue-gray-300|
|blue-gray-400|
|blue-gray-500|
|blue-gray-600|
|blue-gray-700|
|blue-gray-800|
|blue-gray-900|
|brown-50|
|brown-100|
|brown-200|
|brown-300|
|brown-400|
|brown-500|
|brown-600|
|brown-700|
|brown-800|
|brown-900|
|cyan-50|
|cyan-100|
|cyan-200|
|cyan-300|
|cyan-400|
|cyan-500|
|cyan-600|
|cyan-700|
|cyan-800|
|cyan-900|
|cyan-A100|
|cyan-A200|
|cyan-A400|
|cyan-A700|
|deep-orange-50|
|deep-orange-100|
|deep-orange-200|
|deep-orange-300|
|deep-orange-400|
|deep-orange-500|
|deep-orange-600|
|deep-orange-700|
|deep-orange-800|
|deep-orange-900|
|deep-orange-A100|
|deep-orange-A200|
|deep-orange-A400|
|deep-orange-A700|
|deep-purple-50|
|deep-purple-100|
|deep-purple-200|
|deep-purple-300|
|deep-purple-400|
|deep-purple-500|
|deep-purple-600|
|deep-purple-700|
|deep-purple-800|
|deep-purple-900|
|deep-purple-A100|
|deep-purple-A200|
|deep-purple-A400|
|deep-purple-A700|
|gray-50|
|gray-100|
|gray-200|
|gray-300|
|gray-400|
|gray-500|
|gray-600|
|gray-700|
|gray-800|
|gray-900|
|green-50|
|green-100|
|green-200|
|green-300|
|green-400|
|green-500|
|green-600|
|green-700|
|green-800|
|green-900|
|green-A100|
|green-A200|
|green-A400|
|green-A700|
|indigo-50|
|indigo-100|
|indigo-200|
|indigo-300|
|indigo-400|
|indigo-500|
|indigo-600|
|indigo-700|
|indigo-800|
|indigo-900|
|indigo-A100|
|indigo-A200|
|indigo-A400|
|indigo-A700|
|light-blue-50|
|light-blue-100|
|light-blue-200|
|light-blue-300|
|light-blue-400|
|light-blue-500|
|light-blue-600|
|light-blue-700|
|light-blue-800|
|light-blue-900|
|light-blue-A100|
|light-blue-A200|
|light-blue-A400|
|light-blue-A700|
|light-green-50|
|light-green-100|
|light-green-200|
|light-green-300|
|light-green-400|
|light-green-500|
|light-green-600|
|light-green-700|
|light-green-800|
|light-green-900|
|light-green-A100|
|light-green-A200|
|light-green-A400|
|light-green-A700|
|lime-50|
|lime-100|
|lime-200|
|lime-300|
|lime-400|
|lime-500|
|lime-600|
|lime-700|
|lime-800|
|lime-900|
|lime-A100|
|lime-A200|
|lime-A400|
|lime-A700|
|orange-50|
|orange-100|
|orange-200|
|orange-300|
|orange-400|
|orange-500|
|orange-600|
|orange-700|
|orange-800|
|orange-900|
|orange-A100|
|orange-A200|
|orange-A400|
|orange-A700|
|pink-50|
|pink-100|
|pink-200|
|pink-300|
|pink-400|
|pink-500|
|pink-600|
|pink-700|
|pink-800|
|pink-900|
|pink-A100|
|pink-A200|
|pink-A400|
|pink-A700|
|purple-50|
|purple-100|
|purple-200|
|purple-300|
|purple-400|
|purple-500|
|purple-600|
|purple-700|
|purple-800|
|purple-900|
|purple-A100|
|purple-A200|
|purple-A400|
|purple-A700|
|red-50|
|red-100|
|red-200|
|red-300|
|red-400|
|red-500|
|red-600|
|red-700|
|red-800|
|red-900|
|red-A100|
|red-A200|
|red-A400|
|red-A700|
|teal-50|
|teal-100|
|teal-200|
|teal-300|
|teal-400|
|teal-500|
|teal-600|
|teal-700|
|teal-800|
|teal-900|
|teal-A100|
|teal-A200|
|teal-A400|
|teal-A700|
|white|
|yellow-50|
|yellow-100|
|yellow-200|
|yellow-300|
|yellow-400|
|yellow-500|
|yellow-600|
|yellow-700|
|yellow-800|
|yellow-900|
|yellow-A100|
|yellow-A200|
|yellow-A400|
|yellow-A700|


## License

Bricks snippets for Visual studio code plugin is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).


## Disclaimer:
Special thanks to [Ashok Koyi](https://github.com/thekalinga)

Readme template for this plugin was initially borrowed from [here](https://github.com/thekalinga/bootstrap4-vscode) & [here](https://github.com/bodiam/intellij-bootstrap3) & [here](https://github.com/JasonMortonNZ/bs3-sublime-plugin)