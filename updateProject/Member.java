package com.myproject; // Define the package name for this file

public class Member {
    private String memberID;
    public String name;


    // Constructor to initialize the Member object with name and ID
    public Member(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
    }

    // Getter method to retrieve the member's name
    public String getName() {
        return name;
    }


    // Getter method to retrieve the member's ID
    public String getMemberID() {
        return memberID;
    }

    // Override the toString method to provide a string representation of the Member object
    public String toString() {
        return ("Name: " + name) + (" ID: " + memberID);
    }
}
