package fromCodeWars;

public class EachWordBeganUppercase {

    public static void main(String[] args) {

        String sentence = "Hello world wHy SO seRIous";

        System.out.println(toJadenCase(sentence));

    }

    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment

        if(!phrase.isEmpty()){String[] words = phrase.split(" ");
            String result="";

            for (String each : words) {
                each=each.substring(0,1).toUpperCase()+each.substring(1).toLowerCase();
                result+=each+" ";
            }

            result=result.trim();

            return result;}


        return null;
       }


}

/*
Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 */