package streamquizpractice;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee americano = new KenyaAA();
        americano.brewing();
        System.out.println();

        Coffee kenyaAALatte = new Latte(new KenyaAA());
        kenyaAALatte.brewing();
        System.out.println();

        Coffee kenyaMochaLatte = new Mocha(new Latte(new KenyaAA()));
        kenyaMochaLatte.brewing();

    }

}
