package fromLeetCode.problems_Java.hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Stack;

/*
    Related Topics
    -> Array
    -> Math
    -> Geometry

    Problem
    -> https://leetcode.com/problems/erect-the-fence/

        You are given an array trees where trees[i] = [xi, yi] represents the location of a tree in the garden.
        Fence the entire garden using the minimum length of rope, as it is expensive.
        The garden is well-fenced only if all the trees are enclosed.
        Return the coordinates of trees that are exactly located on the fence perimeter.
        You may return the answer in any order.

    Examples
    -> Example 1
            Input: trees = [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
            Output: [[1,1],[2,0],[4,2],[3,3],[2,4]]
            Explanation: All the trees will be on the perimeter of the fence except the tree at [2, 2],
            which will be inside the fence.
    -> Example 2
            Input: trees = [[1,2],[2,2],[4,2]]
            Output: [[4,2],[2,2],[1,2]]
            Explanation: The fence forms a line that passes through all the trees.

    Constraints
    -> 1 <= trees.length <= 3000
    -> trees[i].length == 2
    -> 0 <= xi, yi <= 100
    -> All the given positions are unique.
 */



/**
 * Approach 1 -> Jarvis Algorithm
 *
 *   Check reference
 *
 * Time Complexity -> O(m*n)
 *
 * Space Complexity ->O(m)
 *
 * Result
 *   TLE
 *
 * Reference
 *   https://leetcode.com/problems/erect-the-fence/solution/
 */
class Solution0587_1 {
    public int orientation(int[] p, int[] q, int[] r) {
        return (q[1] - p[1]) * (r[0] - q[0]) - (q[0] - p[0]) * (r[1] - q[1]);
    }

    public boolean inBetween(int[] p, int[] i, int[] q) {
        boolean a = i[0] >= p[0] && i[0] <= q[0] || i[0] <= p[0] && i[0] >= q[0];
        boolean b = i[1] >= p[1] && i[1] <= q[1] || i[1] <= p[1] && i[1] >= q[1];
        return a && b;
    }

    public int[][] outerTrees(int[][] points) {
        HashSet<int[]> hull = new HashSet<> ();
        if (points.length < 4) {
            for (int[] p: points)
                hull.add(p);
            return hull.toArray(new int[hull.size()][]);
        }
        int left_most = 0;
        for (int i = 0; i < points.length; i++)
            if (points[i][0] < points[left_most][0])
                left_most = i;
        int p = left_most;
        do {
            int q = (p + 1) % points.length;
            for (int i = 0; i < points.length; i++) {
                if (orientation(points[p], points[i], points[q]) < 0) {
                    q = i;
                }
            }
            for (int i = 0; i < points.length; i++) {
                if (i != p && i != q && orientation(points[p], points[i], points[q]) == 0 && inBetween(points[p], points[i], points[q])) {
                    hull.add(points[i]);
                }
            }
            hull.add(points[q]);
            p = q;
        }
        while (p != left_most);
        return hull.toArray(new int[hull.size()][]);
    }
}



/**
 * Approach 2 -> Graham Scan
 *
 *   Check reference
 *
 * Time Complexity -> O(n log n)
 *
 * Space Complexity -> O(n)
 *
 * Result
 *   Runtime: 33 ms, faster than 66.52% of Java online submissions for Erect the Fence.
 *   Memory Usage: 55 MB, less than 21.49% of Java online submissions for Erect the Fence.
 *
 * Reference
 *   https://leetcode.com/problems/erect-the-fence/solution/
 */
class Solution0587_2 {
    public int orientation(int[] p, int[] q, int[] r) {
        return (q[1] - p[1]) * (r[0] - q[0]) - (q[0] - p[0]) * (r[1] - q[1]);
    }
    public int distance(int[] p, int[] q) {
        return (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
    }

    private static int[] bottomLeft(int[][] points) {
        int[] bottomLeft = points[0];
        for (int[] p: points)
            if (p[1] < bottomLeft[1])
                bottomLeft = p;
        return bottomLeft;
    }
    public int[][] outerTrees(int[][] points) {
        if (points.length <= 1)
            return points;
        int[] bm = bottomLeft(points);
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] p, int[] q) {
                double diff = orientation(bm, p, q) - orientation(bm, q, p);
                if (diff == 0)
                    return distance(bm, p) - distance(bm, q);
                else
                    return diff > 0 ? 1 : -1;
            }
        });
        int i = points.length - 1;
        while (i >= 0 && orientation(bm, points[points.length - 1], points[i]) == 0)
            i--;
        for (int l = i + 1, h = points.length - 1; l < h; l++, h--) {
            int[] temp = points[l];
            points[l] = points[h];
            points[h] = temp;
        }
        Stack<int[]> stack = new Stack< > ();
        stack.push(points[0]);
        stack.push(points[1]);
        for (int j = 2; j < points.length; j++) {
            int[] top = stack.pop();
            while (orientation(stack.peek(), top, points[j]) > 0)
                top = stack.pop();
            stack.push(top);
            stack.push(points[j]);
        }
        return stack.toArray(new int[stack.size()][]);
    }
}



/**
 * Approach 3 -> Monotone Chain
 *
 *   Check reference
 *
 * Time Complexity -> O(n log n)
 *
 * Space Complexity -> O(n)
 *
 * Result
 *
 *
 * Reference
 *   https://leetcode.com/problems/erect-the-fence/solution/
 */
class Solution0587_3 {
    public int orientation(int[] p, int[] q, int[] r) {
        return (q[1] - p[1]) * (r[0] - q[0]) - (q[0] - p[0]) * (r[1] - q[1]);
    }
    public int[][] outerTrees(int[][] points) {
        Arrays.sort(points, new Comparator<int[]> () {
            public int compare(int[] p, int[] q) {
                return q[0] - p[0] == 0 ? q[1] - p[1] : q[0] - p[0];
            }
        });
        Stack<int[]> hull = new Stack<>();
        for (int i = 0; i < points.length; i++) {
            while (hull.size() >= 2 && orientation(hull.get(hull.size() - 2), hull.get(hull.size() - 1), points[i]) > 0)
                hull.pop();
            hull.push(points[i]);
        }
        hull.pop();
        for (int i = points.length - 1; i >= 0; i--) {
            while (hull.size() >= 2 && orientation(hull.get(hull.size() - 2), hull.get(hull.size() - 1), points[i]) > 0)
                hull.pop();
            hull.push(points[i]);
        }
        // remove redundant elements from the stack
        HashSet<int[]> ret = new HashSet<>(hull);
        return ret.toArray(new int[ret.size()][]);
    }}

