package fromCodingBat.string2_Solutions;

public class GetSandwich {

    public String getSandwich(String str) {

        int i = str.indexOf("bread");

        str=str.replaceFirst("bread", "");

        int j = str.lastIndexOf("bread");

        return (j==-1)? "" : str.substring(i, j);

    }

}

/*
A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance
of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
 */