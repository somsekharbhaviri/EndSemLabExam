package com.klef.jfsd.exam;


public class Instructor {
    private Integer instructorId;
    private String name;
    private String email;
    private String phoneNumber;

    public Integer getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Integer instructorId) {
        this.instructorId = instructorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Instructor [instructorId=" + instructorId + ", name=" + name + 
                ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
    }
}
