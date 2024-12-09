package com.project.id.project.core.documents.entities;

import com.project.id.project.core.Document;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "insurance_number_of_individual_personal_account")
public class InsuranceNumberOfIndividualPersonalAccount extends Document {
    @Column(name = "registration_date")
    private String registrationDate;
    @Column(name = "birthplace")
    private String birthPlace;
    @Column(name = "value_insurance_number_of_individual_personal_account")
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
