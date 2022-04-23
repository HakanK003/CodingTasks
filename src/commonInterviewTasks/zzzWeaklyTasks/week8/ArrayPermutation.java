package commonInterviewTasks.zzzWeaklyTasks.week8;

public class ArrayPermutation {

    public static void main(String[] args) {

        printPermutations(new int[] {1, 2, 3});

    }


    public static void printPermutations(int[] nums){

        for (int i = 0; i <nums.length; i++) {


            for (int j = 0; j < nums.length; j++) {

                if (i==j){continue;}


                for (int k = 0; k < nums.length; k++) {

                    if (i==k||j==k){continue;}


                    System.out.println("{ "+nums[i]+", "+nums[j]+", "+nums[k]+" }");

                }


            }


        }

    }


//    public static void printPermutations(int[] nums){
//
//        for (int i = 0; i <nums.length; i++) {
//
//
//            for (int j = 0; j < nums.length; j++) {
//
//                if (j==i){continue;}
//
//                System.out.println("{ "+nums[i]+", "+nums[j]+"}");
//
//            }
//
//
//        }
//
//    }


}

/*
Array - permutation combinations
Given an array of 3 characters print all permutation combinations from the given characters
 */