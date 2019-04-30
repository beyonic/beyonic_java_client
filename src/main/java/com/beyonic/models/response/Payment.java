package com.beyonic.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jerryshikanga on  2019-04-27
 */
public class Payment extends BaseBeyonicResponseObject {
    @SerializedName("amount")
    private Float amount;

    @SerializedName("currency")
    private String currency;

    @SerializedName("account")
    private Long account;

    @SerializedName("payment_type")
    private String payment_type;

    @SerializedName("metadata")
    private HashMap<String, String > metadata;

    @SerializedName("description")
    private String description;

    @SerializedName("")
    private List<String> phone_nos;

    @SerializedName("state")
    private String state;

    @SerializedName("last_error")
    private String last_error;

    @SerializedName("rejected_reason")
    private String rejected_reason;

    @SerializedName("rejected_by")
    private Long rejected_by;

    @SerializedName("rejected_time")
    private Date rejected_time;

    @SerializedName("cancelled_reason")
    private String cancelled_reason;

    @SerializedName("cancelled_by")
    private Long cancelled_by;

    @SerializedName("cancelled_time")
    private Date cancelled_time;

    @SerializedName("start_date")
    private Date start_date;

    @SerializedName("charged_fee")
    private Float charged_fee;

    public Payment() {
    }

    public Payment(Long id, Date created, Date modified, Long author, Long updated_by, Long organization, Float amount, String currency, Long account, String payment_type, HashMap<String, String> metadata, String description, List<String> phone_nos, String state, String last_error, String rejected_reason, Long rejected_by, Date rejected_time, String cancelled_reason, Long cancelled_by, Date cancelled_time, Date start_date, Float charged_fee) {
        super(id, created, modified, author, updated_by, organization);
        this.amount = amount;
        this.currency = currency;
        this.account = account;
        this.payment_type = payment_type;
        this.metadata = metadata;
        this.description = description;
        this.phone_nos = phone_nos;
        this.state = state;
        this.last_error = last_error;
        this.rejected_reason = rejected_reason;
        this.rejected_by = rejected_by;
        this.rejected_time = rejected_time;
        this.cancelled_reason = cancelled_reason;
        this.cancelled_by = cancelled_by;
        this.cancelled_time = cancelled_time;
        this.start_date = start_date;
        this.charged_fee = charged_fee;
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

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public HashMap<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(HashMap<String, String> metadata) {
        this.metadata = metadata;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getPhone_nos() {
        return phone_nos;
    }

    public void setPhone_nos(List<String> phone_nos) {
        this.phone_nos = phone_nos;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLast_error() {
        return last_error;
    }

    public void setLast_error(String last_error) {
        this.last_error = last_error;
    }

    public String getRejected_reason() {
        return rejected_reason;
    }

    public void setRejected_reason(String rejected_reason) {
        this.rejected_reason = rejected_reason;
    }

    public Long getRejected_by() {
        return rejected_by;
    }

    public void setRejected_by(Long rejected_by) {
        this.rejected_by = rejected_by;
    }

    public Date getRejected_time() {
        return rejected_time;
    }

    public void setRejected_time(Date rejected_time) {
        this.rejected_time = rejected_time;
    }

    public String getCancelled_reason() {
        return cancelled_reason;
    }

    public void setCancelled_reason(String cancelled_reason) {
        this.cancelled_reason = cancelled_reason;
    }

    public Long getCancelled_by() {
        return cancelled_by;
    }

    public void setCancelled_by(Long cancelled_by) {
        this.cancelled_by = cancelled_by;
    }

    public Date getCancelled_time() {
        return cancelled_time;
    }

    public void setCancelled_time(Date cancelled_time) {
        this.cancelled_time = cancelled_time;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Float getCharged_fee() {
        return charged_fee;
    }

    public void setCharged_fee(Float charged_fee) {
        this.charged_fee = charged_fee;
    }
}
