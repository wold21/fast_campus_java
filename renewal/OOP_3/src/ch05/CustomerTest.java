package ch05;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customerN = new Customer(1001, "Nancy");
        Customer customerT = new Customer(1002, "Tom");
        Customer customerE = new GoldCustomer(1003, "Eric");
        Customer customerP = new GoldCustomer(1004, "Peter");
        Customer customerK = new VipCustomer(1005, "Kanye");

        customerList.add(customerN);
        customerList.add(customerT);
        customerList.add(customerE);
        customerList.add(customerP);
        customerList.add(customerK);

        for (Customer customer : customerList) {
            System.out.println(customer.showCostomerInfo());
        }

        // 다형성
        // 각 인스턴스에 해당되는 결과들을 받아볼 수 있다.
        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원을 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
        }
    }
}
