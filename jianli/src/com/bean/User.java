package com.bean;

public class User {

    String username;
    String password;
    String nickname;

    public User(String username, String password, String nickname)
    {
        this.nickname=nickname;
        this.username=username;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
