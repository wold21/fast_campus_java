package variable;

public class DoubleTest2 {

	public static void main(String[] args) {
		
		double dNum = 1;
		
		for(int i=0; i<10000; i++) {
			dNum = dNum + 0.1;
		}
		// 부동소수점의 오차가 있다.
		// 1001이 되어야하지만 1001.000000000159 값이 나옴.
		System.out.println(dNum);
	}

}
