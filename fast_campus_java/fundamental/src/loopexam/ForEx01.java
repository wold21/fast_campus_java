package loopexam;

public class ForEx01 {
    public static void main(String[] args) {
        int num;
        int sum = 0;

        for (num = 0; num < 10; num++) {
            if (num % 2 != 0) {
                sum += num;
                System.out.println(num);
            }
        }
        System.out.println(sum);
    }

}
