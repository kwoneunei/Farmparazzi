package com.example.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class List_Item {
    private int profile;
    private String nickname;
    private String title;
    private Date date;
    private String content;

    public List_Item(int profile, String nickname, String title, Date date, String content) {
        this.profile = profile;
        this.nickname = nickname;
        this.title = title;
        this.date = date;
        this.content = content;
    }

    public int getProfile_image() {
        return profile;
    }

    public void setProfile_image(int profile_image) {
        this.profile = profile_image;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        // Format the date as a string before returning
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }

    public void setWrite_date(Date write_date) {
        this.date = write_date;
    }
}
