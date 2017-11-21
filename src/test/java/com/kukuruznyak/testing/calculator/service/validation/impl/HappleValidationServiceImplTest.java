package com.kukuruznyak.testing.calculator.service.validation.impl;

import com.kukuruznyak.testing.calculator.domain.ComplexObject;
import com.kukuruznyak.testing.calculator.service.validation.ValidationService;
import org.junit.Test;

public class HappleValidationServiceImplTest {
    private ValidationService validationService = new HappleValidationServiceImpl();

    @Test(expected = IllegalArgumentException.class)
    public void validateValuesNullCheck() {
        validationService.validateValues(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateValuesCheckWrongValueA() {
        ComplexObject expectedComplexObject = new ComplexObject(-1000, 2);
        validationService.validateValues(expectedComplexObject);
    }

    @Test
    public void validateValuesCheckCorrectValueA() {
        ComplexObject expectedComplexObject = new ComplexObject(0, 2);
        validationService.validateValues(expectedComplexObject);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateValuesCheckWrongValueB() {
        ComplexObject expectedComplexObject = new ComplexObject(2, -150);
        validationService.validateValues(expectedComplexObject);
    }

    @Test
    public void validateValuesCheckCorrectValueB() {
        ComplexObject expectedComplexObject = new ComplexObject(0, 2);
        validationService.validateValues(expectedComplexObject);
    }
}