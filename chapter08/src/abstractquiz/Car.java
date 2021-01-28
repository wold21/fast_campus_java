package abstractquiz;

public abstract class Car {

    public void start() {
        System.out.println(" 시동을 켭니다.");
    }

    public abstract void drive();

    public abstract void stop();

    public void turnOff() {
        System.out.println(" 시동을 끕니다.");
    }

    // 템플릿 메소드
    final public void run() {
        start();
        drive();
        stop();
        turnOff();
    }
}
