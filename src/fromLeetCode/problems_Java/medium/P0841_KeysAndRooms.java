package fromLeetCode.problems_Java.medium;

import java.util.*;

/*
    Related Topics
    -> Depth-First Search
    -> Breadth-First Search
    -> Graph

    Problem
    -> https://leetcode.com/problems/keys-and-rooms/

        There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0.
        Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.
        When you visit a room, you may find a set of distinct keys in it. Each key has a number on it,
        denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
        Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i,
        return true if you can visit all the rooms, or false otherwise.


    Examples
    -> Example 1
            Input: rooms = [[1],[2],[3],[]]
            Output: true
            Explanation:
                We visit room 0 and pick up key 1.
                We then visit room 1 and pick up key 2.
                We then visit room 2 and pick up key 3.
                We then visit room 3.
                Since we were able to visit every room, we return true.
    -> Example 2
            Input: rooms = [[1,3],[3,0,1],[2],[0]]
            Output: false
                Explanation: We can not enter room number 2 since the only key that unlocks it is in that room.

    Constraints
    -> n == rooms.length
    -> 2 <= n <= 1000
    -> 0 <= rooms[i].length <= 1000
    -> 1 <= sum(rooms[i].length) <= 3000
    -> 0 <= rooms[i][j] < n
    -> All the values of rooms[i] are unique.
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
 *  Runtime 2 ms Beats 70.49% | Memory 42.5 MB Beats 75.46%
 *
 * Reference
 *   https://leetcode.com/problems/keys-and-rooms/solutions/133855/straight-forward/
 */
class Solution0841_1 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        Stack<Integer> dfs = new Stack<>(); dfs.add(0);
        HashSet<Integer> seen = new HashSet<Integer>(); seen.add(0);
        while (!dfs.isEmpty()) {
            int i = dfs.pop();
            for (int j : rooms.get(i))
                if (!seen.contains(j)) {
                    dfs.add(j);
                    seen.add(j);
                    if (rooms.size() == seen.size()) return true;
                }
        }
        return rooms.size() == seen.size();

    }

//        HashSet<Integer> visitedRooms = new HashSet<>();
//        HashSet<Integer> keys = new HashSet<>(rooms.get(0));
//
//        visitedRooms.add(0);
//
//        for (int i = 0; i < rooms.size(); i++) {
//            getKeys(keys,visitedRooms,rooms);
//        }
//
//        return visitedRooms.size() == rooms.size();
//    }
//
//    private void getKeys(HashSet<Integer> keys, HashSet<Integer> visitedRooms, List<List<Integer>> rooms){
//
//        ArrayList<Integer> currKeys = new ArrayList<>(keys);
//
//        for(Integer key : currKeys){
//            if(!visitedRooms.contains(key)) {
//                keys.addAll(rooms.get(key));
//                visitedRooms.add(key);
//            }
//            keys.add(key);
//        }
//
//    }
}