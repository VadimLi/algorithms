package producer_consumer;

public class Producer implements Runnable {

    private final SynchronizationQueue queue;

    public Producer(final SynchronizationQueue queue)
            throws InterruptedException {
        new Thread(this, "start producer")
                .start();
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            queue.put(i++);
        }
    }

}
