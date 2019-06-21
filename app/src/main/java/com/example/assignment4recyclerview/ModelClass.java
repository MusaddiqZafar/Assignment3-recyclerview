package com.example.assignment4recyclerview;

public class ModelClass {

    private int imageresource;
    private  String title;
    private String body;

    public ModelClass(int imageresource, String title, String body) {
        this.imageresource = imageresource;
        this.title = title;
        this.body = body;
    }

    public int getImageresource() {
        return imageresource;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
