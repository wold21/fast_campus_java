package quiz01;

public class Order {
    Long orderNumber;
    String phoneNumber;
    String address;
    int date;
    int time;
    int price;
    int menuNumber;

    public Order(long orderNumber, String phoneNumber, String address, int date, int time, int price, int menuNumber) {
        this.orderNumber = orderNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.date = date;
        this.time = time;
        this.price = price;
        this.menuNumber = menuNumber;
    }
}
