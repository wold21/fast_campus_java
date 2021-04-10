package ch06;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee_kim = new Employee();
        employee_kim.setEmployeeName("kim");

        Employee employee_lee = new Employee();
        employee_lee.setEmployeeName("lee");

        System.out.println(employee_kim.getEmployeeName() + "님의 사원번호는 " + employee_kim.getEmployeeID() + "번 입니다.");
        System.out.println(employee_lee.getEmployeeName() + "님의 사원번호는 " + employee_lee.getEmployeeID() + "번 입니다.");

    }
}
