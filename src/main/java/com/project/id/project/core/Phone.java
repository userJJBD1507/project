package com.project.id.project.core;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Phone {
    @EmbeddedId
    @Column(name = "id")
    private Id id;
    @Column(name = "phone_number")
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
