package reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {

        FileReader fis = new FileReader("reader.txt");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();

        // // 이미 바이트로 읽은 것을 리더로 변환하기 위한 방법.
        // FileInputStream fis = new FileInputStream("reader.txt");
        // InputStreamReader isr = new InputStreamReader(fis);
        // int i;
        // while ((i = isr.read()) != -1) {
        // System.out.print((char) i);
        // }
        // isr.close();

        // //FileReader 사용
        // FileReader fis = new FileReader("reader.txt");
        // int i;
        // while ((i = fis.read()) != -1) {
        // System.out.print((char) i);
        // }
        // fis.close();
    }

}
