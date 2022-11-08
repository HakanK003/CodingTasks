package fromLeetCode.problems_Java.medium;

/*
    Related Topics
    -> Array
    -> Dynamic Programming
    -> Depth-First Search
    -> Matrix
    -> Simulation
 */

public class WhereWillTheBallFall_1706 {


    //Solution
    public int[] findBall(int[][] grid) {

        int result[] = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            result[i] = findBallDropColumn(0, i, grid);
        }
        return result;
    }

    public int findBallDropColumn(int row, int col, int[][] grid) {

        if (row == grid.length)return col;

        int nextColumn = col + grid[row][col];

        if (nextColumn < 0 ||nextColumn > grid[0].length - 1 ||grid[row][col] != grid[row][nextColumn]) {
            return -1;
        }
        return findBallDropColumn(row + 1, nextColumn, grid);
    }



    public int[] findBall1(int[][] grid) {

        int index1 = 0, index2 = 1, currentRow = 0;

        int[] results = new int[grid[0].length];

        for (int i = 0; i < grid[0].length; i++) {

            while(grid[currentRow][index1]==grid[currentRow][index2]){

                if (currentRow == grid.length-1) {
                    results[i] = index1;
                    index1=0;
                    index2=1;
                    currentRow=0;
                } else if (grid[currentRow][index1] == 1) {
                    index1++;
                    index2++;
                    currentRow++;
                } else if (grid[currentRow][index1] == -1) {
                    index1--;
                    index2--;
                    currentRow++;
                }

            }

            if (grid[currentRow][index1]!=grid[currentRow][index2]){

                results[i]=-1;
                index1=0;
                index2=1;
                currentRow=0;

            }

        }

        return results;
    }

}
