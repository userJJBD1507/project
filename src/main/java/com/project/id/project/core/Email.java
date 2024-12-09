package com.project.id.project.core;

public abstract class Email {
    private Id id;
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
