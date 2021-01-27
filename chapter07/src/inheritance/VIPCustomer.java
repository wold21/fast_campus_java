package inheritance;

public class VIPCustomer extends Customer {

    double saleRatio;
    private int agentID;

    // public VIPCustomer() {
    // // precompile단계에 상위 클래스의 기본 생성자가
    // // 자동으로 생성됨.
    // // super(); -> 생략

    // // 그런데 상위클래스의 생성자가 매개변수를 가지고 있을 경우,
    // // super()는 없기 때문에 명시적으로 작성해줘야함.
    // // super(0, null);
    // // 그런데 이런형태로 쓰지 않고 아래의 다른 생성자를 봐보자.

    // super();
    // customerGrade = "VIP";
    // bonusRatio = 0.05;
    // saleRatio = 0.1;

    // System.out.println("VIPCustomer() 생성자 호출");
    // }

    // 이런식으로 사용한다.
    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer(int, String) 생성자 호출");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

}
