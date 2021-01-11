package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "LEE");
        studentLee.setKorSubject("국어", 100);
        studentLee.setMathSubject("수학", 85);
        studentLee.setEngSubject("영어", 77);

        Student studentKim = new Student(101, "KIM");
        studentKim.setKorSubject("국어", 80);
        studentKim.setMathSubject("수학", 77);
        studentKim.setEngSubject("영어", 88);

        studentKim.showStudentScore();
        studentLee.showStudentScore();
    }

}
