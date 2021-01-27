package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer lee = new Customer(10010, "이순신");
        // lee.setCustomerName("이순신");
        // lee.setCustomerID(10010);
        lee.bonusPoint = 1000;
        System.out.println(lee.showCustomerInfo());

        VIPCustomer kim = new VIPCustomer(10020, "김유신");
        // Customer kim = new VIPCustomer(10020, "김유신");
        // 타입을 상위클래스로도 대입이 가능하다.
        // 하위는 무조건 상위클래스를 받고 있기 때문에.
        // 업캐스팅이라고함.
        kim.bonusPoint = 10000;
        System.out.println(kim.showCustomerInfo());

    }

}
