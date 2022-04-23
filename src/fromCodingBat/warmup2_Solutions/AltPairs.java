package fromCodingBat.warmup2_Solutions;

public class AltPairs {

    public String altPairs(String str) {

        int a = str.length();

        if(a<3){return str;}

        String result ="";

        for(int i=0;i<a; i+=4){


            result+=""+str.charAt(i);
            if(a>i+1){result+=""+str.charAt(i+1);}

        }

        return result;

    }

}

/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */