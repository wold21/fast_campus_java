package reference;

public class Student {
    int studentID;
    String studentName;

    Subject korea;
    Subject math;
    Subject eng;

    public Student(int id, String name) {
        studentID = id;
        studentName = name;

        korea = new Subject();
        math = new Subject();
        eng = new Subject();
    }

    public void setKorSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void setEngSubject(String name, int score) {
        eng.subjectName = name;
        eng.score = score;
    }

    public void showStudentScore() {
        int total = korea.score + math.score + eng.score;
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }
}
