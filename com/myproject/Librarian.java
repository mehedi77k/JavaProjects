package com.myproject;

public class Librarian {
    private String librarianID;
    String name;


    public Librarian(String name, String librarianID) {
        this.librarianID = librarianID;
        this.name = name;
    }


    public String getName() {
        return name;
    }



    public String getLibrarianID() {
        return librarianID;
    }


    public String toString() {
        return ("name: " + name) + (" Librarian ID: " + librarianID);
    }
}
