package com.project.id.project.core.documents.entities;

import com.project.id.project.core.Document;

public class VoluntaryHealthInsurance extends Document {
    private String effectiveFrom;
    private String effectiveUntil;
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
