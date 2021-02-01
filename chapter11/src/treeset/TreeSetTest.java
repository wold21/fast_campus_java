package treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("김");
        treeSet.add("이");
        treeSet.add("박");

        // 기본적으로 오름차순으로 정의가 되어있음.

        for (String str : treeSet) {
            System.out.println(str);
        }
    }

}
