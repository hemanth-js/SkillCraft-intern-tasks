import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1; // 1 to 100
        int guess;
        int attempts = 0;

        System.out.println("==================================");
        System.out.println("Guess the Number Game");
        System.out.println("==================================");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Can you guess it? ");

        do {
            System.out.print("\nEnter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }

        } while (guess != randomNumber);

        sc.close();
    }
}
