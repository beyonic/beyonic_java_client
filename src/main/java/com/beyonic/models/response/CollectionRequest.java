package com.beyonic.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by jerryshikanga on  2019-04-27
 */
public class CollectionRequest  extends com.beyonic.models.request.CollectionRequest {
    @SerializedName("id")
    private Long id; // Unique object identifier

    @SerializedName("organization")
    private Long organization; // The ID of the organization that owns this collection request (This is usually your organization ID)

    @SerializedName("created")
    private Date created; // The date that the collection request was created, in the UTC timezone. Format: “YYYY-MM-DDTHH:MM:SSZ”

    @SerializedName("author")
    private Long author; // The ID of the user who created the collection request

    @SerializedName("modified")
    private Date modified; // The date that the collection request was last modified, in the UTC timezone. Format: “YYYY-MM-DDTHH:MM:SSZ”

    @SerializedName("updated_by")
    private Long updated_by; // The ID of the user who last updated the collection request

    @SerializedName("collection")
    private Long collection; // The ID of the collection that fulfilled the collection request, if any

    @SerializedName("status")
    private String status; // This is the status of the collection request. Possible values are: pending, successful, failed, expired or reversed

    @SerializedName("error_message")
    private String error_message; // This will contain a short description in case of an error

    @SerializedName("error_details")
    private String error_details; // This will contain an detailed description in case of an error

    public CollectionRequest() {
    }

    public CollectionRequest(String phonenumber, String first_name, String last_name, Float amount, String currency, String reason, HashMap<String, String> metadata, String success_message, boolean send_instructions, String instructions, Date expiry_date, Long id, Long organization, Date created, Long author, Date modified, Long updated_by, Long collection, String status, String error_message, String error_details) {
        super(phonenumber, first_name, last_name, amount, currency, reason, metadata, success_message, send_instructions, instructions, expiry_date);
        this.id = id;
        this.organization = organization;
        this.created = created;
        this.author = author;
        this.modified = modified;
        this.updated_by = updated_by;
        this.collection = collection;
        this.status = status;
        this.error_message = error_message;
        this.error_details = error_details;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrganization() {
        return organization;
    }

    public void setOrganization(Long organization) {
        this.organization = organization;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getAuthor() {
        return author;
    }

    public void setAuthor(Long author) {
        this.author = author;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Long getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(Long updated_by) {
        this.updated_by = updated_by;
    }

    public Long getCollection() {
        return collection;
    }

    public void setCollection(Long collection) {
        this.collection = collection;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public String getError_details() {
        return error_details;
    }

    public void setError_details(String error_details) {
        this.error_details = error_details;
    }
}
