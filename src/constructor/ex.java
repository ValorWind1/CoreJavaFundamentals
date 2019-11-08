package constructor;

public class ex {
    public static void main(String[] args) {

        constructorstuff acct ;

        acct = new constructorstuff();
        acct.setBalance(10.00);
        acct.setOwnerName("Johhny Bravo");

        System.out.println(acct.getBalance()+" "+acct.getOwnerName());

    }
}
