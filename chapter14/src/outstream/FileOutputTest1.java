package outstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt", true)) { // true라고 쓰면 append됨
            fos.write(65);
            fos.write(66);
            fos.write(67);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
