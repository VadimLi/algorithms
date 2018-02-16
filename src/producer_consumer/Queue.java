package producer_consumer;

public class Queue {

    private int maxSize;

    private long[] queArray;

    private int front; // first

    private int rear; // last

    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new long[this.maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public synchronized void insert(long j) {
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = j;
        nItems++;
    }

    public synchronized long remove() {
        long temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public int size() {
        return nItems;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

}
