package fromLeetCode.problems_Java.easy;


/*
    Related Topics
    -> Binary Search
    -> Interactive

    Problem
    -> https://leetcode.com/problems/guess-number-higher-or-lower/

        We are playing the Guess Game. The game is as follows:
        I pick a number from 1 to n. You have to guess which number I picked.
        Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

        You call a pre-defined API int guess(int num), which returns three possible results:
          -1: Your guess is higher than the number I picked (i.e. num > pick).
           1: Your guess is lower than the number I picked (i.e. num < pick).
           0: your guess is equal to the number I picked (i.e. num == pick).
        Return the number that I picked.

    Examples
    -> Example 1
            Input: n = 10, pick = 6
            Output: 6
    -> Example 2
            Input: n = 1, pick = 1
            Output: 1
    -> Example 3
            Input: n = 2, pick = 1
            Output: 1

    Constraints
    -> 1 <= n <= 2^31 - 1
    -> 1 <= pick <= n

    Notes
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
 */
class GuessGame {
    public int guess(int middle) {
        //Codes
        return -1;
    }
}


/**
 * Approach 1 -> Binary Search
 *
 *   Find middle number by taking average of high and low number, and pick middle number.
 *   If middle number is greater than actual number, than set new low number as middle number
 *   If middle number is lower than actual number, than set new high number as middle number
 *   If middle number is equal to actual number, return middle number
 *
 * Time Complexity -> O(log(n))
 *   In each step, skip half of the remaining possibilities
 *
 * Space Complexity -> O(1)
 *
 * Result
 *   Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.
 *   Memory Usage: 40.6 MB, less than 67.46% of Java online submissions for Guess Number Higher or Lower.
 */
class Solution0374_1 extends GuessGame  {
    public int guessNumber(int n) {

        int high = n, low = 1, middle;
        while(high>=low){

            middle = low + (high - low)/2;

            if(guess(middle)==1)
                low = middle+1;
            else if(guess(middle)==-1)
                high = middle-1;
            else
                return middle;
            }
        return -1;
    }
}

class Solution0374_1_1 extends GuessGame {
    public int guessNumber(int n) {

        int high = n, low = 1, middle;
        while(high>=low){

            middle = low + (high - low)/2;

            switch(guess(middle)){
                case 1:
                    low = middle+1;
                    break;
                case -1:
                    high = middle-1;
                    break;
                case 0:
                    return middle;
            }
        }
        return -1;
    }
}