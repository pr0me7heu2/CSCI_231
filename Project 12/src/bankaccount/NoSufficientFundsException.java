package bankaccount;

public class NoSufficientFundsException extends Exception {
    int accountID;
    double currentBalance;

    public NoSufficientFundsException() {
    }

    public NoSufficientFundsException(String message) {
        super(message);
    }

    public NoSufficientFundsException(int accountID, double currentBalance) {
        super("Insufficient funds in account " + accountID + ". Balance:" +
                String.format("%.2f",currentBalance));
        this.accountID = accountID;
        this.currentBalance = currentBalance;
    }

}
