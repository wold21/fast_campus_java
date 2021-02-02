package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream(
                "/mnt/d/Workspace/Java/fast_campus_java/chapter13/src/exception/a.txt")) {

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
