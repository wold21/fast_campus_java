package streamquizpractice;

public class Latte extends Decorator {

    // 커피를 꾸며줄 데코레이터(재료)이기 때문에 데코레이터를 상속받는다.

    public Latte(Coffee coffee) {
        super(coffee);
    }

    public void brewing() {
        super.brewing();
        System.out.print("Adding Milk ");
    }

}
