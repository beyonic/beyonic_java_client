package com.beyonic.models.request;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jerryshikanga on  2019-04-28
 */
public class Payment {
    private String phonenumber;
    private String payment_type;
    private Float amount;
    private String currency;
    private int account;
    private String description;
    private String callback_url;
    private HashMap<String, String> metadata;
    private String first_name;
    private String last_name;
    private ArrayList<PaymentReceipientData> receipientData;

    public Payment() {
    }

    public Payment(String phonenumber, String payment_type, Float amount, String currency, int account, String description, String callback_url, HashMap<String, String> metadata, String first_name, String last_name, ArrayList<PaymentReceipientData> receipientData) {
        this.phonenumber = phonenumber;
        this.payment_type = payment_type;
        this.amount = amount;
        this.currency = currency;
        this.account = account;
        this.description = description;
        this.callback_url = callback_url;
        this.metadata = metadata;
        this.first_name = first_name;
        this.last_name = last_name;
        this.receipientData = receipientData;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
    }

    public HashMap<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(HashMap<String, String> metadata) {
        this.metadata = metadata;
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

    public ArrayList<PaymentReceipientData> getReceipientData() {
        return receipientData;
    }

    public void setReceipientData(ArrayList<PaymentReceipientData> receipientData) {
        this.receipientData = receipientData;
    }
}
