package com.project.id.project.core.documents.entities;

import com.project.id.project.core.Document;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "foreign_passport_table")
@Entity
public class ForeignPassport extends Document {
    @Column(name = "number")
    private String number;
    @Column(name = "citizenship")
    private String citizenship;
    @Column(name = "birthplace")
    private String birthplace;
    @Column(name = "expiration_date")
    private String expirationDate;
    @Column(name = "who_issued")
    private String whoIssued;
    @Column(name = "issue_date")
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
