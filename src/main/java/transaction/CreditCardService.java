package transaction;

public class CreditCardService {
    public CreditCard getCard(UserInfo userInfo){
        CreditCard card= new CreditCard();
        card.cardNumber="555 444 555 666";
        card.cvv="345";
        card.expiryDate="2-2-2034";
        card.name= userInfo.userName;
        card.cardLimit=15000;
        card.availableBalance=15000;
        return card;
    }
}
