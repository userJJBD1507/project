package com.project.id.project.core.personal;

import com.project.id.project.core.Id;
import com.project.id.project.core.IdConverter;
import com.project.id.project.core.utils.Gender;
import jakarta.persistence.*;

@Entity
@Table(name = "personal_data_table")
public class PersonalData {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Convert(converter = IdConverter.class)
    @Column(name = "id")
    private Id id;
    @Column(name = "")
    private String avatar;
    @Column(name = "invocation")
    private String invocation;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "gender")
    private Gender gender;
    @Column(name = "birthdate")
    private String birthdate;
    @Column(name = "locality")
    private String locality;
    @Column(name = "time_zone")
    private String timeZone;

    public PersonalData() {
    }

    public PersonalData(Id id,
                        String avatar,
                        String invocation,
                        String name,
                        String surname,
                        Gender gender,
                        String birthdate,
                        String locality,
                        String timeZone) {
        this.id = id;
        this.avatar = avatar;
        this.invocation = invocation;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.locality = locality;
        this.timeZone = timeZone;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getInvocation() {
        return invocation;
    }

    public void setInvocation(String invocation) {
        this.invocation = invocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
