package com.example.gymsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Member extends Person {
    private String membershipType;
    private String serialNo;
    private List<Classes> classes;
    private Trainer assignedTrainer;

    public Member(String firstName, String lastName, String nationalID, String gender, String phoneNumber
            , String membershipType) {
        super(firstName.toUpperCase(Locale.ROOT), lastName.toUpperCase(Locale.ROOT), nationalID, gender, phoneNumber);
        this.membershipType = membershipType.toUpperCase(Locale.ROOT);
        this.classes = new ArrayList<>();
        this.assignedTrainer = null;
        generateID();
    }

    public Member(String firstName, String lastName, String nationalID, String gender, String membershipType) {
        super(firstName.toUpperCase(Locale.ROOT), lastName.toUpperCase(Locale.ROOT), nationalID, gender);
        this.membershipType = membershipType.toUpperCase(Locale.ROOT);
        this.classes = new ArrayList<>();
        this.assignedTrainer = null;
        generateID();
    }



    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType.toUpperCase(Locale.ROOT);
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes.add(classes);
    }

    public Trainer getAssignedTrainer() {
        return assignedTrainer;
    }

    public void setAssignedTrainer(Trainer assignedTrainer) {
        this.assignedTrainer = assignedTrainer;
    }

    private void generateID(){
        int myID = (int) ((Math.random() * 9999999)  + 10000000);
        this.serialNo  = myID + "";
    }




}
