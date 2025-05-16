public class TestAccounts {
    public static void main(String[] args) {
        // Test BankAccount
        BankAccount bankAcc = new BankAccount();
        bankAcc.setFirstName("Mark");
        bankAcc.setLastName("Good");
        bankAcc.setAccountID(12345);
        bankAcc.deposit(500.0);
        bankAcc.withdrawal(200.0);
        bankAcc.accountSummary();

        System.out.println(); // spacer

        // Test CheckingAccount
        CheckingAccount checkAcc = new CheckingAccount();
        checkAcc.setFirstName("Mark");
        checkAcc.setLastName("Good");
        checkAcc.setAccountID(67890);
        checkAcc.deposit(300.0);
        checkAcc.processWithdrawal(350.0); // overdraft
        checkAcc.setInterestRate(0.015);
        checkAcc.displayAccount();
    }
}
