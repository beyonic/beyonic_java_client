package com.beyonic.models.request;

import java.util.HashMap;

/**
 * Created by jerryshikanga on  2019-04-28
 */
public class Contact {
    private String first_name;
    private String last_name;
    private String phone_number;
    private String email;
    private HashMap<String, String> metadata;

    public Contact() {
    }

    public Contact(String first_name, String last_name, String phone_number, String email, HashMap<String, String> metadata) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.email = email;
        this.metadata = metadata;
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashMap<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(HashMap<String, String> metadata) {
        this.metadata = metadata;
    }
}
