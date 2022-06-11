import java.util.Scanner;

public class Comparasion {
    public static void main(String[] args){


            Scanner myLittleScanner = new Scanner(System.in);
            int number1;
            int number2;

            System.out.println("Enter first integer: ");
            number1 = myLittleScanner.nextInt();

            System.out.println("Enter second integer: ");
            number2 = myLittleScanner.nextInt();

            if (number1 == number2)
                System.out.printf("%d == %d%n", number1, number2);
            if (number1 != number2)
                System.out.printf("%d != %d%n", number1, number2);
            if (number1 < number2)
                System.out.printf("%d < %d%n", number1, number2);
            if (number1 > number2)
                System.out.printf("%d > %d%n", number1, number2);
            if (number1 >= number2)
                System.out.printf("%d >= %d%n", number1, number2);
            if (number1 <= number2)
                System.out.printf("%d <= %d%n", number1, number2);

    }
}
