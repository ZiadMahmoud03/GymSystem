package com.example.gymsystem;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Employee extends Person {
    private String username;
    private String password;

    public Employee(String username, String password,String firstName, String lastName, String nationalID, String gender, String phoneNumber) {
        super(firstName.toUpperCase(Locale.ROOT), lastName.toUpperCase(Locale.ROOT), nationalID, gender, phoneNumber);
        this.username = username;
        this.password = password;
    }

    public Employee(String firstName, String lastName, String nationalID, String gender) {
        super(firstName.toUpperCase(Locale.ROOT), lastName.toUpperCase(Locale.ROOT), nationalID, gender);
    }



    public boolean register(List<Person> gymEmployees) {
        for (int i = 0; i < gymEmployees.size(); i++) {
            Employee employee1 = (Employee) gymEmployees.get(i);
            if (employee1.getNationalID().equals(this.getNationalID())){
                System.out.println("\nEmployee: " + this.getFirstName() + " " +
                        this.getLastName() + " Already Exists\n");
                return false;
            }
        }
        gymEmployees.add(this);
        System.out.println("\nEmployee: " + this.getFirstName() +" "+
                this.getLastName() + " Successfully Added\n");
        return true;
    }




    public boolean addMember(Member member, List<Person> gymMembers){
        for (int i = 0; i < gymMembers.size(); i++) {
            Member member1 = (Member) gymMembers.get(i);
            if (member1.getNationalID().equals(member.getNationalID())){
                System.out.println("\nMember: " + member.getFirstName() + " " +
                        member.getLastName() + " Already Exists\n");
                return false;
            }
        }
        gymMembers.add(member);
        System.out.println("\nMember: " +member.getFirstName() +" "+
                member.getLastName() + " Successfully Added\n");
        return true;

    }

    public void editMember(Member member){
        boolean run = true;
        String attribute = "";
        Scanner myScanner = new Scanner(System.in);
        while(run){
            System.out.println("First Name (FN)");
            System.out.println("Last Name (LN)");
            System.out.println("National ID (NID)");
            System.out.println("Gender (GR)");
            System.out.println("Phone Number (PN)");
            System.out.println("Membership Type (MT)");
            System.out.println("Please, choose what data do you want to edit in the member or Q to exit");
            attribute = myScanner.nextLine().toUpperCase(Locale.ROOT);
            switch(attribute){
                case "FN" ->{
                    System.out.println("The current First Name is " + member.getFirstName());
                    System.out.println("Enter the new name");
                    member.setFirstName(myScanner.nextLine().toUpperCase(Locale.ROOT));
                }
                case "LN" -> {
                    System.out.println("The Current Last Name is " + member.getLastName());
                    System.out.println("Enter the new name");
                    member.setLastName(myScanner.nextLine().toUpperCase(Locale.ROOT));
                }
                case "NID"->{
                    System.out.println("The current National ID is " + member.getNationalID());
                    System.out.println("Enter the new National ID");
                    member.setNationalID(myScanner.nextLine());
                }
                case "GR" -> {
                    System.out.println("The current Gender is " + member.getGender());
                    System.out.println("Enter the new Gender");
                    member.setGender(myScanner.nextLine());
                }
                case "PN"->{
                    System.out.println("The current Phone Number is " + member.getPhoneNumber());
                    System.out.println("Enter the new Phone Number");
                    member.setPhoneNumber(myScanner.nextLine());
                }
                case "MT"-> {
                    System.out.println("The current Membership Type is " + member.getMembershipType());
                    System.out.println("Enter the new Membership");
                    System.out.println("Pay as you go");
                    System.out.println("Open membership");
                    System.out.println("Term membership");
                    member.setMembershipType(myScanner.nextLine().toUpperCase(Locale.ROOT));
                }
                case "Q" ->{
                    run = false;
                }
            }

        }
    }

    public boolean deleteMember(Member member, List<Person> gymMembers){
        for (int i = 0; i < gymMembers.size(); i++) {
            Member member1 = (Member) gymMembers.get(i);
            if (member1.getNationalID().equals(member.getNationalID())){
                gymMembers.remove(member);
                System.out.println("\nMember: " + member.getFirstName() + " " +
                        member.getLastName() + " Was Removed Successfully\n");
                return true;
            }
        }
        System.out.println("\nNo Such Member: " +member.getFirstName() +" "+
                member.getLastName() + " was Found\n");
        return false;
    }

    public boolean addMemberToClass (Member member, Classes myClass){
        if(myClass.getMembers().size() < myClass.getMaxMemberCount()){
            myClass.addMembersToClass(member);
            member.setClasses(myClass);
            return true;
        }else {
            System.out.println("\nClass is full\n");
            return false;
        }

    }

    public boolean removeMemberFromClass (Member member, Classes myClass){
        if(myClass.getMembers().size() < myClass.getMaxMemberCount()) {
            myClass.getMembers().remove(member);
            return true;
        } else {
            return false;
        }
    }

    public List<Member> viewMembersInClass (Classes myClass){
        for(Member member: myClass.getMembers()){
            return myClass.getMembers();
        }
        return myClass.getMembers();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
