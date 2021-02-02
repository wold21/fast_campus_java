package lambda;

interface PrintString {
    void showString(String str);
}

public class TestLambda {
    public static void main(String[] args) {
        // 1.
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("test");

        // 2.
        showMyString(lambdaStr);

        // 3.
        PrintString test = returnString();
        test.showString("test3");
    }

    // 2.
    public static void showMyString(PrintString p) {
        p.showString("test2");
    }

    // 3.
    // 반환문을 변수처럼 받을 수 있다.
    public static PrintString returnString() {
        return s -> System.out.println(s + "!!!");
    }

}
