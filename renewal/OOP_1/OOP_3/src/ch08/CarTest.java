package ch08;

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AiCar();
        aiCar.run();

        System.out.println("================================");

        Car menualCar = new MenualCar();
        menualCar.run();
    }
}
