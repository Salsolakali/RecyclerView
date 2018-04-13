package com.example.fernana6.recyclerview;

/**
 * Created by FernanA6 on 12-Apr-18.
 */

public class Persona {
    private String name, surname, email;

    public Persona(String name, String surname, String email){
        this.name = name;
        this.surname = surname;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


