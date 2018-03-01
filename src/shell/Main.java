package shell;


public class Main {

    public static void main(String[] args) {
        int maxSize = 3;
        final ArraySh arraySh = new ArraySh(maxSize);

        for (int i = 0; i < maxSize; i++) {
            long n = (long) (Math.random() * 99);
            arraySh.insert(n);
        }

        arraySh.display();
        arraySh.shellSort();
        arraySh.display();
    }

}
