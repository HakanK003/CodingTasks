package fromLeetCode.easy;

import java.util.*;

public class CheckIfTheSentenceIsPangram_1832 {

    //best cool solutions
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Check if the Sentence Is Pangram.
    //Memory Usage: 41.1 MB, less than 84.60% of Java online submissions for Check if the Sentence Is Pangram.
    public boolean checkIfPangram3(String sentence) {

        for (int i = 0; i < 26; ++i) {

            char currChar = (char)('a' + i);

            if (sentence.indexOf(currChar) == -1)
                return false;
        }

        return true;

    }


    //same logic with previous one but way faster than first
    //Runtime: 8 ms, faster than 19.52% of Java online submissions for Check if the Sentence Is Pangram.
    //Memory Usage: 42.1 MB, less than 45.15% of Java online submissions for Check if the Sentence Is Pangram.
    public boolean checkIfPangram2(String sentence) {

        Set<Character> letters = new HashSet<>();

        for (char letter : sentence.toCharArray())
            letters.add(letter);

        return letters.size() == 26;
    }

    public static boolean checkIfPangram(String sentence) {

        return new HashSet<>(Arrays.asList(sentence.toCharArray())).size()==26;


//        //String[] letters = {"a", "b", "c", "d", "e", "f", "g", " h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
//
//        Set<String> word = new TreeSet<>(Arrays.asList(sentence.split("")));
//
//        Set<String> letters = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", " h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
//
//        return word.equals(letters);

    }

}
