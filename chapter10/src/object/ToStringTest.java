package object;

// 마크 인터페이스 Cloneable
class Book implements Cloneable {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return author + ", " + title;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    // 이 객체가 해제될때 GC에서 호출되는 메서드.
    // 이게 정의되어있으면 GC가 finalize()를 수행한다.
    // 리소스 해제, 소켓 close처리 등

}

public class ToStringTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("토지", "박경리");
        System.out.println(book);

        // String str = new String("토지");
        // System.out.println(str.toString());

        Book book2 = (Book) book.clone();
        System.out.println(book2);
    }
}
