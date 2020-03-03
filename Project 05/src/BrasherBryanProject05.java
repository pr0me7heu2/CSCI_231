import java.util.Arrays;
import java.util.Scanner;

public class BrasherBryanProject05 {

    public static double monthlyPayment(int principle, int term, double rate) {
        return principle * rate *Math.pow(1+rate,term) / (Math.pow(1+rate,term)-1);
    }

    public static double endOfMonthBalance(int month, double rate, int principle, double monthlyPayment) {
        return Math.pow(1+rate,month) * principle - ((Math.pow(1+rate,month)-1)*monthlyPayment) / rate;
    }

    public static double totalInterestPaid(int month, int principle, double endOfMonthBalance, double monthlyPayment) {
        return monthlyPayment * month - (principle - endOfMonthBalance);
    }

    public static double monthlyInterest(int month, int principle, double endOfMonthBalance, double monthlyPayment) {
        return totalInterestPaid(month,principle,endOfMonthBalance,monthlyPayment) -
                totalInterestPaid(month-1,principle,endOfMonthBalance,monthlyPayment);
    }

    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);

        int principle, term;
        double rate, monthlyPayment;

        // user inputs user values
        System.out.println("Mortgage Amortization Calculator");
        System.out.println("Enter your principle (in whole dollars):");
        principle = input.nextInt();
        System.out.println("Enter term (in whole months):");
        term = input.nextInt();
        System.out.println("Enter APR as a decimal e.g. 5% is 0.05:");
        rate = input.nextDouble()/12;  // monthly periodic rate

        // monthly payment needed for multiple calculations
        // stored to memory instead of repeated calculations
        monthlyPayment = monthlyPayment(principle,term,rate);

        System.out.println(monthlyPayment(principle,term,rate));
        System.out.println(endOfMonthBalance(1,rate,principle,monthlyPayment));

        String heading1 = "Exam_Name";
        String heading2 = "Exam_Grade";

        System.out.printf( "%-15s %15s %n", heading1, heading2);


    }
}
