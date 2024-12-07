package com.myproject;
import java.util.Scanner;
public class MyProject {

    public static void main(String[] args) {
        Library library = new Library("Central Library");
        Scanner scanner = new Scanner(System.in);
        int primary_choice;


        boolean b = true;
        boolean b2=true;
        while (b) {
            System.out.println("1.LOGIN\n2.REGISTER");
            primary_choice =scanner.nextInt();
            switch (primary_choice){
                case 1:
                    int reminder=library.Adminlogin();
                    if(reminder==1) {
                        while (b2) {
                            System.out.println("Library Management System Menu:");
                            System.out.println("1. Add Book");
                            System.out.println("2. Add Librarian");
                            System.out.println("3. Add Member");
                            System.out.println("4. Remove Book");
                            System.out.println("5. Remove Librarian");
                            System.out.println("6. Remove Member");
                            System.out.println("7. View Books");
                            System.out.println("8. View Librarians");
                            System.out.println("9. View Members");
                            System.out.println("10. Search By Book Tittle");
                            System.out.println("0. Exit");
                            System.out.print("Enter your Choice: ");

                            int choice = scanner.nextInt();
                            scanner.nextLine();

                            switch (choice) {
                                case 1:
                                    System.out.print("Enter Book title: ");
                                    String bookTitle = scanner.nextLine();
                                    System.out.print("Enter Book author: ");
                                    String author = scanner.nextLine();
                                    System.out.print("Enter Book ID: ");
                                    String bookID = scanner.nextLine();
                                    Book book = new Book(bookTitle, author, bookID);
                                    library.addBook(book);
                                    break;

                                case 2:
                                    System.out.print("Enter Librarian's name: ");
                                    String librarianName = scanner.nextLine();
                                    System.out.print("Enter Librarian's ID: ");
                                    String librarianID = scanner.nextLine();
                                    Librarian librarian = new Librarian(librarianName, librarianID);
                                    library.addLibrarian(librarian);
                                    break;

                                case 3:
                                    System.out.print("Enter Member's name: ");
                                    String memberName = scanner.nextLine();
                                    System.out.print("Enter Member's ID: ");
                                    String memberID = scanner.nextLine();
                                    Member member = new Member(memberName, memberID);
                                    library.addMember(member);
                                    break;

                                case 4:
                                    System.out.print("Enter the ID of the Book to remove: ");
                                    String bookIDToRemove = scanner.nextLine();
                                    library.removeBook(bookIDToRemove);
                                    break;

                                case 5:
                                    System.out.print("Enter the ID of the Librarian to remove: ");
                                    String librarianIDToRemove = scanner.nextLine();
                                    library.removeLibrarian(librarianIDToRemove);
                                    break;

                                case 6:
                                    System.out.print("Enter the ID of the Member to remove: ");
                                    String memberIDToRemove = scanner.nextLine();
                                    library.removeMember(memberIDToRemove);
                                    break;

                                case 7:
                                    library.showBooks();
                                    break;

                                case 8:
                                    library.showLibrarians();
                                    break;

                                case 9:
                                    library.showMembers();
                                    break;
                                case 10:
                                    System.out.print("Enter Title of the book to search: ");
                                    String title = scanner.nextLine();

                                    Book foundBook = library.searchBookByTitle(title);
                                    if (foundBook != null) {
                                        System.out.println("Book found: " + foundBook);
                                    } else {
                                        System.out.println("Book not found.");
                                    }


                                case 0:
                                    b = false;
                                    break;

                                default:
                                    System.out.println("Invalid choice. Please choose a valid option.");
                                    break;
                            }
                        }
                    }
                    break;

                case 2:
                    admin a=new admin();
                    library.addAdmin(a);
                    break;
            }
        }
        scanner.close();
        System.out.println("Library Management System has been exited.");
    }
}






