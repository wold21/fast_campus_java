package classpart;

public class Student {

    // private는 해당 클래스에서만 사용가능
    // 다른 클래스에서 사용하려면 생성자를 사용하거나
    // 게터세터 구조를 사용해야함.
    private int studentID;
    public String studentName;
    public String address;

    // void 부분은 함수의 반환 타입.
    // void는 반환 값이 없다는 이야기.
    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    // // default constructor
    // public Student() {
    // }

    // 생성자
    public Student(String name) {
        studentName = name;
    }

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        address = "주소 없음";
    }

}
