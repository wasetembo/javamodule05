import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreditCard {
    private String cardID;
    private String cardName;
    private double creditLimit;
    private double balance;
    private double interestRate;
    private Date dueDate;
    private double availableCredit;
    private String userID;
    private List<Transaction> transactionList;
    private Date reminderDate;

    // Constructor
    public CreditCard(String cardID, String cardName, double creditLimit, double balance, double interestRate, Date dueDate, String userID) {
        this.cardID = cardID;
        this.cardName = cardName;
        this.creditLimit = creditLimit;
        this.balance = balance;
        this.interestRate = interestRate;
        this.dueDate = dueDate;
        this.userID = userID;
        this.transactionList = new ArrayList<>();
        calculateAvailableCredit();
    }

    // Calculate available credit
    public double calculateAvailableCredit() {
        availableCredit = creditLimit - balance;
        return availableCredit;
    }

    // Set payment reminder
    public void setReminder(Date reminderDate) {
        this.reminderDate = reminderDate;
    }

    // Getters
    public double getBalance() {
        return balance;
    }

    public double getAvailableCredit() {
        return calculateAvailableCredit();
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }
}
