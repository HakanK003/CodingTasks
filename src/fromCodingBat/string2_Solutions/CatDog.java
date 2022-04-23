package fromCodingBat.string2_Solutions;

public class CatDog {

    public boolean catDog(String str) {

        int countCat=0, countDog=0;

        for (int i = 0; i < str.length(); i++) {

            if (i <= str.length() - 3) {
                if (str.substring(i, i + 3).equals("cat")) {
                    countCat++;
                }
                if (str.substring(i, i + 3).equals("dog")) {
                    countDog++;
                }
            }
        }

        return countCat==countDog;

    }

}

/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */