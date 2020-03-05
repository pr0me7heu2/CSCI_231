import java.util.Scanner;

public class BrasherBryanProject05 {

    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);

        int principle, term;
        double rate, monthlyPayment;
        char ans;

        System.out.println("Mortgage Amortization Calculator");

        // do-while loops allows user to restart program
        do {
            // user inputs user values
            System.out.println("Enter your principle (in whole dollars):");
            principle = input.nextInt();
            System.out.println("Enter term (in whole months):");
            term = input.nextInt();
            System.out.println("Enter APR as a decimal e.g. 5% is 0.05:");
            rate = input.nextDouble() / 12;  // monthly periodic rate

            monthlyPayment = principle * rate * Math.pow(1 + rate, term) / (Math.pow(1 + rate, term) - 1);


            System.out.printf("%5s | %10s | %12s | %12s | %14s | %10s\n", "Month", "Payment", "To Interest", "To Principle"
                    , "Total Interest", "Balance");

            // solve monthly payment equation for n when b=0
            int monthsOfLoan = (int) -(Math.log(1 - ((principle * rate) / monthlyPayment)) / Math.log(1 + rate));

            // for loop continues iterates over each month + 1 to finish out loan
            for (int month = 1; month <= monthsOfLoan + 1; month++) {
                // before payment
                double startOfMonthBalance = Math.pow(1 + rate, month - 1) * principle - ((Math.pow(1 + rate, month - 1) - 1) * monthlyPayment) / rate;
                // after payment
                double endOfMonthBalance = Math.pow(1 + rate, month) * principle - ((Math.pow(1 + rate, month) - 1) * monthlyPayment) / rate;
                // sum of interest paid for all months to current
                double totalInterestPaid = monthlyPayment * month - (principle - endOfMonthBalance);
                // total interest for this month minus total interest from last month
                double monthlyInterest = (monthlyPayment * month - (principle - endOfMonthBalance)) -
                        (monthlyPayment * (month - 1) - (principle - startOfMonthBalance));

                System.out.printf("%5d   %10.2f   %12.2f   %12.2f   %14.2f   %10.2f\n", month, monthlyPayment, monthlyInterest, monthlyPayment - monthlyInterest,
                        totalInterestPaid, endOfMonthBalance);
            }

//        // while loop equivalent of for loop
//        int month = 1;
//        while(month <= monthsOfLoan + 1) {
//            // before payment
//            double startOfMonthBalance = Math.pow(1+rate,month-1) * principle - ((Math.pow(1+rate,month-1)-1)*monthlyPayment) / rate;
//            // after payment
//            double endOfMonthBalance = Math.pow(1+rate,month) * principle - ((Math.pow(1+rate,month)-1)*monthlyPayment) / rate;
//            // sum of interest paid for all months to current
//            double totalInterestPaid = monthlyPayment * month - (principle - endOfMonthBalance);
//            // total interest for this month minus total interest from last month
//            double monthlyInterest = (monthlyPayment * month - (principle - endOfMonthBalance)) -
//                    (monthlyPayment * (month - 1) - (principle - startOfMonthBalance));
//            System.out.printf("%5d   %10.2f   %12.2f   %12.2f   %14.2f   %10.2f\n", month, monthlyPayment, monthlyInterest, monthlyPayment - monthlyInterest,
//                    totalInterestPaid, endOfMonthBalance);
//            month++;
//        }

            System.out.println("Do you wish to do another calculation? (y/n)");
            // .next() returns string; need charAt(0)
            ans = input.next().charAt(0);

        }while(ans=='Y'||ans=='y');
    }
}
