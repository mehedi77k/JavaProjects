package LabTask5;


    class Student{
        String  name;
        String city;
        int age;
        void insert(String n, String c, int a){
            name=n;
            city=c;
            age=a;
        }
        void printData(){
            System.out.println("Name: "+name);
            System.out.println("City: "+city);
            System.out.println("Age : "+age);
        }
    }

         public class Information {
             public static void main(String[] args) {
                 Student s1=new Student();
                 Student s2=new Student();
                 s1.insert("Mehedi Hasan", "Dhaka", 21);
                 s2.insert("Sadman Sakib", "Mirpur", 69);
                 s1.printData();
                 s2.printData();
             }

         }

