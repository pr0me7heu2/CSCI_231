import java.util.Scanner;

public class BrasherBryanProject06 {


    // returns the number of English letters in String s
    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length() ; i++) {
            // upper case
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                count++;
            }
            // lower case
            else if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                count++;
            }
        }
        return count;
    }

    // returns frequency of char c in String s
    public static int countLetters(String s, char c) {
        int count = 0;
        // convert to all lower case
        c = Character.toLowerCase(c);
        s = s.toLowerCase();
        // count occurrences of c in s
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // make new scanner object
        Scanner input = new Scanner(System.in);

        // hold Y/N answer if user wants to rerun test
        // hold character of interest
        char ans,userChar;
        // hold string of interest
        String userString;

        // user inputs string and char
        System.out.println("Enter a string:");
        userString = input.nextLine();
        System.out.println("Enter a char:");
        // .next() returns string; need charAt(0)
        userChar = input.next().charAt(0);

        // function drivers
        System.out.println("The result of calling function 'int countLetters(String s)' is: " + countLetters(userString));
        System.out.println("The result of calling function 'int countLetters(String s, char c)' is: " + countLetters(userString,userChar));

        // user asked to rerun test
        System.out.println("Do you want to do another test? (y/n)");
        ans = input.next().charAt(0);
        if(ans == 'y' || ans == 'Y') {main(args);}

    }
}
