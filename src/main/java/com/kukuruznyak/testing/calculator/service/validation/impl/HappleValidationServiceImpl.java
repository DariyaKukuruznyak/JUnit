package com.kukuruznyak.testing.calculator.service.validation.impl;

import com.kukuruznyak.testing.calculator.domain.ComplexObject;
import com.kukuruznyak.testing.calculator.service.validation.ValidationService;

public class HappleValidationServiceImpl implements ValidationService {
        public void validateValues(ComplexObject complexObject) {
        if (complexObject == null) {
            throw new IllegalArgumentException("Object is null");
        }
        if (complexObject.getValueA() < 0 || complexObject.getValueB() < 0) {
            throw new IllegalArgumentException("Incorrect value. Expected valueA & valueB > 0");
        }
    }
}
