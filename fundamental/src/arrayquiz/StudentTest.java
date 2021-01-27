package arrayquiz;

public class StudentTest {
    public static void main(String[] args) {
        Student lee = new Student("lee");
        lee.addBook("태백산맥1");
        lee.addBook("태백산맥2");
        Student kim = new Student("kim");
        kim.addBook("재즈 화성의 기초지식");
        kim.addBook("사운드 디자인");
        kim.addBook("나머지는 소음이다");
        Student cho = new Student("cho");
        cho.addBook("모두의 C언어");
        cho.addBook("이것이 자바다");
        cho.addBook("통계학 도감");
        cho.addBook("CentOS리눅스 구축관리 실무");
        cho.addBook("처음 시작하는 파이썬");

        lee.showStudentInfo();
        System.out.println("========================================================================");
        kim.showStudentInfo();
        System.out.println("========================================================================");
        cho.showStudentInfo();
    }
}
