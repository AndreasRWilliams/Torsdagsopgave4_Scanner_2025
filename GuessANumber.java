import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    private static int rnd_number;

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1; // Random number between 1 and 100
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess(); // Start the guessing process
    }

    private static void makeAGuess() {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess:");

        // Check if the input is numeric using hasNextInt()
        if (scanner.hasNextInt()) {
            // Read user input
            int guess = scanner.nextInt();

            // Compare the guess with the random number
            if (guess < rnd_number) {
                System.out.println("Your guess is too low. Try again.");
                makeAGuess(); // Recursive call to let the user guess again
            } else if (guess > rnd_number) {
                System.out.println("Your guess is too high. Try again.");
                makeAGuess(); // Recursive call to let the user guess again
            } else {
                // If the guess is correct
                System.out.println("Congratulations! You guessed the right number.");
            }
        } else {
            // If input was not numeric, show an error message
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next(); // Consume the invalid input to avoid an infinite loop
            makeAGuess(); // Recursive call to let the user try again
        }
    }
}
