package com.beyonic.models.request;

/**
 * Created by jerryshikanga on  2019-04-28
 */
public class PaymentReceipientData {
    private String phonenumber;
    private String first_name;
    private String last_name;
    private String description;
    private int amount;

    public PaymentReceipientData() {
    }

    public PaymentReceipientData(String phonenumber, String first_name, String last_name, String description, int amount) {
        this.phonenumber = phonenumber;
        this.first_name = first_name;
        this.last_name = last_name;
        this.description = description;
        this.amount = amount;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
