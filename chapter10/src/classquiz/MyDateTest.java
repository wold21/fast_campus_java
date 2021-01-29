package classquiz;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(12, 03, 1995);
        MyDate myDate2 = new MyDate(12, 03, 1995);

        System.out.println(myDate1.equals(myDate2));
        System.out.println(myDate1.hashCode());
        System.out.println(myDate2.hashCode());
    }

}
