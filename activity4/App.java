package activity4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    static String[] subjects;
    static double[][] grades;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        subjects = new String[50];  //maximum of 50 subjects indices 0-49
        grades = new double[50][3]; // rows ang columns

        System.out.println("\tG R A D E   M A N A G E R");
        System.out.println("========================================");
        mainMenu();

    }

    public static void mainMenu() { //MAIN MENU
        System.out.println("""
                        MAIN MENU
            [1] Add Subject and Grades
            [2] Write data
            [3] exit
        ========================================""");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        System.out.println("========================================");
        input.nextLine();

        switch (choice) {
            case 1:
                enterSubGrades();
                break;
            case 2:
                writeData();
                break;
            case 3:
                System.out.println("           Program Terminated.          ");
                System.out.println("========================================");
                break;
            default:
                System.out.println("Invalid Choice!");
                mainMenu();
                break;

        }
    }

    public static void enterSubGrades() { //ENTER GRADES AND SUBJECT

        for (int r = 0; r < 3; r++) { // u can enter 3 subjects

            System.out.print("Enter Subject: "); // ENTER SUBJECT
            try {
                subjects[r] = input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                input.nextLine();
            }

            while (true) { 
                // PRELIMS
                System.out.print("Prelim: ");
                try {
                    grades[r][0] = input.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid number");
                    input.nextLine();
                }
            }

            while (true) {// MIDTERMS
                System.out.print("Midterm: ");
                try {
                    grades[r][1] = input.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid number");
                    input.nextLine();
                }
            }

            while (true) {
                // FINALS
                System.out.print("Final: ");
                try {
                    grades[r][2] = input.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid number");
                    input.nextLine();
                }
            }
            input.nextLine();
            System.out.println("========================================");
        }
        mainMenu();
    }

    public static void writeData() { // to display the grades
        StringBuilder sb = new StringBuilder();

        sb.append("Subject, Prelims, Midterms, Finals\n");
        for (int r = 0; r < subjects.length; r++) {
            if (subjects[r] == null) {
                break;
            }
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
