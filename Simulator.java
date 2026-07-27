import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Simulator {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Controls whether valid input has been received
        boolean appCompleted = false;

        do {
            try {

                // Random object to generate dice values
                Random rand = new Random();

                // Ask the user how many dice to roll
                System.out.print("Enter the number of dice you would like to roll: ");
                int numOfDice = sc.nextInt();

                appCompleted = true;

                // Roll the dice and display each result
                for (int i = 0; i < numOfDice; i++) {
                    int rolledNumber = rand.nextInt(6) + 1;

                    System.out.println("\nDice " + (i + 1) + ":");
                    System.out.println(display(rolledNumber));
                }

            } catch (InputMismatchException e) {

                // Handles invalid (non-integer) input
                System.out.println("Please enter a valid whole number.");
                sc.next(); // Clear invalid input
            }

        } while (!appCompleted);

        // Close the scanner
        sc.close();
    }

    // Returns the ASCII art for the rolled dice value
    static String display(int value) {

        switch (value) {

            case 1:
                return "-------\n"
                     + "|     |\n"
                     + "|  o  |\n"
                     + "|     |\n"
                     + "-------";

            case 2:
                return "-------\n"
                     + "|o    |\n"
                     + "|     |\n"
                     + "|    o|\n"
                     + "-------";

            case 3:
                return "-------\n"
                     + "|o    |\n"
                     + "|  o  |\n"
                     + "|    o|\n"
                     + "-------";

            case 4:
                return "-------\n"
                     + "|o   o|\n"
                     + "|     |\n"
                     + "|o   o|\n"
                     + "-------";

            case 5:
                return "-------\n"
                     + "|o   o|\n"
                     + "|  o  |\n"
                     + "|o   o|\n"
                     + "-------";

            case 6:
                return "-------\n"
                     + "|o   o|\n"
                     + "|o   o|\n"
                     + "|o   o|\n"
                     + "-------";

            default:
                return "Not a valid dice value.";
        }
    }
}