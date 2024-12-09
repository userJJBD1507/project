package com.project.id.project.core.documents.entities;

import com.project.id.project.core.Document;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "taxpayer_identification_number_table")
public class TaxPayerIdentificationNumber extends Document {
    @Column(name = "taxpayer_identification_number")
    private String taxpayerIdentificationNumber;
    @Column(name = "issue_date")
    private String issueDate;
    @Column(name = "birthplace")
    private String birthPlace;
    @Column(name = "effective_until")
    private String effectiveUntil;
    @Column(name = "issuing_authority")
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
