package link_list;

public class DoubledLinkedList {

    private Link first;

    private Link last;

    public DoubledLinkedList() {
        // initialize
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dd) {
        Link newLink = new Link(dd);
        if ( isEmpty() ) {
            last = newLink;
        } else {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long dd) {
        Link newLink = new Link(dd);
        if ( isEmpty() ) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public Link deleteLast() {
        Link temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(long key, long dd) {
        Link current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        Link newLink = new Link(dd);
        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            current.next.previous = newLink;
            newLink.next = current.next;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public Link deleteKey(long key) {
        Link current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }

        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }
        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayForward() {
        System.out.println("List (first-->last): ");
        Link current = first;
        while (current != null) {
            System.out.println(current.dData);
            current = current.next;
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.println("List (last-->next): ");
        Link current = last;
        while (current != null) {
            while (current != null) {
                System.out.println(current.dData);
                current = current.previous;
            }
        }
        System.out.println("");
    }

}
