package fromLeetCode.problems_Java.medium;

import java.util.ArrayList;
import java.util.List;

/*
    Related Topics
    -> Array
    -> String
    -> Backtracking
    -> Bit Manipulation
 */

/*
["un","iq","ue"]                4
["cha","r","act","ers"]         6
["abcdefghijklmnopqrstuvwxyz"]  26
["aaa"]                         0
 */
public class MaximumLengthOfAConcatenatedStringWithUniqueCharacters_1239 {

    //TODO

    public int maxLength(List<String> arr) {

        List<Integer> mask = new ArrayList<>();
        int max = 0;
        mask.add(0);
        for (String s : arr) {
            int dup = 0, cur = 0;
            for (char c : s.toCharArray()) {
                dup |= cur & (1 << (c - 'a'));
                cur |= 1 << (c - 'a');
            }
            if (dup > 0) continue;
            for (int i = 0; i < mask.size(); ++i) {
                if ((mask.get(i) & cur) > 0) continue;
                int comb = mask.get(i) | cur;
                mask.add(comb);
                max = Math.max(max, Integer.bitCount(comb));
            }
        }
        return max;

    }
    
}


//// TODO 4ms example solution
//class Solution {
//    public int maxLength(List<String> arr) {
//        // Pre-process arr with an optimizing helper
//        // which converts each word to its character bitset
//        // and then uses a set to prevent duplicate results
//        Set<Integer> optSet = new HashSet<>();
//        for (String word : arr)
//            wordToBitSet(optSet, word);
//
//        // Convert the set back to an array for iteration
//        // then start up the recursive helper
//        int[] optArr = new int[optSet.size()];
//        int i = 0;
//        for (Integer num : optSet)
//            optArr[i++] = num;
//        return dfs(optArr, 0, 0);
//    }
//
//    private void wordToBitSet(Set<Integer> optSet, String word) {
//        // Initialize an empty int to use as a character bitset
//        int charBitSet = 0;
//        for (char c : word.toCharArray()) {
//            // If the bitset contains a duplicate character
//            // then discard this word with an early return
//            // otherwise add the character to the bitset
//            int mask = 1 << c - 'a';
//            if ((charBitSet & mask) > 0)
//                return;
//            charBitSet |= mask;
//        }
//
//        // Store the length of the word in the unused space
//        // then add the completed bitset to our optimized set
//        optSet.add(charBitSet + (word.length() << 26));
//    }
//
//    private int dfs(int[] optArr, int pos, int res) {
//        // Separate the parts of the bitset res
//        int oldChars = res & ((1 << 26) - 1);
//        int oldLen = res >> 26;
//        int best = oldLen;
//
//        // Iterate through the remaining results
//        for (int i = pos; i < optArr.length; i++) {
//            int newChars = optArr[i] & ((1 << 26) - 1);
//            int newLen = optArr[i] >> 26;
//
//            // If the two bitsets overlap, skip to the next result
//            if ((newChars & oldChars) != 0)
//                continue;
//
//            // Combine the two results and trigger the next recursion
//            int newRes = newChars + oldChars + (newLen + oldLen << 26);
//            best = Math.max(best, dfs(optArr, i + 1, newRes));
//        }
//        return best;
//    }
//}

//// TODO 39900kb example solution
//class Solution {
//    void toBit(Set<Integer> s, String st){
//        int res=0;
//        for(char c:st.toCharArray()){
//            int bin=1<<(c-'a');
//            if((res&bin)>0) return;
//            res+=bin;
//        }
//        s.add(res+(st.length()<<26));
//    }
//    int solve(int a[],int ind,int resChars,int resLen){
//        int res=resLen;
//        for(int i=ind;i<a.length;i++){
//            int newChars=a[i]&((1<<26)-1),newLen=a[i]>>26;
//            if((resChars&newChars)>0) continue;
//            res=Math.max(res,solve(a,i+1,resChars+newChars,resLen+newLen));
//        }
//        return res;
//    }
//    public int maxLength(List<String> arr) {
//        Set<Integer> s=new HashSet<>();
//        for(String st:arr) toBit(s,st);
//        int a[]=new int[s.size()],i=0;
//        for(int bit:s) a[i++]=bit;
//        return solve(a,0,0,0);
//    }
//}