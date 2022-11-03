package fromLeetCode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

/*
    Related Topics
    -> Array
    -> Hash Table
    -> String
    -> Greedy
    -> Counting
 */

public class LongestPalindromeByConcatenatingTwoLetterWords_2131 {


    public int longestPalindrome2(String[] words) {

        HashMap<String, Integer> count = new HashMap<String, Integer>();
        for (String word : words) {
            Integer countOfTheWord = count.get(word);
            if (countOfTheWord == null) {
                count.put(word, 1);
            } else {
                count.put(word, countOfTheWord + 1);
            }
        }
        int answer = 0;
        boolean central = false;
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            String word = entry.getKey();
            int countOfTheWord = entry.getValue();
            // if the word is a palindrome
            if (word.charAt(0) == word.charAt(1)) {
                if (countOfTheWord % 2 == 0) {
                    answer += countOfTheWord;
                } else {
                    answer += countOfTheWord - 1;
                    central = true;
                }
            } else if (word.charAt(0) < word.charAt(1)) {
                String reversedWord = "" + word.charAt(1) + word.charAt(0);
                if (count.containsKey(reversedWord)) {
                    answer += 2 * Math.min(countOfTheWord, count.get(reversedWord));
                }
            }
        }
        if (central) {
            answer++;
        }
        return 2 * answer;

    }

    //Time Limit Exceeded
    public static int longestPalindrome1(String[] words) {

        int result = 0;
        HashSet<String> possibleCenter = new HashSet<>();
        LinkedList<String> pairs = new LinkedList<>();

        for (String word : words) {

            String complement = ""+word.charAt(1)+word.charAt(0);

            if (pairs.contains(complement)){
                pairs.remove(complement);
                result+=4;
            }else{
                pairs.add(word);
            }

            if (word.charAt(1)==word.charAt(0)){
                if (possibleCenter.contains(word)){
                    possibleCenter.remove(word);
                }else{
                    possibleCenter.add(word);
                }
            }

        }

        if (possibleCenter.size()>0) result+=2;

        return result;

    }

}
