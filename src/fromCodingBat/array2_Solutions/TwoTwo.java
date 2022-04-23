package fromCodingBat.array2_Solutions;

public class TwoTwo {

    public static void main(String[] args) {

        System.out.println(twoTwo(new int[] {4, 2, 2, 2}));

    }

    public static boolean twoTwo(int[] nums) {

        boolean no = false, no2=true;
        int count2=0;

        for (int i = 0; i < nums.length-1; i++) {

            if(nums[i]==2){no2=false;}

            if ((nums[i]==2&&nums[i+1]==nums[i])){
                no=true;
                count2++;
                i++;
            }


        }

        return (no||no2)&&(count2!=1);


//        boolean no = false, no2=true;
//
//        for (int i = 0; i < nums.length-1; i++) {
//
//            if(nums[i]==2){no2=false;}
//
//            if ((nums[i]==2&&nums[i+1]==nums[i])){
//                no=true;
//                i++;
//            }else{
//                return false;
//            }
//
//
//        }
//
//        return no||no2;

//        boolean no = false;
//
//        for (int i = 1; i < nums.length-1; i++) {
//
//            if ((nums[i]==2&&nums[i+1]==nums[i])||(nums[i]==2&&nums[i-1]==nums[i])){
//                no=true;
//            }else{
//                return false;
//            }
//
//
//        }
//
//        return no;

//        for (int i = 1; i < nums.length-1; i++) {
//
//            if (!(nums[i]==2&&nums[i+1]==nums[i])&&!(nums[i]==2&&nums[i-1]==nums[i])){
//                return false;
//            }
//
//        }
//
//        return (nums.length==1&&nums[0]==2)? false : true;
    }

}

/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
 */