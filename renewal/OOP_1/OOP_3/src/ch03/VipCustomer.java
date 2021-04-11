package ch03;

public class VipCustomer extends Customer {

    double saleRatio;
    private String agentID;

    // public VipCustomer() {
    // // super(); // 하위 클래스가 상위클래스의 인스턴스의 참조값. 상위클래스 디폴트 생성자 안써됨.

    // saleRatio = 0.1;
    // bonusRatio = 0.05;
    // customerGrade = "VIP";
    // System.out.println(" VIP Customer() call");
    // }

    public VipCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "VIP";
        saleRatio = 0.1;
        bonusRatio = 0.05;

        System.out.println("VIP Customer(int , String) call");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int) (price * saleRatio);
        return price;
    }

    public String getAgentID() {
        return this.agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

}
