package object;

class Student {
    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            return (this.studentNum == std.studentNum);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        // String str1 = new String("abc");
        // String str2 = new String("abc");

        // System.out.println(str1 == str2);
        // System.out.println(str1.equals(str2));

        // Student lee = new Student(100, "lee");
        // Student lee2 = lee;
        // Student kim = new Student(100, "kim");

        // System.out.println(lee == lee2);
        // System.out.println(lee.equals(kim));
        // System.out.println(lee.hashCode());
        // System.out.println(kim.hashCode());

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));
    }

}