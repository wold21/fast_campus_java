package ch07;

public class ComputerTest {
    public static void main(String[] args) {
        // 추상 클래스는 인스턴스 화 할 수 없다.
        // 구현 된 함수를 가지고 있기 때문.
        // 혹여나 모두 구현이 되어있다고 해도 안된다.

        Computer desktop = new Desktop();
        desktop.display();
        desktop.turnOn();
    }
}
