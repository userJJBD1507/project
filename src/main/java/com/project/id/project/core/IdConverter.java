package com.project.id.project.core;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class IdConverter implements AttributeConverter<Id, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Id attribute) {
        return (attribute != null) ? attribute.id() : null;
    }

    @Override
    public Id convertToEntityAttribute(Integer dbData) {
        return (dbData != null) ? new Id(dbData) : null;
    }
}
