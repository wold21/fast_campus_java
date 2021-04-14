package ch08;

public class MenualCar extends Car {

    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("스티어링으로 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("전방에 장애물이 있어 브레이크를 밟아 정지합니다.");
    }

}
