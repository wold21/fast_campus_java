package abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Desktop();
        computer.display();

        Computer myNote = new MyNoteBook();
        myNote.display();
        myNote.typing();
    }

}
