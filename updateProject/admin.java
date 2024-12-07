package com.myproject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class admin {
    Scanner input=new Scanner(System.in);
    String name;
    public String password;
    public static int pin=1613;
    public int getPin;
    public String regNum;

    admin(){
        System.out.print("Enter Your name: ");
        this.name=input.nextLine();
        System.out.print("Enter Registration Number: ");
        this.regNum=input.nextLine();
        System.out.print("Enter PIN Code: ");
        this.getPin=input.nextInt();
        input.nextLine();

        System.out.print("Enter Password: ");
        this.password=input.nextLine();
        try {
            FileWriter writer=new FileWriter("adminData.txt");
            writer.write("Admin Name: "+name+"\nRegistration Number: "+regNum+"\nPassword: "+password+"\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
