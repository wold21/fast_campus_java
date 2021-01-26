package staticquiz01;

public class CardCompanyTest {
    public static void main(String[] args) {
        CardCompany cardCompany = CardCompany.getInstance();

        Card myCard = cardCompany.createCard();
        Card yourCard = cardCompany.createCard();

        System.out.println(myCard.getCardNumber());
        System.out.println(yourCard.getCardNumber());
    }

}
