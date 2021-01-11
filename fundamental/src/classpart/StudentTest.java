package classpart;

public class StudentTest {
    public static void main(String[] args) {

        // 생성자
        // new Student();
        Student studentKim = new Student("김혁");
        // studentKim.studentName = "김혁";
        studentKim.address = "서울";

        studentKim.showStudentInfo();

        Student studentLee = new Student(200, "이지은");
        // studentLee.studentName = "이지은";
        // studentLee.address = "서울";

        studentLee.showStudentInfo();

        // // 참조변수에 대한 값
        // // 클래스의 Fullname (패키지명 + 클래스명)
        // // 주소값, 참조값 -> 인스턴스의 주소.
        // // 실제 주소는 아니고 JVM이 주는 해쉬값.
        // // 16진수 32비트
        // System.out.println(studentKim);
        // System.out.println(studentLee);
    }
}
