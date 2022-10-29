package LAB4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExpecitonHandling {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("Your number is " + number);
        } catch (InputMismatchException exception) {
                System.out.println("Please enter a number, not a string!");
        }
    }
}
