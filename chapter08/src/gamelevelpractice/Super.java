package gamelevelpractice;

public class Super extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("공중을 걷습니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프 할 수 있습니다.");
    }

    @Override
    public void turn() {
        System.out.println("턴을 할 수 있습니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 고급 레벨입니다. *****");
    }

}
