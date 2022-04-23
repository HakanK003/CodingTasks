package fromCodingBat.logic2_Solutions;

public class MakeBricks {

    // solution without loops

    public boolean makeBricks(int small, int big, int goal) {

        return (goal/5<=big && goal%5<=small) ||( (goal/5<=big+(small/5)) && (goal%5<=((((small/5))-(Math.max((goal/5)-big, 0)))*5)+small%5));

    }

}

/*
We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done
without any loops. See also: Introduction to MakeBricks

makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
 */