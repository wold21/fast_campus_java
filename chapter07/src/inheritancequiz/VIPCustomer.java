package inheritancequiz;

public class VIPCustomer extends Customer {

    double saleRatio;
    private int agentID;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
    }

    public int getAgentID() {
        return this.agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }
}
