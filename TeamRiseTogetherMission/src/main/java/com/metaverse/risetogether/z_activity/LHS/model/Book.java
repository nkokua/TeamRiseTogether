package com.ohgiraffers.z_activity.mission.LHS.model;

public class Book {
    private String title;
    private String name;

    public Book(String title, String author) {
        this.title = title;
        this.name = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return name;
    }

    public void setAuthor(String author) {
        this.name = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + name + '\'' +
                '}';
    }
}
