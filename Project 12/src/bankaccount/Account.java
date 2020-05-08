package bankaccount;

public abstract class Account {
    private int id;
    private double balance;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws IllegalAmountException {
        if(amount < 0) {
            throw new IllegalAmountException("Deposit must be positive.");
        }
        this.balance += amount;
    }

    public abstract void withdraw(double amount) throws NoSufficientFundsException, IllegalAmountException;

    public abstract void addInterest();

    @Override
    public abstract String toString();
}
