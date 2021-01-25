package cooperation;

public class Subway {
    int lineNum;
    int passengerCount;
    int money;

    public Subway(int lineNum) {
        this.lineNum = lineNum;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void subwayShowInfo() {
        System.out.println(lineNum + "호선의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}
