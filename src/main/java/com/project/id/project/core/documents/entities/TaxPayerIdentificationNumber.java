package com.project.id.project.core.documents.entities;

import com.project.id.project.core.Document;

public class TaxPayerIdentificationNumber extends Document {
    private String taxpayerIdentificationNumber;
    private String issueDate;
    private String birthPlace;
    private String effectiveUntil;
    private String issuingAuthority;

    public TaxPayerIdentificationNumber() {
    }

    public TaxPayerIdentificationNumber(String taxpayerIdentificationNumber,
                                        String issueDate,
                                        String birthPlace,
                                        String effectiveUntil,
                                        String issuingAuthority) {
        this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
        this.issueDate = issueDate;
        this.birthPlace = birthPlace;
        this.effectiveUntil = effectiveUntil;
        this.issuingAuthority = issuingAuthority;
    }

    public String getTaxpayerIdentificationNumber() {
        return taxpayerIdentificationNumber;
    }

    public void setTaxpayerIdentificationNumber(String taxpayerIdentificationNumber) {
        this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getEffectiveUntil() {
        return effectiveUntil;
    }

    public void setEffectiveUntil(String effectiveUntil) {
        this.effectiveUntil = effectiveUntil;
    }

    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }
}
