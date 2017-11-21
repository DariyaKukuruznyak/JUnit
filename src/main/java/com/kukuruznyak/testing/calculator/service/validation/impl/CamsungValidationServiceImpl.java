package com.kukuruznyak.testing.calculator.service.validation.impl;

import com.kukuruznyak.testing.calculator.domain.ComplexObject;
import com.kukuruznyak.testing.calculator.service.validation.ValidationService;

public class CamsungValidationServiceImpl implements ValidationService {
    public void validateValues(ComplexObject complexObject) {
        if (complexObject == null) {
            throw new IllegalArgumentException("Object is null");
        }
    }
}
