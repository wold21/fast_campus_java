package inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer lee = new Customer(10010, "이순신");
        lee.bonusPoint = 1000;

        VIPCustomer kim = new VIPCustomer(10020, "김유신");
        kim.bonusPoint = 10000;

        int pricelee = lee.calcPrice(10000);
        int pricekim = kim.calcPrice(10000);

        System.out.println(lee.showCustomerInfo() + "지불금액은 " + pricelee + "원 입니다.");
        System.out.println(kim.showCustomerInfo() + "지불금액은 " + pricekim + "원 입니다.");

        Customer joe = new VIPCustomer(10030, "조이");
        joe.bonusPoint = 10000;
        System.out.println(joe.showCustomerInfo() + "지불금액은 " + joe.calcPrice(10000) + "원 입니다.");

    }

}
