package staticquiz01;

public class Card {
    private int cardNumber;
    private static int cardSerialNum = 10000; // 프로그램이 로드될때 스태틱 영역에 등록

    public Card() { // 생성자
        cardSerialNum++;
        cardNumber = cardSerialNum;
    }

    public int getCardNumber() { // 게터
        return cardNumber;
    }

    public void setCartNumber(int cardNumber) { // 세터
        this.cardNumber = cardNumber;
    }
}

// Card 클래스는 card의 serialNumber를 관리하기위해 만들어졌다.
// 그래서 스태틱 변수를 하나 가지고 있으며 그것이 시리얼 넘버이자 이후에 발급 될 카드 번호이다.
// 접근은 은닉되어있기 때문에 게터세터로 접근이 가능하다.
// 이 클래스로 인스턴스가 하나 생성되면 cardSerialNumber는 ++ 된다.
