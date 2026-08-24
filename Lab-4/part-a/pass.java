// public class passwrodChecker{
//     public boolean haslength(String pw){
//         return pw.length() >=8;
//     }
//     public boolean hasUppercase(String pw){
//         return pw.length() >=8;
//     }

// }
public class pass {
    public boolean haslength(String pw) {
        return pw.length() >= 8;
    }

    public boolean hasUppercase(String pw) {
        return pw.matches(".*[A-Z].*");
    }

    public boolean hasDigit(String pw) {
        return pw.matches(".*[0-9].*");
    }

    public boolean hasSpecialCharacter(String pw) {
        return pw.matches(".*[^a-zA-Z0-9].*");
    }

    public String strength(String pw) {
        int count = 0;

        if (haslength(pw)) {
            count++;
        }
        if (hasUppercase(pw)) {
            count++;
        }
        if (hasDigit(pw)) {
            count++;

        }
        if (hasSpecialCharacter(pw)) {
            count++;

        }
        if (count <= 1) {
            return "weak";
        } else if (count <= 3) {
            return "Medium";
        } else {
            return "Strong";

        }

    }
}
