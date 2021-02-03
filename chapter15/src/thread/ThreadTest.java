package thread;

// // Thread 상속
// class MyThread extends Thread {
//     public void run() {
//         int i;
//         for (i = 0; i <= 200; i++) {
//             System.out.println(i + "\t");

//             try {
//                 sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// implements Runnable
class MyThread implements Runnable {
    public void run() {
        int i;
        for (i = 0; i <= 200; i++) {
            System.out.println(i + "\t");

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("Start");

        // // Thread 상속
        // MyThread th1 = new MyThread();
        // MyThread th2 = new MyThread();
        // th1.start();
        // th2.start();

        // // implements Runnable
        // MyThread runner1 = new MyThread();
        // MyThread runner2 = new MyThread();
        // Thread th1 = new Thread(runner1);
        // Thread th2 = new Thread(runner2);
        // th1.start();
        // th2.start();

        Thread t = Thread.currentThread();
        System.out.println(t);

        System.out.println("End");

    }
}