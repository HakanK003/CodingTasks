package fromLeetCode.problems_Java.medium;

import java.util.ArrayList;
import java.util.Collections;

/*
    Related Topics
    -> String
    -> Union Find

    Problem
    -> https://leetcode.com/problems/lexicographically-smallest-equivalent-string/

        You are given two strings of the same length s1 and s2 and a string baseStr.
        We say s1[i] and s2[i] are equivalent characters.
        For example, if s1 = "abc" and s2 = "cde", then we have 'a' == 'c', 'b' == 'd', and 'c' == 'e'.
        Equivalent characters follow the usual rules of any equivalence relation:
        Reflexivity: 'a' == 'a'.
        Symmetry: 'a' == 'b' implies 'b' == 'a'.
        Transitivity: 'a' == 'b' and 'b' == 'c' implies 'a' == 'c'.
        For example, given the equivalency information from s1 = "abc" and s2 = "cde", "acd" and "aab" are
        equivalent strings of baseStr = "eed", and "aab" is the lexicographically smallest equivalent string of baseStr.
        Return the lexicographically smallest equivalent string of baseStr by using the equivalency information from s1 and s2.

    Examples
    -> Example 1
            Input: s1 = "parker", s2 = "morris", baseStr = "parser"
            Output: "makkek"
                Explanation: Based on the equivalency information in s1 and s2, we can group their
                characters as [m,p], [a,o], [k,r,s], [e,i].
                The characters in each group are equivalent and sorted in lexicographical order.
                So the answer is "makkek".
    -> Example 2
            Input: s1 = "hello", s2 = "world", baseStr = "hold"
            Output: "hdld"
                Explanation: Based on the equivalency information in s1 and s2, we can group their
                characters as [h,w], [d,e,o], [l,r].
                So only the second letter 'o' in baseStr is changed to 'd', the answer is "hdld".
    -> Example 3
            Input: s1 = "leetcode", s2 = "programs", baseStr = "sourcecode"
            Output: "aauaaaaada"
                Explanation: We group the equivalent characters in s1 and s2 as [a,o,e,r,s,c], [l,p], [g,t] and [d,m],
                thus all letters in baseStr except 'u' and 'd' are transformed to 'a', the answer is "aauaaaaada"

    Constraints
    -> 1 <= s1.length, s2.length, baseStr <= 1000
    -> s1.length == s2.length
    -> s1, s2, and baseStr consist of lowercase English letters.
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
 *   //"gmerjboftfnqseogigpdnlocmmhskigdtednfnjtlcrdpcjkbj"
 *   //"fnnafafhqkitbcdlkpiloiienikjiikdfcafisejgeldprcmhd"
 *   //baseStr =
 *   //"ezrqfyguivmybqcsvibuvtajdvamcdjpmgcbvieegpyzdcypcx"
 *   //
 *   //failed
 *   //Output
 *   //"azaCayauavayaCaavaauvaaaavaaaaaaaaaavaaaaayzaayaax"
 *   //Expected
 *   //"azaAayauavayaAaavaauvaaaavaaaaaaaaaavaaaaayzaayaax"
 *
 */
class Solution1061_1 {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {

        ArrayList<ArrayList<Character>> equivalentGroups = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            boolean worked = false;
            Character curr1 = s1.charAt(i), curr2 = s2.charAt(i);

            for (int j = 0; j < equivalentGroups.size(); j++) {
                if (equivalentGroups.get(j).contains(curr1) || equivalentGroups.get(j).contains(curr2)) {
                    equivalentGroups.get(j).add(curr1);
                    equivalentGroups.get(j).add(curr2);
                    worked = true;
                }
            }

            if (!worked){
                ArrayList<Character> newGroup = new ArrayList<Character>();
                newGroup.add(curr1);
                newGroup.add(curr2);
                equivalentGroups.add(newGroup);
            }
        }

        for (ArrayList<Character> equivalentGroup : equivalentGroups) {
            Collections.sort(equivalentGroup);
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < baseStr.length(); i++) {

            boolean done = false;
            Character curr = baseStr.charAt(i);

            for (ArrayList<Character> equivalentGroup : equivalentGroups) {
                if (equivalentGroup.contains(curr)) {
                    result.append(equivalentGroup.get(0));
                    done = true;
                    break;
                }
            }

            if (!done){
                result.append(curr);
            }

        }

        return result.toString();
    }
}



/**
 * Approach 2 ->
 *
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
 *   Runtime 1 ms Beats 100% | Memory 40.4 MB Beats 99.43%
 * Reference
 *   https://leetcode.com/problems/lexicographically-smallest-equivalent-string/solutions/3052116/java-ufds-w-template-faster-than-100/?orderBy=newest_to_oldest
 */
class Solution1061_2_Union_Find {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {


        UFDS dsu = new UFDS(26);
        for(int i = 0; i < s1.length(); i++){
            dsu.union(s1.charAt(i)-97,s2.charAt(i)-97);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < baseStr.length(); i++){
            int root = dsu.root(baseStr.charAt(i) - 97);
            sb.append((char)(dsu.min[root] + 97));

        }
        return sb.toString();
    }

    class UFDS{

        int[] id;
        int[] size;
        int[] min;

        public UFDS(int N){

            id = new int[N];
            size = new int[N];
            min = new int[N];
            for(int i = 0; i < N; i++){
                id[i] = i;
                size[i] = 1;
                min[i] = i;
            }
        }

        private int root(int i){
            while (i != id[i]){
                id[i] = id[id[i]];
                i = id[i];
            }
            return i;
        }

        public void union(int p, int q){

            int i = root(p);
            int j = root(q);
            if(i == j)return;
            if(size[i] < size[j]){
                id[i] = id[j];
                size[j] += size[i];
                min[j] = Math.min(min[i],min[j]);
            }
            else{
                id[j] = id[i];
                size[i] += size[j];
                min[i] = Math.min(min[i],min[j]);
            }
        }

    }
}

