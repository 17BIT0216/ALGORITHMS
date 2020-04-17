package com.company;

public class Contacts {

    private String name;
    private String phoneNum;


    public Contacts(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public Contacts createContact(String name, String phoneNum)
    {
        return Contacts(name,phoneNum);

    }


}

