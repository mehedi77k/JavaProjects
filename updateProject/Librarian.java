package com.myproject; // Define the package for this file

public class Librarian {
    private String librarianID;
    String name;

    // Constructor to initialize the Librarian object with name and ID
    public Librarian(String name, String librarianID) {
        this.librarianID = librarianID;
        this.name = name;
    }

    // Getter method to retrieve the librarian's name
    public String getName() {
        return name;
    }



    // Getter method to retrieve the librarian's ID
    public String getLibrarianID() {
        return librarianID;
    }

    // Override the toString method to provide a string representation of the Librarian object
    public String toString() {
        return ("name: " + name) + (" Librarian ID: " + librarianID);
    }
}
