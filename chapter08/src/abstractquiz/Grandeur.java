package abstractquiz;

public class Grandeur extends Car {

    private String carName;

    public Grandeur(String carName) {
        this.carName = carName;
    }

    @Override
    public void drive() {
        System.out.println(carName + " 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println(carName + " 멈춥니다.");
    }

    public String getCarName() {
        return this.carName;
    }

}
