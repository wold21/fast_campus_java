package cooperation;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 10500);
        Student studentP = new Student("Paul", 5340);
        Student studentA = new Student("Alice", 45000);

        Bus bus144 = new Bus(144);
        Bus bus1218 = new Bus(1218);
        Subway greenLine = new Subway(2);
        Subway blueLine = new Subway(4);
        Taxi taxiOne = new Taxi("48자 1513");

        studentJ.takeBus(bus144);
        studentP.takeBus(bus144);
        studentA.takeTaxi(taxiOne);
        System.out.println();

        studentJ.showInfo();
        studentP.showInfo();
        studentA.showInfo();
        System.out.println();

        bus144.busShowInfo();
        bus1218.busShowInfo();
        System.out.println();

        taxiOne.taxiShowInfo();
        System.out.println();

        greenLine.subwayShowInfo();
        blueLine.subwayShowInfo();
        System.out.println();
    }

}
