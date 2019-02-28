package com.example.biddutkumar.recyclerviewdemo;

public class User {

    private String Name;
    private String Gender;
    private String mobileNumber;
    private int profileImage;

    public User() {

    }

    public User(String name, String gender, String mobileNumber, int profileImage) {
        Name = name;
        Gender = gender;
        this.mobileNumber = mobileNumber;
        this.profileImage = profileImage;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getProfileImage() {
        return profileImage;
    }
}
