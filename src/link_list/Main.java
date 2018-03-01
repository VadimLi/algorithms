package link_list;


public class Main {

    public static void main(String[] args) {
        DoubledLinkedList list = new DoubledLinkedList();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);

        list.insertFirst(2);
        list.insertFirst(1);

        list.insertAfter(10, 1000);
        list.insertAfter(1000, 2000);

        list.displayForward();

        list.deleteKey(1);
        list.displayBackward();
    }

}
