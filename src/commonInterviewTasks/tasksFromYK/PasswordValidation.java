package commonInterviewTasks.tasksFromYK;

public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println(isValid("MyPassword%01"));
    }

    private static boolean isValid(String password) {
        String lowercase=".*[a-z].*";
        String uppercase=".*[A-Z].*";
        String numbers=".*[0-9].*";
        String specialchars=".*[!-/].*";

        boolean HasLower = password.matches(lowercase),
                HasUppere = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialchars),
                valid = false;

        if(password.length() >= 6 && !password.contains(" "))
            if( HasLower && HasUppere && HasDigits && HasSpecial)
                valid = true;
        return valid;
    }

}
