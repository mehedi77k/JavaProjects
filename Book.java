package com.myproject;

class Book {
    private String title; 
    private String author;
    private String bookID;
                         
    public Book(String title, String author, String bookID) {

        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    public String getBookID() {
    

        return bookID;
    }



    public String toString() {
        return title + " by " + author + " (ID: " + bookID + ")";
    }

}
