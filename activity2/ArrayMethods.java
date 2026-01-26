import java.util.Scanner;

public class ArrayMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] m = new double[3][4];
        double[][] n = new double[4][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");

        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                m[r][c] = input.nextDouble();
            }
        }

        System.out.println("Sum of elements at column 0 is: " + sumColumn(m, 0));
        System.out.println("Sum of elements at column 1 is: " + sumColumn(m, 1));
        System.out.println("Sum of elements at column 2 is: " + sumColumn(m, 2));
        System.out.println("Sum of elements at column 3 is: " + sumColumn(m, 3));

        System.out.println("Enter a 4-by-4 matrix row by row: ");

        for (int r = 0; r < n.length; r++) {
            for (int c = 0; c < n[r].length; c++) {
                n[r][c] = input.nextDouble();
            }
        }
        System.out.println("Sum of elements in the major daigonal is: " + sumMajorDiagonal(n));

    }

    public static double sumColumn(double[][] m, int columnIndex) {

        double sumColumn = 0;
        for (int r = 0; r < m.length; r++) {
            sumColumn = sumColumn + m[r][columnIndex];
        }
        return sumColumn;
    }

    // PROBLEM 2

    public static double sumMajorDiagonal(double[][] n) {
        double sum = 0;

        // 0,0 1,1 2,2 3,3

        for (int r = 0; r < n.length; r++) {
            sum += n[r][r];

        }

        return sum;

    }

}
