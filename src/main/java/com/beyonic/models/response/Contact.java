package com.beyonic.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by jerryshikanga on  2019-04-28
 */
public class Contact extends com.beyonic.models.request.Contact {
    @SerializedName("id")
    private Long id;

    @SerializedName("organization")
    private Long organization;

    @SerializedName("type")
    private String type;

    @SerializedName("status")
    private String status;

    @SerializedName("created")
    private Date created;

    @SerializedName("modified")
    private Date modified;

    @SerializedName("author")
    private Long author;

    @SerializedName("updated_by")
    private Long updated_by;

    public Contact() {
    }

    public Contact(String first_name, String last_name, String phone_number, String email, HashMap<String, String> metadata, Long id, Long organization, String type, String status, Date created, Date modified, Long author, Long updated_by) {
        super(first_name, last_name, phone_number, email, metadata);
        this.id = id;
        this.organization = organization;
        this.type = type;
        this.status = status;
        this.created = created;
        this.modified = modified;
        this.author = author;
        this.updated_by = updated_by;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Long getAuthor() {
        return author;
    }

    public void setAuthor(Long author) {
        this.author = author;
    }

    public Long getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(Long updated_by) {
        this.updated_by = updated_by;
    }
}
