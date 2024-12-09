package com.project.id.project.core.addresses.entities;

import com.project.id.project.core.Address;
import com.project.id.project.core.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "home_address_table")
public class HomeAddress extends Address {
    public HomeAddress() {
    }

    public HomeAddress(Id id,
                       String name,
                       String city,
                       String region,
                       String street,
                       int house,
                       int subway,
                       int floor,
                       int apartment,
                       int intercom) {
        super(id, name, city, region, street, house, subway, floor, apartment, intercom);
    }
}
