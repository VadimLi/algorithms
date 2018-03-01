package partition;

public class Main {

    public static void main(String[] args) {
        int maxSize = 6; // Размер массива
        ArrayPar arr = new ArrayPar(maxSize); // Создание массива
        arr.insert(10);
        arr.insert(70);
        arr.insert(50);
        arr.insert(50);
        arr.insert(50);
        arr.insert(50);

        arr.display();

        int pivot = arr.partitionIt(0, arr.size() - 1, 23);

        System.out.println("Pivot is : " + pivot);

        arr.display();

    }

}
