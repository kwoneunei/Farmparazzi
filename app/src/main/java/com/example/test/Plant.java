package com.example.test;

public class Plant {
    private String id;
    private String name;
    private int image;
    private String feature;

    public Plant(String id, String name, int image,String feature){
        this.id=id;
        this.name=name;
        this.image=image;
        this.feature=feature;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getImage(){
        return image;
    }

    public void setImage(int image){
        this.image=image;
    }

    public String getFeature(){
        return feature;
    }

    public void setFeature(String feature){
        this.feature=feature;
    }
}
