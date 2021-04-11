package quiz03;

import java.util.ArrayList;

public class Student {
    int sNumber;
    String sName;
    ArrayList<Subject> subjectList;

    public Student(int sNumber, String sName) {
        this.sNumber = sNumber;
        this.sName = sName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String subjectName, int subjectScore) {
        Subject sub = new Subject();

        sub.setSubject(subjectName);
        sub.setScore(subjectScore);
        subjectList.add(sub);
    }

    public void showStudentInfo() {
        int total = 0;

        for (Subject sub : subjectList) {
            System.out.println("학생 " + sName + "의 " + sub.subject + " 과목 성적은 " + sub.score + "점 입니다.");
            total += sub.score;
        }
        System.out.println("학생 " + sName + "의 총점은 " + total + "점 입니다.");

    }
}
