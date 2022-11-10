/*
    Related Topics
    -> String
    -> Stack

    Problem
    -> https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

        You are given a string s consisting of lowercase English letters.
        A duplicate removal consists of choosing two adjacent and equal letters and removing them.
        We repeatedly make duplicate removals on s until we no longer can.
        Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

    Examples
    -> Example 1
            Input: s = "abbaca"
            Output: "ca"
            Explanation:
            For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.
            The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
    -> Example 2
            Input: s = "azxxzy"
            Output: "ay"

    Constraints
    -> 1 <= s.length <= 10^5
    -> s consists of lowercase English letters.

    Notes
     * @param {string} s
     * @return {string}
 */



/**
 * Approach 1 -> Replace using Two Pointers
 *
 *   Make an array of chars. Then find duplicate chars, replace them with next chars.
 *
 * Time Complexity -> O(n)
 *   Loop through array
 *
 * Space Complexity -> O(n)
 *   We assign values to array
 *
 * Result
 *   Runtime: 141 ms, faster than 59.98% of JavaScript online submissions for Remove All Adjacent Duplicates In String.
 *   Memory Usage: 52.4 MB, less than 13.50% of JavaScript online submissions for Remove All Adjacent Duplicates In String.
 *   Optimized
 *   Runtime: 134 ms, faster than 68.46% of JavaScript online submissions for Remove All Adjacent Duplicates In String.
 *   Memory Usage: 51.2 MB, less than 74.19% of JavaScript online submissions for Remove All Adjacent Duplicates In String.
 */
var removeDuplicates = function(s) {

    let letters = [];

    for (let i =0; i < s.length; i++){
        letters.push( s.charAt(i) );
    }

    let i = 0;
    for (let j = 0; j < s.length; j++) {
        res[i] = res[j];
        if (i > 0 && res[i - 1] == res[i])
            i--;
        else
            i++;
    }

    let result = "";

    for (let letter of letters){
        result+=letter;
    }

    return result;

};

// Optimized
var removeDuplicates = function(s) {

    let arr = [s[0]]
    let j=0
    for(let i=1; i<s.length; i++){
        if(s[i] === arr[j]){
            arr.pop()
            j--
        }else{
            arr.push(s[i])
            j++
        }
    }
    return arr.join("")
};

/**
 * Approach 2 -> Stack
 *
 *   Loop trough String and put chars to a Stack. If current char is equal to top char of stack, pop stack and skip that char.
 *
 * Time Complexity -> O(n)
 *   Loop through String once
 *
 * Space Complexity -> O(n)
 *   We assign values to Stack
 *
 * Result
 *   Runtime: 60 ms, faster than 100.00% of JavaScript online submissions for Remove All Adjacent Duplicates In String.
 *   Memory Usage: 51.6 MB, less than 58.54% of JavaScript online submissions for Remove All Adjacent Duplicates In String.
 */
var removeDuplicates = function(s) {

    let stack = [];

    for (let i = 0; i < s.length; i++) {
        let temp = stack.pop()
        if (s[i] === temp) continue
        else {
            stack.push(temp)
            stack.push(s[i])
        }
    }

    return stack.join('');
};
