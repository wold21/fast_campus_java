package gamelevelpractice;

public class Beginner extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("느리게 걷습니다.");
    }

    @Override
    public void jump() {
        System.out.println("아직 점프 할 수 없습니다.");
    }

    @Override
    public void turn() {
        System.out.println("아직 턴을 할 수 없습니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 초급 레벨입니다. *****");
    }

}
