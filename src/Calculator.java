import java.util.Scanner;

public class Calculator {
    // psvm - not so magic shortcut
    public static void main(String[] args) {
        System.out.println("Calculator...");
        System.out.println("Calculator sum of two numbers");
        System.out.println("Provide first number: ");
        int firstNumber;
        int secondNumber;
        // TODO: explain object creation
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("Your provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " +secondNumber);
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);

        System.out.println("Calculator difference of two numbers");
        System.out.println("Provide third number: ");
        int thirdNumber;
        int fourthNumber;
        thirdNumber = inputReader.nextInt();
        System.out.println("You provided number: " + thirdNumber);
        System.out.println("Provide fourth number: ");
        fourthNumber = inputReader.nextInt();
        System.out.println("You provided number: " + fourthNumber);
        int difference = thirdNumber - fourthNumber;
        System.out.println("Difference is: " +difference);

        System.out.println("Calculator product of two numbers");
        System.out.println("Provide fifth number");
        int fifthNumber;
        int sixthNumber;
        fifthNumber = inputReader.nextInt();
        System.out.println("You provided number: " +fifthNumber);
        System.out.println("Provide sixth number: ");
        sixthNumber = inputReader.nextInt();
        System.out.println("You provided number: " + sixthNumber );
        int product = fifthNumber * sixthNumber;
        System.out.println("Product is: " +product);

            }
}
