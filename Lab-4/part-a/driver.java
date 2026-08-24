public class driver {
    public static void main(String[] args) {
        pass ch = new pass();

        String[] passwrods = {
                "abc",
                "Password123",
                "Password!@#",
                "PassWord",
                "pass"
        };

        for (String pw : passwrods) {
            System.out.println("\nPasswrod: " + pw);

            System.out.println("Length >8:" + ch.haslength(pw));

            System.out.println("Contains Uppercase:" + ch.hasUppercase(pw));
            System.out.println("Contains Digit:" + ch.hasDigit(pw));
            System.out.println("Contains Special Character:" + ch.hasSpecialCharacter(pw));

            System.out.println("Strong Password:" + ch.strength(pw));

        }
    }
}