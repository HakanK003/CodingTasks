package fromLeetCode.problems_Java.hard;

/*
    Related Topics
    -> String
    -> Dynamic Programming
 */

public class StringCompressionII_1531 {

    public int getLengthOfOptimalCompression(String s, int k) {
        // 4 states -> [idx][prev_char][freq_count][k]
        n = s.length();

        if(n == k) return 0;

        boolean allSame = true;

        // Base case: check for all char are same
        for(int i = 1; i < n; i++)
        {
            if(s.charAt(i) != s.charAt(i-1))
            {
                allSame = false;
                break;
            }
        }

        if(allSame)
        {
            /*
            log10(n) + 1 => used to count the number of digits
            eg: 100 => log10(100) + 1 = 2 + 1 = 3 (number of digits in 100)
            */

            // we can remove k characters from n
            n  -= k;

            // if n is 1, we don't need to write 1 as per question
            if(n == 1)
                return 1;

            // we need to add +1 for considering cur char + (number of digits in n)
            return  (int) Math.log10(n) + 1 + 1;
        }

        int[][][][] dp = new int[n+1][27][11][101];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < 27; j++)
            {
                for(int x = 0; x < 11; x++)
                {
                    for(int y = 0; y < 101; y++)
                    {
                        dp[i][j][x][y] = -1;
                    }
                }
            }
        }

        return f(0, (char) ('z' + 1), 0, s, k, dp);
    }

    private int n;

    private int f(int idx, char prev, int curCharFreqCount, String s, int k, int dp[][][][])
    {
        if(k < 0) return (int)1e9;

        if(idx >= n)
            return 0;

        // if curCharFreqCount, consider it as 10, because, until 10 .. 99, string length will be 2,
        if(curCharFreqCount >= 10)
            curCharFreqCount = 10;

        if(dp[idx][prev - 'a'][curCharFreqCount][k] != -1)
            return dp[idx][prev - 'a'][curCharFreqCount][k];


        int res = (int) 1e9;

        /*
        3 cases:
        case 1: We will delete our current character if K is available, so our string length will be minimum.
        case 2: If cur char is not same as prev, our res will be increased by 1 and curCharFreqCount will be 1
        case 3: If cur char is same as prev char, we need to merge it and increase our count
                case 3.1: If curCharFreqCount is either 1 or more than 9, our res will be increased by 1
                case 3.2: Else, we just need to increase curCharFreqCount.
        */

        // case 1
        res = Math.min(res, f(idx+1, prev, curCharFreqCount, s, k-1, dp));

        // case 2
        if(s.charAt(idx) != prev)
            res = Math.min(res, 1 + f(idx + 1, s.charAt(idx), 1, s, k, dp));

            // case 3
        else{

            // case 3.1
            if(curCharFreqCount == 1 || curCharFreqCount == 9)
            {
                res = Math.min(res, 1 + f(idx + 1, prev, (curCharFreqCount + 1), s, k, dp));
            }

            // case 3.2
            else{
                res = Math.min(res, f(idx + 1, prev, curCharFreqCount + 1, s, k, dp));
            }
        }

        return dp[idx][prev - 'a'][curCharFreqCount][k] = res;
    }

}
