package fromCodingBat.warmup1_Solutions;

public class Max1020 {

    public int max1020(int a, int b) {

        int x = (a>=10&&a<=20)? a : 0 ;
        int y = (b>=10&&b<=20)? b : 0 ;

        int z = x;

        if(y>z){z=y;}


        return z;

    }

}

/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */