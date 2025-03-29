import java.util.Random;

public class Game {

    private final int targetNumber;
    private int attemptsLeft;
    private int attempts;
    private final long startTime;

    public Game(Difficulty difficulty) {
        this.targetNumber = new Random().nextInt(1, 101); // Generates a random number between 1 and 100
        this.attemptsLeft = difficulty.getChances();
        this.attempts = 0;
        this.startTime = System.currentTimeMillis();
    }

    public String makeGuess(int guess) {
        if (attemptsLeft <= 0) {
            return "No attempts left! The number was " + targetNumber + "!";
        }
        attemptsLeft--;
        attempts++;

        if (guess == targetNumber) {
            long endTime = System.currentTimeMillis();
            // Calculate elapsed time in seconds
            double elapsedTime = (endTime - startTime) / 1000.0;
            return "Congratulations! You guessed the correct number " + targetNumber + " in " + attempts + " attempts!\n" + "Elapsed Time: " + elapsedTime + "s";
        } else if (guess > targetNumber) {
            return "Incorrect! The number is less than " + guess + ".";
        } else {
            return "Incorrect! The number is greater than " + guess + ".";
        }
    }

    public boolean hasAttemptsLeft() {
        return attemptsLeft > 0;
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public int getAttempts() {
        return attempts;
    }

}
