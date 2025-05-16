public class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount() {
        super(); // calls BankAccount constructor
        interestRate = 0.01; // default interest rate
    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void processWithdrawal(double amount) {
        if (amount > balance) {
            balance -= (amount + 30); // overdraft fee
            System.out.println("Overdraft! $30 fee applied.");
        } else {
            balance -= amount;
        }
    }

    public void displayAccount() {
        accountSummary(); // inherited method
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}
