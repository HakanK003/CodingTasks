package randomTasks;

public class CalculatingRunTime {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        // --- Codes ---

        long duration = System.nanoTime() - startTime;

        System.out.println( duration               + " nanoseconds"  +
                     "\n" + duration/1_000_000     + " milliseconds" +
                     "\n" + duration/1_000_000_000 + " seconds");

        // 1 second = 1_000 milliseconds = 1_000_000_000 nanoseconds

    }

}
