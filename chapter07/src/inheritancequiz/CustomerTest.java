package inheritancequiz;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer lee = new Customer(10010, "lee");
        Customer kim = new Customer(10020, "kim");
        Customer hong = new GoldCustomer(10100, "hong");
        Customer han = new GoldCustomer(10200, "han");
        Customer park = new VIPCustomer(11000, "park", 50788);

        customerList.add(lee);
        customerList.add(kim);
        customerList.add(hong);
        customerList.add(han);
        customerList.add(park);

        System.out.println("\n========== 고객 정보 출력 ==========\n");

        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo() + "\n");
        }
        System.out.println("\n========== 할인율과 보너스 포인트 계산 ==========\n");
        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트 점수는 " + customer.bonusPoint + "점 입니다.\n");
        }
    }

}
