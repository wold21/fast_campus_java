package practice;

public class Store {
    private int storeNum;

    private static Store instanceStore = new Store();

    private Store() {
    }

    public static Store getInstanceStore() {
        return instanceStore;
    }

    public int getStoreNum() {
        return this.storeNum;
    }

    public void setStoreNum(int storeNum) {
        this.storeNum = storeNum;
    }
}
