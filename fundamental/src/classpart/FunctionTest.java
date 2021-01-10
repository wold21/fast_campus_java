package classpart;

import java.util.Scanner;

public class FunctionTest {

    public static int addNum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum() {
        int sum = 0;
        int i;

        for (i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요.");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        sayHello("hello");
        int num = calcSum();
        int total = addNum(n1, n2);
        System.out.println(total);
        System.out.println(num);

    }

}
