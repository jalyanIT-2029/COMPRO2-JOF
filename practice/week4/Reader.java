import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("info.txt")) {
            System.out.println(fr.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
