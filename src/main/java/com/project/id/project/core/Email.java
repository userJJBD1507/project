package com.project.id.project.core;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Email {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Convert(converter = IdConverter.class)
    @Column(name = "id")
    private Id id;
    @Column(name = "email")
    private String email;

    public Email() {
    }

    public Email(Id id, String email) {
        this.id = id;
        this.email = email;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
