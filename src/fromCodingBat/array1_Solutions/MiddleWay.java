package fromCodingBat.array1_Solutions;

public class MiddleWay {

    public int[] middleWay(int[] a, int[] b) {

        int[] middle = new int[2];

        middle[0]=a[1];
        middle[1]=b[1];

        return middle;

    }

}

/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */