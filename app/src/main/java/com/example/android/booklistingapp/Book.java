package com.example.android.booklistingapp;

public class Book {
    private String Image;
    private String Title;
    private String Author;
    private String PublishedDate;
    private String WebReaderLink;

    public Book( String img,String title ,String author, String publishedDate, String webReaderLink) {
        this.Image = img;
        this.Title = title;
        this.Author = author;
        this.PublishedDate = publishedDate;
        this.WebReaderLink = webReaderLink;
    }

    public String getImage() {
        return Image;
    }

    public String getAuthor() {
        return Author;
    }


    public String getTitle() {
        return Title;
    }

    public String getPublishedDate() {
        return PublishedDate;
    }

    public String getWebReaderLink() {
        return WebReaderLink;
    }
}
