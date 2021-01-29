package string;

public class StringTest {
    public static void main(String[] args) {

        // 힙메모리에 생성.
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2);

        // 상수풀에있는 값
        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3 == str4);
    }

}
