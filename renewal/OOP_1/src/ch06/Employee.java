package ch06;

public class Employee {
    private static int serialNum = 100;

    private int employeeID;
    private String employeeName;
    private String department;

    public Employee() {
        serialNum++;
        employeeID = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
