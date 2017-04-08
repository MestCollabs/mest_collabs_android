package com.example.pianoafrik.mestcollabsapp.models;

/**
 * Created by Neville Masheti on 4/5/2017.
 */

public class Mester {

    public int id;
    public String email, name, profilePicture;

    public Mester(int id, String email, String name, String profilePicture) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}
