package knapsack;

public class Backup {

    private int sack[];

    public Backup(int sack[]) {
        this.sack = sack;
    }

    /**
     * @param weight,
     * @param index = 0
     */
    public boolean knapsack(int weight, int index) {
        boolean complete = false;

        if (index == sack.length) return false;
        if (sack[index] == weight) {
            System.out.println("Answer: ");
            System.out.print(sack[index] + "");
            complete = true;
        }
        if (weight > sack[index]) {
            complete = knapsack(weight - sack[index], index + 1);
            if (complete) System.out.println(sack[index] + " ");
            for (int i = index + 1; i < sack.length; i++) {
                if (!complete) complete = knapsack(weight, i);
            }
        }
        if (weight < sack[index]) complete = knapsack(weight, index + 1);

        return complete;
    }

}
