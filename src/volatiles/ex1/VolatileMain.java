package volatiles.ex1;

public class VolatileMain {

    private final static int TOTAL_THREADS = 2;

    public static void main(String[] args) {
        final VolatileData volatileData =
                new VolatileData();
        final Thread[] threads = new Thread[TOTAL_THREADS];
        for (int i = 0; i < TOTAL_THREADS; i++) {
            threads[i] = new VolatileThread(volatileData);
        }

        for (int i = 0; i < TOTAL_THREADS; i++) {
            threads[i].start();
        }

    }

}
