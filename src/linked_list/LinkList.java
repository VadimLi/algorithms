package linked_list;

public class LinkList {

    private Link first;

    public LinkList() {
        first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public ListIterator getIterator() {
        return new ListIterator(this);
    }

    public void displayList() {
        Link current  = first;
        while (current != null) {
            System.out.println(current.dData);
            current = current.next;
        }
        System.out.println("");
    }

}
