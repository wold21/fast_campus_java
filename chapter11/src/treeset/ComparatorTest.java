package treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2) * (-1);
    }

}

public class ComparatorTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new MyCompare());
        // 보통 Comparator는 이미 Comparable이 정의되어있을때
        // 또 다른 방식으로 구현하기 위해 사용한다.
        // 클래스 생성자의 인자로 생성해주면된다.

        treeSet.add("김");
        treeSet.add("이");
        treeSet.add("박");

        // 기본적으로 오름차순으로 정의가 되어있음.

        for (String str : treeSet) {
            System.out.println(str);
        }
    }

}
