package staticquiz01;

public class CardCompany {

    private static CardCompany instance = new CardCompany();

    private CardCompany() {
    }

    public static CardCompany getInstance() {
        if (instance == null) {
            instance = new CardCompany();
        }
        return instance;
    }

    public Card createCard() {
        Card card = new Card();
        return card;
    }
}

// 카드를 발급해주는 회사이다.
// Card를 사용해 카드를 발급하는 일만 하기 때문에 싱글턴 패턴을 사용했다.
// 클래스 내부에서 스스로 인스턴스를 하나 생성.
// 생성자는 외부에서 호출을 막기 위해 하나 생성해 놓고, 따라서 컴파일러가 기본적으로 생성해주지 않는다.
// 만들어진 객체를 외부에서 접근하기 위해, 외부에서 인스턴스 생성 상관없이 접근할 수 있게 해줘야하기 때문에 public 그리고
// static으로 get메서드를 하나 만들어준다.

// 그리고 카드 번호를 생성해주기 위해서 리턴값이 Card인 createCard라는 메서드를 만들고
// 메서드가 호출되면 그제서야 이전에 만들어 놓았던 Card클래스의 인스턴스가 card란 이름으로 생성되고
// 리턴되게 된다. 그리하여 Card클래스에있는 static변수는 ++가 될것이고 (생성되었으니)
// getCardNumber를 하면 증가된 번호를 받을 수 있는것이다.
