import java.util.Scanner;

public class BrasherBryanProject03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create scanner object

        System.out.println("Convert percentage grade to letter grade.");
        System.out.println("Enter your score (0 -- 100):");

        float score = input.nextFloat();  // set user input to score

        // check validity
        if (score < 0 || score > 100) {
            System.out.println("Invalid entry.");
            System.exit(1);
        }

        char grade;

        // assign letter grade based on percentage score

        // switch value can not be floating point
        int scoreInt = (int) (score / 10);

        switch(scoreInt) {
            case 6: grade = 'D';
            break;
            case 7: grade = 'C';
            break;
            case 8: grade = 'B';
            break;
            case 9:
            case 10: grade = 'A';
            break;
            default: grade = 'F';
        }

//        if (score < 60) {
//            grade = 'F';
//        }
//        else if (score < 70) {
//            grade = 'D';
//        }
//        else if (score < 80) {
//            grade = 'C';
//        }
//        else if (score < 90) {
//            grade = 'B';
//        }
//        else {
//            grade = 'A';
//        }

        // output letter grade
        System.out.println("Your grade is: " + grade);
    }
}
