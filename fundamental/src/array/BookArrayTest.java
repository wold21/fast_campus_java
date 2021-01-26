package array;

public class BookArrayTest {
    public static void main(String[] args) {
        Book[] lib = new Book[5];

        lib[0] = new Book("신1", "베르나르베르베르");
        lib[1] = new Book("신2", "베르나르베르베르");
        lib[2] = new Book("신3", "베르나르베르베르");
        lib[3] = new Book("신4", "베르나르베르베르");
        lib[4] = new Book("신5", "베르나르베르베르");

        for (int i = 0; i < lib.length; i++) {
            System.out.println(lib[i]);
            lib[i].showBookInfo();
        }
    }
}
