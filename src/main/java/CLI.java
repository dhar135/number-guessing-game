import java.util.Scanner;

public class CLI {

    private final Scanner scanner = new Scanner(System.in);
    private int round = 1;

    public void start() {
        while (true) {
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100.");

            Difficulty difficulty = selectDifficulty();
            Game game = new Game(difficulty);

            System.out.println("Great! You have selected the " + difficulty.name() + " difficulty.\n");

            System.out.println("Round " + round);

            while (game.hasAttemptsLeft()) {

                System.out.print("Enter your guess: \n");
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number between 1 and 100.");
                    scanner.nextLine();
                    continue;
                }

                int guess = scanner.nextInt();
                scanner.nextLine();

                String feedback = game.makeGuess(guess);
                System.out.println(feedback);
                if (guess != game.getTargetNumber()) {
                    System.out.println("Your Attempts: " + game.getAttempts() + " | " + "Attempts Left: "
                            + game.getAttemptsLeft() + "\n");
                } else {
                    break;
                }
            }
            System.out.println("Press Q if you would like to quit. Otherwise, press any key to play another round!");

            String response = scanner.nextLine();
            if (!response.equals("Q") && !response.equals("q")) {
                System.out.println("Starting a New Game!");
                round++;
            } else {
                System.out.println("Game Ending!");
                break;
            }
        }

    }

    private Difficulty selectDifficulty() {
        System.out.println("Please select the difficulty level: ");
        System.out.println("1. Easy (10 chances)\n2. Medium (5 chances)\n3. Hard (3 chances)");
        System.out.print("Enter your choice (1 – 3): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid choice. Defaulting to Medium.");
            scanner.nextLine();
            return Difficulty.MEDIUM;
        }

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
