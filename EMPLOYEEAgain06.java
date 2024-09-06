/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeagain06;

public class EMPLOYEEAgain06 {

    // Private properties (fields)
    private String name;
    private int id;
    private double salary;
    private String designation;

    // Constructor to initialize all properties
    public EMPLOYEEAgain06(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    // Default constructor
    public EMPLOYEEAgain06() {
        this("Unknown", 0, 0.0, "Not Specified");
    }

    // Getter and Setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for 'salary'
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) { // Validate salary
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Getter and Setter for 'designation'
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + 
                           ", Salary: $" + salary + ", Designation: " + designation);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an instance of Employee using parameterized constructor
        EMPLOYEEAgain06 emp1 = new EMPLOYEEAgain06("MD. Jamil", 14016, 75000.00, "Texttile Engineering");

        // Displaying details
        System.out.println("Employee 1:");
        emp1.displayDetails();

        // Modifying properties using setter methods
        emp1.setName("MD. Faisal");
        emp1.setSalary(85000.00);
        emp1.setDesignation("Senior Textile Engineer");

        // Displaying updated details
        System.out.println("\nUpdated Employee 1:");
        emp1.displayDetails();

        // Creating an instance of Employee using default constructor
        EMPLOYEEAgain06 emp2 = new EMPLOYEEAgain06();
        System.out.println("\nEmployee 2 (Default Constructor):");
        emp2.displayDetails();

        // Setting properties for emp2
        emp2.setName("Tonmoy Hasan");
        emp2.setId(140120);
        emp2.setSalary(20000.00);
        emp2.setDesignation("Data Analyst");

        // Displaying updated details for emp2
        System.out.println("\nUpdated Employee 2:");
        emp2.displayDetails();
    }
}
