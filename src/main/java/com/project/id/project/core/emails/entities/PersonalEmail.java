package com.project.id.project.core.emails.entities;

import com.project.id.project.core.Email;
import com.project.id.project.core.Id;

public class PersonalEmail extends Email {
    public PersonalEmail() {
    }

    public PersonalEmail(Id id, String email) {
        super(id, email);
    }
}
