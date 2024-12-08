package com.project.id.project.core.documents.entities;

import com.project.id.project.core.Document;
import com.project.id.project.core.utils.DrivingCategory;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "driving_license_table")
public class DrivingLicense extends Document {
    @Column(name = "number")
    private String number;
    @Column(name = "birthplace")
    private String birthplace;
    @Column(name = "whom_issued")
    private String whoIssued;
    @Column(name = "validity_until")
    private String validUntil;
    @Column(name = "issue_date")
    private String issueDate;
    @Column(name = "issue_place")
    private String placeOfIssue;
    @Column(name = "special_marks")
    private String comments;
    @Column(name = "category")
    private DrivingCategory category;

    public DrivingLicense() {
    }

    public DrivingLicense(String number,
                          String birthplace,
                          String whoIssued,
                          String validUntil,
                          String issueDate,
                          String placeOfIssue,
                          String comments,
                          DrivingCategory category) {
        this.number = number;
        this.birthplace = birthplace;
        this.whoIssued = whoIssued;
        this.validUntil = validUntil;
        this.issueDate = issueDate;
        this.placeOfIssue = placeOfIssue;
        this.comments = comments;
        this.category = category;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getPlaceOfIssue() {
        return placeOfIssue;
    }

    public void setPlaceOfIssue(String placeOfIssue) {
        this.placeOfIssue = placeOfIssue;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public DrivingCategory getCategory() {
        return category;
    }

    public void setCategory(DrivingCategory category) {
        this.category = category;
    }
}
