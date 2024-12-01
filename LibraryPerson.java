package com.myproject;

abstract class LibraryPerson {
     private String name;

     public LibraryPerson(String name) {
        this.name = name;
    }

     public abstract void performDuties();

      public String getName() {
        return name;
    }


    public String toString() {
        return "Name: " + name;
    }
}
