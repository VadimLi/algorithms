package linked_list;

public class Main {

    public static void main(String[] args) {
        final DoubledLinkedList linkedList = new DoubledLinkedList();
        linkedList.insertLast(10);
        linkedList.insertLast(15);
        linkedList.insertLast(20);
        linkedList.insertLast(25);

        linkedList.insertFirst(50);
        linkedList.insertFirst(100);
        linkedList.insertFirst(1000);


        linkedList.deleteLast();
        linkedList.deleteLast();

        linkedList.deleteFirst();
        linkedList.deleteFirst();

        linkedList.insertAfter(50, 100);
        linkedList.insertAfter(100, 1000);

        linkedList.deleteKey(100);
        linkedList.deleteKey(1000);
        linkedList.deleteKey(50);

        linkedList.displayList();

    }

}
