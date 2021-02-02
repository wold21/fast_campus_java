package inputstream;

public class SystemInTest {
    public static void main(String[] args) {
        System.out.println("입력 :");

        // 반환값이 int임.
        try {
            int i = System.in.read();
            System.out.println(i);
            System.out.println((char) i);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}