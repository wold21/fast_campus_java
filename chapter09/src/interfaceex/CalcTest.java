package interfaceex;

public class CalcTest {
    public static void main(String[] args) {
        // 당연히 Calc인터페이스, ComplateCalc 추상 클래스를 타입으로 사용가능.
        // 인터페이스는 구현코드가 없기 때문에 잘 생각해서 타입지정해야함.
        // 그래서 인터페이스를 타입 상속이라고도함.
        ComplateCalc calc = new ComplateCalc();

        int n1 = 10;
        int n2 = 2;

        System.out.println(calc.add(n1, n2));
        System.out.println(calc.subtract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.divide(n1, n2));
        calc.showInfo();
        calc.description();

        // 인터페이스 타입으로 정적 메소드를 인스턴스로 생성 상관없이
        // 바로 사용할 수 있다.
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = Calc.total(arr);
        System.out.println(sum);

    }

}
