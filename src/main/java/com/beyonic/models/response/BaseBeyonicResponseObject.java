package com.beyonic.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by jerryshikanga on  2019-04-28
 */
public class BaseBeyonicResponseObject {
    @SerializedName("id")
    private Long id;

    @SerializedName("created")
    private Date created;

    @SerializedName("modified")
    private Date modified;

    @SerializedName("author")
    private Long author;

    @SerializedName("updated_by")
    private Long updated_by;

    @SerializedName("organization")
    private Long organization;

    BaseBeyonicResponseObject() {
    }

    BaseBeyonicResponseObject(Long id, Date created, Date modified, Long author, Long updated_by, Long organization) {
        this.id = id;
        this.created = created;
        this.modified = modified;
        this.author = author;
        this.updated_by = updated_by;
        this.organization = organization;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getOrganization() {
        return organization;
    }

    public void setOrganization(Long organization) {
        this.organization = organization;
    }
}
