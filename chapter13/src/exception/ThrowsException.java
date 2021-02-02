package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {

        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt", "java.lang.string");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) { // 모든 예외처리에 걸리지 않으면 최상위 예외처리에 걸린다. 최상위기 때문에 제일 마지막에 자리해야함.
            System.out.println(e);
        }
    }

}
