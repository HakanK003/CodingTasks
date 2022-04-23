package programmingLab.part8_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryCalculation {

    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {
        int refuelTimes =0;
        for(Integer each : deliveries){
            if(each<max_fuel){refuelTimes++;}else{refuelTimes+=each/max_fuel;}
        }

        return refuelTimes;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        in.close();
        System.out.println(refuel_times(list, fuel));

    }

}

/*
A pizza delivery men has a scooter and a lot of deliveries to make, he will have to refuel a few times.

refuel_times gets an arraylist deliveries of the amount of fuel it will take to get to destinations like:

[1,3,5], first place will take 1 fuel unit to get to second 3 fuel units etc...

the max_fuel is the max fuel units in the vehicle fuel tank.

you will need to return how meany refuels it will take to do all deliveries
(if the units are bigger then the tank he will refuel along the way in a gas station).

Example:

refuel_times([7,7,7],7)
returns: 3 (3 fuel stops 7 units each delivery)

refuel_times([9,1],3)
returns: 4 (3 fuel stops for first delivery and +1 stop for second)

refuel_times([100,200,10],10)
returns: 31
 */