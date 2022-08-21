package com.bookstore;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("journey");
        book.setiSBN(1234567890L);
        book.setPrice(200);
        Author author =new Author();
        author.setAuthorName("niit");
        author.setAuthorPenName("Wave33");
        book.setAuthor(author);
        book.display();


    }
}
