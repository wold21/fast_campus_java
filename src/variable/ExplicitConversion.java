package variable;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		// 명시적 형변환
		// 데이터 유실이 발생할 수 있음.
		int i = 1000;
		byte bNum = (byte)i;
		System.out.println(bNum);
		
		double dNum1 = 1.2f;
		float fNum = 0.9f;
		
		// 실수 -> 정수 형변환
		// 데이터 유실 발생
		int iNum1 = (int)dNum1 + (int)fNum;
		int iNum2 = (int)(dNum1 + fNum);
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
