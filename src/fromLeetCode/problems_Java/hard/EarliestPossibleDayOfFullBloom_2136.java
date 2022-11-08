package fromLeetCode.problems_Java.hard;

/*
    Related Topics
    -> Array
    -> Greedy
    -> Sorting
 */

//TODO
public class EarliestPossibleDayOfFullBloom_2136 {

    public int earliestFullBloom(int[] plantTime, int[] growTime) {

        int result = 0;

        for (int j : plantTime) {

            result += j;

        }
        int min = 10000;

        for (int j : growTime) {

            if (j<min) min =j;

        }

        result+=min;

        return result;
    }

}


//TODO 25ms example solution
//
//    public int earliestFullBloom(int[] plantTime, int[] growTime) {
//
//        return plantTime != null && growTime != null ? earliestFullBloom(plantTime, growTime, plantTime.length) : 0;
//    }
//
//    private int earliestFullBloom(int[] plantTime, int[] growTime, int n) {
//
//        int radix = Arrays.stream(growTime).max().getAsInt();
//
//        int[] A = new int[radix + 1];
//
//        for (int growT : growTime) {
//            A[growT]++;
//        }
//
//        int[] B = new int[radix + 1];
//        int currentSum = 0;
//
//        for (int i = radix; i >= 0; i--) {
//            currentSum += A[i];
//            B[i] = currentSum;
//        }
//
//        int[] sPlant = new int[n];
//        int[] sGrow = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            sGrow[--B[growTime[i]]] = growTime[i];
//            sPlant[B[growTime[i]]] = plantTime[i];
//        }
//
//        int totalSum = 0;
//        int most = 0;
//
//        for (int i = 0; i < n; i++) {
//            totalSum += sPlant[i];
//            most = Integer.max(most, sGrow[i] + totalSum);
//        }
//
//        return most;
//    }



//TODO 53000kb example solution
//
//    // sort by growth time
//    // | p1 |       g1     |
//    //      | p2 |   g2       |
//    //           | p3 | g3|
//    public int earliestFullBloom(int[] plantTime, int[] growTime) {
//        int n = plantTime.length;
//        int[][] times = new int[n][2];
//        for (int i = 0; i < n; i++) {
//            times[i][0] = plantTime[i];
//            times[i][1] = growTime[i];
//        }
//
//        Arrays.sort(times, (a, b) -> b[1] - a[1]);
//
//        int res = 0, curStart = 0;
//        for (int i = 0; i < n; i++) {
//            // i'th bloom time = cur + plant + grow
//            res = Math.max(res, curStart + times[i][0] + times[i][1]);
//            curStart += times[i][0];
//        }
//
//        return res;
//    }


//    public int earliestFullBloom(int[] plantTime, int[] growTime) {
//        int n = growTime.length;
//        List<Integer> indices = new ArrayList<>();
//        for (int i = 0; i < n; ++i) {
//            indices.add(i);
//        }
//        Collections.sort(indices, Comparator.comparingInt(i -> -growTime[i]));
//        int result = 0;
//        for (int i = 0, curPlantTime = 0; i < n; ++i) {
//            int idx = indices.get(i);
//            int time = curPlantTime + plantTime[idx] + growTime[idx];
//            result = Math.max(result, time);
//            curPlantTime += plantTime[idx];
//        }
//        return result;
//    }


//	// TC : O(nlogn)
//	// SC : O(n)/ O(1)
//	public int earliestFullBloom(int[] plantTime, int[] growTime) {
//		List<Seed> plant = new ArrayList<>();
//		for(int i=0;i<plantTime.length;i++){
//			plant.add(new Seed(plantTime[i], growTime[i]));
//		}
//
//		// GO for the one with max Growth Time
//		Collections.sort(plant, (a,b) ->(b.growTime - a.growTime));
//
//		int time=0;
//		int max=0;
//		//plant max grow time first and keep track of max time it can take
//		for(int i=0;i<plantTime.length;i++){
//			time += plant.get(i).plantTime;
//			max = Math.max(max,time+plant.get(i).growTime);
//		}
//		return max;
//	}
//
//
//	private class Seed{
//		int plantTime;
//		int growTime;
//
//		public Seed(int p, int g){
//			this.plantTime = p;
//			this.growTime = g;
//		}
//	}