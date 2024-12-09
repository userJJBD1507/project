package com.project.id.project.core.phones.entities;

import com.project.id.project.core.Id;
import com.project.id.project.core.Phone;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "phone_numbers_table")
public class PhoneNumber extends Phone {
    public PhoneNumber() {
    }

    public PhoneNumber(Id id, String phoneNumber) {
        super(id, phoneNumber);
    }
}
