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
@@@GENERATED_DOCUMENTATION_PLACEHOLDER@@@

## License

Bricks snippets for Visual studio code plugin is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).


## Disclaimer:
Special thanks to [Ashok Koyi](https://github.com/thekalinga)

Readme template for this plugin was initially borrowed from [here](https://github.com/thekalinga/bootstrap4-vscode) & [here](https://github.com/bodiam/intellij-bootstrap3) & [here](https://github.com/JasonMortonNZ/bs3-sublime-plugin)