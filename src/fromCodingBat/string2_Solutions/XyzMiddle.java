package fromCodingBat.string2_Solutions;

public class XyzMiddle {

    public boolean xyzMiddle(String str) {

        if (str.length()>=5){

            int i = (str.length()-3)/2, j=str.length()-(str.length()-3)/2;;

            if (str.substring(i, j).contains("xyz")){return true;}

        }else{

            if (str.contains("xyz")){return true;}
        }

        return false;
    }
    
//    public boolean xyzMiddle(String str) {
//
//        if (str.contains("xyz")){
//
//            String[] parts = str.split("xyz");
//
//            if (parts.length==2){
//
//                return (parts[0].length()==parts[1].length())||(parts[0].length()+1==parts[1].length())||(parts[0].length()-1==parts[1].length());
//
//            }
//
//        }
//
//        return false;
//
//    }

}

/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the
left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */