package fromLeetCode.problems_Java.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Related Topics
    -> Depth-First Search
    -> Breadth-First Search
    -> Graph
    -> Union Find

    Problem
    -> https://leetcode.com/problems/possible-bipartition/

        We want to split a group of n people (labeled from 1 to n) into two groups of any size.
        Each person may dislike some other people, and they should not go into the same group.
        Given the integer n and the array dislikes where dislikes[i] = [ai, bi] indicates that
        the person labeled ai does not like the person labeled bi,
        return true if it is possible to split everyone into two groups in this way.


    Examples
    -> Example 1
            Input: n = 4, dislikes = [[1,2],[1,3],[2,4]]
            Output: true
            Explanation: group1 [1,4] and group2 [2,3].
    -> Example 2
            Input: n = 3, dislikes = [[1,2],[1,3],[2,3]]
            Output: false
    -> Example 3
            Input: n = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
            Output: false


    Constraints
    -> 1 <= n <= 2000
    -> 0 <= dislikes.length <= 10^4
    -> dislikes[i].length == 2
    -> 1 <= dislikes[i][j] <= n
    -> ai < bi
    -> All the pairs of dislikes are unique.
 */


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
 *  Runtime 11 ms Beats 98.95% | Memory 50.2 MB Beats 83.49%
 *
 * Reference
 *   https://leetcode.com/problems/possible-bipartition/solutions/655414/java-dfs-clean-code/
 */
class Solution0886_1_DFS {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] d : dislikes) {
            int a = d[0] - 1, b = d[1] - 1;
            graph[a].add(b);
            graph[b].add(a);
        }
        int[] groupMap = new int[n]; // Map people with the group (-1: None, 0: GroupA, 1: GroupB)
        Arrays.fill(groupMap, -1);
        for (int i = 0; i < n; i++)
            if (groupMap[i] == -1 && !dfs(graph, i, 0, groupMap))
                return false;
        return true;
    }
    boolean dfs(List<Integer>[] graph, int src, int group, int[] groupMap) {
        if (groupMap[src] == 1 - group) return false; // Found `src` in the competitor group
        if (groupMap[src] == group) return true; // Already visited
        groupMap[src] = group; // Assign `src` to `group`
        for (int v : graph[src])
            if (!dfs(graph, v, 1 - group, groupMap))
                return false;
        return true;
    }
}