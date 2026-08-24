

public class Main {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        accounts[0] = new Account("Riya", 5000);
        accounts[1] = new Account("Aman", 1000);
        accounts[2] = new Account("Neha");

        accounts[0].deposit(2000);
        boolean ok1 = accounts[0].withdraw(3000);
        boolean ok2 = accounts[0].withdraw(10000);

        for (Account a : accounts) {
            System.out.println(a);
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
