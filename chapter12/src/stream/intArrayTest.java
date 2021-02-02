package stream;

import java.util.Arrays;

public class intArrayTest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int sum = Arrays.stream(arr).sum();
        // 카운트의 반환값이 Long이기때문에 캐스팅.
        int count = (int) Arrays.stream(arr).count();

        System.out.println(sum + ", " + count);

        System.out.println(Arrays.stream(arr).reduce(0, (a, b) -> a + b));

    }

}
