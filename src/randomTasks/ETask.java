package randomTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ETask {

    public static void main(String[] args) {

        System.out.println(solution("ooouuuaaaiiieee"));

    }

    public static String solution(String S){

        TreeMap<String, Integer> map = new TreeMap<>();

        int maxCount=0;
        String result="";
        String maxVowel="";

        for (int i = 0; i < S.length(); i++) {

                if (S.charAt(i)=='a'||S.charAt(i)=='A'){

                    if (map.containsKey("a")){
                    map.put("a", map.get("a")+1);
                    }else{
                        map.put("a", 1);
                    }

                    if (map.get("a")>maxCount){
                        maxCount=map.get("a");
                        maxVowel="a";
                    }

                }else if(S.charAt(i)=='e'||S.charAt(i)=='E'){

                    if (map.containsKey("e")) {
                        map.put("e", map.get("e") + 1);
                    }else{
                        map.put("e", 1);
                    }

                    if (map.get("e")>maxCount){
                        maxCount=map.get("e");
                        maxVowel="e";
                    }

                }else if(S.charAt(i)=='i'||S.charAt(i)=='I'){

                    if (map.containsKey("i")) {
                        map.put("i", map.get("i") + 1);
                    }else{
                        map.put("i", 1);
                    }

                    if (map.get("i")>maxCount){
                        maxCount=map.get("i");
                        maxVowel="i";
                    }

                }else if(S.charAt(i)=='o'||S.charAt(i)=='O'){

                    if (map.containsKey("o")) {
                        map.put("o", map.get("o") + 1);
                    }else{
                        map.put("o", 1);
                    }

                    if (map.get("o")>maxCount){
                        maxCount=map.get("o");
                        maxVowel="o";
                    }

                }else if(S.charAt(i)=='u'||S.charAt(i)=='U'){

                    if (map.containsKey("u")) {
                        map.put("u", map.get("u") + 1);
                    }else{
                        map.put("u", 1);
                    }

                    if (map.get("u")>maxCount){
                        maxCount=map.get("u");
                        maxVowel="u";
                    }

                }


            }

        result+=(maxCount==1)? maxVowel+" appears "+maxCount+" time" : maxVowel+" appears "+maxCount+" times";

        for (Map.Entry<String, Integer> pair : map.entrySet()) {

            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();

            if ((eachValue==maxCount)&& !eachKey.equals(maxVowel)){
                result+=(maxCount==1)? "\n" + eachKey+" appears "+maxCount+" time" : "\n"+ eachKey+" appears "+maxCount+" times";
            }

        }

            return result;
        }


}


