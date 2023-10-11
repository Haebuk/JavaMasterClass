public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount:" + amount);
            return;
        }

        this.balance += amount;
        System.out.println(amount + " deposited, " + "total: " + this.balance);
    }

    public void withdrawal(double amount) {
        if (balance < amount) {
            System.out.println("You have not enough money");
            return;
        }

        this.balance -= amount;
        System.out.println("Withdrawal of " + amount +
                " processed, Remaining balance = " + this.balance);
    }
}
