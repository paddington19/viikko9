package com.example.v9oikea;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;
    protected String id;



    public User(String firstName) {
        this.firstName = firstName;
        id = "NCC-" + (int)(Math.random() * 90000 + 1000);
    }




    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }


    public String getId() {
        return this.id;
    }
}
