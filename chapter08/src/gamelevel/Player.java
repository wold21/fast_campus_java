package gamelevel;

public class Player {

    private PlayerLevel level;

    public Player() {
        level = new BeginnerLeval();
        level.showLevelMessage();
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }

    public PlayerLevel getLevel() {
        return this.level;
    }
}
