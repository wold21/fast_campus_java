package quiz01;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order(202104101500L, "010-4658-9513", "서울시 강북구 북한산", 20210410, 150000, 35000, 0003);
        System.out.println("주문 접수 번호 : " + order.orderNumber);
        System.out.println("주문 핸드폰 번호 : " + order.phoneNumber);
        System.out.println("주문 주소 : " + order.address);
        System.out.println("주문 날짜 : " + order.date);
        System.out.println("주문 시간 : " + order.time);
        System.out.println("주문 가격 : " + order.price);
        System.out.println("주문 메뉴 번호 : " + order.menuNumber);
    }
}
