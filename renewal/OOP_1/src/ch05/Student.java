package ch05;

public class Student {
    String studentName;
    int money;

    public Student(String name, int money) {
        this.studentName = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSub(Sub sub) {
        sub.take(1250);
        this.money -= 1250;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
