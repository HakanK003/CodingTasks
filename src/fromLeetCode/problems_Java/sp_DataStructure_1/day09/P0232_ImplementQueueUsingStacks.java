package fromLeetCode.problems_Java.sp_DataStructure_1.day09;

import java.util.Stack;

/*
    Related Topics
    -> Stack
    -> Design
    -> Queue

    Problem
    -> https://leetcode.com/problems/implement-queue-using-stacks/

        Implement a first in first out (FIFO) queue using only two stacks.
        The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
        Implement the MyQueue class:
            void push(int x) Pushes element x to the back of the queue.
            int pop() Removes the element from the front of the queue and returns it.
            int peek() Returns the element at the front of the queue.
            boolean empty() Returns true if the queue is empty, false otherwise.
        Notes:
            You must use only standard operations of a stack, which means only push to top, peek/pop from top, size,
            and is empty operations are valid.
            Depending on your language, the stack may not be supported natively. You may simulate a stack using a list
            or deque (double-ended queue) as long as you use only a stack's standard operations.


    Examples
    -> Example 1
            Input
            ["MyQueue", "push", "push", "peek", "pop", "empty"]
            [[], [1], [2], [], [], []]
            Output
            [null, null, null, 1, 1, false]
            Explanation
                MyQueue myQueue = new MyQueue();
                myQueue.push(1); // queue is: [1]
                myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
                myQueue.peek(); // return 1
                myQueue.pop(); // return 1, queue is [2]
                myQueue.empty(); // return false

    Constraints
    -> 1 <= x <= 9
    -> At most 100 calls will be made to push, pop, peek, and empty.
    -> All the calls to pop and peek are valid.

    Notes
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
 */


/**
 * Approach 1 ->
 *
 *
 * Time Complexity ->
 *
 *
 * Space Complexity ->
 *
 *
 * Result
 *   Runtime 0 ms Beats 100% | Memory 40.3 MB Beats 84.15%
 */
class MyQueue {

    Stack<Integer> stack1, stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        while (stack1.size()>0){
            stack2.push(stack1.pop());
        }
        stack2.push(x);
        while(stack2.size()>0){
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        return stack1.pop();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean empty() {
        return stack1.empty();
    }
}


/**
 * Approach 2 ->
 *
 *
 * Time Complexity ->
 *
 *
 * Space Complexity ->
 *
 *
 * Result
 *   Runtime 0 ms Beats 100% | Memory 40.3 MB Beats 84.15%
 *
 * Reference
 *   https://leetcode.com/problems/implement-queue-using-stacks/solutions/64288/accepted-clean-java-solution/?orderBy=most_votes
 */
class MyQueue2 {

    Stack<Integer> s1, s2;

    public MyQueue2() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        peek();
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

}