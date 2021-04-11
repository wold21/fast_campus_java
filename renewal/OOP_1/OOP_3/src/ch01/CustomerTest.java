package ch01;

public class CustomerTest {
    public static void main(String[] args) {
        Customer lee = new Customer();
        lee.setCustomerID(1001);
        lee.setCustomerName("lee");
        lee.bonusPoint = 1000;
        System.out.println(lee.showCostomerInfo());

        VipCustomer kim = new VipCustomer();
        kim.setCustomerID(11001);
        kim.setCustomerName("kim");
        kim.setAgentID("3030");
        kim.bonusPoint = 10000;
        System.out.println(kim.showCostomerInfo());
    }
}
