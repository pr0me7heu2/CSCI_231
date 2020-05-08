package bankaccount;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(int id, double balance, double interestRate) {
        super(id, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) throws NoSufficientFundsException, IllegalAmountException {
        if(amount < 0) {
            throw new IllegalAmountException("Withdrawal must be positive.");
        }
        else if (getBalance() - amount < 500) {
            throw new NoSufficientFundsException(this.getId(),this.getBalance());
        }
        else {
            setBalance(getBalance()-amount);
        }
    }

    public void addInterest() {
        setBalance(getBalance()*(1+interestRate));
    }

    @Override
    public String toString() {
        return "Account ID: " + getId() + " Type: Savings  Balance: " + String.format("%.2f",getBalance()) +
                " Interest rate: " + String.format("%.2f",getInterestRate());
    }
}
