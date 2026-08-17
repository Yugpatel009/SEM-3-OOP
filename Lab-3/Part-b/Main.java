/**
 * Main - Lab 2 (Part B) SCRATCH TEST.
 * A temporary driver used only to check Account/Customer this lab.
 * MiniBank.java stays the real entry point; this file just exercises the
 * classes.
 */
public class Main {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        accounts[0] = new Account("Riya", 5000);
        accounts[1] = new Account("Aman", 1000);
        accounts[2] = new Account("Neha"); // 0 opening balance

        accounts[0].deposit(2000); // 5000 + 2000 = 7000
        boolean ok1 = accounts[0].withdraw(3000); // 7000 - 3000 = 4000, true
        boolean ok2 = accounts[0].withdraw(10000); // too much -> false, unchanged

        for (Account a : accounts) {
            System.out.println(a); // uses Account.toString()
        }

        System.out.println("withdraw 3000 -> " + ok1);
        System.out.println("withdraw 10000 -> " + ok2);

        boolean sameAccount = accounts[0].equals(accounts[1]);
        System.out.println("accounts[0] equals accounts[1]? " + sameAccount);

        Object obj = accounts[0];
        if (obj instanceof Account) {
            System.out.println("obj is an Account object.");
        } else {
            System.out.println("obj is not an Account object.");
        }
    }
}
