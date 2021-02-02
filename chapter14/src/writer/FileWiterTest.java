package writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWiterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("writer.txt");

        fw.write("A");
        char[] buf = { 'B', 'C', 'D', 'E', 'F' };

        fw.write(buf);
        fw.write("안녕하세요");
        fw.write(buf, 2, 2);
        fw.close();

        FileReader fis = new FileReader("writer.txt");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }

}
