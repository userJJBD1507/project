package com.project.id.project.core.documents.entities;

import com.project.id.project.core.Document;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "required_health_insurance_table")
public class CompulsoryMedicalInsurance extends Document {
    @Column(name = "series_form_number")
    private String seriesAndNumber;
    @Column(name = "series_and_form_number")
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
