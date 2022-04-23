package programmingLab.part8_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Swap {

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        String temp = list.get(pos1);
        list.set(pos1,list.get(pos2));
        list.set(pos2,temp);
        return list;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int pos1 = in.nextInt();
        int pos2 = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(swap(list, pos1, pos2));

    }

}

/*
In this assignment you will swap a position in an array list with another.

swap() gets 3 arguments, an Arraylist, a position, and another position to swap with.

Example

swap(["one","two","three"],0,2)
returns:["three","two","one"]

swap(["a","c","b","d","e"],0,3)
returns:["d","c","b","a","e"]
 */