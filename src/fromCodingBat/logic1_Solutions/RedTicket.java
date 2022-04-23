package fromCodingBat.logic1_Solutions;

public class RedTicket {

    public int redTicket(int a, int b, int c) {

        return (a==2&&b==2&&c==2)? 10 :(a==b&&b==c)? 5 :(a!=b&&a!=c)? 1 : 0;

    }

}

/*
You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2,
the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different
from a, the result is 1. Otherwise the result is 0.

redTicket(2, 2, 2) → 10
redTicket(2, 2, 1) → 0
redTicket(0, 0, 0) → 5
 */