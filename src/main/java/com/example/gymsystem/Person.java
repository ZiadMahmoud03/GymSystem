package com.example.gymsystem;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String nationalID;
    private String phoneNumber;
    private String gender;


    public Person(String firstName, String lastName,String nationalID, String gender, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalID = nationalID;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public Person(String table, String nationalID){

    }

    public Person(String firstName, String lastName, String nationalID, String gender) {
        this(firstName, lastName,nationalID,gender, "N/A");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
