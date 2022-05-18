package fromHackerRank.promlemSolving.dataStructure;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArrayDS2D_HourglassMaxValue {
}

class Result2 {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */


    /*

    [ [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0] ]
    [ a, a, a, a, a, a ]
    [ [i, i, i, i, i, i],[i, i, i, i, i, i],[i, i, i, i, i, i],[i, i, i, i, i, i],[i, i, i, i, i, i],[i, i, i, i, i, i] ]

     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here

        int max = Integer.MIN_VALUE;

        for (int a = 0; a< arr.size()-2; a++) {

            for (int i = 0; i < arr.get(i).size() - 2; i++) {

                int sum = 0;

//                for (int j = 0; j < 3; j++) {
//
//                    sum+=arr.get(a+j).get(i+j);
//
//                }

                //Maybe use another loop to avoid lines below

                sum+=arr.get(a).get(i);
                sum+=arr.get(a).get(i+1);
                sum+=arr.get(a).get(i+2);

                sum+=arr.get(a+1).get(i+1);

                sum+=arr.get(a+2).get(i);
                sum+=arr.get(a+2).get(i+1);
                sum+=arr.get(a+2).get(i+2);


                if (sum > max) {
                    max = sum;
                }

            }

        }

        return max;

    }

}

class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result2.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}