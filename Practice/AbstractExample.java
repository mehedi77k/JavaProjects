package Practice;
// Abstract class representing a general Employee
abstract class Employee {
    protected String name;    // Employee's name
    protected int age;        // Employee's age
    protected String gender;  // Employee's gender

    // Constructor to initialize common attributes of all employees
    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Abstract methods that will be implemented in subclasses
    public abstract double calculateSalary(); // Calculates salary (implementation depends on role)
    public abstract void displayEmployeeDetails(); // Displays employee details
}

// Manager class that extends Employee
class Manager extends Employee {
    protected double baseSalary; // Base salary for manager
    protected double bonus;      // Bonus for manager

    // Constructor to initialize Manager attributes
    public Manager(String name, int age, String gender, double baseSalary, double bonus) {
        super(name, age, gender); // Call the constructor of the Employee class
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Implementation of calculateSalary for Manager
    public double calculateSalary() {
        return baseSalary + bonus; // Total salary = base salary + bonus
    }

    // Implementation of displayEmployeeDetails for Manager
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Worker class that extends Employee
class Worker extends Employee {
    protected double hourlyRate;  // Pay per hour for the worker
    protected int hoursWorked;    // Number of hours worked

    // Constructor to initialize Worker attributes
    public Worker(String name, int age, String gender, double hourlyRate, int hoursWorked) {
        super(name, age, gender); // Call the constructor of the Employee class
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementation of calculateSalary for Worker
    public double calculateSalary() {
        return hourlyRate * hoursWorked; // Total salary = hourly rate * hours worked
    }

    // Implementation of displayEmployeeDetails for Worker
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// SalesPerson class that extends Manager
class SalesPerson extends Manager {
    protected double commissionRate; // Commission rate for salesperson

    // Constructor to initialize SalesPerson attributes
    public SalesPerson(String name, int age, String gender, double baseSalary, double bonus, double commissionRate) {
        super(name, age, gender, baseSalary, bonus); // Call the constructor of the Manager class
        this.commissionRate = commissionRate;
    }

    // Override calculateSalary to include commission
    public double calculateSalary() {
        return super.calculateSalary() + (super.calculateSalary() * commissionRate);
        // Total salary = (Base salary + bonus) + commission on total
    }

    // Override displayEmployeeDetails to include commission details
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails(); // Call the Manager's display method
        System.out.println("Commission Rate: " + commissionRate);
        System.out.println("Total Salary (including commission): " + calculateSalary());
    }
}

// Main class to test the program
class AbstractExample {
    public static void main(String[] args) {
        // Create an instance of Manager
        Employee manager = new Manager("John", 40, "Male", 5000, 1000);

        // Create an instance of Worker
        Employee worker = new Worker("Mary", 25, "Female", 20, 160);

        // Create an instance of SalesPerson
        Employee salesPerson = new SalesPerson("Bob", 45, "Male", 6000, 1500, 0.05);

        // Display details for Manager
        manager.displayEmployeeDetails();
        System.out.println();

        // Display details for Worker
        worker.displayEmployeeDetails();
        System.out.println();

        // Display details for SalesPerson
        salesPerson.displayEmployeeDetails();
    }
}
