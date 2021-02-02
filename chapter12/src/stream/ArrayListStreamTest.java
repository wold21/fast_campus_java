package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        sList.add("Tom");
        sList.add("Khan");
        sList.add("Edward");
        sList.add("Jack");
        sList.add("Hash");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.print(s + " "));
        System.out.println();

        // String은 Comparable이 구현되어있기 때문에 가능함.
        // 아니면 오버라이딩해줘야함.
        sList.stream().sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();

        sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + " "));
    }

}
