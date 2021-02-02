package inputstream;

import java.io.InputStreamReader;

public class SystemInTest2 {
    public static void main(String[] args) {
        System.out.println("입력 후 끝이라고 써주세요.");
        System.out.println("입력 :");

        // 반환값이 int임.
        try {
            int i;
            InputStreamReader isr = new InputStreamReader(System.in); // 바이트를 문자로 읽을 수 있게 보조해주는 스트림
            while ((i = isr.read()) != '끝') { // 한글은 한바이트 이상이라 읽을 수 없다.
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}