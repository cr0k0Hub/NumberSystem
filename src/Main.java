import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("1 - Digit to binary");
        System.out.println("2 - Binary to digit");
        int choose = reader.nextInt();

        if (choose == 1) {

            System.out.println("Input your number:");
            int number = reader.nextInt();

            System.out.println(NumberSystem.toBin(number));
        } else if (choose == 2) {

            System.out.println("Input your number");
            String number = reader.next();

            System.out.println(NumberSystem.toDigit(number));
        }
    }
}
