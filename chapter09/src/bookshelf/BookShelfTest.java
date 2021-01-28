package bookshelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();

        bookQueue.enQueue("신1");
        bookQueue.enQueue("신2");
        bookQueue.enQueue("신3");
        bookQueue.enQueue("신4");

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }

}
