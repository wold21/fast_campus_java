package streamquiz;

public abstract class Decorator extends Coffee {

    Coffee coffee;

    // 혼자 쓰여질수 없기에 생성자에 커피를 선언하고 인자로 받는다.
    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }

}
