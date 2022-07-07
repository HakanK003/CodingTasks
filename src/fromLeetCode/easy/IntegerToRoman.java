package fromLeetCode.easy;

public class IntegerToRoman {

  /*
            Symbol       Value
     o       I             1
     n       IV            4
     m       V             5
     l       IX            9
     k       X             10
     h       XL            40
     g       L             50
     f       XC            90
     e       C             100
     d       CD            400
     c       D             500
     b       CM            900
     a       M             1000
     */

    //Runtime: 12 ms, faster than 42.83% of Java online submissions for Integer to Roman.
    //Memory Usage: 45.2 MB, less than 68.29% of Java online submissions for Integer to Roman.
    public String intToRoman(int num) {

        String result="";

        int a = num/1000;
        if (a>0){
            for (int i = 0; i < a; i++) {
                result+="M";
            }
        }

        int b = (num%1000)/900;
        if (b>0){
            for (int i = 0; i < b; i++) {
                result+="CM";
            }
        }

        int c = ((num%1000)%900)/500;
        if(c>0){
            for (int i = 0; i < c; i++) {
                result+="D";
            }
        }

        int d= (((num%1000)%900)%500)/400;
        if (d>0){
            for (int i = 0; i < d; i++) {
                result+="CD";
            }
        }

        int e = ((((num%1000)%900)%500)%400)/100;
        if (e>0){
            for (int i = 0; i < e; i++) {
                result+="C";
            }
        }

        int f = (((((num%1000)%900)%500)%400)%100)/90;
        if (f>0){
            for (int i = 0; i < f; i++) {
                result+="XC";
            }
        }

        int g = ((((((num%1000)%900)%500)%400)%100)%90)/50;
        if (g>0){
            for (int i = 0; i < g; i++) {
                result+="L";
            }
        }

        int h = (((((((num%1000)%900)%500)%400)%100)%90)%50)/40;
        if (h>0){
            for (int i = 0; i < h; i++) {
                result+="XL";
            }
        }

        int k = ((((((((num%1000)%900)%500)%400)%100)%90)%50)%40)/10;
        if (k>0){
            for (int i = 0; i < k; i++) {
                result+="X";
            }
        }

        int l = (((((((((num%1000)%900)%500)%400)%100)%90)%50)%40)%10)/9;
        if (l>0){
            for (int i = 0; i < l; i++) {
                result+="IX";
            }
        }

        int m = ((((((((((num%1000)%900)%500)%400)%100)%90)%50)%40)%10)%9)/5;
        if (m>0){
            for (int i = 0; i < m; i++) {
                result+="V";
            }
        }

        int n = (((((((((((num%1000)%900)%500)%400)%100)%90)%50)%40)%10)%9)%5)/4;
        if (n>0){
            for (int i = 0; i < n; i++) {
                result+="IV";
            }
        }

        int o = ((((((((((((num%1000)%900)%500)%400)%100)%90)%50)%40)%10)%9)%5)%4);
        if (o>0){
            for (int i = 0; i < o; i++) {
                result+="I";
            }
        }


        return result;


    }

    //Runtime: 10 ms, faster than 53.94% of Java online submissions for Integer to Roman.
    //Memory Usage: 45.9 MB, less than 47.81% of Java online submissions for Integer to Roman.
    public String intToRoman2(int num) {

        String result="";

        if (num/1000>0){
            for (int i = 0; i < num/1000; i++) {
                result+="M";
            }
        }

        num=num%1000;

        if (num/900>0){
            for (int i = 0; i < num/900; i++) {
                result+="CM";
            }
        }

        num=num%900;

        if(num/500>0){
            for (int i = 0; i < num/500; i++) {
                result+="D";
            }
        }

        num=num%500;

        if (num/400>0){
            for (int i = 0; i < num/400; i++) {
                result+="CD";
            }
        }

        num=num%400;

        if (num/100>0){
            for (int i = 0; i < num/100; i++) {
                result+="C";
            }
        }

        num=num%100;

        if (num/90>0){
            for (int i = 0; i < num/90; i++) {
                result+="XC";
            }
        }

        num=num%90;

        if (num/50>0){
            for (int i = 0; i < num/50; i++) {
                result+="L";
            }
        }

        num=num%50;

        if (num/40>0){
            for (int i = 0; i < num/40; i++) {
                result+="XL";
            }
        }

        num=num%40;

        if (num/10>0){
            for (int i = 0; i < num/10; i++) {
                result+="X";
            }
        }

        num=num%10;

        if (num/9>0){
            for (int i = 0; i < num/9; i++) {
                result+="IX";
            }
        }

        num=num%9;

        if (num/5>0){
            for (int i = 0; i < num/5; i++) {
                result+="V";
            }
        }
        num=num%5;

        if (num/4>0){
            for (int i = 0; i < num/4; i++) {
                result+="IV";
            }
        }

        num=num%4;


            for (int i = 0; i < num; i++) {
                result+="I";
            }


        return result;


    }


}
