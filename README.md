# Automated Cafe Machine Game

A desktop cafe machine game built with Java Swing for a second-year university project.

The player works as an automated cafe machine: customers arrive, request drinks, and the player has to choose the correct ingredients before time runs out.

## Features

- Main menu, how-to-play screen, and character info cards
- Customer animations and random drink requests
- Ingredient buttons for making drinks
- Multiple drink combinations, including hot, iced, blended, and soda drinks
- Level start, complete, and failed screens
- Custom pixel-style image assets and font

## Tech Used

- Java
- Java Swing
- Java AWT
- Eclipse project structure
- VS Code Java extension support
- PNG assets for UI, customers, ingredients, and backgrounds

## Project Structure

```text
src/
  ActualGame/   Main entry screens and game flow
  Game/         Machine, menu, customer, and gameplay logic

res/            Images, font, buttons, backgrounds, and drink assets
```

## Main Class

```text
ActualGame.TaoBinTesting
```

## How to Run

This project was originally made in Eclipse and can run with Java 8 or newer.

### Quick Run on macOS

Double-click `run-game.command` from this project folder.

If macOS blocks it, open Terminal in this folder and run:

```sh
chmod +x run-game.command
./run-game.command
```

You need a Java runtime to use the launcher. To edit or run from VS Code/Eclipse, install a full Java JDK, not only a JRE.

### Run in VS Code

1. Install a Java JDK, version 8 or newer.
2. Install the VS Code extension: `Extension Pack for Java`.
3. Open this folder in VS Code.
4. Open the Run and Debug panel.
5. Select `Run Cafe Machine Game`.
6. Click Run.

### Run in Eclipse

1. Install a Java JDK, version 8 or newer.
2. Open Eclipse.
3. Go to `File > Import > General > Existing Projects into Workspace`.
4. Select this project folder.
5. Run `src/ActualGame/TaoBinTesting.java` as a Java Application.

If Eclipse says this folder is not a valid project, make sure `.project` and `.classpath` exist in the project root. Those files tell Eclipse that this is a Java project.

## Notes

This is an older student project, so some code and layout choices are not fully polished. The goal of this repository is to preserve and showcase the original Java Swing game.
