package gamelevelpractice;

public class Advenced extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("달릴 수 있습니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프 할 수 있습니다.");
    }

    @Override
    public void turn() {
        System.out.println("아직 턴을 할 수 없습니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 중급 레벨입니다. *****");
    }

}
