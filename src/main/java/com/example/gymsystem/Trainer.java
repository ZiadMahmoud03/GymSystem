package com.example.gymsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Trainer extends Person {
    private List<Classes> classes;
    private List<Member> members;

    public Trainer(String firstName, String lastName, String nationalID, String gender, String phoneNumber) {
        super(firstName.toUpperCase(Locale.ROOT), lastName.toUpperCase(Locale.ROOT), nationalID, gender, phoneNumber);
        this.classes = new ArrayList<Classes>();
        this.members = new ArrayList<Member>();
    }

    public Trainer(String firstName, String lastName, String nationalID, String gender) {
        super(firstName.toUpperCase(Locale.ROOT), lastName.toUpperCase(Locale.ROOT), nationalID, gender);
        this.classes = new ArrayList<Classes>();
        this.members = new ArrayList<Member>();
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses (Classes classes) {
        this.classes.add(classes);
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }


}
