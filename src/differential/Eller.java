package differential;

public class Eller {

    private static double diffFunc(final double x,
                                   final double y) {
        return x*x - 2*y;
    }

    public static void main(String[] args) {

        double x = 0;

        double y = 1;

        double h = 0.1;

        System.out.println("x[0] = "  + x);

        System.out.println("y[0] = " + y);

        System.out.println("f(" + x + ", " + y + ") = " + diffFunc(x, y));

        System.out.println("h*f(" + x + ", " + y + ") = " + (h*diffFunc(x, y)));

        for (int i = 1; i < 10; i++) {
            x+=h;

            y += h*diffFunc(x, y);

            System.out.println("------------------------------");

            System.out.println("x[" + i + "]= "  + x);

            System.out.println("y[" + i + "]= " + y);

            System.out.println("f(" + x + ", " + y + ") = " + diffFunc(x, y));

            System.out.println("h*f(" + x + ", " + y + ") = " + (h*diffFunc(x, y)));
        }

    }

}
