package hidingquiz;

public class MydateTest {
    public static void main(String[] args) {
        Mydate date1 = new Mydate(2020, 8, 13);
        System.out.println(date1.isValid());
        Mydate date2 = new Mydate(2021, 2, 28);
        System.out.println(date2.isValid());
    }

}