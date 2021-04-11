package ch09;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> lib = new ArrayList<>();

        lib.add(new Book("태백산맥1", "조정래"));
        lib.add(new Book("태백산맥2", "조정래"));
        lib.add(new Book("태백산맥3", "조정래"));
        lib.add(new Book("태백산맥4", "조정래"));
        lib.add(new Book("태백산맥5", "조정래"));

        for (int i = 0; i < lib.size(); i++) {
            lib.get(i).showBookInfo();
        }
    }
}
