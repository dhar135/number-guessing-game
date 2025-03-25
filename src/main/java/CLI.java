import java.util.Scanner;

public class CLI {

    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        Difficulty difficulty = selectDifficulty();
        Game game = new Game(difficulty);

        System.out.println("Great! You have selected the " + difficulty + " difficulty.\n");

        while (game.hasAttemptsLeft()) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            String feedback = game.makeGuess(guess);
            System.out.println(feedback);
            if (guess != game.getTargetNumber()) {
                System.out.println("Your Attempts: " + game.getAttempts() + " | " + "Attempts Left: " + game.getAttemptsLeft() + "\n");
            } else {
                return;
            }
        }

        System.out.println("Game Over! The number was " + game.getTargetNumber() + ".");

    }

    private Difficulty selectDifficulty() {
        System.out.println("Please select the difficulty level: ");
        System.out.println("1. Easy (10 chances)\n2. Medium (5 chances)\n3. Hard (3 chances)");
        System.out.print("Enter your choice (1–3): ");

        int difficulty = scanner.nextInt();
        return switch (difficulty) {
            case 1 -> Difficulty.EASY;
            case 2 -> Difficulty.MEDIUM;
            case 3 -> Difficulty.HARD;
            default -> {
                System.out.println("Invalid choice. Defaulting to Medium.");
                yield Difficulty.MEDIUM;
            }
        };
    }
}
