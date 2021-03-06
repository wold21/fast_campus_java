package ifexample;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int month = sc.nextInt();
		sc.close();
		int day;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 2: 
				day = 28;
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			default:
				System.out.println("1월부터 12월 사이의 숫자를 입력해주세요.");
				day = 0;
		}
		if (month <= 12) {
			System.out.println(month + "월은 " + day + "일 입니다.");
		}
	}

}
