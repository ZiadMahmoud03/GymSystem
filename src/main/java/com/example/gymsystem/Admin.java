package com.example.gymsystem;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Admin extends Person {
    private String username;
    private String password;



    public Admin(String username, String password, String firstName,
                 String lastName, String nationalID, String gender, String phoneNumber) {
        super(firstName.toUpperCase(Locale.ROOT), lastName.toUpperCase(Locale.ROOT), nationalID, gender, phoneNumber);
        this.username = username;
        this.password = password;
    }

    public Admin(String firstName, String lastName, String nationalID, String gender) {
        super(firstName, lastName, nationalID, gender);
    }


    public boolean addEmployee(Employee employee, List<Person> gymEmployees) {
        for (int i = 0; i < gymEmployees.size(); i++) {
            Employee employee1 = (Employee) gymEmployees.get(i);
            if (employee1.getNationalID().equals(employee.getNationalID())){
                System.out.println("\nEmployee: " + employee.getFirstName() + " " +
                        employee.getLastName() + " Already Exists\n");
                return false;
            }
        }
        gymEmployees.add(employee);
        System.out.println("\nEmployee: " +employee.getFirstName() +" "+
                employee.getLastName() + " Successfully Added\n");
        return true;
    }

    public void editEmployee(Employee employee) {
        boolean run = true;
        String attribute = "";
        Scanner myScanner = new Scanner(System.in);
        while(run){
            System.out.println("First Name (FN)");
            System.out.println("Last Name (LN)");
            System.out.println("National ID (NID)");
            System.out.println("Gender (GR)");
            System.out.println("Phone Number (PN)");
            System.out.println("Please, choose what data do you want to edit in the employee or Q to exit");
            attribute = myScanner.nextLine().toUpperCase(Locale.ROOT);
            switch(attribute){
                case "FN" ->{
                    System.out.println("The current First Name is " + employee.getFirstName());
                    System.out.println("Enter the new name");
                    employee.setFirstName(myScanner.nextLine());
                }
                case "LN" -> {
                    System.out.println("The Current Last Name is " + employee.getLastName());
                    System.out.println("Enter the new name");
                    employee.setLastName(myScanner.nextLine());
                }
                case "NID"->{
                    System.out.println("The current National ID is " + employee.getNationalID());
                    System.out.println("Enter the new National ID");
                    employee.setNationalID(myScanner.nextLine());
                }
                case "GR" -> {
                    System.out.println("The current Gender is " + employee.getGender());
                    System.out.println("Enter the new Gender");
                    employee.setGender(myScanner.nextLine());
                }
                case "PN"->{
                    System.out.println("The current Phone Number is " + employee.getPhoneNumber());
                    System.out.println("Enter the new Phone Number");
                    employee.setPhoneNumber(myScanner.nextLine());
                }
                case "Q" ->{
                    run = false;
                }
            }

        }
    }

    public boolean deleteEmployee(Employee employee, List<Person> gymEmployees) {
        for (int i = 0; i < gymEmployees.size(); i++) {
            Employee employee1 = (Employee) gymEmployees.get(i);
            if (employee1.getNationalID().equals(employee.getNationalID())){
                gymEmployees.remove(employee);
                System.out.println("\nEmployee: " + employee.getFirstName() + " " +
                        employee.getLastName() + " Was Removed Successfully\n");
                return true;
            }
        }
        System.out.println("\nNo Such Employee: " +employee.getFirstName() +" "+
                employee.getLastName() + " was Found\n");
        return false;

    }

    public boolean addTrainer(Trainer trainer, List<Person> gymTrainers) {
        for (int i = 0; i < gymTrainers.size(); i++) {
            Trainer trainer1 = (Trainer) gymTrainers.get(i);
            if (trainer1.getNationalID().equals(trainer.getNationalID())){
                System.out.println("\nTrainer: " + trainer.getFirstName() +" "+
                        trainer.getLastName() +" Already Exists\n");
                return false;
            }
        }
        gymTrainers.add(trainer);
        System.out.println("\nTrainer: " + trainer.getFirstName() +" "+
                trainer.getLastName() +" Successfully Added\n");
        return true;
    }

    public void editTrainer(Trainer trainer) {
        boolean run = true;
        String attribute = "";
        Scanner myScanner = new Scanner(System.in);
        while(run){
            System.out.println("First Name (FN)");
            System.out.println("Last Name (LN)");
            System.out.println("National ID (NID)");
            System.out.println("Gender (GR)");
            System.out.println("Phone Number (PN)");
            System.out.println("Please, choose what data do you want to edit in the trainer or Q to exit");
            attribute = myScanner.nextLine().toUpperCase(Locale.ROOT);
            switch(attribute){
                case "FN" ->{
                    System.out.println("The current First Name is " + trainer.getFirstName());
                    System.out.println("Enter the new name");
                    trainer.setFirstName(myScanner.nextLine());
                }
                case "LN" -> {
                    System.out.println("The Current Last Name is " + trainer.getLastName());
                    System.out.println("Enter the new name");
                    trainer.setLastName(myScanner.nextLine());
                }
                case "NID"->{
                    System.out.println("The current National ID is " + trainer.getNationalID());
                    System.out.println("Enter the new National ID");
                    trainer.setNationalID(myScanner.nextLine());
                }
                case "GR" -> {
                    System.out.println("The current Gender is " + trainer.getGender());
                    System.out.println("Enter the new Gender");
                    trainer.setGender(myScanner.nextLine());
                }
                case "PN"->{
                    System.out.println("The current Phone Number is " + trainer.getPhoneNumber());
                    System.out.println("Enter the new Phone Number");
                    trainer.setPhoneNumber(myScanner.nextLine());
                }
                case "Q" ->{
                    run = false;
                }
            }

        }
    }

    public boolean deleteTrainer(Trainer trainer, List<Person> gymTrainers) {
        for (int i = 0; i < gymTrainers.size(); i++) {
            Trainer trainer1 = (Trainer) gymTrainers.get(i);
            if (trainer1.getNationalID().equals(trainer.getNationalID())){
                gymTrainers.remove(trainer);
                System.out.println("\nTrainer: " + trainer.getFirstName() +" "+
                        trainer.getLastName() +" Deleted\n");
                return true;
            }
        }
        System.out.println("\nNo Such Trainer " + trainer.getFirstName() +" "+
                trainer.getLastName() +" is Found\n");
        return false;

    }

    public boolean assignTrainerToClass(Trainer trainer, Classes myClass) {
        boolean validClass = true;
        for (int i = 0; i < trainer.getClasses().size(); i++) {
            if(trainer.getClasses().get(i).getDay().equals(myClass.getDay())
                    || trainer.getClasses().get(i).getTime().equals(myClass.getTime())){
               validClass = false;
            }
        }
        if(validClass){
            myClass.setTrainer(trainer);
            trainer.setClasses(myClass);
            System.out.println("\nTrainer assigned Successfully\n");
            return true;
        } else {
            System.out.println("\nTrainer Already Assigned\n");
            return false;
        }
    }


    public boolean assignTrainerToMember (Trainer trainer, Member member) {
        if (member.getAssignedTrainer() == null) {
            member.setAssignedTrainer(trainer);
            trainer.getMembers().add(member);
            System.out.println("\nTrainer assigned Successfully\n");
            return true;
        }else {
            if (member.getAssignedTrainer() == trainer){
                System.out.println("\nTrainer Already Assigned\n");
                return false;
            }else {
                member.setAssignedTrainer(trainer);
                trainer.getMembers().add(member);
                System.out.println("\nTrainer assigned Successfully\n");
                return true;
            }
        }
    }

    public boolean openClass (Classes myClass, List<Classes> gymClasses) {
        for (Classes classes1 : gymClasses){
            if (classes1.getName().equals(myClass.getName())){
                System.out.println("\nClass: " + myClass.getName() + " Already Exists\n");
                return false;
            }
        }
        gymClasses.add(myClass);
        System.out.println("\nClass: " + myClass.getName() + " was Opened Successfully\n");
        return true;
    }

    public void editClass(Classes myClass) {
        boolean run = true;
        String attribute = "";
        Scanner myScanner = new Scanner(System.in);
        while(run){
            System.out.println("Class Name (CN)");
            System.out.println("Class Description (CD)");
            System.out.println("Class Day (CDA)");
            System.out.println("Class Time (CT)");
            System.out.println("Class Duration (CDU)");
            System.out.println("Class Max Member Count (CMM)");
            System.out.println("Please, choose what data do you want to edit in the trainer or Q to exit");
            attribute = myScanner.nextLine().toUpperCase(Locale.ROOT);
            switch(attribute){
                case "CN" ->{
                    System.out.println("The current Name is " + myClass.getName());
                    System.out.println("Enter the new name");
                    myClass.setName(myScanner.nextLine());
                }
                case "CD" -> {
                    System.out.println("The Current Description is " + myClass.getDescription());
                    System.out.println("Enter the new Description");
                    myClass.setDescription(myScanner.nextLine());
                }
                case "CDA"->{
                    System.out.println("The current Day is " + myClass.getDay());
                    System.out.println("Enter the new Day");
                    myClass.setDay(myScanner.nextLine());
                }
                case "CT" -> {
                    System.out.println("The current Time is " + myClass.getTime());
                    System.out.println("Enter the new Time");
                    myClass.setTime(myScanner.nextLine());
                }
                case "CDU" -> {
                    System.out.println("The current Duration is " + myClass.getDuration());
                    System.out.println("Enter the new Time");
//                    myClass.setDuration(myScanner.nextLine());
                }
                case "CMM"->{
                    System.out.println("The current max member count is " + myClass.getMaxMemberCount());
                    System.out.println("Enter the new max member count");
                    myClass.setMaxMemberCount(myScanner.nextInt());
                    myScanner.nextLine();
                }
                case "Q" ->{
                    run = false;
                }
            }

        }
    }

    public boolean deleteClass(Classes myClass, List<Classes> gymClasses) {
        for (Classes classes1 : gymClasses){
            if (classes1.getName().equals(myClass.getName())){
                System.out.println("\nClass: " + myClass.getName() + " was Removed\n");
                gymClasses.remove(myClass);
                return true;
            }
        }
        System.out.println("\nNo Such Class " + myClass.getName() + " is Found\n");
        return false;
    }

    public List<Member> viewMembersInSpecificClass (Classes myClass) {

        if (!myClass.getMembers().isEmpty()) {
            return myClass.getMembers();
        }else {
            System.out.println("There are no members currently in the class");
        }
        return myClass.getMembers();
    }

    public List<Member> viewMembersInSpecificMembership (String membership, List<Person> gymMembers) {
        List<Member> membersInSpecificMemberShip = new ArrayList<>();

        for (int i = 0; i < gymMembers.size(); i++) {
            Member member = (Member) gymMembers.get(i);
            if (member.getMembershipType().equals(membership)){
                membersInSpecificMemberShip.add(member);
            }
        }
        if (!membersInSpecificMemberShip.isEmpty()) {
            return  membersInSpecificMemberShip;

        }else {
            System.out.println("There are no members in this membership");
        }
        return membersInSpecificMemberShip;
    }

    public void viewAllMembers(List<Person> gymMembers) {
        if (!gymMembers.isEmpty()) {
            System.out.println("\n---------------------------------------------------------------------" +
                    "-------------------------------------------------------------\n");
            System.out.format("%16s%16s%16s\n", "First Name",
                    "Last Name",
                    "National ID");

            for (Person member : gymMembers) {
                System.out.format("%16s%16s%16s\n", member.getFirstName(),
                        member.getLastName(),
                        member.getNationalID());
            }
            System.out.println("\n---------------------------------------------------------------------" +
                    "-------------------------------------------------------------\n");
        }else {
            System.out.println("There are no members currently add members to view");
        }
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
}