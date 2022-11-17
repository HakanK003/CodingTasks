package fromLeetCode.problems_Java.medium;

/*
    Related Topics
    -> Math
    -> Geometry

    Problem
    -> https://leetcode.com/problems/rectangle-area/

        Given the coordinates of two rectilinear rectangles in a 2D plane, return the total area covered by the two rectangles.
        The first rectangle is defined by its bottom-left corner (ax1, ay1) and its top-right corner (ax2, ay2).
        The second rectangle is defined by its bottom-left corner (bx1, by1) and its top-right corner (bx2, by2).

    Examples
    -> Example 1
            Input: ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2
            Output: 45
    -> Example 2
            Input: ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2
            Output: 16

    Constraints
    -> -10^4 <= ax1 <= ax2 <= 10^4
    -> -10^4 <= ay1 <= ay2 <= 10^4
    -> -10^4 <= bx1 <= bx2 <= 10^4
    -> -10^4 <= by1 <= by2 <= 10^4
 */



/**
 * Approach 1 -> Math / Intersection Over Union
 *
 *   Check reference
 *
 * Time Complexity -> O(1)
 *   Constant time, we just use some variables and do calculation
 *
 * Space Complexity -> O(1)
 *   We don't use extra data structure, everything is in constant
 *
 * Result
 *   Runtime: 5 ms, faster than 51.55% of Java online submissions for Rectangle Area.
 *   Memory Usage: 43.6 MB, less than 15.86% of Java online submissions for Rectangle Area.
 *
 *  Reference
 *    https://leetcode.com/problems/rectangle-area/solution/
 */
class Solution0223_1 {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int areaOfA = (ay2 - ay1) * (ax2 - ax1);
        int areaOfB = (by2 - by1) * (bx2 - bx1);

        // calculate x overlap
        int left = Math.max(ax1, bx1);
        int right = Math.min(ax2, bx2);
        int xOverlap = right - left;

        // calculate y overlap
        int top = Math.min(ay2, by2);
        int bottom = Math.max(ay1, by1);
        int yOverlap = top - bottom;

        int areaOfOverlap = 0;
        // if the rectangles overlap each other, then calculate
        // the area of the overlap
        if (xOverlap > 0 && yOverlap > 0) {
            areaOfOverlap = xOverlap * yOverlap;
        }

        // areaOfOverlap is counted twice when in the summation of
        // areaOfA and areaOfB, so we need to subtract it from the
        // total, to get the total area covered by both the rectangles
        int totalArea = areaOfA + areaOfB - areaOfOverlap;

        return totalArea;
    }
}

//TODO 2ms example solution
//
//class Solution {
//    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2)
//    {
//        int area1=Math.abs(ax1-ax2)*Math.abs(ay1-ay2);
//        int area2=Math.abs(bx1-bx2)*Math.abs(by1-by2);
//        int x1=Math.min(ax2,bx2)-Math.max(ax1,bx1);
//        int y1=Math.min(ay2,by2)-Math.max(ay1,by1);
//        int repeat=0;
//        if(x1>0 && y1>0)
//            repeat=x1*y1;
//        return area1+area2-repeat;
//    }
//}

//TODO 41000kb example solution
//
//class Solution {
//    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
//        if(ax1 > bx1)
//            return computeArea(bx1,   by1,   bx2,   by2, ax1,   ay1,   ax2,   ay2);
//
//        int total = (bx2 - bx1) *(by2 - by1) + (ay2 - ay1) *(ax2 - ax1);
//        if(ay1>= by2 || ay2 <= by1 || ax2 <= bx1) return total;
//
//        int y1 = Math.max(ay1, by1);
//        int y2 = Math.min(ay2, by2);
//        int x1 = Math.max(ax1, bx1);
//        int x2 = Math.min(ax2, bx2);
//
//         return total - (x2-x1)*(y2-y1);
//    }
//}
