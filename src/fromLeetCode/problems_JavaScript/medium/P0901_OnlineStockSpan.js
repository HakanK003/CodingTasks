/*
    Related Topics
    -> String
    -> Array

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
     * @param {number} price
     * @return {number}
     * Your StockSpanner object will be instantiated and called as such:
     * var obj = new StockSpanner()
     * var param_1 = obj.next(price)
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
 * Time Complexity -> O(1)
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
 *   Runtime: 516 ms, faster than 59.94% of JavaScript online submissions for Online Stock Span.
 *   Memory Usage: 59.5 MB, less than 76.76% of JavaScript online submissions for Online Stock Span.
 *
 * Reference
 *   https://leetcode.com/problems/online-stock-span/solution/
 *   https://github.com/HakanK003/CodingTasks/blob/master/src/fromLeetCode/problems_Java/medium/P0901_OnlineStockSpan.java
 */
var StockSpanner = function() {
    this.stocks = [];
};

StockSpanner.prototype.next = function(price) {

    let days = 1;

    while(this.stocks.length && this.stocks[this.stocks.length - 1].price <= price) {
        days += this.stocks[this.stocks.length - 1].days;
        this.stocks.pop();
    }

    this.stocks.push({price, days})

    return days;
};
