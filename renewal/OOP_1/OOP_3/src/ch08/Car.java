package ch08;

public abstract class Car {
    public abstract void drive();

    public abstract void stop();

    public void startCar() {
        System.out.println("Engine Start!!");
    }

    public void turnOff() {
        System.out.println("Engine Stop!!");
    }

    // Hook method
    public void washCar() {
    }

    // template method
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
