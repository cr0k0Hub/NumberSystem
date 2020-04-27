/*
* Created by https://github.com/cr0k0Hub
/*

public class NumberSystem {

    public static double toBin(int number) {
        
        // binary - The string in which the number will be written in binary form.
        // The string type was chosen for the convenience of adding new elements.
        String binary;
        for (binary = ""; number != 1; number /= 2) {
            if (number % 2 == 0) {
                binary = binary + "0";
            } else {
                binary = binary + "1";
            }
        }
        
        binary = binary + "1";
        // Flip binary
        binary = (new StringBuffer(binary)).reverse().toString();

        return Double.valueOf(binary);
    }


    public static double toDigit(String binary) {

        // result - returning value
        // power - degree of 2 
        double result = 0;
        double power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {

            // numb - used to take one character from a string
            char numb = binary.charAt(i);

            switch (numb) {
                case '0':
                    result += 0;
                    break;
                case '1':
                    result += Math.pow(2, power);
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }

            power++;
        }

        return result;
    }
}
