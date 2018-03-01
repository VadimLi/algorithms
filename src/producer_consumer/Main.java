package producer_consumer;

import org.w3c.dom.Document;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final SynchronizationQueue synchronizationQueue =
                new SynchronizationQueue();
        new Consumer(synchronizationQueue);
        new Producer(synchronizationQueue);
    }

}
