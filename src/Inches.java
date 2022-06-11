import java.util.Scanner;

public class Inches {
    public static void main(String[] args) {

        long ci;
        long im;

        im = 5280 * 12;
        ci = im * im * im;
        System.out.println("В кубической миле содержится  " + ci + "  кубических дюймов");
    }

    public static class Addition {

        public static void main(String[] args) {

            Scanner myLittleScanner = new Scanner(System.in);
            int number1;
            int number2;
            int sum;

            System.out.println("Enter first integer: ");
                    number1 = myLittleScanner.nextInt();

            System.out.println("Enter second integer: ");
            number2 = myLittleScanner.nextInt();

            sum = number1 + number2;
            System.out.println(sum);
            System.out.printf("Sum is %d%n", sum);


    //        if (number1 == number2)
    //            System.out.printf("%d == %d%n", number1, number2);
    //        if (number1 != number2)
    //            System.out.printf("%d == %d%n", number1, number2);
    //        if (number1 < number2)
    //            System.out.printf("%d == %d%n", number1, number2);

        }
    }
}
