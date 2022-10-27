package com.example.MyBookShopApp.data;

public class Author {

    private String author;

    @Override
    public String toString() {
        return "Author{" +
                "author='" + author + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
