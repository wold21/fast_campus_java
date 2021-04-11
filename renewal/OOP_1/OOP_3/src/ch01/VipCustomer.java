package ch01;

public class VipCustomer extends Customer {

    double saleRatio;
    private String agentID;

    public VipCustomer() {
        saleRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
    }

    public String getAgentID() {
        return this.agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

}
