package lambda;

public class StringConTest {
    public static void main(String[] args) {
        StringConcat concat = (s, v) -> System.out.println(s + "," + v);
        concat.makeString("hello", " world");
    }

}
