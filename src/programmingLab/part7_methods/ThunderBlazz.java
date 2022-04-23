package programmingLab.part7_methods;

import java.util.Arrays;
import java.util.Scanner;

public class ThunderBlazz {

    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1, int ingredient2, int ingredient3){

        // your code here
        boolean thunderBlazz=false;
        if(available){thunderBlazz=true;}
        if(gift){thunderBlazz=true;}
        int[] ingredients = {ingredient1,ingredient2,ingredient3};
        Arrays.sort(ingredients);
        int[] trueIngredients = {1,2,3};
        if(Arrays.equals(ingredients,trueIngredients)){thunderBlazz=true;}
        return thunderBlazz;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getThunderBlazz(in.nextBoolean(), in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
        in.close();
    }

}

/*
There are a few ways to get this galacticly popular drink, if its available at the store you can buy it. or you can get it as a gift. The third option is to mix its ingredients (its a secret formula):

1 from ingredient1 ,2 from ingredient2 and 3 from ingredient3.

or the alternate recipe: 3 from ingredient1, 1 from ingredient2 and 2 from ingredient3.

You need to have exact amount of ingredients for making the drink. not less or more

getThunderBlazz(boolean avilable,boolean gift, int ingredient1,
   int ingredient2, int ingredient3)
getThunderBlazz(boolean avilable,boolean gift, int ingredient1,
   int ingredient2, int ingredient3)
available(boolean) = available at store gift(boolean) = got it as a gift the three ingredients as ints

Example:

getThunderBlazz(true,false,1,2,3)
returns true

getThunderBlazz(false,false,1,2,3)

returns true

getThunderBlazz(false,false,1,5,3)
returns false

getThunderBlazz(false,false,3,1,2)
returns true

getThunderBlazz(false,false,3,1,1)
returns false

getThunderBlazz(false,true,9,7,3)
returns true

hint: use parenthesis to separate logical arguments:

(true|| false && true) || (false&&true) etc

or put them in their own variables, everything to make it easy to read.
 */