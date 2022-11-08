package fromLeetCode.hard;

import java.util.ArrayList;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

        System.out.println( findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}) );

    }



    //Runtime: 5 ms, faster than 46.22% of Java online submissions for Median of Two Sorted Arrays.
    //Memory Usage: 49.4 MB, less than 74.08% of Java online submissions for Median of Two Sorted Arrays.
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] all = new int[nums1.length + nums2.length];

        int x = 0, y = 0, z = 0;

        while(y < nums1.length && z < nums2.length){

            if (nums1[y] < nums2[z]){
                all[x] = nums1[y];
                x++;
                y++;
            }else{
                all[x] = nums2[z];
                x++;
                z++;
            }

        }

        for (;y < nums1.length;y++){
            all[x] = nums1[y];
            x++;
        }

        for (;z < nums2.length;z++){
            all[x] = nums2[z];
            x++;
        }


        if (all.length % 2 == 0) {

            return ((double) all[all.length / 2] + (double) all[(all.length / 2) - 1]) / 2;

        } else {

            return (double) all[all.length / 2];

        }

    }

    //Runtime: 4 ms, faster than 73.07% of Java online submissions for Median of Two Sorted Arrays.
    //Memory Usage: 49.8 MB, less than 58.04% of Java online submissions for Median of Two Sorted Arrays.
    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {

        int[] all = new int[nums1.length + nums2.length];

        int x = 0, y = 0, z = 0;

        while(y < nums1.length && z < nums2.length){

            if (nums1[y] < nums2[z]){
                all[x] = nums1[y];
                x++;
                y++;
            }else{
                all[x] = nums2[z];
                x++;
                z++;
            }

        }

        while(y < nums1.length){
            all[x] = nums1[y];
            x++;
            y++;
        }

        while(z < nums2.length){
            all[x] = nums2[z];
            x++;
            z++;
        }


        if (all.length % 2 == 0) {

            return ((double) all[all.length / 2] + (double) all[(all.length / 2) - 1]) / 2;

        } else {

            return (double) all[all.length / 2];

        }

    }

    //Runtime: 5 ms, faster than 46.22% of Java online submissions for Median of Two Sorted Arrays.
    //Memory Usage: 42.9 MB, less than 99.38% of Java online submissions for Median of Two Sorted Arrays.
    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {

        int[] all = new int[nums1.length + nums2.length];

        int x = 0;

        for (int j : nums1) {
            all[x] = j;
            x++;
        }
        for (int i : nums2) {
            all[x] = i;
            x++;
        }

        mergeSort(all);

        if (all.length % 2 == 0) {

            return ((double) all[all.length / 2] + (double) all[(all.length / 2) - 1]) / 2;

        } else {

            return (double) all[all.length / 2];

        }

    }


    public static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) return; //base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //left array
        int j = 0; //right array

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //indices

        //check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }
}