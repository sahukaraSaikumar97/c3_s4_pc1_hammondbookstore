package com.bookstore;

public class Book {
    private long iSBN;
    private String title;
    private double price;
    private Author author;


    public long getiSBN() {
        return iSBN;
    }

    public void setiSBN(long iSBN) {
        this.iSBN = iSBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "iSBN=" + iSBN +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", author=" + author +
                '}';
    }

    public void display(){
        System.out.println("book isbn number = " + iSBN);
        System.out.println( "book title = "+ title);
        System.out.println("book price = " + price);
        System.out.println("author Name ="+author.getAuthorName());
        System.out.println("author Pen Name ="+author.getAuthorPenName());
    }
}
