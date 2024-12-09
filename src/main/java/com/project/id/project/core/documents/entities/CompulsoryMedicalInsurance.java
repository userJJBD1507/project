package com.project.id.project.core.documents.entities;

import com.project.id.project.core.Document;

public class CompulsoryMedicalInsurance extends Document {
    private String seriesAndNumber;
    private String seriesAndFormNumber;

    public CompulsoryMedicalInsurance() {
    }

    public CompulsoryMedicalInsurance(String seriesAndNumber, String seriesAndFormNumber) {
        this.seriesAndNumber = seriesAndNumber;
        this.seriesAndFormNumber = seriesAndFormNumber;
    }

    public String getSeriesAndNumber() {
        return seriesAndNumber;
    }

    public void setSeriesAndNumber(String seriesAndNumber) {
        this.seriesAndNumber = seriesAndNumber;
    }

    public String getSeriesAndFormNumber() {
        return seriesAndFormNumber;
    }

    public void setSeriesAndFormNumber(String seriesAndFormNumber) {
        this.seriesAndFormNumber = seriesAndFormNumber;
    }
}
