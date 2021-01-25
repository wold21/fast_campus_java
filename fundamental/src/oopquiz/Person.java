package oopquiz;

public class Person {
    String personName;
    int money;

    public Person(String personName, int money) {
        this.personName = personName;
        this.money = money;
    }

    public void buyStarCoffee(StarCoffeeShop star, int money) {
        String message = star.brewing(4000);
        if (message != null) {
            this.money -= 4000;
            System.out.println(personName + "님이 " + money + "원 으로 " + message);
        }
    }

    public void buyBeanCoffee(BeanCoffeeShop bean, int money) {
        String message = bean.brewing(4500);
        if (message != null) {
            this.money -= 4000;
            System.out.println(personName + "님이 " + money + "원 으로 " + message);
        }

    }
}
