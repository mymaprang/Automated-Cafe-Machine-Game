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

This project was originally made in Eclipse and uses Java 17.

### Run in VS Code

1. Install JDK 17.
2. Install the VS Code extension: `Extension Pack for Java`.
3. Open this folder in VS Code.
4. Open `src/ActualGame/TaoBinTesting.java`.
5. Click `Run` above the `main` method.

### Run in Eclipse

1. Install JDK 17.
2. Open Eclipse.
3. Go to `File > Import > General > Existing Projects into Workspace`.
4. Select this project folder.
5. Run `src/ActualGame/TaoBinTesting.java` as a Java Application.

## Notes

This is an older student project, so some code and layout choices are not fully polished. The goal of this repository is to preserve and showcase the original Java Swing game.

