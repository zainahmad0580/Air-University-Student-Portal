package com.example.semesterproject;

public class DataBean {
    int image;
    String langName;

    public DataBean() {
    }

    public DataBean(int image, String langName) {
        super();
        this.image = image;
        this.langName=langName;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
    public String getLangName() {
        return langName;
    }
    public void setLangName(String langName) {
        this.langName = langName;
    }
}
