package gamelevel;

public class SuperLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("공중을 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("더 높이 점프 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("턴을 합니다. ");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("*****고급 레벨입니다.*****");

    }
}
