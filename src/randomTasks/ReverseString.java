package randomTasks;

public class ReverseString {

    public static void main(String[] args) {

        String word1 = "Wooden Spoon";

        String word2 = reverseWord(word1);

        System.out.println(word2);

    }

    public static String reverseWord(String word){

        String reversedWord= "";

        for (int i=word.length()-1; i>=0; i--){

            reversedWord+=""+word.charAt(i);

        }
        return reversedWord;
    }

}
