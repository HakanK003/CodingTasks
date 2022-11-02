package fromLeetCode.medium;

import java.util.*;

/*
    Related Topics
    -> Hash Table
    -> String
    -> Breadth-First Search
 */

public class MinimumGeneticMutation_433 {


    public int minMutation(String start, String end, String[] bank) {
        Queue<String> queue = new LinkedList<>();
        Set<String> seen = new HashSet<>();
        queue.add(start);
        seen.add(start);

        int steps = 0;

        while (!queue.isEmpty()) {
            int nodesInQueue = queue.size();
            for (int j = 0; j < nodesInQueue; j++) {
                String node = queue.remove();
                if (node.equals(end)) {
                    return steps;
                }

                for (char c: new char[] {'A', 'C', 'G', 'T'}) {
                    for (int i = 0; i < node.length(); i++) {
                        String neighbor = node.substring(0, i) + c + node.substring(i + 1);
                        if (!seen.contains(neighbor) && Arrays.asList(bank).contains(neighbor)) {
                            queue.add(neighbor);
                            seen.add(neighbor);
                        }
                    }
                }
            }

            steps++;
        }

        return -1;
    }


//    public int minMutation1(String start, String end, String[] bank) {
//
//        ArrayList<String> possibleVersions = new ArrayList<>();
//        int count =0;
//
//        while (!start.equals(end)) {
//
//            String copyStart = start;
//
//            for (int i = 0; i < 8; i++) {
//
//                if (start.charAt(i) != end.charAt(i)) {
//
//                    possibleVersions.add(start.substring(0, i) + end.charAt(i) + start.substring(i + 1, 8));
//
//                }
//
//            }
//
//            for (String version : bank) {
//
//                if(possibleVersions.contains(version)){
//                    start=version;
//                }
//
//            }
//
//            if (copyStart.equals(start)){
//
//                for (String version : bank) {
//
//                    int match = 0;
//
//                    for (int i = 0; i < 8; i++) {
//
//                        if (version.charAt(i)==start.charAt(i)) match++;
//
//                    }
//
//                    if (match == 7) start = version;
//
//                }
//
//            }
//
//            if (copyStart.equals(start)) return -1;
//
//            count++;
//
//        }
//
//        return count;
//    }

}


//TODO 0ms example solution
//
//    public int minMutation(String start, String end, String[] bank) {
//        int level = 0;
//        int len = bank.length;
//        char[] chr = {'A','C','G','T'};
//
//        Set<String> hset = new HashSet<String>();
//        for(String s: bank){
//            hset.add(s);
//        }
//
//        Queue<String> queue = new LinkedList<>();
//        queue.add(start);
//
//        while(true){
//            level++;
//            int n = queue.size();
//
//            if(n == 0){
//                return -1;
//            }
//
//            for(int i =0; i < n; i++){
//                char[] ch = queue.poll().toCharArray();
//
//                for(int j =0; j < 8; j++){
//                    char org_char = ch[j];
//                    for(int c = 0; c<4; c++){
//                        ch[j] = chr[c];
//                        String str = String.valueOf(ch);
//                        if(str.equals(end)
//                          && hset.contains(str)){
//                            return level;
//                        }
//
//                        if(!hset.contains(str)){
//                            continue;
//                        }
//
//                        hset.remove(str);
//                        queue.add(str);
//                    }
//                    ch[j] = org_char;
//                }
//            }
//        }
//    }


//TODO 39600kb example solution
//
//class Solution {
//
//    HashMap<Integer,List<Integer>> map = new HashMap<>();
//    ArrayList<String> bankArr = new ArrayList<>();
//
//    boolean validMute(String g1,String g2){
//        int count = 0;
//        for( int i = 0; i < g1.length(); i++ ){
//            if(g1.charAt(i) != g2.charAt(i)) count++;
//            if(count>1) return false;
//        }
//        return count == 1;
//    }
//
//    void init(){
//        for( int i = 0; i < bankArr.size(); i++ ){
//            for( int j = i+1; j < bankArr.size(); j++ ){
//                if(validMute(bankArr.get(i),bankArr.get(j))){
//                    List<Integer> cur;
//                    cur = map.getOrDefault(i,new ArrayList<>());
//                    cur.add(j);
//                    map.put(i,cur);
//
//
//                    cur = map.getOrDefault(j,new ArrayList<>());
//                    cur.add(i);
//                    map.put(j,cur);
//                }
//            }
//        }
//    }
//    boolean solved = false;
//    int dfs(int start,int end,boolean[] vis){
//        if( start == end ){
//            solved = true;
//            return 0;
//        }
//        vis[start] = true;
//        int len = bankArr.size()*2;
//        for(int i : map.get(start)){
//            if(vis[i]) continue;
//            len = Math.min(len,1 + dfs(i,end,vis));
//        }
//        vis[start] = false;
//        return len;
//    }
//
//    public int minMutation(String start, String end, String[] bank) {
//        if(bank.length == 0) return -1;
//        for(String gene : bank ) bankArr.add(gene);
//        int endIdx = -1,startIdx = -1;
//        for(int i = 0; i < bankArr.size(); i++){
//            if(bankArr.get(i).equals(end)) endIdx = i;
//            if(bankArr.get(i).equals(start)) startIdx = i;
//        }
//        if( endIdx == -1 ) return -1;
//
//        if( startIdx == -1 ){
//            bankArr.add(start);
//            startIdx = bankArr.size()-1;
//        }
//        init();
//        int ans = dfs(startIdx,endIdx,new boolean[bankArr.size()]);
//        return solved ? ans : -1;
//    }
//}