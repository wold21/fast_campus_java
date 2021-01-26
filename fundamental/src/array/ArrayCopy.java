package array;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int[] arr1 = { 1, 2, 3, 4, 5 };

        System.arraycopy(arr, 0, arr1, 1, 3);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

}
