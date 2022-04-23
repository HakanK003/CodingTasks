package fromCodingBat.logic2_Solutions;

public class MakeChocolate {

    public int makeChocolate(int small, int big, int goal) {

        int bars=0;

        for(int i=0; i<big; i++){
            if(goal<5){break;}
            goal-=5;
        }

        while(goal>0&&small-->0){
            goal-=1;
            bars++;
        }

        return (goal<=0)? bars : -1;

    }

}

/*
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
 */