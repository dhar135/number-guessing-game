# Number Guessing Game

A simple command-line number guessing game built in Java as part of the Roadmap.sh project.

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

1. Launch the game using the commands above
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
```

## Contributing

Feel free to submit issues and enhancement requests!

## License

This project is open source and available under the [MIT License](LICENSE).
