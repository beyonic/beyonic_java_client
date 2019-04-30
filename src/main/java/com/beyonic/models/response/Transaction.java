package com.beyonic.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by jerryshikanga on  2019-04-28
 */
public class Transaction extends BaseBeyonicResponseObject {
    @SerializedName("id")
    private Long id;

    @SerializedName("account")
    private Long account;

    @SerializedName("amount")
    private Float amount;

    @SerializedName("description")
    private String description;

    @SerializedName("created")
    private Date created;

    @SerializedName("type")
    private String type;

    public Transaction() {
    }

    public Transaction(Long id, Long account, Float amount, String description, Date created, String type) {
        this.id = id;
        this.account = account;
        this.amount = amount;
        this.description = description;
        this.created = created;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
