package com.kukuruznyak.testing.calculator.service.validation.impl;

import com.kukuruznyak.testing.calculator.domain.ComplexObject;
import com.kukuruznyak.testing.calculator.service.validation.ValidationService;
import org.junit.Test;

public class SaimensValidationServiceImplTest {
    private ValidationService validationService = new SaimensValidationServiceImpl();

    @Test(expected = IllegalArgumentException.class)
    public void validateValuesNullCheck() {
        validationService.validateValues(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateValuesCheckWrongValueA() {
        ComplexObject expectedComplexObject = new ComplexObject(-10, 2);
        validationService.validateValues(expectedComplexObject);
    }

    @Test
    public void validateValuesCheckCorrectValueA() {
        ComplexObject expectedComplexObject1 = new ComplexObject(-100, -2);
        ComplexObject expectedComplexObject2 = new ComplexObject(50, -2);
        validationService.validateValues(expectedComplexObject1);
        validationService.validateValues(expectedComplexObject2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateValuesCheckWrongValueB() {
        ComplexObject expectedComplexObject = new ComplexObject(50, 50);
        validationService.validateValues(expectedComplexObject);
    }

    @Test
    public void validateValuesCheckCorrectValueB() {
        ComplexObject expectedComplexObject = new ComplexObject(50, -2);
        validationService.validateValues(expectedComplexObject);
    }
}