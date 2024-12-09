package com.project.id.project.core.addresses.entities;

import com.project.id.project.core.Address;
import com.project.id.project.core.Id;
import net.minidev.json.JSONObject;

public class WorkAddress extends Address{
    public WorkAddress() {
    }

    public WorkAddress(Id id,
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