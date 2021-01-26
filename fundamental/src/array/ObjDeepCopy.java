package array;

public class ObjDeepCopy {
    public static void main(String[] args) {
        Book[] lib = new Book[5];
        Book[] copyLib = new Book[5];

        lib[0] = new Book("신1", "베르나르베르베르");
        lib[1] = new Book("신2", "베르나르베르베르");
        lib[2] = new Book("신3", "베르나르베르베르");
        lib[3] = new Book("신4", "베르나르베르베르");
        lib[4] = new Book("신5", "베르나르베르베르");

        copyLib[0] = new Book();
        copyLib[1] = new Book();
        copyLib[2] = new Book();
        copyLib[3] = new Book();
        copyLib[4] = new Book();

        for (int i = 0; i < lib.length; i++) {
            copyLib[i].setAuthor(lib[i].getAuthor());
            copyLib[i].setTitle(lib[i].getTitle());
        }

        lib[0].setTitle("나목");
        lib[0].setAuthor("박완서");

        for (Book book : lib) {
            book.showBookInfo();
        }
        System.out.println("=================");
        for (Book book : copyLib) {
            book.showBookInfo();
        }
        // 이렇게 직접적으로 데이터를 수정해주는 것이 깊은 복사이다.
    }

}
