package com.project.id.project.core.documents.entities;

import com.project.id.project.core.Document;

public class Passport extends Document {
    private String seriesAndNumber;
    private String birthplace;
    private String whoIssued;
    private String divisionCode;
    private String issueDate;
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
