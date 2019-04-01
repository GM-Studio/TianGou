package com.taingou.entity;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -3203812478312895495L;

    private long userId;
    private String userName;
    private String userPassWord;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassWord='" + userPassWord + '\'' +
                '}';
    }
}
