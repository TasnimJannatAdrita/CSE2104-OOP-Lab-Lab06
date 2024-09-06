/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personagain06;

public class PERSONAgain06 {

    // Properties (private fields)
    private String name;
    private int age;
    private String gender;
    private String address;

    // Constructor to initialize all properties
    public PERSONAgain06(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    // Default constructor
    public PERSONAgain06() {
        this("Unknown", 0, "Unknown", "Unknown"); // Default values
    }

    // Getter and Setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for 'age'
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) { // Validate age
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Getter and Setter for 'gender'
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter and Setter for 'address'
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + 
                           ", Gender: " + gender + ", Address: " + address);
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Creating an instance of Person using parameterized constructor
        PERSONAgain06 person1 = new PERSONAgain06("X", 30, "Female", "Tangail");

        // Displaying details
        System.out.println("Person 1:");
        person1.displayDetails();

        // Modifying properties using setter methods
        person1.setName("Y");
        person1.setAge(34);
        person1.setAddress("Munshiganj");

        // Displaying updated details
        System.out.println("\nUpdated Person 1:");
        person1.displayDetails();

        // Creating an instance of Person using default constructor
        PERSONAgain06 person2 = new PERSONAgain06();
        System.out.println("\nPerson 2 (Default Constructor):");
        person2.displayDetails();
        
        // Setting properties for person2
        person2.setName("Z");
        person2.setAge(29);
        person2.setGender("Male");
        person2.setAddress("Dinajpur");
        
        // Displaying updated details for person2
        System.out.println("\nUpdated Person 2:");
        person2.displayDetails();
    }
}
