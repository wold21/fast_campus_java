package innerclass;

class aOuter {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {

        int num = 100;
        return new Runnable() {

            @Override
            public void run() {
                System.out.println(num);
                System.out.println(i);
                System.out.println(outNum);
                System.out.println(aOuter.sNum);
            }
        };
    }

    // 인터페이스나 추상클래스를 클래스 없이
    // 바로 생성 가능.
    Runnable runner = new Runnable() {

        @Override
        public void run() {
            System.out.println("test");
        }

    };
}

public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        aOuter aOuter = new aOuter();

        // 익명 내부 클래스
        aOuter.runner.run();

        Runnable runnable = aOuter.getRunnable(50);
        // getRunnable은 호출되고 끝남.
        // 그렇기에 지역 내부 클래스안의 함수에서의 변수 컨트롤은 상수화로 시켜야한다.

        runnable.run();
    }

}
