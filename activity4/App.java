package activity4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static String[] subjects;
    static double[][] grades;

    public static void main(String[] args) {
        subjects = new String[5];
        grades = new double[5][3];
        int choice2;

        Scanner sc = new Scanner(System.in);

        for (int r = 0; r < 4; r++) {
            System.out.println("""
                    Pick a subject

                    [1] COMPRO1
                    [2] COMPRO2
                    [3] OOP
                    [4] MMW
                    [5] DSA
                    [0] exit
                    """);
            System.out.print("Enter choice: ");
            try {
                subjects[r] = sc.nextLine();

                // PRELIMS
                System.out.print("Input Prelim grade: ");
                try {
                    grades[r][0] = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid number");
                }
                // MIDTERMS
                System.out.print("Input Midterm grade: ");
                try {
                    grades[r][1] = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid number");
                }
                // FINALS
                System.out.print("Input Final grade: ");
                try {
                    grades[r][2] = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid number");
                }

                sc.nextLine();
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
            }
        }
        writeData();
    }

    public static void writeData() {
        StringBuilder sb = new StringBuilder();

        sb.append("Subject, Prelims, Midterms, Finals\n");
        for (int r = 0; r < subjects.length; r++) {
            if (subjects[r] == null)
                break;

            sb.append(subjects[r]);
            for (int c = 0; c < grades[r].length; c++) {
                sb.append(",").append(grades[r][c]);
            }
            sb.append("\n");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Grades.csv"))) {
            bw.write(sb.toString());
            bw.flush();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(sb.toString());

    }
}
