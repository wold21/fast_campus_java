package array;

public class ObjCopy {
    public static void main(String[] args) {
        Book[] lib = new Book[5];
        Book[] copyLib = new Book[5];

        lib[0] = new Book("신1", "베르나르베르베르");
        lib[1] = new Book("신2", "베르나르베르베르");
        lib[2] = new Book("신3", "베르나르베르베르");
        lib[3] = new Book("신4", "베르나르베르베르");
        lib[4] = new Book("신5", "베르나르베르베르");

        System.arraycopy(lib, 0, copyLib, 0, 5);

        lib[0].setTitle("나목");
        lib[0].setAuthor("박완서");

        for (Book book : lib) {
            book.showBookInfo();
        }
        System.out.println("=================");
        for (Book book : copyLib) {
            book.showBookInfo();
        }

        // 양쪽이 다 바뀜 카피가 아니라 참조한다.
        // 주소만 복사.
        // 이를 얕은 복사라고한다.
    }

}
