package fromCodingBat.warmup1_Solutions;

public class StringE {

    public boolean stringE(String str) {

        int x = str.length();

        int y = str.replace("e", "").length();

        return (x-y>=1)&&(x-y<=3);

    }

}

/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */