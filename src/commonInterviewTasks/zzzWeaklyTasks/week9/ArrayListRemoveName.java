package commonInterviewTasks.zzzWeaklyTasks.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveName {

    public static void main(String[] args) {

        System.out.println(removeName(new ArrayList<>(Arrays.asList("Hakan", "Hello", "Hakan", "There", "Hakan", "Hakan")),"Hakan"));

    }

    public static ArrayList<String> removeName(ArrayList<String> nameList, String name){

        nameList.removeIf(x -> x.equals(name));

        return nameList;
    }

}

/*
ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */