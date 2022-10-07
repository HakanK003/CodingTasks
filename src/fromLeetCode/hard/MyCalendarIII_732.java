package fromLeetCode.hard;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyCalendarIII_732 {

}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */

class MyCalendarThree {


    TreeMap<Integer, Integer> bookings;

    public MyCalendarThree() {
        bookings = new TreeMap<>();
    }

    public int book(int start, int end) {
        bookings.put(start, bookings.getOrDefault(start, 0) + 1);
        bookings.put(end, bookings.getOrDefault(end, 0) - 1);
        int res = 0, cur = 0;
        for (int delta : bookings.values()) {
            cur += delta;
        res = Math.max(res, cur);
        }
        return res;
//        for (int i = start; i < end; i++) {
//
//            if (bookings.containsKey(i)){
//
//                bookings.put(i, bookings.get(i)+1);
//
//            }else{
//
//                bookings.put(i, 1);
//
//            }
//
//        }
//
//        int high = 0;
//
//        for (Map.Entry<Integer,Integer> entry : bookings.entrySet()){
//
//            if (entry.getValue()>high){
//                high = entry.getValue();
//            }
//
//        }
//
//        return high;
    }
}


//Approach 1: Sweep-line Algorithm
/*
Initialize a TreeMap diff as empty. We use a TreeMap here instead of an array because the times given by the inputs are sparse as there are at most 400 calls of book() function, we don't have to create records for all numbers in [1, 1e9).
Each time we book a new event [start, end)
Update the diff[start] by adding 1 while diff[end] by subtracting 1.
Initialize an integer cur = 0 to represent the number of intervals at the current time
Enumerate all times that have records in diff in order, accumulate the corresponding value to cur, and record the max value of cur during our enumeration, which is the result of book() call.
 */
/*
class MyCalendarThree {
    private Map<Integer, Integer> diff;

    public MyCalendarThree() {
        diff = new TreeMap<>();
    }

    public int book(int start, int end) {
        diff.put(start, diff.getOrDefault(start, 0) + 1);
        diff.put(end, diff.getOrDefault(end, 0) - 1);
        int res = 0, cur = 0;
        for (int delta : diff.values()) {
            cur += delta;
            res = Math.max(res, cur);
        }
        return res;
    }
}
 */
/*
Complexity Analysis
Let NN be the number of events booked.

Time Complexity: O(N^2)O(N
2
 ). For each new event, we update the changes at two points in O(\log{N})O(logN) because we keep the HashMap in sorted order. Then we traverse diff in O(N)O(N) time.

Space Complexity: O(N)O(N), the size of diff.


 */


//Approach 2: Segment Tree
/*
Each time adding a new event [start, end), we start from the root node, which represents the time interval [0, C], where C is the largest possible time and equals to 1e9 in this problem, check if [start, end - 1] has any intersection with current range [L, R] ([0, C] for the root node), and update those nodes recursively:

If L > end - 1 or R < start, no elements in [start, end - 1] are included in current node, just return.
If start <= L and R >= end - 1, the range represented by this node is completely contained in [start, end - 1]. All elements in the range will be added by 1, so we just need to increase its lazy and val by 1 and stop.
Otherwise, only partial numbers in this range are coverd by [start, end). We just go to the two child nodes and repeat the checking steps above to update them. After updating data in child nodes, don't forget to update val of our current node by lazy + max(left.val, right.val), because the max numbers must come from either left or right half of the range, plus the number shared by all elements in the interval, which is stored in lazy.
The val of the root node is exactly the answer we want.
 */

/*
class MyCalendarThree {
    private Map<Integer, Integer> vals;
    private Map<Integer, Integer> lazy;

    public MyCalendarThree() {
        vals = new HashMap<>();
        lazy = new HashMap<>();
    }

    public void update(int start, int end, int left, int right, int idx) {
        if (start > right || end < left)
            return;
        if (start <= left && right <= end) {
            vals.put(idx, vals.getOrDefault(idx, 0) + 1);
            lazy.put(idx, lazy.getOrDefault(idx, 0) + 1);
        } else {
            int mid = (left + right) / 2;
            update(start, end, left, mid, idx * 2);
            update(start, end, mid + 1, right, idx * 2 + 1);
            vals.put(idx, lazy.getOrDefault(idx, 0)
                    + Math.max(vals.getOrDefault(idx * 2, 0), vals.getOrDefault(idx * 2 + 1, 0)));
        }
    }

    public int book(int start, int end) {
        update(start, end - 1, 0, 1000000000, 1);
        return vals.getOrDefault(1, 0);
    }
}

 */

/*
Complexity Analysis
Let NN be the number of events booked and CC be the largest time (i.e., 10^910
9
  in this problem)

Time Complexity: O(N \log{C})O(NlogC). The max possible depth of the segment tree is \log{C}logC. At most O(\log{C})O(logC) nodes will be visited in each update operation. Thus, the time complexity of booking NN new events is O(N \log{C})O(NlogC).
Space Complexity: O(N \log{C})O(NlogC). Instead of creating a segment tree of 4C4C at first, we create tree nodes dynamically when needed. Every time update is called, we create at most O(\log{C})O(logC) nodes because the max depth of the segment tree is \log{C}logC.
 */


//Approach 3: Balanced Tree
/*
To keep all intervals mentioned above sorted, we first use a balanced tree as a container initialized with the largest time range [1, 1e9), which has no events, that is, we have intervals = [[1, 1e9)] at first. All intervals are stored in the array intervals in the form of [left, right).

When we need to book a new event [start, end):

Binary search all starting points in intervals to find the first interval [L1, R1) that has L1 >= start, then we split the interval into [L1, start) and [start, R1), keep the events in them the same as the origin interval [L1, R1), and put them back in intervals container.
Similarly, perform a binary search to get the first [L2, R2) that satisfies L2 <= end, split it into[L2, start) and [start, R2) and inserting them into intervals.
For all non-empty intervals between [start, R1) and [start, R1) inclusively in intervals, increase the events of them by 1 as we added a new event in time [start, end) just now. Because only the number of events in those intervals are updated, to get the max number of events now, we just need to compare the last max number of events with them.
 */

/*
class MyCalendarThree {
    private TreeMap<Integer, Integer> starts;
    private int res;

    public MyCalendarThree() {
        starts = new TreeMap<>();
        starts.put(0, 0);
        res = 0;
    }

    public void split(int x) {
        Integer prev = starts.floorKey(x);
        Integer next = starts.ceilingKey(x);
        if (next != null && next == x)
            return;
        starts.put(x, starts.get(prev));
    }

    public int book(int start, int end) {
        split(start);
        split(end);
        for (var interval : starts.subMap(start, true, end, false).entrySet()) {
            res = Math.max(res, interval.setValue(interval.getValue() + 1) + 1);
        }
        return res;
    }
}
 */
/*
Complexity Analysis
Let NN be the number of events booked.

Time Complexity: O(N^2)O(N
2
 ) in the worst case. For each new [start, end), we find the intervals that contains point start and end in O(\log{N})O(logN) time, split and add new intervals in O(\log{N})O(logN) time. We increase at most 2 new intervals each time, so the size of intervals(or starts) is at most 2N+12N+1. Finally, we enumerate all intervals contained in [start, end) to get the max number of events, which takes O(N)O(N) time. Therefore, the overall time complexity of booking NN events is O(N^2)O(N
2
 ).
Though the time complexity looks not ideal in the worst case, if the given [start, end) is distributed uniformly, the time complexity is O(N\log\log N)O(NloglogN) (See also: Crate chtholly_tree). The proof is not easy so we ignore it here.

Space Complexity: O(N)O(N), the size of intervals(or starts) is at most 2N+12N+1 as we analyzed before.
 */