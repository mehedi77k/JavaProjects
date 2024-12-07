package com.myproject;

class Member {
    private String memberID;
    public String name;

    public Member(String name, String memberID) {

        this.memberID = memberID;
        this.name=name;

    }
    public String getName() {
        return name;
    }

    public String getMemberID() {
        return memberID;
    }


    public String toString() {
        return "Member Name: "+name+  " | Member ID: " + memberID;
    }
}
}
