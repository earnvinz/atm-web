package th.ac.ku.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAccount {
    @Id
    private int id;

    private int customerId;
    private String type;
    private double balance;

    public BankAccount() {

    }

    public BankAccount(int id, int customerId, String type, double balance) {
        this.id = id;
        this.customerId = customerId;
        this.type = type;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
