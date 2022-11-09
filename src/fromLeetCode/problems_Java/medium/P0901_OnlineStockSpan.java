package fromLeetCode.problems_Java.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
    Related Topics
    -> Stack
    -> Monotonic Stack
    -> Design
    -> Data Stream

    Problem
    -> https://leetcode.com/problems/online-stock-span/

        Design an algorithm that collects daily price quotes for some stock and returns the span of that stock's price for the current day.
        The span of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backward)
        for which the stock price was less than or equal to today's price.

        For example, if the price of a stock over the next 7 days were [100,80,60,70,60,75,85], then the stock spans would be [1,1,1,2,1,4,6].

        Implement the StockSpanner class:
            StockSpanner() Initializes the object of the class.
            int next(int price) Returns the span of the stock's price given that today's price is price.

    Examples
    -> Example1
            Input
            ["StockSpanner", "next", "next", "next", "next", "next", "next", "next"]
            [[], [100], [80], [60], [70], [60], [75], [85]]
            Output
            [null, 1, 1, 1, 2, 1, 4, 6]

            Explanation
            StockSpanner stockSpanner = new StockSpanner();
            stockSpanner.next(100); // return 1
            stockSpanner.next(80);  // return 1
            stockSpanner.next(60);  // return 1
            stockSpanner.next(70);  // return 2
            stockSpanner.next(60);  // return 1
            stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
            stockSpanner.next(85);  // return 6

    Constraints
    -> 1 <= price <= 10^5
    -> At most 10^4 calls will be made to next

    Notes
     * Your StockSpanner object will be instantiated and called as such:
     * StockSpanner obj = new StockSpanner();
     * int param_1 = obj.next(price);
 */



/**
 * Approach 1 -> Monotonic Stack
 *
 *    Initialize a stack. The stack will store elements in the format [price, answer] in a monotonic decreasing manner.
 *    On each call to next:
 *      First set ans = 1 representing the answer.
 *      The top of the stack has a format [priceTop, answerTop]. While priceTop <= price, add answerTop to ans and pop from the stack.
 *      Push the current [price, ans] onto the stack.
 *      Return ans.
 *
 * Time Complexity -> O(1) ~ Amortized O(n)
 *   Even though there is a while loop in next, that while loop can only run nn times total across the entire algorithm.
 *   Each element can only be popped off the stack once, and there are up to nn elements.
 *   This is called amortized analysis - if you average out the time it takes for next to run across nn calls, it works out to be O(1).
 *   If one call to next takes a long time because the while loop runs many times,
 *   then the other calls to next won't take as long because their while loops can't run as long.
 *
 * Space Complexity -> O(n)
 *   In the worst case scenario for space (when all the stock prices are decreasing),
 *   the while loop will never run, which means the stack grows to a size of n.
 *
 * Result
 *   Runtime: 76 ms, faster than 54.87% of Java online submissions for Online Stock Span.
 *   Memory Usage: 75.1 MB, less than 21.90% of Java online submissions for Online Stock Span.
 *
 * Reference
 *   https://leetcode.com/problems/online-stock-span/solution/
 */
class StockSpanner {

    Stack<int[]> stocks = new Stack<>();

    public StockSpanner() {

    }

    public int next(int price) {

        int days = 1;

        while (!stocks.isEmpty() && stocks.peek()[0] <= price) {
            days += stocks.pop()[1];
        }

        stocks.push(new int[] {price, days});

        return days;

    }

}



/**
 * Approach 2 -> Similar to Sequence DP
 *
 *   Based on the size of the data, and the title tells that the running time requirement is reduced by 50%,
 *   it can be deduced that an O(n) level algorithm needs to be used.
 *   Because the practice is the more obvious sequence DP practice.
 *   dp[i] represents the number of consecutive days below the current price ending in ith.
 *   So it can be deduced that the recursive equation is:
 *     if dp[i-1] > dp[i] then the value is 1
 *   Otherwise we need to keep jumping forward, i.e. when prices[i] >= prices[j]
 *     Then j -= prices[j]. Until the jump to the head or the condition does not hold.
 *
 * Time Complexity -> O(1) ~ Amortized O(n)
 *   Same with Approach 1
 *
 * Space Complexity -> O(n)
 *   In the worst case scenario for space (when all the stock prices are decreasing),
 *   the while loop will never run, which means the stack grows to a size of n.
 *
 * Result
 *   Runtime: 27 ms, faster than 98.40% of Java online submissions for Online Stock Span.
 *   Memory Usage: 51.7 MB, less than 85.19% of Java online submissions for Online Stock Span.
 *
 * Reference
 *   https://github.com/cherryljr/LeetCode/blob/master/Online%20Stock%20Span.java
 */
class StockSpanner2 {

    private List<Integer> prices;
    private List<Integer> dp;

    public StockSpanner2() {
        prices = new ArrayList<>();
        dp = new ArrayList<>();
    }

    public int next(int price) {

        if (prices.isEmpty() || price < prices.get(prices.size() - 1)) {
            dp.add(1);
        } else {
            int i = prices.size() - 1;
            while (i >= 0 && prices.get(i) <= price) {
                i -= dp.get(i);
            }
            dp.add(prices.size() - i);
        }
        prices.add(price);
        return dp.get(dp.size() - 1);
    }
}