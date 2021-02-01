package innerclass;

class OutClass {

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    // 인스턴스 내부 클래스
    class InClass {
        int iNum = 100;
        int sInNum = 200;

        void inTest() {
            // 외부 private변수 사용가능
            System.out.println(num);
            // 외부 스태틱도 사용가능.
            System.out.println(sNum);
        }
    }

    public void usingInner() {
        inClass.inTest();
    }

    // 정적 내부 클래스
    // 아웃클래스 생성여부와 상관없이 쓸 수 있다.
    static class InStaticClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            System.out.println(inNum);
            System.out.println(sInNum);
            System.out.println(sNum); // 아웃클래스에 있는 변수
        }

        static void sTest() {
            // System.out.println(inNum); // 여기서는 일반 변수를 사용할 수 없다.
            System.out.println(sInNum);
            System.out.println(sNum);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingInner();

        OutClass.InClass myInClass = outClass.new InClass();
        // 아웃 클래스 안에 있는 인클래스를 이렇게 외부에서 선언할 수 있으나.
        // 아웃 클래스 안에서만 사용하려고 만든 인클래스이기 때문에
        // 이렇게 사용하지는 않는다.
        System.out.println();

        // // 정적 내부 클래스 생성
        // OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        // sInClass.inTest();

        // // 정적 내부 클래스의 함수는 이런식으로 바로 불러 쓸 수 있다.
        OutClass.InStaticClass.sTest();
    }
}