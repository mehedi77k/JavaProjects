package com.myproject;

class Librarian extends LibraryPerson {
    private String librarianID;

    public Librarian(String name, String librarianID) {
        super(name);
        this.librarianID = librarianID;
    }


    public void performDuties() {
        System.out.println("Librarian managing the library.");
    }

    public String getLibrarianID() {
        return librarianID;
    }


    public String toString() {
        return super.toString() + " | Librarian ID: " + librarianID;
    }
}