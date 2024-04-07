import java.util.Scanner;
import java.util.Random;

public class number_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 10;
        
        System.out.println("Welcome to the Guess the Number game!");

        while (true) {
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("I have selected a number between 1 and 100. Try to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number " + targetNumber + "!");
                    guessedCorrectly = true;
                    break;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + targetNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thank you for playing!");
                break;
            }
        }

        scanner.close();
    }
}
