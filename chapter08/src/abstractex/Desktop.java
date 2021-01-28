package abstractex;

public class Desktop extends Computer {

    @Override
    public void display() {
        System.out.println("Desktop Display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    public void turnOff() {
        System.out.println("데스크탑 전원을 끕니다.");
    }
}
