package com.amisoft.dto;

/**
 * Created by amitdatta on 26/07/17.
 */
public class UserEmail {

    private String userEmailId;
    private String message;

    public UserEmail(String userEmailId, String message) {
        this.userEmailId = userEmailId;
        this.message = message;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
