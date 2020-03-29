package fr.selfmed.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonPropertyOrder({ "id", "date", "label", "amount", "status" })
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName="root")
public class Transaction {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("date")
    private String date;

    @JsonProperty("label")
    private String label;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("status")
    private String status;

    public Transaction(Integer id, String date, String label, String amount, String status) {
        super();
        this.id = id;
        this.date = date;
        this.label = label;
        this.amount = amount;
        this.status = status;
    }

    public Transaction(Transaction tr) {
        super();
        this.id = tr.getId();
        this.date = tr.getDate();
        this.label = tr.getLabel();
        this.amount = tr.getAmount();
        this.status = tr.getStatus();
    }

    public Transaction() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", label='" + label + '\'' +
                ", amount='" + amount + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
