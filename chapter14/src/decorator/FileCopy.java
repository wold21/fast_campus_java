package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        long milliseconds = 0;

        try (FileInputStream fis = new FileInputStream("HollyWood.zip");
                FileOutputStream fos = new FileOutputStream("copy.zip");
                BufferedInputStream bis = new BufferedInputStream(fis);
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            milliseconds = System.currentTimeMillis();

            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }

            milliseconds = System.currentTimeMillis() - milliseconds;
        } catch (IOException e) {
            System.out.println(e);
        }

        /*
         * 보조스트림을 여러개 사용할 수 있다. Socket socket = new Socket(); BufferedReader isr = new
         * BufferedReader(new InputStreamReader(socket.getInputStream()));
         * isr.readLine();
         */
        System.out.println("복사에 걸린 시간 : " + milliseconds);
    }

}
