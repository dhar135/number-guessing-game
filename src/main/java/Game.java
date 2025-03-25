import java.util.Random;

public class Game {

    private final int targetNumber;
    private int attemptsLeft;
    private final Difficulty difficulty;

    public Game(Difficulty difficulty) {
        this.difficulty = difficulty;
        this.targetNumber = new Random().nextInt(1, 101); // Generates a random number between 1 and 100
        this.attemptsLeft = difficulty.getChances();
    }

    public String makeGuess(int guess) {
        if (attemptsLeft <= 0) {
            return "No attempts left! The number was " + targetNumber + "!";
        }
        attemptsLeft--;

        if (guess ==  targetNumber) {
            return "Congratulations! You guessed the correct number in " + attemptsLeft + " attempts!";
        }
        else if (guess > targetNumber) {
            return "Incorrect! The number is less than " + guess + ".";
        }
        else {
            return "Incorrect! The number is greater than " + guess + ".";
        }
    }
}
