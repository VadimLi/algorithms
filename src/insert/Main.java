package insert;

public class Main {

    public static void main(String[] args) {
        int maxSize = 100;
        ArrayIns arrayIns;
        arrayIns = new ArrayIns(maxSize);

        arrayIns.insert(77);
        arrayIns.insert(99);
        arrayIns.insert(44);
        arrayIns.insert(55);
        arrayIns.insert(22);
        arrayIns.insert(88);
        arrayIns.insert(11);
        arrayIns.insert(89);
        arrayIns.insert(66);
        arrayIns.insert(33);

        arrayIns.display();

        arrayIns.insertionSort();

        arrayIns.display();

    }

}
