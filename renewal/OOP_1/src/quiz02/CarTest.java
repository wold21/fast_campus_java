public class CarTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();

        Car jeep = factory.createCar();
        Car k9 = factory.createCar();

        System.out.println(jeep.getCarNum());
        System.out.println(k9.getCarNum());

    }
}
