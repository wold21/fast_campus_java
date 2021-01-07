package ifexample;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		
		int age = sc.nextInt();
		sc.close();
		
		int charge = 0;
		
		// if와 if는 따로 조건을 따진다.
		// if와 else if, else는 하나라도 조건에 걸리면
		// 나머지 조건을 안건다. 
		if (age < 8) {
			charge = 1000;
			System.out.println("미취학");
		}else if (age < 14) {
			charge = 1500;
			System.out.println("초등생");
		}else if (age < 20) {
			charge = 2000;
			System.out.println("중고등생");
		}else {
			charge = 3000;
			System.out.println("나머지");
		}
		
		System.out.println("나이 : " + age);
		System.out.println("요금 : " + charge);
	}
}
