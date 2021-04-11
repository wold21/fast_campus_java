package quiz03;

public class StudentTest {
    public static void main(String[] args) {
        Student sLee = new Student(1001, "Lee");

        sLee.addSubject("국어", 100);
        sLee.addSubject("수학", 50);

        Student sKim = new Student(1002, "Kim");

        sKim.addSubject("국어", 70);
        sKim.addSubject("수학", 85);
        sKim.addSubject("영어", 100);

        sLee.showStudentInfo();
        System.out.println("====================================");
        sKim.showStudentInfo();
    }
}
