package ifexample;

import java.util.Scanner;

public class IfExampleQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ���.");
		int score = sc.nextInt();
		sc.close();
		
		char grade = 'A';
		
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else if(score >= 60) {
			grade = 'D';
		}
		else if(score <= 59) {
			grade = 'F';
		}
		else {
			System.out.println("0~100������ ���� �Է����ּ���.");
		}
		
		System.out.println("����: " + score);
		System.out.println("����: " + grade);
	}

}
