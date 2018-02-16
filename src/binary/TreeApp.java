package binary;


public class TreeApp {

    public static void main(String[] args) {
        Tree theTree = new Tree();
        theTree.insert(50, 1.5);
        theTree.insert(75, 2);
        theTree.insert(62, 3);
        theTree.insert(87, 9);
        theTree.insert(93, 10);
        theTree.insert(79, 11);
        theTree.insert(77, 89);

        System.out.println();
        theTree.inOrder();
        System.out.println("delete one element");
        theTree.delete(75);

        System.out.println("after deleting...");
        theTree.inOrder();

        System.out.println("");
        System.out.println("max = " + theTree.minimum().iData);
        System.out.println("min = " + theTree.maximum().iData);

        final Node found = theTree.find(75);
        if (found != null) {
            System.out.println("Element with key exists");
        } else {
            System.out.println("Element with key not exists");
        }

    }

}
