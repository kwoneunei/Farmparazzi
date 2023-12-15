package com.example.test;

import android.app.Activity;
import android.os.Bundle;

public class Rec_Plant {

    private String rec_id;
    private String rec_name;
    private int rec_image;

    public Rec_Plant(String rec_id, String rec_name, int rec_image){
        this.rec_id=rec_id;
        this.rec_name=rec_name;
        this.rec_image=rec_image;
    }

    public String getrecId(){
        return rec_id;
    }

    public void setrecId(String rec_id){
        this.rec_id=rec_id;
    }

    public String getrecName(){
        return rec_name;
    }

    public void setrecName(String rec_name){
        this.rec_name=rec_name;
    }

    public int getrecImage(){
        return rec_image;
    }

    public void setrecImage(int rec_image){
        this.rec_image=rec_image;
    }
}