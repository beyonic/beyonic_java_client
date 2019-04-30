package com.beyonic.models.request;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by jerryshikanga on  2019-04-28
 */
public class CollectionRequest {
    private String phonenumber; // Must be in international format
    private String first_name; // Optional subscriber first name - if omitted, the first name will be set to ‘Anonymous’
    private String last_name; // Optional subscriber last name - if omitted, the last name will be set to 'Contact’
    private Float amount; // Do not include thousands separators
    private String currency; // 3 letter ISO currency code. No currency conversion is done, so the currency must be valid for the selected phonenumber. You must have funded Beyonic an account in this currency. If your account for this currency has zero balance, your payment will fail. Note:: BXC is the Beyonic Test Currency code.
    private String reason; // The reason for this collection request. This is used when sending automated instructions to the customer. If you omit this field, it will be set to your company name. Please keep this field below 20 characters because some networks may truncate it. You are also advised to include your company name so that it’s clear who is requesting the funds.
    private HashMap<String, String> metadata; // Custom attributes to store with this object.

    /* Parameters new in V2 */
    private String success_message; // New in V2. This message will be sent via SMS to the subscriber when they make a payment for this collection request. ’-Powered by Beyonic’ shall be appended to this message. If you leave this message out, a default message shall be sent by Beyonic. You can include {amount} and {customer} placeholders - these will be replaced with the amount and customer name or number details before the message is sent.
    private boolean send_instructions; // New in V2. Defaults to False (but you probably want to set this to True). Indicates whether we should send payment instructions to the subscriber via SMS. Note that this field defaults to False, so if you want the collection request to actually notify the customer (with a USSD popup and an SMS), you must set this field to True. Omitting the field will prevent collection requests from being sent out to the customer.
    private String instructions; // New in V2. Allows overriding of the default instructions sent to the subscriber. If omitted, default network-specific instructions will be sent to the subscriber via SMS. If you want to skip sending ANY sms instructions and turn off even the default instructions, set this parameter to “skip” (instructions = “skip”)
    private Date expiry_date; // Defaults to “24 hours”. Specifies the date and time when this collection request will be marked as expired. Examples of valid values for this field include strings such as “tomorrow”, “24 hours”, “2 minutes”, or %d/%m/%Y format e.g 24/05/2019 or %d/%m/%Y %H:%M:%S format e.g 24/05/2019 13:24:12

    public CollectionRequest() {
    }

    public CollectionRequest(String phonenumber, String first_name, String last_name, Float amount, String currency, String reason, HashMap<String, String> metadata, String success_message, boolean send_instructions, String instructions, Date expiry_date) {
        this.phonenumber = phonenumber;
        this.first_name = first_name;
        this.last_name = last_name;
        this.amount = amount;
        this.currency = currency;
        this.reason = reason;
        this.metadata = metadata;
        this.success_message = success_message;
        this.send_instructions = send_instructions;
        this.instructions = instructions;
        this.expiry_date = expiry_date;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public HashMap<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(HashMap<String, String> metadata) {
        this.metadata = metadata;
    }

    public String getSuccess_message() {
        return success_message;
    }

    public void setSuccess_message(String success_message) {
        this.success_message = success_message;
    }

    public boolean isSend_instructions() {
        return send_instructions;
    }

    public void setSend_instructions(boolean send_instructions) {
        this.send_instructions = send_instructions;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }
}
