import java.util.Date;

public class TestCreditCard {
    public static void main(String[] args) {
        CreditCard card = new CreditCard("C001", "Visa Platinum", 5000, 1500, 0.15, new Date(), "U123");

        Transaction transaction1 = new Transaction("T001", "C001", 50, "Groceries", new Date(), "Walmart Purchase", true);
        Transaction transaction2 = new Transaction("T002", "C001", 30, "Dining", new Date(), "Restaurant", true);

        card.addTransaction(transaction1);
        card.addTransaction(transaction2);

        System.out.println("Available Credit: " + card.calculateAvailableCredit());
    }
}
