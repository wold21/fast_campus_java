package classpart;

public class Student {

    public int studentID;
    public String studentName;
    public String address;

    // void 부분은 함수의 반환 타입.
    // void는 반환 값이 없다는 이야기.
    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

}
