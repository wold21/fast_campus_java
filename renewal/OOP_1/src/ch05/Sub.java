package ch05;

public class Sub {
    int subLine;
    int passengerCount;
    int money;

    public Sub(int subLine) {
        this.subLine = subLine;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(subLine + "호선의 승객 수는 " + passengerCount + "명 이고 수입은 " + money + "원 입니다.");
    }
}
