package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		int num1 = 0B00001010; // 10
		int num2 = 0B00000101; // 5
		
		// And 둘다 참이면 1을 반환
		System.out.println(num1 & num2); // 곱
		System.out.println(num1 | num2); // 합
		System.out.println(num1 ^ num2); // XOR
		
		System.out.println(num2 << 3);
		System.out.println(num2 >> 2); 
		
	}

}
