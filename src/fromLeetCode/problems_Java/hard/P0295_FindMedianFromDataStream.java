package fromLeetCode.problems_Java.hard;

import java.util.Collections;
import java.util.PriorityQueue;

/*
    Related Topics
    -> Two Pointers
    -> Design
    -> Sorting
    -> Heap (Priority Queue)
    -> Data Stream

    Problem
    -> https://leetcode.com/problems/find-median-from-data-stream/

        The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value,
        and the median is the mean of the two middle values.
            For example, for arr = [2,3,4], the median is 3.
            For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
        Implement the MedianFinder class:
            MedianFinder() initializes the MedianFinder object.
            void addNum(int num) adds the integer num from the data stream to the data structure.
            double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.


    Examples
    -> Example 1
            Input
            ["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
            [[], [1], [2], [], [3], []]
            Output
            [null, null, null, 1.5, null, 2.0]
            Explanation
            MedianFinder medianFinder = new MedianFinder();
            medianFinder.addNum(1);    // arr = [1]
            medianFinder.addNum(2);    // arr = [1, 2]
            medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
            medianFinder.addNum(3);    // arr[1, 2, 3]
            medianFinder.findMedian(); // return 2.0

    Constraints
    -> -10^5 <= num <= 10^5
    -> There will be at least one element in the data structure before calling findMedian.
    -> At most 5 * 10^4 calls will be made to addNum and findMedian.

    Notes
     * Your MedianFinder object will be instantiated and called as such:
     * MedianFinder obj = new MedianFinder();
     * obj.addNum(num);
     * double param_2 = obj.findMedian();
     * Follow up:
         If all integer numbers from the stream are in the range [0, 100], how would you optimize your solution?
         If 99% of all integer numbers from the stream are in the range [0, 100], how would you optimize your solution?
 */



/**
 * Approach 1 -> Two heaps
 *
 *   Check reference
 *
 * Time Complexity
 *   Constructor: O(1)
 *   addNum: O(logN)
 *   findMedian: O(1)
 *
 * Space Complexity -> O(n)
 *
 * Result
 *   Runtime: 291 ms, faster than 24.61% of Java online submissions for Find Median from Data Stream.
 *   Memory Usage: 121.1 MB, less than 70.35% of Java online submissions for Find Median from Data Stream.
 *
 * Reference
 *   https://leetcode.com/problems/find-median-from-data-stream/discuss/1330646/C%2B%2BJavaPython-MinHeap-MaxHeap-Solution-Picture-explain-Clean-and-Concise
 *
 */
class MedianFinder {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {

    }

    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if (minHeap.size() > maxHeap.size())
            maxHeap.offer(minHeap.poll());
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) return maxHeap.peek();
        return (minHeap.peek() + maxHeap.peek()) / 2.0d;
    }
}

