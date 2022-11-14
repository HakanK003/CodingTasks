package fromLeetCode.problems_Java.medium;


/*
    Related Topics
    -> String
    -> Two Pointers

    Problem
    -> https://leetcode.com/problems/reverse-words-in-a-string/

        Given an input string s, reverse the order of the words.
        A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
        Return a string of the words in reverse order concatenated by a single space.
        Note that s may contain leading or trailing spaces or multiple spaces between two words.
        The returned string should only have a single space separating the words. Do not include any extra spaces.

    Examples
    -> Example 1
            Input: s = "the sky is blue"
            Output: "blue is sky the"
    -> Example 2:
            Input: s = "  hello world  "
            Output: "world hello"
            Explanation: Your reversed string should not contain leading or trailing spaces.
    -> Example 3:
            Input: s = "a good   example"
            Output: "example good a"
            Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

    Constraints
    -> 1 <= s.length <= 10^4
    -> s contains English letters (upper-case and lower-case), digits, and spaces ' '.
    -> There is at least one word in s.

    Notes
     * Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
 */



/**
 * Approach 1 -> Convert to Array then Reverse
 *
 *   Make an Array of Strings (words), then loop backward trough Array.
 *   Add elements (words) to new String (or String Builder)
 *   Skip empty or blank words.
 *
 * Time Complexity -> O(n)
 *   Loop through array once.
 *
 * Space Complexity -> O(n)
 *   We assign values to Array.
 *
 * Result
 *   Runtime: 4 ms, faster than 96.84% of Java online submissions for Reverse Words in a String.
 *   Memory Usage: 41.9 MB, less than 98.51% of Java online submissions for Reverse Words in a String.
 */
class Solution0151_1 {
    public String reverseWords(String s) {

        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = words.length-1; i >= 0; i--) {
            if (words[i].isBlank() || words[i].isEmpty()) continue;
            result.append(words[i]).append(" ");
        }

        return result.toString().trim();

    }
}



/**
 * Approach 2 -> Two Pointers
 *
 *   Check reference
 *
 * Time Complexity -> ?
 *
 * Space Complexity -> ?
 *
 * Result
 *   Runtime: 3 ms, faster than 98.76% of Java online submissions for Reverse Words in a String.
 *   Memory Usage: 42 MB, less than 96.93% of Java online submissions for Reverse Words in a String.
 *
 * Reference
 *   https://leetcode.com/problems/reverse-words-in-a-string/discuss/47720/Clean-Java-two-pointers-solution-(no-trim(-)-no-split(-)-no-StringBuilder)
 */
class Solution0151_2 {

    public String reverseWords(String s) {
        if (s == null) return null;

        char[] a = s.toCharArray();
        int n = a.length;

        // step 1. reverse the whole string
        reverse(a, 0, n - 1);
        // step 2. reverse each word
        reverseWords(a, n);
        // step 3. clean up spaces
        return cleanSpaces(a, n);
    }

    void reverseWords(char[] a, int n) {
        int i = 0, j = 0;

        while (i < n) {
            while (i < j || i < n && a[i] == ' ') i++; // skip spaces
            while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
            reverse(a, i, j - 1);                      // reverse the word
        }
    }

    // trim leading, trailing and multiple spaces
    String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && a[j] == ' ') j++;             // skip spaces
            while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
            while (j < n && a[j] == ' ') j++;             // skip spaces
            if (j < n) a[i++] = ' ';                      // keep only one space
        }

        return new String(a).substring(0, i);
    }

    // reverse a[] from a[i] to a[j]
    private void reverse(char[] a, int i, int j) {
        while (i < j) {
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }

}