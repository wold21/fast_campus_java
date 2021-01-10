package classpartquiz02;

public class OrderPage {
    public static void main(String[] args) {
        OrderInfo firstOrder = new OrderInfo();
        firstOrder.orderNumber = 202101100001L;
        firstOrder.customerID = "wold2180";
        firstOrder.orderDate = "2021년 01월 10일";
        firstOrder.customerName = "김혁";
        firstOrder.goodsNumber = "PD0345-12";
        firstOrder.customerAddress = "강북구 삼양로 424-11";

        System.out.println();
        System.out.println("주문번호: " + firstOrder.orderNumber);
        System.out.println("고객 아이디: " + firstOrder.customerID);
        System.out.println("주문날짜: " + firstOrder.orderDate);
        System.out.println("고객 이름: " + firstOrder.customerName);
        System.out.println("상품번호: " + firstOrder.goodsNumber);
        System.out.println("배송주소: " + firstOrder.customerAddress);
    }
}
