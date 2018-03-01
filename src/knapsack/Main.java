package knapsack;


public class Main {

    public static void main(String[] args) {
        int[] sack = new int[] {11, 12, 32, 43};
        Backup backup = new Backup(sack);
        if (!backup.knapsack(43, 0))
            System.out.println("No valid combinations");
    }

}
