package fromCodingBat.string2_Solutions;

public class SameStarChar {

    public boolean sameStarChar(String str) {

        if (str.equals("*")||str.equals("**")||!str.contains("*")){return true;}

        boolean off = false;

        for (int i = 1; i < str.length()-1; i++) {

            if (str.charAt(i)=='*'&&str.charAt(i-1)==str.charAt(i+1)){
                off = true;
            }else if(str.charAt(i)=='*'){off = false;}

        }

        return off;
    }

}

/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
 */