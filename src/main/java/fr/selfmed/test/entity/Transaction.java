package fr.selfmed.test.entity;

import java.util.Date;

enum Status {
    ASSIGNED, NOTASSIGNED;
}

public class Transaction {

    private int transactionId;
    private Date transactionDate;
    private String label;
    private Double amount;
    private Status status;

    public Transaction(int transactionId, Date transactionDate, String label, Double amount, Status status) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.label = label;
        this.amount = amount;
        this.status = status;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "transaction{" +
                "transactionId=" + transactionId +
                ", transactionDate=" + transactionDate +
                ", label='" + label + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
