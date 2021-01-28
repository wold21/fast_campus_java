package interfaceex;

public interface Calc {

    // 상수
    double PI = 3.14;
    int Error = -999999999;

    // 추상 메소드
    // 구현 클래스에서 구현해야함.
    int add(int num1, int num2);

    int subtract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);

    // default method
    default void description() {
        System.out.println("점수 계산기를 구현합니다.");
        // myMethod();
    }

    // static method
    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }
        // myStaticMethod();
        return total;
    }

    // private method
    // java9 부터 제공
    // private void myMethod() {
    // System.out.println("private method");
    // }

    // private static void myStaticMethod() {
    // System.out.println("private static method");
    // }
}