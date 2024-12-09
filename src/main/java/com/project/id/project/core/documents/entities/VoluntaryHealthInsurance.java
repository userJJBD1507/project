package com.project.id.project.core.documents.entities;

import com.project.id.project.core.Document;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "voluntary_health_insurance_table")
public class VoluntaryHealthInsurance extends Document {
    @Column(name = "onset_of_action")
    private String effectiveFrom;
    @Column(name = "end_of_action")
    private String effectiveUntil;
    @Column(name = "policy_holder")
    private String policyHolder;

    public VoluntaryHealthInsurance() {

    }

    public VoluntaryHealthInsurance(String effectiveFrom,
                                    String effectiveUntil,
                                    String policyHolder) {
        this.effectiveFrom = effectiveFrom;
        this.effectiveUntil = effectiveUntil;
        this.policyHolder = policyHolder;
    }

    public String getEffectiveFrom() {
        return effectiveFrom;
    }

    public void setEffectiveFrom(String effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    public String getEffectiveUntil() {
        return effectiveUntil;
    }

    public void setEffectiveUntil(String effectiveUntil) {
        this.effectiveUntil = effectiveUntil;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
    }
}
