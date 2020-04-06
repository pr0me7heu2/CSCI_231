import java.util.Scanner;

public class BrasherBryanProject08 {

    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);
        // int to hold user input
        int inputInt;

        do {
            System.out.println("Enter an integer representing the state of the coins? [0,511]");
            inputInt = input.nextInt();
        } while((inputInt < 0) || (inputInt > 511));

        //hold user input as a binary number in String data type
        String binaryState = Integer.toBinaryString(inputInt);

        System.out.println("Your input is " + binaryState + " in base-2.");


        //check to see if binaryState has 9 digits
        //if not, pads left side of string with zeroes
        if(binaryState.length() < 9) {
            String padded = "000000000";
            binaryState = padded.substring(binaryState.length()) + binaryState;
        }

        System.out.println("That is equivalent to: " + binaryState);

        System.out.println("This corresponds to the following state of the nine coins:");

        //iterator points to place within string
        int iterator = 0;


        //double four loop iterates through an imaginary 3x3 matrix
        //each nth element in this 'matrix' is either H or T depending
        //on the value of nth number in the binary string
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(binaryState.charAt(iterator) == '0'){
                    System.out.print("H ");
                }
                else {
                    System.out.print("T ");
                }
                iterator++;
            }
            System.out.println();
        }

        // user asked to rerun test
        System.out.println("Do you want to try again? (y/n)");
        if(input.next().charAt(0) == 'y') {main(args);}
    }

}
