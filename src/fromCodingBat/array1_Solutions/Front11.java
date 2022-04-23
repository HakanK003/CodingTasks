package fromCodingBat.array1_Solutions;

public class Front11 {

    public int[] front11(int[] a, int[] b) {

        int x = a.length;
        int y = b.length;

        if(x==0&&y==0){
            return new int[0];
        }else if(x!=1&&y==0){
            return new int[] { a[0] };
        }else if(x==0&&y!=0){
            return new int[] { b[0] };
        }else{
            return new int[] { a[0], b[0] };
        }

    }

}

/*
Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]

 */