package producer_consumer;

public class Consumer implements Runnable {

    private final SynchronizationQueue queue;

    public Consumer(final SynchronizationQueue queue)
            throws InterruptedException {
        new Thread(this, "start consumer")
                .start();
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            queue.get();
        }
    }

}