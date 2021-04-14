package ch07;

public abstract class Computer {

    public abstract void display();

    public abstract void typing();

    public void turnOn() {
        System.out.println("System On");
    }

    public void turnOff() {
        System.out.println("System Off");
    }
}
