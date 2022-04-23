package programmingLab.part7_methods;

import java.util.Scanner;

public class ArrayGetDuplicates {

    public static int getDup(String[] r) {

        int countTotal=0;
        String result ="";

        for (String each : r) {

            int count=0;

            if(!result.contains(each)){

                for(String checker : r){
                    if(each.equals(checker)){count++;}
                }

            }

            if(count>1){countTotal+=count;}

            result+=each;
        }

        return countTotal;



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        in.close();

        System.out.println(getDup(strs));

    }


}

/*
getDup accepts an array and returns an int.

If there is any element is duplicated, the method counts how many of those present in the array.

Example :

getDup(["1","2","aa"',"1"])
returns:2
("1" is duplicated and there are two "1"s so return is 2)
getDup(["1","2","aa"',"1"])

("1" is duplicated and there are two "1"s
and 2 "aa"s so return is 4)
getDup(["1","2","aa"',"1", "aa"])
returns:4

("1" is duplicated and there are two "1"s
and 2 "aa"s so return is 4)
getDup(["1","g","aabb',"7","7","2","aa"',"7"])
returns:3

hint:

you will need a nested array the will run on the array we get from the method argument.
inside the nested loop you will need to check if the main array element is equal to the current
 */