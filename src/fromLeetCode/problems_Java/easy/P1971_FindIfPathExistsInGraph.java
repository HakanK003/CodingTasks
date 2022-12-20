package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Depth-First Search
    -> Breadth-First Search
    -> Union Find
    -> Graph

    Problem
    -> https://leetcode.com/problems/find-if-path-exists-in-graph/

        There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive).
        The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes
        a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge,
        and no vertex has an edge to itself.
        You want to determine if there is a valid path that exists from vertex source to vertex destination.
        Given edges and the integers n, source, and destination,
        return true if there is a valid path from source to destination, or false otherwise.

    Examples
    -> Example 1
            Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
            Output: true
            Explanation: There are two paths from vertex 0 to vertex 2:
            - 0 → 1 → 2
            - 0 → 2
    -> Example 2
            Input: n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
            Output: false
            Explanation: There is no path from vertex 0 to vertex 5.

    Constraints
    -> 1 <= n <= 2 * 10^5
    -> 0 <= edges.length <= 2 * 10^5
    -> edges[i].length == 2
    -> 0 <= ui, vi <= n - 1
    -> ui != vi
    -> 0 <= source, destination <= n - 1
    -> There are no duplicate edges.
    -> There are no self edges.
 */




/**
 * Approach 1 ->
 *
 *
 *
 * Time Complexity ->
 *
 *
 * Space Complexity ->
 *
 *
 * Result
 *   Runtime 25 ms Beats 92.70% | Memory 137.5 MB Beats 84.73%
 *
 * Reference
 *   https://leetcode.com/problems/find-if-path-exists-in-graph/solutions/1406774/java-4-solutions-union-find-9ms-union-by-rank-14-ms-dfs-88-ms-bfs-90-ms/
 */
class Solution1971_1_UnionFind {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        DisjointSetUnion set = new DisjointSetUnion(n);
        for(int[] edge : edges){
            set.union(edge[0], edge[1]);
        }

        return set.areConnected(source, destination);
    }
}
class DisjointSetUnion{
    private int[] parent;
    private int N;

    public DisjointSetUnion(int n){
        this.N = n;
        this.parent = new int[this.N];
        for(int i = 0; i < this.N; i++){
            this.parent[i] = i;
        }
    }

    public boolean areConnected(int u, int v){
        return find(u) == find(v);
    }

    public void union(int u, int v){
        if(u != v){
            int a = find(u);
            int b = find(v);
            parent[a] = b;
        }
    }

    private int find(int u){
        int x = u;
        while(x != this.parent[x]){
            x = this.parent[x];
        }

        this.parent[u] = x;
        return x;
    }
}
