public class Car {
    private static int carSerial = 10000;
    private int carNum;

    public Car() {
        carSerial++;
        carNum = carSerial;
    }

    public int getCarNum() {
        return this.carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }
}
