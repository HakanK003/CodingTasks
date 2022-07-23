package commonInterviewTasks.tasksFromYK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {

    public static void main(String[] args) {
        System.out.println(reverse("tayfa"));
//        System.out.println(sum(10));
        System.out.println(same("abc", "cabacbb"));
        System.out.println(removeDuplicate("bbacccbdabaa"));
        String[] arr = {"a","a","b","b","c"};
        List<String> list = new ArrayList<>(Arrays.asList("a","v"));
        list.remove("a");
        System.out.println(list);
        //System.out.println(Arrays.toString(removeDuplicateArray(arr))+" this");
    }

    static String reverse(String word){
        return Arrays.stream(word.split("")).reduce("", (x,y)->y+x);
    }

    static String removeDuplicate(String str){
        return Arrays.stream(str.split("")).distinct().sorted().collect(Collectors.joining());
    }

//    static String[] removeDuplicateArray(String[] str){
    //return Arrays.stream(str).distinct().;
//    }

    static boolean same(String str1, String str2){
        return Arrays.stream(str1.split("")).allMatch(x->str2.contains(x));
    }

    static int sum(int n){
        return IntStream.range(0,n).reduce(0, (x, y) -> x+y);
    }



}
