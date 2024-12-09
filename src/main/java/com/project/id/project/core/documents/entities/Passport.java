package com.project.id.project.core.documents.entities;

import com.project.id.project.core.Document;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "passport_table")
public class Passport extends Document {
    @Column(name = "series_number")
    private String seriesAndNumber;
    @Column(name = "place_of_birth")
    private String birthplace;
    @Column(name = "who_issued")
    private String whoIssued;
    @Column(name = "division_code")
    private String divisionCode;
    @Column(name = "issue_date")
    private String issueDate;
    @Column(name = "registration_address")
    private String registrationAddress;

    public Passport() {
    }

    public Passport(String seriesAndNumber,
                    String birthplace, String whoIssued,
                    String divisionCode,
                    String issueDate, String registrationAddress) {
        this.seriesAndNumber = seriesAndNumber;
        this.birthplace = birthplace;
        this.whoIssued = whoIssued;
        this.divisionCode = divisionCode;
        this.issueDate = issueDate;
        this.registrationAddress = registrationAddress;
    }

    public String getSeriesAndNumber() {
        return seriesAndNumber;
    }

    public void setSeriesAndNumber(String seriesAndNumber) {
        this.seriesAndNumber = seriesAndNumber;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getWhoIssued() {
        return whoIssued;
    }

    public void setWhoIssued(String whoIssued) {
        this.whoIssued = whoIssued;
    }

    public String getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }
}
