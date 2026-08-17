/**
 * Account - Lab 2 (Part B).
 * The balance is PRIVATE and can change only through deposit()/withdraw(),
 * never by a direct setter - this is encapsulation protecting valid state.
 */
public class Account {
    private final String accountNumber; // identity, fixed for life
    private String ownerName;
    private long balance; // whole rupees
    private boolean active;
    private static int counter = 1; // shared, generates account numbers

    /** Full constructor. */
    public Account(String ownerName, long openingBalance) {
        this.accountNumber = generateAccountNumber(); // e.g. "AC0001"
        this.ownerName = ownerName;
        this.balance = openingBalance;
        this.active = true;
    }

    /** Overloaded constructor: chains to the full one with a 0 opening balance. */
    public Account(String ownerName) {
        this(ownerName, 0);
    }

    private static String generateAccountNumber() {
        return String.format("AC%04d", counter++); // AC0001, AC0002, ...
    }

    /** Add money (ignores non-positive amounts). */
    public void deposit(long amount) {
        if (amount > 0)
            balance += amount;
    }

    /** Remove money only if the balance is sufficient. Returns success. */
    public boolean withdraw(long amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false; // insufficient funds: no change
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber
                + ", Owner Name: " + ownerName
                + ", Balance: " + balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Account)) {
            return false;
        }

        Account other = (Account) o;
        return this.accountNumber.equals(other.accountNumber);
    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }

}
