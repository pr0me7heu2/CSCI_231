package bankaccount;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class BrasherBryanProject11_AccountTestDrive {

    public static void main(String[] args) {

        // random object to assist in initializing attributes
        Random rand = new Random();

        // scanner object for making deposits and withdrawals
        Scanner input = new Scanner(System.in);

        // Date object for timestamps
        Date date = new Date();

        // int for holding account UID
        int accountID = 0;

        // double for holding scanner input
        double temp;

        // array to hold 4 test accounts
        Account[] accounts = new Account[4];

        // instantiating test accounts
        /* Each account is instantiated with a unique account ID,
        a starting balance between 0 and 1000, and the savings accounts
        have an interest rate of between 0.01 and 0.05. */
        accounts[0] = new CheckingAccount(++accountID,rand.nextInt(1001));
        accounts[1] = new CheckingAccount(++accountID,rand.nextInt(1001));
        accounts[2] = new SavingAccount(++accountID,rand.nextInt(1001),
                ((double)rand.nextInt(5)+1)/100);
        accounts[3] = new SavingAccount(++accountID,rand.nextInt(1001),
                ((double)rand.nextInt(5)+1)/100);

        // print out current account information
        System.out.println("Account information: " + date);
        for(Account account : accounts) {
            System.out.println(account.toString());
        }

        // test deposit
        System.out.println("How much do you want to deposit?");
        temp = input.nextDouble();
        for(Account account : accounts) {
            account.deposit(temp);
        }

        // print out current account information
        System.out.println("Account information: " + date);
        for(Account account : accounts) {
            System.out.println(account.toString());
        }

        // test withdraw
        System.out.println("How much do you want to withdraw?");
        temp = input.nextDouble();
        for(Account account : accounts) {
            account.withdraw(temp);
        }

        // print out current account information
        System.out.println("Account information: " + date);
        for(Account account : accounts) {
            System.out.println(account.toString());
        }

        // accrue interest
        System.out.println("Testing interest accrual...");
        accounts[2].addInterest();
        accounts[3].addInterest();

        // print out current account information
        System.out.println("Account information: " + date);
        for(Account account : accounts) {
            System.out.println(account.toString());
        }

        // accrue interest
        System.out.println("Testing interest accrual...");
        accounts[2].addInterest();
        accounts[3].addInterest();

        // print out final account information
        System.out.println("Account information: " + date);
        for(Account account : accounts) {
            System.out.println(account.toString());
        }
    }
}
