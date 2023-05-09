# com.tyler.project2

This package contains the source code for the Pokemon game application. The code is organized into several classes, each of which has a specific responsibility.
## Classes
### Pokemon

The Pokemon class represents a single Pokemon in the game. It has fields for the Pokemon's name, hit points, move, move power, and attack speed, as well as methods for getting and setting these fields and displaying the Pokemon's stats.
### PokemonSelection

The PokemonSelection class is responsible for getting information from the user to create instances of the Pokemon class. It has methods for creating a new Pokemon instance and assigning that instance to a player.
### Main

The Main class is the entry point for the Pokemon game application. It creates an instance of the PokemonSelection class and uses that instance to assign Pokemon to each player.
## Dependencies

The Pokemon game application has no external dependencies. However, it does depend on the Java standard library, which should be available on any system with Java installed.
Building and Running

To build and run the Pokemon game application, you can use the following steps:

1. Clone the project from GitHub to your local machine.
2. Open the project in Intellij IDEA.
3. Compile the code by clicking the "Build" menu and selecting "Build Project".
4. Run the application by running the Main class. You can do this by right-clicking on the class in the project view and selecting "Run Main.main()".

The application will prompt you to enter information about each player's Pokemon, and then it will display the stats for each Pokemon.