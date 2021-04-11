package ch08;

public class AiCar extends Car {

    @Override
    public void drive() {
        System.out.println("자율 주행을 합니다.");
        System.out.println("스스로 조향합니다.");
    }

    @Override
    public void stop() {
        System.out.println("전방에 장애물이 있어 멈춥니다.");
    }

    @Override
    public void washCar() {
        System.out.println("자동세차를 합니다.");
    }

}
