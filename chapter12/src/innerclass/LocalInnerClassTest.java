package innerclass;

class Outer {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {

        int num = 100;

        // 지역 내부 클래스
        class myRunnable implements Runnable {

            @Override
            public void run() {
                // 지역 변수들 변경 불가능.
                // 함수는 불리고 해제되기 때문에.
                // num += 10;
                // i = 200;
                // 하지만 볼수는 있음.
                System.out.println(num);
                System.out.println(i);
                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }
        }
        return new myRunnable();
    }
}

public class LocalInnerClassTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(50);
        // getRunnable은 호출되고 끝남.
        // 그렇기에 지역 내부 클래스안의 함수에서의 변수 컨트롤은 상수화로 시켜야한다.

        runnable.run();
    }

}
