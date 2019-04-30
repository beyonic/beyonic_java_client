package com.beyonic.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by jerryshikanga on  2019-04-28
 */
public class Webhook extends BaseBeyonicResponseObject {
    @SerializedName("event")
    private String event;

    @SerializedName("target")
    private String target;

    @SerializedName("user")
    private Long user;

    public Webhook() {
    }

    public Webhook(Long id, Date created, Date modified, Long author, Long updated_by, Long organization, String event, String target, Long user) {
        super(id, created, modified, author, updated_by, organization);
        this.event = event;
        this.target = target;
        this.user = user;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }
}
