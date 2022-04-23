package fromCodingBat.warmup1_Solutions;

public class DelDel {

    public String delDel(String str) {

        switch(str.length()){

            case 0:
            case 1:
            case 2:
            case 3:
                return str;
            default:
                return (str.substring(1,4).equals("del"))? str.replace("del", "") : str;
        }

    }


}

/*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */