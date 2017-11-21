package com.kukuruznyak.testing.calculator.service.validation.impl;

import com.kukuruznyak.testing.calculator.domain.ComplexObject;
import com.kukuruznyak.testing.calculator.service.validation.ValidationService;
import org.junit.Test;

public class CamsungValidationServiceImplTest {
    private ValidationService validationService = new CamsungValidationServiceImpl();

    @Test(expected = IllegalArgumentException.class)
    public void validateValuesNullCheck() throws Exception {
        ComplexObject expectedComplexObject = null;
        validationService.validateValues(expectedComplexObject);
    }

}