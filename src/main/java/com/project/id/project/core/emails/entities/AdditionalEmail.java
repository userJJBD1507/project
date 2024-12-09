package com.project.id.project.core.emails.entities;

import com.project.id.project.core.Email;
import com.project.id.project.core.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "additional_emails_table")
@Entity
public class AdditionalEmail extends Email {
    public AdditionalEmail() {
    }

    public AdditionalEmail(Id id, String email) {
        super(id, email);
    }

}
