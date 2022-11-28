package fromLeetCode.problems_Java.medium;

import java.util.*;

/*
    Related Topics
    -> Array
    -> Hash Table
    -> Sorting
    -> Counting

    Problem
    -> https://leetcode.com/problems/find-players-with-zero-or-one-losses/

        You are given an integer array matches where matches[i] = [winneri, loseri]
        indicates that the player winneri defeated player loseri in a match.
        Return a list answer of size 2 where:
            answer[0] is a list of all players that have not lost any matches.
            answer[1] is a list of all players that have lost exactly one match.
        The values in the two lists should be returned in increasing order.
        Note:
            You should only consider the players that have played at least one match.
            The testcases will be generated such that no two matches will have the same outcome.

    Examples
    -> Example 1
            Input: matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
            Output: [[1,2,10],[4,5,7,8]]
            Explanation:
                Players 1, 2, and 10 have not lost any matches.
                Players 4, 5, 7, and 8 each have lost one match.
                Players 3, 6, and 9 each have lost two matches.
                Thus, answer[0] = [1,2,10] and answer[1] = [4,5,7,8].
    -> Example 2
            Input: matches = [[2,3],[1,3],[5,4],[6,4]]
            Output: [[1,2,5,6],[]]
            Explanation:
                Players 1, 2, 5, and 6 have not lost any matches.
                Players 3 and 4 each have lost two matches.
                Thus, answer[0] = [1,2,5,6] and answer[1] = [].

    Constraints
    -> 1 <= matches.length <= 10^5
    -> matches[i].length == 2
    -> 1 <= winneri, loseri <= 10^5
    -> winneri != loseri
    -> All matches[i] are unique.
 */



/**
 * Approach 1 -> Hash Set
 *
 *   Check code
 *
 * Time Complexity ->
 *   Check reference
 *
 * Space Complexity ->
 *   Check reference
 *
 * Result
 *   Runtime: 354 ms, faster than 21.22% of Java online submissions for Find Players With Zero or One Losses.
 *   Memory Usage: 185.1 MB, less than 5.07% of Java online submissions for Find Players With Zero or One Losses.
 */
class Solution2225_1 {
    public List<List<Integer>> findWinners(int[][] matches) {

        Set<Integer> everybody = new HashSet<>();
        HashMap<Integer, Integer> winners = new HashMap<>();
        HashMap<Integer, Integer> losers = new HashMap<>();

        for (int[] match : matches) {

            int winner = match[0], loser = match[1];

            everybody.add(winner);
            everybody.add(loser);

            if (winners.containsKey(winner)) {
                winners.put(winner, winners.get(winner)+1);
            } else {
                winners.put(winner, 1);
            }

            if (losers.containsKey(loser)) {
                losers.put(loser, losers.get(loser)+1);
            } else {
                losers.put(loser, 1);
            }

        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        for ( Integer each : everybody){
            if (winners.containsKey(each) && !losers.containsKey(each)){
                result.get(0).add(each);
                continue;
            }
            if (losers.containsKey(each) && losers.get(each) == 1){
                result.get(1).add(each);
            }
        }

        Collections.sort(result.get(0));
        Collections.sort(result.get(1));

        return result;
    }
}



/**
 * Approach 2 -> Hash Set
 *
 *   Check code
 *
 * Time Complexity ->
 *   Check reference
 *
 * Space Complexity ->
 *   Check reference
 *
 * Result
 *   Runtime: 219 ms, faster than 53.43% of Java online submissions for Find Players With Zero or One Losses.
 *   Memory Usage: 141.7 MB, less than 76.13% of Java online submissions for Find Players With Zero or One Losses.
 *
 *  Reference
 *    https://leetcode.com/problems/find-players-with-zero-or-one-losses/solution/
 */
class Solution2225_2 {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> zeroLoss = new HashSet<>(), oneLoss = new HashSet<>(),moreLosses = new HashSet<>();

        for (int[] match : matches) {
            int winner = match[0], loser = match[1];
            // Add winner.
            if (!oneLoss.contains(winner) && !moreLosses.contains(winner)) {
                zeroLoss.add(winner);
            }
            // Add or move loser.
            if (zeroLoss.contains(loser)) {
                zeroLoss.remove(loser);
                oneLoss.add(loser);
            } else if (oneLoss.contains(loser)) {
                oneLoss.remove(loser);
                moreLosses.add(loser);
            } else if (moreLosses.contains(loser)) {
                continue;
            } else {
                oneLoss.add(loser);
            }
        }

        List<List<Integer>> answer = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        answer.get(0).addAll(zeroLoss);
        answer.get(1).addAll(oneLoss);
        Collections.sort(answer.get(0));
        Collections.sort(answer.get(1));

        return answer;
    }
}

