package abstractquiz;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(new Sonata("Sonata"));
        carList.add(new Grandeur("Grandeur"));
        carList.add(new Avante("Avante"));
        carList.add(new Genesis("Genesis"));

        for (Car car : carList) {
            car.run();
            System.out.println("==========================");
        }
    }

}
