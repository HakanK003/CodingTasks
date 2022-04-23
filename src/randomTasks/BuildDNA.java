package randomTasks;

public class BuildDNA {

    public static void main(String[] args) {

        String given = "ATTTCACGGTA";

        System.out.println(buildDNA(given));

    }

    public static String buildDNA(String str){

        String result = "";

        char[] ch = str.toCharArray();

        for(int i=0; i<str.length(); i++){

            switch (ch[i]){
                case 'A': result += "T";
                    break;
                case 'C': result += "G";
                    break;
                case 'T': result += "A";
                    break;
                case 'G': result += "C";
                    break;
            }
        }

        return result;
    }


}
