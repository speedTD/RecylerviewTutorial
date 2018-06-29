package com.developer.dinhduy.recyclerview_tutorial;

import android.widget.ImageView;

public class Book {
    private String namebook;
    private String Title;
    private int Image;

    public Book(String namebook, String title, int image) {
        this.namebook = namebook;
        Title = title;
        Image = image;
    }

    public Book() {
    }

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
