package com.myproject;

class Member extends LibraryPerson {
    private String memberID;

    public Member(String name, String memberID) {
        super(name);
        this.memberID = memberID;
    }


    public void performDuties() {
        System.out.println("Member borrowing and returning books.");
    }

    public String getMemberID() {
        return memberID;
    }


    public String toString() {
        return super.toString() + " | Member ID: " + memberID;
    }
}
