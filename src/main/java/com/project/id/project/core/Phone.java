package com.project.id.project.core;

public abstract class Phone {
    private Id id;
    private String phoneNumber;

    public Phone() {
    }

    public Phone(Id id, String phoneNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
