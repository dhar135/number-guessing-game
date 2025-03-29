# Number Guessing Game

A simple command-line number guessing game built in Java as part of the Roadmap.sh project.

Project Link: [Number Guessing Game](https://roadmap.sh/projects/number-guessing-game)

## Description

This is a console-based number guessing game where the player tries to guess a randomly generated number between 1 and 100. The game features three difficulty levels, each with a different number of attempts allowed.

## Features

- Three difficulty levels:
  - Easy: 10 attempts
  - Medium: 5 attempts
  - Hard: 3 attempts
- Interactive command-line interface
- Hints after each guess (higher/lower)
- Attempt tracking
- Random number generation between 1 and 100

## Prerequisites

- Java Development Kit (JDK) 17 or higher

## How to Run

### Option 1: Using the Script (Recommended)

1. Clone the repository:

```bash
git clone https://github.com/yourusername/number-guessing-game.git
cd number-guessing-game
```

2. Make the script executable and run it:

```bash
chmod +x script.sh
./script.sh
```

The script will automatically:

- Clean up any existing compiled classes
- Compile all Java files
- Run the game

### Option 2: Manual Compilation

1. Clone the repository:

```bash
git clone https://github.com/yourusername/number-guessing-game.git
cd number-guessing-game
```

2. Compile the Java files:

```bash
javac src/main/java/*.java
```

3. Run the game:

```bash
java -cp src/main/java Main
```

## How to Play

1. Launch the game using one of the methods above
2. Select a difficulty level (1 for Easy, 2 for Medium, 3 for Hard)
3. Enter your guess when prompted
4. Receive feedback on whether your guess was too high or too low
5. Continue guessing until you either:
   - Guess the correct number
   - Run out of attempts

## Project Structure

```
src/main/java/
├── Main.java         # Entry point of the application
├── CLI.java          # Command-line interface implementation
├── Game.java         # Core game logic
└── Difficulty.java   # Difficulty level enum
script.sh            # Convenience script for building and running the game
```

## Contributing

Feel free to submit issues and enhancement requests!

### Future Features

- Implement a hint system that provides clues to the user if they are stuck.
- Keep track of the user’s high score (i.e., the fewest number of attempts it took to guess the number under a specific difficulty level).

## License

This project is open source and available under the [MIT License](LICENSE).
