package practice.week3;

import java.util.Scanner;

public class ExceptionPractice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1.
        System.out.print("Enter a number: ");
        try {
            int number = input.nextInt();
            System.out.println("The number is " + number);
        } catch (Exception e) {
            System.out.println("ERROR! Invalid Input");
        }

        // 2.
        System.out.print("\nEnter a number: ");

        int enteredNum = inputNumber();
        System.out.println("The number is " + enteredNum);
    }

    public static int inputNumber() {
        Scanner input = new Scanner(System.in);

        while (true) {

            try {
                int number = input.nextInt();
                return number;
            } catch (Exception e) {
                System.out.println("SABING NUMBER, BAT LETTER NILALAGAY!? ");
                System.out.print("Enter ka ulit: ");
                input.nextLine();
            }
        }
    }
}
