package gamelevelpractice;

public class Master extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("공중을 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("공중 점프를 할 수 있습니다.");
    }

    @Override
    public void turn() {
        System.out.println("공중 턴을 할 수 있습니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 마스터 레벨입니다. *****");
    }

}
