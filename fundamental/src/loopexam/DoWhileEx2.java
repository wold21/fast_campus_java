package loopexam;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		/*
		 * int num = 1; int sum = 0;
		 * 
		 * do { sum += num; num++; }while(num <=10);
		 * 
		 * System.out.println(sum); System.out.println(num);
		 */

		Scanner sc = new Scanner(System.in);
		int inputNum;
		int sum = 0;

		do {
			inputNum = sc.nextInt();
			sum += inputNum;
		} while (inputNum != 0);

		System.out.println(sum);
	}

}
