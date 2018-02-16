package binary_repeat;


public class Tree {

    private Node root;

    public Node find(Node findNode) {
        Node current = root;
        while (current != findNode) {
            if (findNode.iData < current.iData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null)
                return null;
        }
        return current;
    }

    public void output(Node localRoot) {
        if (localRoot != null) {
            output(localRoot.leftChild);
            System.out.println(localRoot.iData + ": " + localRoot.fData);
            output(localRoot.rightChild);
        }
    }

    public void input(Node findNode) {
        Node current = findNode;
    }

}
