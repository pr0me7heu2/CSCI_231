import java.util.Scanner;

public class BrasherBryanProject04 {
    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Base-2 to Base-10 Conversion");

        System.out.println("Enter binary number:");
        String binStr = input.next();

        // user validation
        // if user enters a base 10 number, modulus will be greater than 1
        // if user enters something non-numeric, program exits but exception
        // is caught with better explanation of error
        try {
            while (Integer.parseInt(binStr) % 10 > 1) {
                System.out.println("Enter binary number:");
                binStr = input.next();
            }
        } catch (Exception e) {
            System.out.println("You did not enter a valid binary number.");
        }

        // uses built-in method to convert binary to decimal
        int decimalBuiltIn = Integer.parseInt(binStr,2);

        // student-generated algorithm
        // without a set size for the binary entry, I could
        // not create an algorithm without loops (which we
        // officially have not learned yet)

        int decimalManual = 0; // decimal conversion to be compared to decimalBuiltIn
        int power = binStr.length() -1;  // power of leftmost digit in binary string


        // iterates through the binary string adding 2^power if the
        // digit at position is 1
        for (int position = 0; position < binStr.length(); position++) {
            if (binStr.charAt(position) == '1') {
                decimalManual += (int)Math.pow(2,power);
            }
            power--;  // weight of each digit decreases as we move R -> L
        }
        
        System.out.println(binStr + " in base-2 is equivalent to " + decimalBuiltIn + " in base-10.");
        System.out.println(binStr + " in base-2 is equivalent to " + decimalManual + " in base-10.");

    }
}
