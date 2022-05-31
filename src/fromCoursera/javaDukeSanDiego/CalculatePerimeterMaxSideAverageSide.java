package fromCoursera.javaDukeSanDiego;



public class CalculatePerimeterMaxSideAverageSide {

    public static void main(String[] args) {

        //coordinates for points (they are grouped by two, so I'm able to find distance between two point = side) (not best way but ... it works)
         int[][] provideData2 = new int[][]{
                    { -3, 3, -4, -3,   -4, -3, 4, -2,    4, -2, 6, 5,     6, 5, -3, 3 } ,
                    {-3,4, -3,-5,     -3,-5, 3,-5,      3,-5, 3,4,    3,4, -3,4 },
                    { -4, -3, 4, -2,    4, -2 ,12, 2,     12, 2, 6, 5,    6, 5 , -3, 3,    -3, 3, -8, 1,    -8, 1, -4, -3},
                    {-3, 9, -8, 7,    -8, 7, -12, 4,      -12, 4, -6, -2,     -6, -2, -4, -6,    -4, -6, 2, -8,   2, -8, 6, -5,   6, -5, 10, -3,    10, -3, 8, 5,   8, 5, 4, 8,   4,8, -3,9},
                    {-15,8, -8,-6,     -8,-6, 7,-2,     7,-2, 4,10,     4,10,-15,8},
                    {-13,8,-8,-6,     -8,-6,5,-2,    5,-2,2,10,     2,10,-13,8 }
            };


         for(int j =0; j< provideData2.length; j++){

            double longestSide = Double.MIN_VALUE;
            double totalSum = 0;
            int sideNumber = 0;

            for (int i = 0; i <= provideData2[j].length - 3; i = i + 4) {

                Double side = Math.sqrt(((provideData2[j][i] - provideData2[j][i + 2]) * (provideData2[j][i] - provideData2[j][i + 2])) + ((provideData2[j][i + 1] - provideData2[j][i + 3]) * (provideData2[j][i + 1] - provideData2[j][i + 3])));

                totalSum += side;

                sideNumber++;

                if (side > longestSide) longestSide = side;

            }

            System.out.println();

            System.out.println("totalSum = " + totalSum);
            System.out.println("longestSide = " + longestSide);
            System.out.println("averageSide = " + totalSum / sideNumber);

            System.out.println("--------------------------------------------------------------");


        }

    }

}
