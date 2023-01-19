package fromLeetCode.problems_Java.hard;

/*
    Related Topics
    -> Dynamic Programming
    -> Tree
    -> Depth-First Search
    -> Graph

    Problem
    -> https://leetcode.com/problems/sum-of-distances-in-tree/

        There is an undirected connected tree with n nodes labeled from 0 to n - 1 and n - 1 edges.
        You are given the integer n and the array edges where edges[i] = [ai, bi] indicates that
        there is an edge between nodes ai and bi in the tree.
        Return an array answer of length n where answer[i] is the sum of the distances
        between the ith node in the tree and all other nodes.

    Examples
    -> Example 1
            Input: n = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
            Output: [8,12,6,10,10,10]
            Explanation: The tree is shown above.
                We can see that dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5)
                equals 1 + 1 + 2 + 2 + 2 = 8.
                Hence, answer[0] = 8, and so on.
    -> Example 2
            Input: n = 1, edges = []
            Output: [0]
    -> Example 3
            Input: n = 2, edges = [[1,0]]
            Output: [1,1]

    Constraints
    -> 1 <= n <= 3 * 10^4
    -> edges.length == n - 1
    -> edges[i].length == 2
    -> 0 <= ai, bi < n
    -> ai != bi
    -> The given input represents a valid tree.
 */


import java.util.ArrayList;
import java.util.HashSet;

/**
 * Approach 1 ->
 *
 *
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *   Runtime 89 ms Beats 48.9% | Memory 68.3 MB Beats 25.82%
 *
 * Reference
 *   https://leetcode.com/problems/sum-of-distances-in-tree/solutions/130583/c-java-python-pre-order-and-post-order-dfs-o-n/?orderBy=most_votes
 */
class Solution0834_1_DFS {
    int[] res, count;
    ArrayList<HashSet<Integer>> tree;
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        tree = new ArrayList<HashSet<Integer>>();
        res = new int[n];
        count = new int[n];
        for (int i = 0; i < n ; ++i)
            tree.add(new HashSet<Integer>());
        for (int[] e : edges) {
            tree.get(e[0]).add(e[1]);
            tree.get(e[1]).add(e[0]);
        }
        dfs(0, -1);
        dfs2(0, -1);
        return res;
    }

    public void dfs(int root, int pre) {
        for (int i : tree.get(root)) {
            if (i == pre) continue;
            dfs(i, root);
            count[root] += count[i];
            res[root] += res[i] + count[i];
        }
        count[root]++;
    }


    public void dfs2(int root, int pre) {
        for (int i : tree.get(root)) {
            if (i == pre) continue;
            res[i] = res[root] - count[i] + count.length - count[i];
            dfs2(i, root);
        }
    }
}