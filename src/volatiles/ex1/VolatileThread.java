package volatiles.ex1;

public class VolatileThread extends Thread {

    private final VolatileData data;

    public VolatileThread(final VolatileData data) {
        this.data = data;
    }

    @Override
    public void run() {
        int oldValue = data.getCounter();

        System.out.println("[Thread " + Thread.currentThread().getId()
                        + "]: Old value = " + oldValue);

        data.increaseCounter();

        int newValue = data.getCounter();
        System.out.println("[Thread " + Thread.currentThread().getId()
                        + "]: New value = " + newValue);

    }

}
