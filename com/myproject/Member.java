package com.myproject;

public class Member {
    private String memberID;
    public String name;



    public Member(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
    }

    public String getName() {

        return name;
    }


    public String getMemberID()
    {
        return memberID;
    }


    public String toString() {

        return ("Name: " + name) + (" ID: " + memberID);
    }
}
