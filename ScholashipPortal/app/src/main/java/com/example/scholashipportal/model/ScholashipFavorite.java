package com.example.scholashipportal.model;

public class ScholashipFavorite {
    int img;
    String name;
    String type;
    String deadline;
    String tag;

    public ScholashipFavorite(int img, String name, String type, String deadline, String tag) {
        this.img = img;
        this.name = name;
        this.type = type;
        this.deadline = deadline;
        this.tag = tag;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
