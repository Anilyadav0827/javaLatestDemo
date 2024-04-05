package transaction;

public class Transaction {
    public String cardInfo="4444 4444 6666";
    public String cvv="345";
    public static int cardLimit=15000;

    public int getTransaction(String cardNumber,String userCvv,int txAmount){
        if(cardInfo.equals(cardNumber)&&cvv.equals(userCvv)){
            if(txAmount<=cardLimit){
                System.out.println("your transaction is successful");
                cardLimit=cardLimit-txAmount;
            }
            else {
                System.out.println("transaction failed");

            }
        }
        else{
            System.out.println("in valid credentials");
        }

      return cardLimit;

    }
    public int rePayCardAmount(String cardNumber,int rePayAmount){
        if(this.cardInfo.equals(cardNumber)){
            cardLimit=cardLimit+rePayAmount;
        }
        System.out.println("total Amount paid : "+cardLimit);
        return cardLimit;

    }
}
