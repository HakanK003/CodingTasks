package fromLeetCode.problems_Java.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
    Related Topics
    -> String
    -> Counting

    Problem
    -> https://leetcode.com/problems/determine-if-string-halves-are-alike/

        You are given a string s of even length. Split this string into two halves of equal lengths,
        and let a be the first half and b be the second half.
        Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
        Notice that s contains uppercase and lowercase letters.
        Return true if a and b are alike. Otherwise, return false.

    Examples
    -> Example 1
            Input: s = "book"
            Output: true
            Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
    -> Example 2
            Input: s = "textbook"
            Output: false
            Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
            Notice that the vowel o is counted twice.

    Constraints
    -> 2 <= s.length <= 1000
    -> s.length is even.
    -> s consists of uppercase and lowercase letters.
 */




/**
 * Approach 1 -> Two Pointer
 *
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(1)
 *
 *
 * Result
 *   First
 *   Runtime: 11 ms, faster than 38.58% of Java online submissions for Determine if String Halves Are Alike.
 *   Memory Usage: 42.3 MB, less than 50.82% of Java online submissions for Determine if String Halves Are Alike.
 *   Second
 *   Runtime: 15 ms, faster than 22.35% of Java online submissions for Determine if String Halves Are Alike.
 *   Memory Usage: 45 MB, less than 5.84% of Java online submissions for Determine if String Halves Are Alike.
 *   Third
 *   Runtime: 7 ms, faster than 62.49% of Java online submissions for Determine if String Halves Are Alike.
 *   Memory Usage: 42.5 MB, less than 43.27% of Java online submissions for Determine if String Halves Are Alike.
 *
 */
class Solution1704_1_1 {
    public boolean halvesAreAlike(String s) {

        int head=0, tail=s.length()-1, count=0;

        HashSet<Character> vowels= new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        for(;head<tail; head++, tail--){
            if(vowels.contains(s.charAt(head))) count--;
            if(vowels.contains(s.charAt(tail))) count++;
        }

        return count==0;
    }
}

class Solution1704_1_2 {
    public boolean halvesAreAlike(String s) {

        int head=0, tail=s.length()-1, count=0;

        String vowels = "aeiouAEIOU";

        for(;head<tail; head++, tail--){
            if(vowels.contains(""+s.charAt(head))) count--;
            if(vowels.contains(""+s.charAt(tail))) count++;
        }

        return count==0;
    }
}


class Solution1704_1_3 {
    public boolean halvesAreAlike(String s) {

        int head=0, last=s.length()-1, count=0;

        HashSet<Character> vowels= new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        for(;head<s.length()/2; head++){
            if(vowels.contains(s.charAt(head))) count--;
            if(vowels.contains(s.charAt(last-head))) count++;
        }

        return count==0;
    }
}