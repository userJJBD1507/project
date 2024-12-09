package com.project.id.project.core.emails.entities;

import com.project.id.project.core.Email;
import com.project.id.project.core.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "personal_email_table")
@Entity
public class PersonalEmail extends Email {
    public PersonalEmail() {
    }

    public PersonalEmail(Id id, String email) {
        super(id, email);
    }
}
