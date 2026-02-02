import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Me {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("First name: ");
            sb.append("First name: ").append(input.nextLine()).append("\n");

            System.out.print("Last name: ");
            sb.append("Last name: ").append(input.nextLine()).append("\n");

            System.out.print("age: ");
            sb.append("age: ").append(input.nextLine()).append("\n");

            System.out.print("Email: ");
            sb.append("Email: ").append(input.nextLine()).append("\n");

            System.out.print("Phone: ");
            sb.append("Phone: ").append(input.nextLine()).append("\n");

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }

        // try-with-resourse
        try (FileWriter fw = new FileWriter("me.txt");) {
            fw.write(sb.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
