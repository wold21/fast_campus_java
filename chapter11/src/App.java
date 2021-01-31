import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Random rantInt = new Random();
        int num = rantInt.nextInt(arr.length) + 1;
        System.out.println(arr[num]);

    }
}
