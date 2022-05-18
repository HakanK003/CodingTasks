package fromHackerRank.javaPractices.practice5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {


    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)+" ;
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE );

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }


//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//
//        Scanner input = new Scanner(System.in);
//
//        int x = input.nextInt();
//
//        input.nextLine();
//
//        String[] sentences = new String[x];
//
//        for (int i = 0; i < x; i++) {
//
//            sentences[i] = input.nextLine();
//
//        }
//
//        input.close();
//
//        for (String eachSentence : sentences) {
//
//            ArrayList<String> words = new ArrayList<>( Arrays.asList(eachSentence.split(" ") ) );
//
//            for (int i =0; i< words.size(); i++ ){
//
//                for (int j =0; j< words.size(); j++) {
//
//                    if ( words.get(i).equalsIgnoreCase(words.get(j)) && (i!=j) ){words.set(j, "");}
//
//                }
//
//            }
//
//            String result ="";
//
//            for (String eachUnique : words) {
//
//                if (!(eachUnique.isEmpty()))
//                result+=eachUnique+" ";
//
//            }
//
//            System.out.println(result.trim());
//
//        }
//
//
//    }

}
