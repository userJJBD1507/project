package com.project.id.project.core.documents.entities;

import com.project.id.project.core.Document;

public class BirthCertificate extends Document {
    private String seriesAndNumber;
    private String citizenship;
    private String birthplace;
    private String birthRecordData;
    private String fathersSurname;
    private String fathersName;
    private String fathersPatronymic;
    private String fathersCitizenship;
    private String fathersBirthdate;
    private String mothersSurname;
    private String mothersName;
    private String mothersPatronymic;
    private String mothersCitizenship;
    private String mothersBirthdate;
    private String stateRegistrationPlace;
    private String issueCertificatePlace;
    private String issueString;

    public BirthCertificate() {
    }

    public BirthCertificate(String seriesAndNumber,
                            String citizenship,
                            String birthplace,
                            String birthRecordData,
                            String fathersSurname,
                            String fathersName,
                            String fathersPatronymic,
                            String fathersCitizenship,
                            String fathersBirthdate,
                            String mothersSurname,
                            String mothersName,
                            String mothersPatronymic,
                            String mothersCitizenship,
                            String mothersBirthdate,
                            String stateRegistrationPlace,
                            String issueCertificatePlace,
                            String issueString) {
        this.seriesAndNumber = seriesAndNumber;
        this.citizenship = citizenship;
        this.birthplace = birthplace;
        this.birthRecordData = birthRecordData;
        this.fathersSurname = fathersSurname;
        this.fathersName = fathersName;
        this.fathersPatronymic = fathersPatronymic;
        this.fathersCitizenship = fathersCitizenship;
        this.fathersBirthdate = fathersBirthdate;
        this.mothersSurname = mothersSurname;
        this.mothersName = mothersName;
        this.mothersPatronymic = mothersPatronymic;
        this.mothersCitizenship = mothersCitizenship;
        this.mothersBirthdate = mothersBirthdate;
        this.stateRegistrationPlace = stateRegistrationPlace;
        this.issueCertificatePlace = issueCertificatePlace;
        this.issueString = issueString;
    }

    public String getSeriesAndNumber() {
        return seriesAndNumber;
    }

    public void setSeriesAndNumber(String seriesAndNumber) {
        this.seriesAndNumber = seriesAndNumber;
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

    public String getBirthRecordData() {
        return birthRecordData;
    }

    public void setBirthRecordData(String birthRecordData) {
        this.birthRecordData = birthRecordData;
    }

    public String getFathersSurname() {
        return fathersSurname;
    }

    public void setFathersSurname(String fathersSurname) {
        this.fathersSurname = fathersSurname;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getFathersPatronymic() {
        return fathersPatronymic;
    }

    public void setFathersPatronymic(String fathersPatronymic) {
        this.fathersPatronymic = fathersPatronymic;
    }

    public String getFathersCitizenship() {
        return fathersCitizenship;
    }

    public void setFathersCitizenship(String fathersCitizenship) {
        this.fathersCitizenship = fathersCitizenship;
    }

    public String getFathersBirthdate() {
        return fathersBirthdate;
    }

    public void setFathersBirthdate(String fathersBirthdate) {
        this.fathersBirthdate = fathersBirthdate;
    }

    public String getMothersSurname() {
        return mothersSurname;
    }

    public void setMothersSurname(String mothersSurname) {
        this.mothersSurname = mothersSurname;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getMothersPatronymic() {
        return mothersPatronymic;
    }

    public void setMothersPatronymic(String mothersPatronymic) {
        this.mothersPatronymic = mothersPatronymic;
    }

    public String getMothersCitizenship() {
        return mothersCitizenship;
    }

    public void setMothersCitizenship(String mothersCitizenship) {
        this.mothersCitizenship = mothersCitizenship;
    }

    public String getMothersBirthdate() {
        return mothersBirthdate;
    }

    public void setMothersBirthdate(String mothersBirthdate) {
        this.mothersBirthdate = mothersBirthdate;
    }

    public String getStateRegistrationPlace() {
        return stateRegistrationPlace;
    }

    public void setStateRegistrationPlace(String stateRegistrationPlace) {
        this.stateRegistrationPlace = stateRegistrationPlace;
    }

    public String getIssueCertificatePlace() {
        return issueCertificatePlace;
    }

    public void setIssueCertificatePlace(String issueCertificatePlace) {
        this.issueCertificatePlace = issueCertificatePlace;
    }

    public String getIssueString() {
        return issueString;
    }

    public void setIssueString(String issueString) {
        this.issueString = issueString;
    }
}
