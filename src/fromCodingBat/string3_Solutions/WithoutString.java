package fromCodingBat.string3_Solutions;

public class WithoutString {

    public static void main(String[] args) {

        System.out.println(withoutString("Hello There", "llo"));

    }

    public static String withoutString(String base, String remove) {

        String replacement = "";

        for (int i = 0; i < remove.length(); i++) {

            replacement+=" ";

        }

        for (int i = 0; i < base.length()-remove.length(); i++) {

            if (base.substring(i, i+remove.length()+1).equalsIgnoreCase(remove)){

                base= base.substring(0, i)+replacement+base.substring(i+remove.length()+2);

            }

        }

        while(base.contains("  ")){

            base=base.replace("  ", " ");

        }

        return base;

    }

}

/*
Given two strings, base and remove, return a version of the base string where all instances of the remove string
have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances,
so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
 */