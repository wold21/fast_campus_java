package oopquiz;

public class CoffeeTest {
    public static void main(String[] args) {
        Person kim = new Person("김졸려", 30000);
        Person lee = new Person("이피곤", 30000);

        StarCoffeeShop star = new StarCoffeeShop();
        BeanCoffeeShop bean = new BeanCoffeeShop();

        kim.buyStarCoffee(star, Menu.STARAMERICANO);
        lee.buyBeanCoffee(bean, Menu.BEANLATTE);
    }

}
