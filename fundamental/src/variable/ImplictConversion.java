package variable;

public class ImplictConversion {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(fNum);
		
		
		// iNum = int
		// fNum = float
		// ���� ���ϸ� iNum�� float�� �ٲ�
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
	}

}
