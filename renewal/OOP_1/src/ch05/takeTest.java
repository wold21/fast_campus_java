package ch05;

public class takeTest {
    public static void main(String[] args) {
        Student s1 = new Student("Kim", 10000);
        Student s2 = new Student("Lee", 5000);

        Bus bus1120 = new Bus(1120);
        Bus bus1218 = new Bus(1218);
        Bus bus144 = new Bus(144);

        Sub blueSub = new Sub(4);
        Sub greenSub = new Sub(2);

        s1.takeBus(bus1120);
        s1.showInfo();
        s2.takeSub(greenSub);
        s2.showInfo();

        bus1120.showBusInfo();
        greenSub.showBusInfo();

    }
}
