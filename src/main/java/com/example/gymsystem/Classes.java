package com.example.gymsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Classes {
    private String name;
    private Trainer trainer;
    private String day;
    private String time;
    private final static int duration = 1;
    private List<Member> members;
    private String description;
    private int maxMemberCount;

    public Classes(String name, Trainer trainer, String day,String time,
                   String description, int maxMemberCount) {
        this.name = name;
        this.trainer = trainer;
        this.day = day;
        this.time = time;
        this.description = description;
        this.members = new ArrayList<>();
        this.maxMemberCount = maxMemberCount;
    }

    public Classes (String name, String day,String time,
                    String description, int maxMemberCount){
        this.name = name;
        this.day = day;
        this.time = time;
//        this.duration = duration;
        this.description = description;
        this.members = new ArrayList<>();
        this.maxMemberCount = maxMemberCount;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public String getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }


    public List<Member> getMembers() {
        return members;
    }

    public int getMaxMemberCount() {
        return maxMemberCount;
    }

    public void setMaxMemberCount(int maxMemberCount) {
        this.maxMemberCount = maxMemberCount;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }

    private Member findMember (String nationalID){
        if (!members.isEmpty()){
            for (Member member : members){
                if (member.getNationalID().equals(nationalID)){
                    return member;
                }
            }
        }
        return null;
    }

    public void addMembersToClass (Member member){
        if (findMember(member.getNationalID())  == null){
            members.add(member);
            System.out.println("Member Added Successfully");
        }else {
            System.out.println("Member Already Exist");
        }

    }


}

