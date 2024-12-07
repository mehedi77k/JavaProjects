package com.myproject;

class Book {
    private String title; //stores title of the book
    private String author;//store author name
    private String bookID;//store unique identifier of the book
    //private means this variables can be accessed directly in the book class
    public Book(String title, String author, String bookID) { //constractor and parameters
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    public String getBookID() {
        //public means this method can accessed outside of the class

        return bookID;//return the value of the instance variable
    }
    public String getTitle() {
        return title;
    }



    public String toString() {
        return title + " by " + author + " (ID: " + bookID + ")";
    }

}
