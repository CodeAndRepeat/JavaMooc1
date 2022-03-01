
public class YourFirstBankTransfer {

    public static void main(String[] args) {

        Account matthewsAccount = new Account("Matthews account", 1000);
        Account mAccount = new Account("My account", 0);

        matthewsAccount.withdrawal(100.0);
        mAccount.deposit(100.0);

        System.out.println(matthewsAccount);
        System.out.println(mAccount);
    }
}
