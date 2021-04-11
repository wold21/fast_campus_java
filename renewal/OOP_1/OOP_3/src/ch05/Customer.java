package ch05;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    // public Customer() {
    // customerGrade = "SILVER";
    // bonusRatio = 0.01;
    // System.out.println("Customer() call");
    // }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer(int, String) call");
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCostomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며 보너스 포인트는 " + bonusPoint + "점 입니다.";
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
