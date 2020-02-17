package src;

// import java.util.Scanner;
import java.util.Random;

public class BrasherBryanProject02 {
    public static void main(String[] args) {
//        // creates new scanner object
//        Scanner input = new Scanner(System.in);
//
//        // user input
//        System.out.println("Enter a change between 1 and 99 cents:");
//        int count = input.nextInt();

        int max = 99; // maximum cents to be generated
        int min = 1; // min cents to be generated
        int range = (max-min) + 1;  // forces next nextInt to possibly return max

        int count = new Random().nextInt(range) + min;

        System.out.println("You have a " + count + " cents.  That is:");
        System.out.println(count / 25 + " quarters");
        System.out.println(count % 25 / 10 + " dimes");
        System.out.println(count % 25 % 10 / 5 + " nickels");
        System.out.println(count % 25 % 10 % 5 + " pennies");

    }
}
