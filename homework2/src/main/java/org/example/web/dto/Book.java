package org.example.web.dto;

import javax.validation.constraints.*;

public class Book {
    private Integer id;
    @NotBlank(message = "Author cannot be empty")
    private String author;
    @NotBlank(message = "Title cannot be empty")
    private String title;
    @NotNull(message = "Size cannot be empty")
    @Positive(message = "Size must be positive digit")
    @Digits(message = "Size must less than 4 signs", integer = 4, fraction = 0)
    private Integer size;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", size=" + size +
                '}';
    }
}