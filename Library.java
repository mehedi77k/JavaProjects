package com.myproject;

import java.util.ArrayList;
import java.util.Scanner;

class Library {
    Scanner input = new Scanner(System.in);

    private String name;
    private ArrayList<Book> books;
    private ArrayList<Librarian> librarians;
    private ArrayList<Member> members;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.librarians = new ArrayList<>();
        this.members = new ArrayList<>();

    }

    admin[] theAdmins = new admin[10];
    /*{Book book1 = new Book("Tithir Nil Toale", "Humayun Ahmed", "10");
    }*/

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.toString());
    }

    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian);
        System.out.println("Librarian added: " + librarian.getName());
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public void removeBook(String bookID) {
        Book removedBook = null;
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                removedBook = book;
                break;
            }
        }

        if (removedBook != null) {
            books.remove(removedBook);
            System.out.println("Book removed: " + removedBook.toString());
        } else {
            System.out.println("Book not found with ID: " + bookID);
        }
    }

    public void removeLibrarian(String librarianID) {
        Librarian removedLibrarian = null;
        for (Librarian librarian : librarians) {
            if (librarian.getLibrarianID().equals(librarianID)) {
                removedLibrarian = librarian;
                break;
            }
        }

        if (removedLibrarian != null) {
            librarians.remove(removedLibrarian);
            System.out.println("Librarian removed: " + removedLibrarian.getName());
        } else {
            System.out.println("Librarian not found with ID: " + librarianID);
        }
    }

    public void removeMember(String memberID) {
        Member removedMember = null;
        for (Member member : members) {
            if (member.getMemberID().equals(memberID)) {
                removedMember = member;
                break;
            }
        }

        if (removedMember != null) {
            members.remove(removedMember);
            System.out.println("Member removed: " + removedMember.getName());
        } else {
            System.out.println("Member not found with ID: " + memberID);
        }
    }

    public void showBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void showLibrarians() {
        System.out.println("Librarians:");
        for (Librarian librarian : librarians) {
            System.out.println(librarian);
        }
    }

    public void showMembers() {
        System.out.println("Library Members:");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public static int count=0;

    public void addAdmin(admin a)
    {
        for (int i = 0; i < count; i++) {

            if (a.regNum.equalsIgnoreCase(
                    theAdmins[i].regNum)) {

                // Print statement
                System.out.println(
                        "Admin of Reg Num " + a.regNum
                                + " is Already Registered.");

                return;
            }
        }
        if(a.getPin!=a.pin){
            System.out.println("!! WRONG PINCODE !!");
            return;
        }

        if (count <= 10) {
            theAdmins[count] = a;
            count++;
            System.out.println("ADMIN REGISTERD !");
        }
    }
    /*public void print(){
        System.out.println(theAdmins[0].name);
        System.out.printf(theAdmins[0].regNum);
    }*/

    public int Adminlogin() {
        // Display message only
        System.out.print("Enter Reg Number: ");

        String regNum = input.nextLine();
        System.out.print("\nEnter Password: ");
        String pass = input.nextLine();


        for (int i = 0; i < count; i++) {

            if (theAdmins[i].regNum.equalsIgnoreCase(regNum) &&
                    theAdmins[i].password.equals(pass)) {
                return 1;
            }

        }
        System.out.println("Librarian Not Registerd");
        return 0;
    }
}