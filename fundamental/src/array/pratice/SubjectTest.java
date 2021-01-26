package array.pratice;

public class SubjectTest {
    public static void main(String[] args) {
        Student lee = new Student(1001, "lee");
        lee.addSubject("국어", 100);
        lee.addSubject("영어", 86);
        lee.addSubject("수학", 14);

        Student kim = new Student(1002, "kim");
        kim.addSubject("음악", 100);
        kim.addSubject("과학", 75);
        kim.addSubject("암벽오르기", 100);

        lee.showStudentInfo();
        System.out.println("========================");
        kim.showStudentInfo();
    }

}
