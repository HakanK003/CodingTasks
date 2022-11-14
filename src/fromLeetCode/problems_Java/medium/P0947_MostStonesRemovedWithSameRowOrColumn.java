package fromLeetCode.problems_Java.medium;

import java.util.*;

/*
    Related Topics
    -> Depth-First Search
    -> Union Find
    -> Graph

    Problem
    -> https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/

        On a 2D plane, we place n stones at some integer coordinate points. Each coordinate point may have at most one stone.
        A stone can be removed if it shares either the same row or the same column as another stone that has not been removed.
        Given an array stones of length n where stones[i] = [xi, yi] represents the location of the ith stone,
        return the largest possible number of stones that can be removed.

    Examples
    -> Example 1
            Input: stones = [[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]]
            Output: 5
            Explanation: One way to remove 5 stones is as follows:
            1. Remove stone [2,2] because it shares the same row as [2,1].
            2. Remove stone [2,1] because it shares the same column as [0,1].
            3. Remove stone [1,2] because it shares the same row as [1,0].
            4. Remove stone [1,0] because it shares the same column as [0,0].
            5. Remove stone [0,1] because it shares the same row as [0,0].
            Stone [0,0] cannot be removed since it does not share a row/column with another stone still on the plane.
    -> Example 2
            Input: stones = [[0,0],[0,2],[1,1],[2,0],[2,2]]
            Output: 3
            Explanation: One way to make 3 moves is as follows:
            1. Remove stone [2,2] because it shares the same row as [2,0].
            2. Remove stone [2,0] because it shares the same column as [0,0].
            3. Remove stone [0,2] because it shares the same row as [0,0].
            Stones [0,0] and [1,1] cannot be removed since they do not share a row/column with another stone still on the plane.
    -> Example 3
            Input: stones = [[0,0]]
            Output: 0
            Explanation: [0,0] is the only stone on the plane, so you cannot remove it.

    Constraints
    -> 1 <= stones.length <= 1000
    -> 0 <= xi, yi <= 10^4
    -> No two stones are at the same coordinate point.
 */



/**
 * Approach 1 -> Union Find
 *
 *   Check reference
 *
 * Time Complexity -> O(n) amortize O(1)
 *   Check reference
 *
 * Space Complexity -> O(n)
 *   Check reference
 *
 * Result
 *   Runtime: 20 ms, faster than 91.17% of Java online submissions for Most Stones Removed with Same Row or Column.
 *   Memory Usage: 53.3 MB, less than 38.46% of Java online submissions for Most Stones Removed with Same Row or Column.
 *
 *  Reference
 *    https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/discuss/197668/Count-the-Number-of-Islands-O(N)
 */
class Solution0947_1 {
    Map<Integer, Integer> f = new HashMap<>();
    int islands = 0;

    public int removeStones(int[][] stones) {
        for (int i = 0; i < stones.length; ++i)
            union(stones[i][0], ~stones[i][1]);
        return stones.length - islands;
    }

    public int find(int x) {
        if (f.putIfAbsent(x, x) == null)
            islands++;
        if (x != f.get(x))
            f.put(x, find(f.get(x)));
        return f.get(x);
    }

    public void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            f.put(x, y);
            islands--;
        }
    }
}



/**
 * Approach 2 -> Recursive DFS
 *
 *   Check reference
 *
 * Time Complexity -> O(n^2)
 *   Check reference
 *
 * Space Complexity -> O(n)
 *   Check reference
 *
 * Result
 *   Runtime: 494 ms, faster than 5.17% of Java online submissions for Most Stones Removed with Same Row or Column.
 *   Memory Usage: 49.9 MB, less than 57.39% of Java online submissions for Most Stones Removed with Same Row or Column.
 *
 *  Reference
 *    https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/discuss/209369/Java-recursive-DFS-Short-and-easy-to-understand
 */
class Solution0947_2 {
    // Ans = # of stones – # of islands
    public int removeStones(int[][] stones) {
        Set<int[]> visited = new HashSet();
        int numOfIslands = 0;
        for (int[] s1:stones){
            if (!visited.contains(s1)){
                dfs(s1, visited, stones);
                numOfIslands++;
            }
        }
        return stones.length - numOfIslands;
    }

    private void dfs(int[] s1, Set<int[]> visited, int[][] stones){
        visited.add(s1);
        for (int[] s2: stones){
            if (!visited.contains(s2)){
                // stone with same row or column. group them into island
                if (s1[0] == s2[0] || s1[1] == s2[1])
                    dfs(s2, visited, stones);
            }
        }
    }
}



// TODO other solutions to check
//// sample 41000 KB submission
//class Solution {
//
//    private int[] parent;
//
//    public int removeStones(int[][] stones) {
//        parent = new int[stones.length];
//        for (int i = 0; i < stones.length; i++) {
//            parent[i] = i;
//        }
//
//        for (int i = 0; i < stones.length; i++) {
//            for (int j = i + 1; j < stones.length; j++) {
//                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
//                    union(i, j);
//                }
//            }
//        }
//
//        int count = 0;
//        for (int i = 0; i < stones.length; i++) {
//            if (parent[i] == i) {
//                count++;
//            }
//        }
//        return stones.length - count;
//    }
//
//    public int find(int i) {
//        while (parent[i] != i) {
//            i = parent[i];
//        }
//        return parent[i];
//    }
//
//    public void union(int x, int y) {
//        parent[find(x)] = find(y);
//    }
//}
//
//
//// sample 2 ms submission
//class Solution {
//    int[] parent = new int[20001];
//    int islands = 0;
//
//    public int removeStones(int[][] stones) {
//        for (int i = 0; i < stones.length; ++i) {
//            union(stones[i][0], stones[i][1] + 10000);
//        }
//
//        return stones.length - islands;
//    }
//
//    public int find(int x) {
//        if (parent[x] == 0) {
//            islands++;
//            parent[x] = x;
//        }
//        if (x != parent[x])
//            parent[x] = find(parent[x]);
//        return parent[x];
//    }
//
//    public void union(int x, int y) {
//        x = find(x);
//        y = find(y);
//        if (x != y) {
//            parent[x] = y;
//            islands--;
//        }
//    }
//}
//
//
//// sample 42700 KB submission
//class Solution {
//    public int removeStones(int[][] stones) {
//        int n = stones.length;
//        Map<Integer,List<Integer>> map = new HashMap<>();
//        //build graph
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(isConnect(stones,i,j)){
//                    map.putIfAbsent(i, new ArrayList<>());
//                    map.get(i).add(j);
//                    map.putIfAbsent(j, new ArrayList<>());
//                    map.get(j).add(i);
//                }
//            }
//        }
//        Set<Integer> visited = new HashSet<>();
//        int count = 0;
//        for(int i=0;i<n;i++){
//            if(!visited.contains(i)){
//                dfs(i, visited,map);
//                count++;
//            }
//        }
//        return n-count;
//    }
//
//    public void dfs(int i, Set<Integer> visited,Map<Integer,List<Integer>> map){
//        if(visited.contains(i)){
//            return;
//        }
//        visited.add(i);
//        if(map.containsKey(i)){
//            for(int nei: map.get(i)){
//                dfs(nei,visited,map);
//            }
//        }
//    }
//
//
//    public boolean isConnect(int[][] stones, int i, int j){
//        if(stones[i][0]==stones[j][0] || stones[i][1]==stones[j][1]){
//            return true;
//        }
//        return false;
//    }
//}
