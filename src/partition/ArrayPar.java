package partition;

public class ArrayPar {

    private long[] theArray;

    private int nElems;

    public ArrayPar(int max) {
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        theArray[nElems] = value;
        nElems++;
    }

    public int size() {
        return nElems;
    }

    public void display() {
        System.out.println("A:");
        for (int i = 0; i < nElems; i++) {
            System.out.println(theArray[i]);
        }
        System.out.println();
    }

    public int partitionIt(int left, int right, int pivot) {
        int leftPtr = left;
        int rightPtr = right;
        while (true) {
            while (leftPtr < right &&
                    theArray[leftPtr] < pivot) {
                leftPtr++;
            }
            while (rightPtr > left &&
                    theArray[rightPtr] > pivot) {
                rightPtr--;
            }
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        return leftPtr;
    }

    private void swap(int dex1, int dex2) {
        long temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }


}
