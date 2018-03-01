package link_list;

public class Link {

    public long dData;

    public Link next;

    public Link previous;

    public Link(long dData) {
        this.dData = dData;
    }

    public void displayLink() {
        System.out.println(dData + " ");
    }

}
