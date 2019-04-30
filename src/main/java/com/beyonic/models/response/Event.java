package com.beyonic.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by jerryshikanga on  2019-04-27
 */
public class Event extends BaseBeyonicResponseObject {
    @SerializedName("type")
    private String type;

    @SerializedName("data")
    private Object data;

    public Event() {
    }

    public Event(Long id, Date created, Date modified, Long author, Long updated_by, Long organization, String type, Object data) {
        super(id, created, modified, author, updated_by, organization);
        this.type = type;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
