import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    // Create a main() method
    public static void main(String[] args) {


        // Use the following code to create a random number from 1 to 100:
        // Note: you may have to import the Random class
        // int randomNumber = new Random().nextInt(100) + 1;
        int randomNumber = new Random().nextInt(100) + 1;
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Create a variable to hold the number of guess attempts, example
        // int guessAttempts = 6;
        int guessAttempts = 10;

        // While the user has more than 0 guess attempts...
        while (guessAttempts > 0) {

        // Ask the user for a number between 1 and 100
            System.out.println("\nEnter a number from 1 to 100: ");
            int amount = scanner.nextInt();
        // If the user's number matches the random number tell the user they guessed correctly!
        // Stop the program using:
        // System.exit(0);
            if ( amount == randomNumber ){
                System.out.println("WOW! You're that good! You guessed it!!!\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89");
                System.exit(0);
            }

        // Otherwise, if the user's number is lower than the random number,
        // tell them they guessed too low
            else if (amount < randomNumber ){
                System.out.println("What's going on? Are you scared? That's way too low!");

        // Decrease the number of attempts by 1
                guessAttempts -= 1;
            }
        // Otherwise, tell the user they guessed too high
            else {
                System.out.println("Hold your horses... That is way too high!");

        // Decrease the number of attempts by 1
                guessAttempts -= 1;
            }
        // Outside the loop, tell the user they have lost and reveal the random number!
        }
        System.out.println("Now that's a bummer... The number was: " + randomNumber);


        /*
         * Feel free to add any additional rules :)
         */
    }
}
