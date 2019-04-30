package com.beyonic.models.request;

/**
 * Created by jerryshikanga on  2019-04-28
 */
public class Webhook {
    private String event;
    private String target;

    public Webhook() {
    }

    public Webhook(String event, String target) {
        this.event = event;
        this.target = target;
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
}
