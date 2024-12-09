package com.project.id.project.core.documents.entities;

import com.project.id.project.core.Document;

public class InsuranceNumberOfIndividualPersonalAccount extends Document {
    private String registrationDate;
    private String birthPlace;
    private String InsuranceNumberOfIndividualPersonalAccount;

    public InsuranceNumberOfIndividualPersonalAccount() {
    }

    public InsuranceNumberOfIndividualPersonalAccount(String registrationDate,
                                                      String birthPlace,
                                                      String insuranceNumberOfIndividualPersonalAccount) {
        this.registrationDate = registrationDate;
        this.birthPlace = birthPlace;
        InsuranceNumberOfIndividualPersonalAccount = insuranceNumberOfIndividualPersonalAccount;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getInsuranceNumberOfIndividualPersonalAccount() {
        return InsuranceNumberOfIndividualPersonalAccount;
    }

    public void setInsuranceNumberOfIndividualPersonalAccount(String insuranceNumberOfIndividualPersonalAccount) {
        InsuranceNumberOfIndividualPersonalAccount = insuranceNumberOfIndividualPersonalAccount;
    }
}
