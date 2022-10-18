package fromLeetCode.medium;

public class CountAndSay_38 {

    public String countAndSay(int n) {


        if(n < 1) return null;
        if(n ==1 ) return "1";

        StringBuffer sb = new StringBuffer("11");

        for(int i = 2; i < n; i++){

            StringBuffer c = new StringBuffer();
            int count = 1;

            for( int j = 1; j < sb.length();j++){

                if(sb.charAt(j-1) == sb.charAt(j)){
                    count++;
                }else{
                    c.append(count);
                    c.append(sb.charAt(j-1));
                    count = 1;
                }

            }

            c.append(count);
            c.append(sb.charAt(sb.length()-1));
            sb = c;

        }

        return sb.toString();



    }

}


/*
TODO 2ms example solution

    public String countAndSay(int n) {
        if(n == 1) return "1";
        String s = countAndSay(n-1);

        StringBuilder sb = new StringBuilder();
        char ch = '!';
        int num = 0;
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i)!=ch){
                if(num>0){
                    sb.append(num);
                    sb.append(ch);
                }
                num = 0;
                ch = s.charAt(i);
            }
            num++;
            i++;
        }
        sb.append(num);
        sb.append(ch);
        return sb.toString();
    }


TODO 39500kb example solution

    public String countAndSay(int n) {
        String sol = "1";
        while (n > 1) {
            int length = sol.length();
            StringBuilder currStr = new StringBuilder();

            for (int i = 0; i < length; i++) {

                int count = 1;
                while (i < length-1 && sol.charAt(i) == sol.charAt(i+1)) {
                    count++;
                    i++;
                }

                currStr.append(count).append(sol.charAt(i));

            }
            sol = currStr.toString();
            n--;
        }

        return sol;

    }


 */