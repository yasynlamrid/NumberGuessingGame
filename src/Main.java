import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;

        while (true) {
            System.out.print("Enter your number (1-100): ");
            int numberUser = scanner.nextInt();

            if (numberUser == randomNumber) {
                System.out.println("Your guess is correct!");
                break;
            } else if (numberUser < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
    }
}
