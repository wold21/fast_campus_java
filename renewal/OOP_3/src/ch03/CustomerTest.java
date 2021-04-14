package ch03;

public class CustomerTest {
    public static void main(String[] args) {
        Customer lee = new Customer(1001, "lee");
        lee.bonusPoint = 1000;
        int price = lee.calcPrice(1000);
        System.out.println(lee.showCostomerInfo() + price);

        VipCustomer kim = new VipCustomer(11001, "kim");
        kim.setAgentID("3030");
        kim.bonusPoint = 10000;
        price = kim.calcPrice(1000);
        System.out.println(kim.showCostomerInfo() + price);

        Customer vc = new VipCustomer(11002, "testName");
        // 가상함수(메서드)
        // VIPCustomer로 사용됐다.
        // 인스턴스는 각각 가상 메서드 테이블을 가지고 있음.
        // 재정의가 된다는 것은 다른 메서드 주소를 가진다는 이야기이다.
        System.out.println(vc.calcPrice(1000));
    }
}
