package com.kukuruznyak.testing.calculator.service.validation.impl;

import com.kukuruznyak.testing.calculator.domain.ComplexObject;
import com.kukuruznyak.testing.calculator.service.validation.ValidationService;

public class SaimensValidationServiceImpl implements ValidationService {
    public void validateValues(ComplexObject complexObject) {
        if (complexObject == null) {
            throw new IllegalArgumentException("Object is null");
        }
        if (!(complexObject.getValueA() == -100 || complexObject.getValueA() == 50) || complexObject.getValueB() >= 0) {
            throw new IllegalArgumentException("Incorrect value. Expected valueA =-100 or 50 & valueB < 0");
        }
    }
}
