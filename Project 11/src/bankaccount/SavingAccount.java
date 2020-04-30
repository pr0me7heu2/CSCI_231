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
    public void withdraw(double amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("Withdrawal must be positive.");
        }
        else if (getBalance() - amount < 500) {
            System.out.println("Insufficient funds for account " + getId() + " Current balance: " +
                    "" + String.format("%.2f",getBalance()));
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
