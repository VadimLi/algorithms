package producer_consumer;

public class SynchronizationQueue {

    private final Queue queue;

    public SynchronizationQueue() {
        queue = new Queue(10);
    }

    public synchronized void put(int value) {
        while (queue.isFull() &&
                !queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.insert(value);
        System.out.println("Отправил: " + value);
        notify();
    }

    public synchronized long get() {
        while (queue.isEmpty() &&
                !queue.isFull()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long val = queue.remove();
        System.out.println("Получил: " + val);
        notify();
        return val;
    }

}
