import java.util.Random;

public class Game {

    private final int targetNumber;
    private int attemptsLeft;
    private int attempts;
    private int round;
    private boolean quit;

    public Game(Difficulty difficulty) {
        this.targetNumber = new Random().nextInt(1, 101); // Generates a random number between 1 and 100
        this.attemptsLeft = difficulty.getChances();
        this.attempts = 0;
        this.round = 1;
        this.quit = false;
    }

    public String makeGuess(int guess) {
        if (attemptsLeft <= 0) {
            return "No attempts left! The number was " + targetNumber + "!";
        }
        attemptsLeft--;
        attempts++;

        if (guess == targetNumber) {
            return "Congratulations! You guessed the correct number in " + attempts + " attempts!";
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

    public int getRound() {
        return round;
    }

    public void incrementRound() {
        round++;
    }

    public void setQuit(boolean quit) {
        this.quit = quit;
    }

    public boolean getQuit() {
        return quit;
    }

    public Game newGame(Difficulty difficulty) {
        return new Game(difficulty);
    }

}
