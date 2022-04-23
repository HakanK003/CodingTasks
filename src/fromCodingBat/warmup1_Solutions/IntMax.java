package fromCodingBat.warmup1_Solutions;

public class IntMax {

    public int intMax(int a, int b, int c) {

        int max= a;

        if(b>max){max=b;}
        if(c>max){max=c;}

        return max;

    }

}

/*
Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */