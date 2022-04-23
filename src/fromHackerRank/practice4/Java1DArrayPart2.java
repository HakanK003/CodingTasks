package fromHackerRank.practice4;

import java.util.Scanner;

public class Java1DArrayPart2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfQueries = input.nextInt();

        for (int i = 0; i < numberOfQueries; i++) {

            int[] game = new int[input.nextInt()];

            int leap = input.nextInt();

            for (int j = 0; j < game.length; j++) {
                game[j]= input.nextInt();
            }

            String result = "YES";}}}

/*
            for (int x = 0; x < game.length;) {

                if(game[x+1]==0) {
                    x++;
                    }else if(game[x+leap]==0){
                    x+=leap;
                }else if ( game[x-1]==0 && x-1>=0 ){
                    while(game[x-1]==0 && x-1>=0){x--;}
                }



                }else{result="NO"; break;}

            }

            System.out.println(result);

        }

        input.close();

    }

 */



/*
Sample Input

STDIN           Function
-----           --------
4               q = 4 (number of queries)
5 3             game[] size n = 5, leap = 3 (first query)
0 0 0 0 0       game = [0, 0, 0, 0, 0]
6 5             game[] size n = 6, leap = 5 (second query)
0 0 0 1 1 1     . . .
6 3
0 0 1 1 1 0
3 1
0 1 0
Sample Output

YES
YES
NO
NO
Explanation

We perform the following  queries:

For game = [0,0,0,0,0] and leap =3, we can walk and/or jump to the end of the array because every cell contains a 0. Because we can win, we return true.
For game = [0,0,0,1,1,1] and leap =5, we can walk to index 1 and then jump  units to the end of the array. Because we can win, we return true.
For game = [0,0,1,1,1,0] and leap =3, there is no way for us to get past the three consecutive ones. Because we cannot win, we return false.
For game = [0,1,0] and leap =1, there is no way for us to get past the one at index 1. Because we cannot win, we return false.
 */