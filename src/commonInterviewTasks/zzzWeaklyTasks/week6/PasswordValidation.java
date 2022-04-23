package commonInterviewTasks.zzzWeaklyTasks.week6;

public class PasswordValidation {

    public static void main(String[] args) {

        String str1 = "ASdf12!@";

        System.out.println("passwordValidation(str1) = " + passwordValidation(str1));

        String str2 = "asd123!@#";

        System.out.println("passwordValidation(str2) = " + passwordValidation(str2));

        String str3 = "ASDfgh!@#";

        System.out.println("passwordValidation(str3) = " + passwordValidation(str3));

        String str4 = "ASD123!@#";

        System.out.println("passwordValidation(str4) = " + passwordValidation(str4));

        String str5 = "ASDfgh123";

        System.out.println("passwordValidation(str5) = " + passwordValidation(str5));

        String str6 = "As1!";

        System.out.println("passwordValidation(str6) = " + passwordValidation(str6));

        String str7 = "Asd 1!";

        System.out.println("passwordValidation(str7) = " + passwordValidation(str7));


    }


    public static boolean passwordValidation(String str){

        boolean rule1 = ( str.length() >= 6 && !str.contains(" ") );

        boolean rule2 = false,
                rule3 = false,
                rule4 = false,
                rule5 = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase( str.charAt(i) ))      {rule2=true;}
            if (Character.isLowerCase( str.charAt(i) ))      {rule3=true;}
            if (!Character.isLetterOrDigit( str.charAt(i) )) {rule4=true;}
            if (Character.isDigit( str.charAt(i) ))          {rule5=true;}
        }

        return  rule1&&rule2&&rule3&&rule4&&rule5 ;
    }

    // try to do it with one line of each in lambda version

}

/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */