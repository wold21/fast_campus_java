package streamquizpractice;

public abstract class Decorator extends Coffee {

    // 똑같이 커피를 상속받음.
    // 이 데코레이터를 베이스 객체가 사용할 것임으로 추상클래스로 선언.

    Coffee coffee;

    // 커피 타입으로 생성
    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    // 상속 받았기에 추상 메서드 오버라이드
    @Override
    public void brewing() {
        coffee.brewing();
    }

}
