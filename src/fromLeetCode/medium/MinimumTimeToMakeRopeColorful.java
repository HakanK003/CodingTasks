package fromLeetCode.medium;

public class MinimumTimeToMakeRopeColorful {

    //Runtime: 20 ms, faster than 34.49% of Java online submissions for Minimum Time to Make Rope Colorful.
    //Memory Usage: 89.2 MB, less than 75.16% of Java online submissions for Minimum Time to Make Rope Colorful.
    public int minCost1(String colors, int[] neededTime) {

        int totalTime = 0;
        int nextDifferentColor = 0;

        for (int i = 0; i < colors.length() - 1; i++) {

            if (colors.charAt(i) != colors.charAt(i + 1)) {
                nextDifferentColor += 1;

            } else {

                while (nextDifferentColor < colors.length() - 1 && colors.charAt(nextDifferentColor) == colors.charAt(nextDifferentColor + 1)) {
                    nextDifferentColor++;
                }

                int totalForColor = 0;
                int maxForColor = 0;

                for (int j = i; j <= nextDifferentColor; j++) {

                    totalForColor += neededTime[j];
                    if (neededTime[j] > maxForColor) maxForColor = neededTime[j];

                }

                totalForColor -= maxForColor;
                totalTime += totalForColor;

                i = nextDifferentColor - 1;

            }
        }

        return totalTime;

    }


    //greedy algorithm
    //Runtime: 14 ms, faster than 58.58% of Java online submissions for Minimum Time to Make Rope Colorful.
    //Memory Usage: 89.6 MB, less than 63.68% of Java online submissions for Minimum Time to Make Rope Colorful.
    public int minCost2(String colors, int[] neededTime) {

        int minimum = 0;

        for (int i = 1; i < colors.length(); i++) {

            if (colors.charAt(i) == colors.charAt(i-1)) {
                minimum += Math.min(neededTime[i], neededTime[i - 1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }

        }

        return minimum;

    }

}
