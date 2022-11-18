package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Math

    Problem
    -> https://leetcode.com/problems/ugly-number/

        An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
        Given an integer n, return true if n is an ugly number.

    Examples
    -> Example 1
            Input: n = 6
            Output: true
            Explanation: 6 = 2 × 3
    -> Example 2
            Input: n = 1
            Output: true
            Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
    -> Example 3
            Input: n = 14
            Output: false
            Explanation: 14 is not ugly since it includes the prime factor 7.

    Constraints
    -> -2^31 <= n <= 2^31 - 1
 */



/**
 * Approach 1 -> Math
 *
 *   Divide number to 2, 3, 5 until it's 1 or can't dividable more. After divisions if n==1 return true otherwise false.
 *   If number is negative directly false because, numbers that has only 2, 3, 5 as prime factor can't be negative.
 *
 * Time Complexity -> O(log(n))
 *   We can divide max log(n) times
 *
 * Space Complexity -> O(1)
 *
 * Result
 *   Runtime: 2 ms, faster than 80.60% of Java online submissions for Ugly Number.
 *   Memory Usage: 41.1 MB, less than 60.08% of Java online submissions for Ugly Number.
 */
class Solution0263_1 {
    public boolean isUgly(int n) {

        while(n>0){
            if (n%30==0)
                n/=30;
            else if(n%15==0)
                n/=15;
            else if(n%6==0)
                n/=6;
            else if(n%10==0)
                n/=10;
            else if (n%2==0)
                n/=2;
            else if (n%3==0)
                n/=3;
            else if (n%5==0)
                n/=5;
            else
                break;
        }

        return n==1;
    }
}

class Solution0263_2 {
    public boolean isUgly(int n) {

        if(n<1) return false;

        while(n%2==0){
            n/=2;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%5==0){
            n/=5;
        }

        return n==1;
    }
}