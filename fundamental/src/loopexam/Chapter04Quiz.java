package loopexam;

import java.util.Scanner;

public class Chapter04Quiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 연산자를 입력해주세요");
        System.out.println("예시)  +  *  -  /  %");
        String oper = sc.next();

        System.out.println("두개의 숫자를 입력해주세요");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = 0;

        //// if문으로 만들기
        // if (oper.equals("+")) {
        // result = num1 + num2;
        // } else if (oper.equals("-")) {
        // result = num1 - num2;
        // } else if (oper.equals("*")) {
        // result = num1 * num2;
        // } else if (oper.equals("/")) {
        // result = num1 / num2;
        // } else if (oper.equals("%")) {
        // result = num1 % num2;
        // } else {
        // System.out.println("올바른 연산자를 입력하세요.");
        // }
        // System.out.println(num1 + oper + num2 + "=" + result);

        // ---------------------------------------------------------//

        // while문으로 만들기
        switch (oper) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("올바른 연산자를 입력하세요.");
        }
        System.out.println(num1 + oper + num2 + "=" + result);

        sc.close();
    }

}
