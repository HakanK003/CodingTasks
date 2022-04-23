package fromCodingBat.logic2_Solutions;

public class Blackjack {

    public int blackjack(int a, int b) {

        a = (a>21)? 0 : a;
        b = (b>21)? 0 : b;

        return (Math.min( Math.abs(21-a), Math.abs(21-b))==Math.abs(21-a))?a:b;

    }

}

/*
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
 */