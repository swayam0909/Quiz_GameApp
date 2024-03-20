package com.example.quizapp;

import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class withdrawRequest {
    private String userId;
    private String emailAddress;
    private String requestedBy;

    public withdrawRequest(String userId, String payPal, String name) {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @ServerTimestamp
    private Date createdAt;

}
