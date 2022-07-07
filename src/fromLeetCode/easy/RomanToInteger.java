package fromLeetCode.easy;

public class RomanToInteger {


    //Runtime: 5 ms, faster than 93.38% of Java online submissions for Roman to Integer.
    //Memory Usage: 46 MB, less than 52.08% of Java online submissions for Roman to Integer.
    public int romanToInt(String s) {

        int result =0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i)=='I'){

                if (i!=s.length()-1&&s.charAt(i+1)=='V'){result+=4; i++;}
                else if(i!=s.length()-1&&s.charAt(i+1)=='X'){result+=9; i++;}
                else {result+=1;}

            } else if (s.charAt(i)=='V'){

                result+=5;

            }else if (s.charAt(i)=='X'){

                if (i!=s.length()-1&&s.charAt(i+1)=='L'){result+=40; i++;}
                else if(i!=s.length()-1&&s.charAt(i+1)=='C'){result+=90; i++;}
                else {result+=10;}

            }else if(s.charAt(i)=='L'){

                result+=50;

            }else if(s.charAt(i)=='C'){

                if (i!=s.length()-1&&s.charAt(i+1)=='D'){result+=400; i++;}
                else if(i!=s.length()-1&&s.charAt(i+1)=='M'){result+=900; i++;}
                else {result+=100;}

            }else if(s.charAt(i)=='D'){

                result+=500;

            }else if (s.charAt(i)=='M'){

                result+=1000;

            }


        }

        return result;

    }


    //Runtime: 8 ms, faster than 63.11% of Java online submissions for Roman to Integer.
    //Memory Usage: 44.5 MB, less than 81.21% of Java online submissions for Roman to Integer.
    public int romanToInt2(String s) {

        int result =0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i)=='I'){

                if (i!=s.length()-1&&s.charAt(i+1)=='V'){result+=4; i++;}
                else if(i!=s.length()-1&&s.charAt(i+1)=='X'){result+=9; i++;}
                else {result+=1;}
                continue;

            }
            if (s.charAt(i)=='V'){

                result+=5;
                continue;

            }

            if (s.charAt(i)=='X'){

                if (i!=s.length()-1&&s.charAt(i+1)=='L'){result+=40; i++;}
                else if(i!=s.length()-1&&s.charAt(i+1)=='C'){result+=90; i++;}
                else {result+=10;}
                continue;

            }

            if(s.charAt(i)=='L'){

                result+=50;
                continue;

            }

            if(s.charAt(i)=='C'){

                if (i!=s.length()-1&&s.charAt(i+1)=='D'){result+=400; i++;}
                else if(i!=s.length()-1&&s.charAt(i+1)=='M'){result+=900; i++;}
                else {result+=100;}
                continue;

            }

            if(s.charAt(i)=='D'){

                result+=500;
                continue;

            }

            if (s.charAt(i)=='M'){

                result+=1000;

            }


        }

        return result;

    }


    //Runtime: 10 ms, faster than 49.62% of Java online submissions for Roman to Integer.
    //Memory Usage: 45.7 MB, less than 55.81% of Java online submissions for Roman to Integer.
    //Runtime: 8 ms, faster than 63.11% of Java online submissions for Roman to Integer.
    //Memory Usage: 45.1 MB, less than 72.04% of Java online submissions for Roman to Integer.
    public int romanToInt3(String s) {

        s=s+" ";

        int result =0;

        for (int i = 0; i < s.length()-1; i++) {

            if (s.charAt(i)=='I'){

                if (s.charAt(i+1)=='V'){result+=4; i++;}
                else if(s.charAt(i+1)=='X'){result+=9; i++;}
                else {result+=1;}

            } else if (s.charAt(i)=='V'){

                result+=5;

            }else if (s.charAt(i)=='X'){

                if (s.charAt(i+1)=='L'){result+=40; i++;}
                else if(s.charAt(i+1)=='C'){result+=90; i++;}
                else {result+=10;}

            }else if(s.charAt(i)=='L'){

                result+=50;

            }else if(s.charAt(i)=='C'){

                if (s.charAt(i+1)=='D'){result+=400; i++;}
                else if(s.charAt(i+1)=='M'){result+=900; i++;}
                else {result+=100;}

            }else if(s.charAt(i)=='D'){

                result+=500;

            }else if (s.charAt(i)=='M'){

                result+=1000;

            }


        }

        return result;

    }


    //Runtime: 9 ms, faster than 57.46% of Java online submissions for Roman to Integer.
    //Memory Usage: 45.2 MB, less than 68.84% of Java online submissions for Roman to Integer.
    public int romanToInt4(String s) {

        s=s+" ";

        int result =0, i;

        for (i =0 ; i < s.length()-1; i++) {

            if (s.charAt(i)=='I'){

                if (s.charAt(i+1)=='V'){result+=4; i++;}
                else if(s.charAt(i+1)=='X'){result+=9; i++;}
                else {result+=1;}

            } else if (s.charAt(i)=='V'){

                result+=5;

            }else if (s.charAt(i)=='X'){

                if (s.charAt(i+1)=='L'){result+=40; i++;}
                else if(s.charAt(i+1)=='C'){result+=90; i++;}
                else {result+=10;}

            }else if(s.charAt(i)=='L'){

                result+=50;

            }else if(s.charAt(i)=='C'){

                if (s.charAt(i+1)=='D'){result+=400; i++;}
                else if(s.charAt(i+1)=='M'){result+=900; i++;}
                else {result+=100;}

            }else if(s.charAt(i)=='D'){

                result+=500;

            }else if (s.charAt(i)=='M'){

                result+=1000;

            }


        }

        return result;

    }


}


