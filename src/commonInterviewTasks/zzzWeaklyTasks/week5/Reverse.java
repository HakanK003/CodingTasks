package commonInterviewTasks.zzzWeaklyTasks.week5;

public class Reverse {

    public static void main(String[] args) {

        String str1 = "ABCD";

        System.out.println("reverse1(str1) = " + reverse1(str1));

        String str2 = "Hello There";

        System.out.println("reverse1(str2) = " + reverse1(str2));

        String str3 = "Java";

        System.out.println("reverse1(str3) = " + reverse1(str3));


//        String str4 = "ABCD";
//
//        System.out.println("reverse2(str4) = " + reverse2(str4));
//
//        String str5 = "Hello There";
//
//        System.out.println("reverse2(str5) = " + reverse2(str5));
//
//        String str6 = "Java";
//
//        System.out.println("reverse2(str6) = " + reverse2(str6));


    }


    public static String reverse1 (String str){

        String result ="";

        for (int i = str.length()-1; i >= 0; i--) {

            result+=str.charAt(i);

        }


        return result;
    }


    public static String reverse2 (String str){

        return new StringBuilder(str).reverse().toString();

    }



}

/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */