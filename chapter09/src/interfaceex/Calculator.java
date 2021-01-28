package interfaceex;

public abstract class Calculator implements Calc {

    // 구현할 Calc 추상 클래스의 부분만 구현했기때문에 아직 두개의 추상 메소드가 남았다.
    // 그래서 이 클래스는 일반 클래스가 아니라 덜 구현했기 때문에 타입이 추상클래스이다.

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

}
