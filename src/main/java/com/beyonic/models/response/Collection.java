package com.beyonic.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by jerryshikanga on  2019-04-28
 */
public class Collection extends BaseBeyonicResponseObject {
    @SerializedName("remote_transaction_id")
    private String remote_transaction_id;

    @SerializedName("amount")
    private Float amount;

    @SerializedName("currency")
    private String currency;

    @SerializedName("phonenumber")
    private String phonenumber;

    @SerializedName("payment_date")
    private Date payment_date;

    @SerializedName("reference")
    private String reference;

    @SerializedName("status")
    private String status;

    /* new in V3 */
    private CollectionRequest collection_request;

    public Collection() {
    }

    public Collection(Long id, Date created, Date modified, Long author, Long updated_by, Long organization, String remote_transaction_id, Float amount, String currency, String phonenumber, Date payment_date, String reference, String status, CollectionRequest collection_request) {
        super(id, created, modified, author, updated_by, organization);
        this.remote_transaction_id = remote_transaction_id;
        this.amount = amount;
        this.currency = currency;
        this.phonenumber = phonenumber;
        this.payment_date = payment_date;
        this.reference = reference;
        this.status = status;
        this.collection_request = collection_request;
    }

    public String getRemote_transaction_id() {
        return remote_transaction_id;
    }

    public void setRemote_transaction_id(String remote_transaction_id) {
        this.remote_transaction_id = remote_transaction_id;
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

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CollectionRequest getCollection_request() {
        return collection_request;
    }

    public void setCollection_request(CollectionRequest collection_request) {
        this.collection_request = collection_request;
    }
}
