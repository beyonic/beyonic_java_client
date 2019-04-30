package com.beyonic.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by jerryshikanga on  2019-04-27
 */
public class Account extends BaseBeyonicResponseObject {
    @SerializedName("balance")
    private Float balance;

    @SerializedName("currency")
    private String currency;

    @SerializedName("status")
    private String status;

    public Account() {
    }

    public Account(Long id, Long organization, Float balance, String currency, String status, Date created, Long author, Date modified, Long updated_by) {
        super(id, created, modified, author, updated_by, organization);
        this.balance = balance;
        this.currency = currency;
        this.status = status;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
