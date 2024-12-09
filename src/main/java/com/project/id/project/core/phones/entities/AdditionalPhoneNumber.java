package com.project.id.project.core.phones.entities;

import com.project.id.project.core.Id;
import com.project.id.project.core.Phone;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "additional_phone_numbers_table")
public class AdditionalPhoneNumber extends Phone {
    public AdditionalPhoneNumber() {
    }

    public AdditionalPhoneNumber(Id id, String phoneNumber) {
        super(id, phoneNumber);
    }
}
