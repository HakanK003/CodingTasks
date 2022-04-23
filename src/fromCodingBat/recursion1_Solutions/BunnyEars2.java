package fromCodingBat.recursion1_Solutions;

public class BunnyEars2 {

    public static void main(String[] args) {

        System.out.println(bunnyEars2(3));

    }


    public static int bunnyEars2(int bunnies) {

        return bn(bunnies);

    }

    public static int bn(int a){


        if(a>0){

            if(a%2==0){

                return 3 + bn(--a);

            }else{

                return 2 + bn(--a);

            }

        }

        return 0;
    }

}
