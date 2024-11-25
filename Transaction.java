import java.util.Date;

public class Transaction {
    private String transactionID;
    private String cardID;
    private double amount;
    private String category;
    private Date transactionDate;
    private String description;
    private boolean isDebit;

    // Constructor
    public Transaction(String transactionID, String cardID, double amount, String category, Date transactionDate, String description, boolean isDebit) {
        this.transactionID = transactionID;
        this.cardID = cardID;
        this.amount = amount;
        this.category = category;
        this.transactionDate = transactionDate;
        this.description = description;
        this.isDebit = isDebit;
    }

    // Get transaction details
    public String getTransactionDetails() {
        return "TransactionID: " + transactionID + ", Amount: " + amount + ", Category: " + category + ", Date: " + transactionDate + ", Description: " + description + ", Is Debit: " + isDebit;
    }
}
