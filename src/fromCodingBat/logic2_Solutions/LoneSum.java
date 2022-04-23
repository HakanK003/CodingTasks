package fromCodingBat.logic2_Solutions;

public class LoneSum {

    public int loneSum(int a, int b, int c) {

        int sum=0;

        if(a!=b&&a!=c){sum+=a;}
        if(b!=a&&b!=c){sum+=b;}
        if(c!=a&&c!=b){sum+=c;}

        return sum;

    }

}

/*
Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
 */