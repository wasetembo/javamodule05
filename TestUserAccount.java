import java.util.Date;

public class TestUserAccount {
    public static void main(String[] args) {
        UserAccount user = new UserAccount("U123", "JohnDoe", "john.doe@example.com", "hashed_password");

        CreditCard card1 = new CreditCard("C001", "Visa Platinum", 5000, 1500, 0.15, new Date(), "U123");
        CreditCard card2 = new CreditCard("C002", "MasterCard Gold", 3000, 800, 0.12, new Date(), "U123");

        user.addCreditCard(card1);
        user.addCreditCard(card2);

        System.out.println("Total Credit Used: " + user.getTotalCreditUsed());
        System.out.println("Total Credit Available: " + user.getTotalCreditAvailable());
    }
}
