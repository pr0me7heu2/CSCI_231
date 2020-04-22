import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class MyStringTestDrive {

    public static void main(String[] args) {

        System.out.println("Driver for BrasherBryanProject10_MyString");

        //scanner object
        Scanner input = new Scanner(System.in);

        //random object
        Random rand = new Random();

        //tests constructor
        System.out.println("Enter a line of text: ");
        BrasherBryanProject10_MyString myString = new BrasherBryanProject10_MyString(input.nextLine().toCharArray());
        System.out.println("You entered: " + Arrays.toString(myString.getData()));

        //test charAt(int i)
        int randomIndex = rand.nextInt(myString.getData().length + 1);
        System.out.println("The character at index " + randomIndex + " is: " + myString.charAt(randomIndex));

        //test length()
        System.out.println("The length of string is: " + myString.length());

        //test substring(int begin, int end))
        System.out.println("Enter beginning and  indexes for substring: e.g. \"3 7\"");
        int begin = input.nextInt();
        int end = input.nextInt();
        System.out.println("Substring is: " + Arrays.toString(myString.substring(begin,end).getData()));

        //test to toLowerCase()
        System.out.println("That as a lowercase MyString object: ");
        System.out.println(Arrays.toString(myString.toLowerCase().getData()));

        //test equals(MyString other)
        input.nextLine();  //advances scanner to next line
        System.out.println("Enter another line of text: ");
        System.out.println("Your original string is identical to your new string: " +
                myString.equals(new BrasherBryanProject10_MyString(input.nextLine().toCharArray())));

        //test valueOf(int i)
        System.out.println("Enter an integer: ");
        System.out.println("That as a MyString object is: " +
                Arrays.toString(BrasherBryanProject10_MyString.valueOf(input.nextInt()).getData()));


    }
}
