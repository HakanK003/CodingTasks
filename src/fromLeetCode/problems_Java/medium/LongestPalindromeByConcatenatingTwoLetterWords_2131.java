package fromLeetCode.problems_Java.medium;

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


    //TODO
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


//TODO 7ms
//
//    public int longestPalindrome(String[] words) {
//        final int alphabetSize = 26;
//        int[][] count = new int[alphabetSize][alphabetSize];
//        for (String word : words) {
//            count[word.charAt(0) - 'a'][word.charAt(1) - 'a']++;
//        }
//        int answer = 0;
//        boolean central = false;
//        for (int i = 0; i < alphabetSize; i++) {
//            if (count[i][i] % 2 == 0) {
//                answer += count[i][i];
//            } else {
//                answer += count[i][i] - 1;
//                central = true;
//            }
//            for (int j = i + 1; j < alphabetSize; j++) {
//            	answer += 2 * Math.min(count[i][j], count[j][i]);
//            }
//        }
//        if (central) {
//            answer++;
//        }
//        return 2 * answer;
//    }


//TODO 50100kb
//
//    public int longestPalindrome(String[] words) {
//        boolean[] mid = new boolean[26];
//        int[] freq2 = new int[26*26];
//
//        Map<String, Integer> freq = new HashMap<>();
//
//        int len = 0;
//
//        for(String word: words) {
//            int c0 = word.charAt(0) - 'a', c1 = word.charAt(1) - 'a';
//            if(c0 == c1) {
//                int c  = c0;
//                if(mid[c])
//                    len += 4;
//                mid[c] = !mid[c];
//                continue;
//            }
//            int w = 26*c0 + c1;
//            if(freq2[w] == 0) {
//                freq2[26*c1 + c0] += 1;
//            } else {
//                len += 4;
//                freq2[w] -= 1;
//            }
//        }
//        for(boolean b: mid)
//            if(b) return len + 2;
//        return len;
//    }