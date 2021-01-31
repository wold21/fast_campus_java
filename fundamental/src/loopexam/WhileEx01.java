package loopexam;

import java.util.Scanner;

public class WhileEx01 {

	public static void main(String[] args) {
		/*
		 * int num = 1; int sum = 0;
		 * 
		 * while(num <=10) { sum += num; num++; } System.out.println(sum);
		 * System.out.println(num);
		 */

		int input;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();

		while (input != 0) {
			sum += input;
			input = sc.nextInt();
		}

		System.out.println(sum);
	}

}
