
import java.util.Scanner;

public class Grades {

    public static Scanner input = new Scanner(System.in);
    public static double[][] grades = new double[50][3];
    public static String[] subjects = new String[50];
    public static String subject = "";

    public static void main(String[] args) {
        mainMenu();

    }

    public static void mainMenu() {
        System.out.print(""" 
            M A I N   M E N U
        [1] Enter grades
        [2] Display grades
        [3] Exit
        """);
        System.out.print("Enter choice: ");
        try {
            int choice1 = input.nextInt();
            switch (choice1) {
                case 1:
                    pickSubject();
                    break;
                case 2:
                    displayGrades();
                    break;
                case 3:
                    System.out.println("oki byeeee");
                    break;
                default:
                    mainMenu();
                    break;

            }
        } catch (Exception e) {
            System.out.println("Invalid Input");
            input.nextLine();
            mainMenu();
        }

    }

    public static void pickSubject() {

        System.out.print(""" 
            S U B J E C T
        [1] COMPRO2
        [2] DSA
        [3] OOP
        [4] go back
        """);
        System.out.print("Enter choice: ");

        try {
            int choice2 = input.nextInt();
            switch (choice2) {
                case 1:
                    subject = "COMPRO2";
                    enterGrades(0);
                    break;
                case 2:
                    subject = "DSA";
                    enterGrades(1);
                    break;
                case 3:
                    subject = "OOP";
                    enterGrades(2);
                    break;
                case 4:
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    pickSubject();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid Input");
            input.nextLine();
            pickSubject();
            
        }
    }

    public static void enterGrades(int subIndex) {
        String[] periods = {"Prelim", "Midterm", "Finals"};
        System.out.println("Enter grades for " + subject);

        try {
            for (int i = 0; i < periods.length; i++) {
                System.out.print(periods[i] + ": ");
                grades[subIndex][i] = input.nextDouble();
                if (subjects[subIndex] == null) {
                    subjects[subIndex] = subject;
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input.");
            input.nextLine();
        } 

        System.out.println("Grades saved...");
        pickSubject();
    }

    public static void displayGrades() {
        System.out.println("\nSUBJECT    PRELIM    MIDTERMS    FINALS");
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null) {  
                System.out.printf("%-12s %-10.1f %-10.1f %-10.1f%n", subjects[i], grades[i][0], grades[i][1], grades[i][2]);
            }
        }
    }
}
