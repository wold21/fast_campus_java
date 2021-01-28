package templateex;

public abstract class Car {
    public abstract void drive();

    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // 훅 메서드
    // 아무기능이 없지만 하위 클래스가 재정의 해서
    // 사용하는 메서드
    public void washCar() {
    }

    // 템플릿 메서드
    // 하위 클래스에서 재정의 할 수 없다.
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}