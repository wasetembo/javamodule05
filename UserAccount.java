import java.util.ArrayList;
import java.util.List;

public class UserAccount {
    private String userID;
    private String username;
    private String email;
    private String passwordHash;
    private List<CreditCard> creditCardList;
    private double totalCreditUsed;
    private double totalCreditAvailable;

    // Constructor
    public UserAccount(String userID, String username, String email, String passwordHash) {
        this.userID = userID;
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
        this.creditCardList = new ArrayList<>();
        this.totalCreditUsed = 0.0;
        this.totalCreditAvailable = 0.0;
    }

    // Getters
    public double getTotalCreditUsed() {
        totalCreditUsed = creditCardList.stream().mapToDouble(CreditCard::getBalance).sum();
        return totalCreditUsed;
    }

    public double getTotalCreditAvailable() {
        totalCreditAvailable = creditCardList.stream().mapToDouble(CreditCard::getAvailableCredit).sum();
        return totalCreditAvailable;
    }

    // Add a credit card to the list
    public void addCreditCard(CreditCard card) {
        creditCardList.add(card);
    }

    // Get the list of credit cards
    public List<CreditCard> getCreditCardList() {
        return creditCardList;
    }
}
