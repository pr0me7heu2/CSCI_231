package bankaccount;

public class CheckingAccount extends Account {

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("Withdrawal must be positive.");
        }
        else if (getBalance() < amount) {
            System.out.println("Insufficient funds for account " + getId() + " Current balance: " +
                    "" + String.format("%.2f",getBalance()));
        }
        else {
            setBalance(getBalance()-amount);
        }
    }

    // available for future expansion of interest rates to checking accounts
    @Override
    public void addInterest() {
    }

    @Override
    public String toString() {
        return "Account ID: " + getId() + " Type: Checking Balance: " + String.format("%.2f",getBalance());
    }
}
