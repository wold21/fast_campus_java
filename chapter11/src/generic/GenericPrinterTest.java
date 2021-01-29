package generic;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        Powder powder = new Powder();
        powderPrinter.setMaterial(powder);
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        Plastic plastic = new Plastic();
        plasticPrinter.setMaterial(plastic);
        System.out.println(plasticPrinter);

        // 상속받은 <타입>이 아니기 때문에 쓸 수 없다.
        // GenericPrinter<Water> waterPrinter = new GenericPrinter<>();

        powderPrinter.printing();
        plasticPrinter.printing();
    }

}