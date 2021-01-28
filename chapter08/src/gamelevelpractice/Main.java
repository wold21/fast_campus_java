package gamelevelpractice;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        PlayerLevel aPlayer = new Advenced();
        player.upgradeLevel(aPlayer);
        player.play(2);

        PlayerLevel sPlayer = new Super();
        player.upgradeLevel(sPlayer);
        player.play(3);

        PlayerLevel mPlayer = new Master();
        player.upgradeLevel(mPlayer);
        player.play(4);
    }

}
