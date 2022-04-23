package randomTasks;

import java.util.*;

public class AddressList {

    public static void main(String[] args) {


        List< ArrayList<String> > bigList = new ArrayList<>();

        Map map1=new HashMap<String, ArrayList<String>>();
        map1.put("EEE", new ArrayList<String>( Arrays.asList("EEE", "LastNameE", "StreetE", "CityE", "StateE", "35") ) );

        bigList.add( new ArrayList<String>( Arrays.asList("EEE", "LastNameE", "StreetE", "CityE", "StateE", "35") ) );
        bigList.add( new ArrayList<String>( Arrays.asList("FFF", "LastNameF", "StreetF", "CityF", "StateF", "45") ) );
        bigList.add( new ArrayList<String>( Arrays.asList("CCC", "LastNameC", "StreetC", "CityC", "StateC", "15") ) );
        bigList.add( new ArrayList<String>( Arrays.asList("DDD", "LastNameD", "StreetD", "CityD", "StateD", "25") ) );
        bigList.add( new ArrayList<String>( Arrays.asList("GGG", "LastNameG", "StreetG", "CityG", "StateG", "60") ) );
        bigList.add( new ArrayList<String>( Arrays.asList("AAA", "LastNameA", "StreetA", "CityA", "StateA", "10") ) );
        bigList.add( new ArrayList<String>( Arrays.asList("BBB", "LastNameB", "StreetB", "CityB", "StateB", "20") ) );


        for ( ArrayList<String> each : bigList ){

            Set< ArrayList<String> > olderThan18 = new TreeSet<>();

            if ( Integer.parseInt( each.get( each.size()-1 ) )>18 ){

                olderThan18.add( each );

            }


            System.out.println(olderThan18);

        }




    }

}
