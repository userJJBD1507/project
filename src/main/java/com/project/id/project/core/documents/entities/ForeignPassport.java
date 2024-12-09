package com.project.id.project.core.documents.entities;

import com.project.id.project.core.Document;

public class ForeignPassport extends Document {
    private String number;
    private String citizenship;
    private String birthplace;
    private String expirationDate;
    private String whoIssued;
    private String issueDate;

    public ForeignPassport() {
    }

    public ForeignPassport(String number,
                           String citizenship,
                           String birthplace,
                           String expirationDate,
                           String whoIssued, String issueDate) {
        this.number = number;
        this.citizenship = citizenship;
        this.birthplace = birthplace;
        this.expirationDate = expirationDate;
        this.whoIssued = whoIssued;
        this.issueDate = issueDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getWhoIssued() {
        return whoIssued;
    }

    public void setWhoIssued(String whoIssued) {
        this.whoIssued = whoIssued;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}
