package fromCodingBat.array1_Solutions;

public class Make2 {

    public int[] make2(int[] a, int[] b) {

        int x = a.length;
        int y = b.length;


        switch (x) {

            case 0:
                if (y > 1) {
                    return new int[]{b[0], b[1]};
                } else if (y == 1) {
                    return new int[]{b[0]};
                } else {
                    return b;
                }
            case 1:
                if (y > 0) {
                    return new int[]{a[0], b[0]};
                } else {
                    return new int[]{a[0]};
                }

            default:
                return new int[]{a[0], a[1]};


            }

        }

    }
/*
Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
the elements from a followed by the elements from b. The arrays may be any length, including 0,
but there will be 2 or more elements available between the 2 arrays.

make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
 */