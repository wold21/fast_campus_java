package array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<String>();

        lists.add("aaa");
        lists.add("bbb");
        lists.add("ccc");

        for (int i = 0; i < lists.size(); i++) {
            String string = lists.get(i);
            System.out.println(string);
        }

        for (String str : lists) {
            System.out.println(str);
        }
    }
}
