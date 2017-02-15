package kateryna.workshop_4;

/**
 * Created by carmudi on 15/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.setNumber("23456");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Doe");
        bobsAccount.setCustomerEmailAddress("bob.doe@gmail.com");
        bobsAccount.setCustomerPhoneNumber("(067) 123-45-78");

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0 );
    }
}
