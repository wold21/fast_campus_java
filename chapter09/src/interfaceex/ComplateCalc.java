package interfaceex;

public class ComplateCalc extends Calculator {

    // 상속받은 상위 클래스의 나머지 추상 메소드를 구현했다.
    // 최종적으로 인터페이스, 즉 청사진을 모두 완료한것.

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            return Error;
        } else {
            return num1 / num2;
        }
    }

    public void showInfo() {
        System.out.println("모두 구현함.");
    }

    // @Override
    // public void description() {
    // System.out.println("재정의 한 description");
    // }

}
