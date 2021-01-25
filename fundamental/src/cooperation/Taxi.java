package cooperation;

public class Taxi {
    String taxiNum;
    int money;

    public Taxi(String taxiNum) {
        this.taxiNum = taxiNum;
    }

    public void take(int money) {
        this.money += money;
    }

    public void taxiShowInfo() {
        System.out.println(taxiNum + "번 택시의 수입은 " + money + "원 입니다.");
    }
}
