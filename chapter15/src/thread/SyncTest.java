package thread;

class Bank {
    private int money = 10000;

    // // 동기화 메서드 방식
    // public synchronized void saveMoney(int save) {
    // int m = this.getMoney();

    // try {
    // Thread.sleep(3000);
    // } catch (Exception e) {
    // e.printStackTrace();
    // }

    // setMoney(m + save);
    // }

    // public synchronized void minusMoney(int minus) {
    // int m = this.getMoney();

    // try {
    // Thread.sleep(200);
    // } catch (Exception e) {
    // e.printStackTrace();
    // }

    // setMoney(m - minus);
    // }

    // 동기화 블럭 방식
    public void saveMoney(int save) {
        synchronized (this) {
            int m = this.getMoney();

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            setMoney(m + save);
        }
    }

    public synchronized void minusMoney(int minus) {
        int m = this.getMoney();

        try {
            Thread.sleep(200);
        } catch (Exception e) {
            e.printStackTrace();
        }

        setMoney(m - minus);
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}

class Park extends Thread {

    public void run() {
        System.out.println("start save");
        SyncTest.myBank.saveMoney(3000);
        System.out.println("Park save money : " + SyncTest.myBank.getMoney());
    }
}

class ParkWife extends Thread {
    public void run() {
        System.out.println("start minus");
        SyncTest.myBank.minusMoney(1000);
        System.out.println("ParkWife minus money : " + SyncTest.myBank.getMoney());
    }
}

// // 클래스 실행 메서드에서 걸고 싶은 경우
// class Park extends Thread {

// public void run() {
// synchronized (SyncTest.myBank) {
// System.out.println("start save");
// SyncTest.myBank.saveMoney(3000);
// System.out.println("Park save money : " + SyncTest.myBank.getMoney());
// }
// }
// }

// class ParkWife extends Thread {
// public void run() {
// synchronized (SyncTest.myBank) {
// System.out.println("start minus");
// SyncTest.myBank.minusMoney(1000);
// System.out.println("ParkWife minus money : " + SyncTest.myBank.getMoney());
// }
// }
// }

public class SyncTest {
    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException {
        Park p = new Park();
        p.start();

        Thread.sleep(200);

        ParkWife pw = new ParkWife();
        pw.start();
    }

}
