package ch03;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKim = new Student();

        studentKim.studentID = 2235;
        studentKim.setStudentName("Kim");
        studentKim.address = "서울 강북구";

        studentKim.showStudentInfo();

        Student studentLee = new Student();
        studentLee.studentID = 2236;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 종로구";

        System.out.println();

        studentLee.showStudentInfo();
    }
}
