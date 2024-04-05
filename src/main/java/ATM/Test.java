package ATM;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Account account= new Account();

        account.accountNumber="123455";
        account.balance=200000;
        account.bankName="Sbi";
        account.ifscCode="22222";
        account.passWord="9999";
        account.userName="a@1234";

        Card card= new Card();
        card.account=account;
        card.cardNumber="6666666";
        card.cvv="777";
        card.expiryDate= new Date();

        Atm atm= new Atm();
        atm.atmMachineBalance=1000000;
        atm.location="lb nagar";
        atm.machineId="444";

        Transcation transcation =new Transcation();

        transcation.atm=atm;
        transcation.card=card;
        transcation.txId="778899";
        transcation.txIdDate= new Date();
        transcation.withdrawAmount=2000;

    }
}
