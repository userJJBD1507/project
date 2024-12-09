package com.project.id.project.core;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Address {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Convert(converter = IdConverter.class)
    @Column(name = "id")
    private Id id;
    @Column(name = "")
    private String name;
    @Column(name = "")
    private String city;
    @Column(name = "")
    private String region;
    @Column(name = "")
    private String street;
    @Column(name = "")
    private int house;
    @Column(name = "")
    private int subway;
    @Column(name = "")
    private int floor;
    @Column(name = "")
    private int apartment;
    @Column(name = "")
    private int intercom;

    public Address() {
    }

    public Address(Id id,
                   String name,
                   String city,
                   String region,
                   String street,
                   int house,
                   int subway,
                   int floor,
                   int apartment,
                   int intercom) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.region = region;
        this.street = street;
        this.house = house;
        this.subway = subway;
        this.floor = floor;
        this.apartment = apartment;
        this.intercom = intercom;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getSubway() {
        return subway;
    }

    public void setSubway(int subway) {
        this.subway = subway;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public int getIntercom() {
        return intercom;
    }

    public void setIntercom(int intercom) {
        this.intercom = intercom;
    }
}
