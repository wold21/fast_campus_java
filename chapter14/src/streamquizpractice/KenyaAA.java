package streamquizpractice;

public class KenyaAA extends Coffee {

    // 커피를 상속받는 베이스 컴포넌트
    // 이 객체가 여러개의 보조객체를 사용할 것이다.

    @Override
    public void brewing() {
        System.out.print("KenyaAA Americano ");
    }

}