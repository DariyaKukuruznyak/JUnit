package com.kukuruznyak.testing.calculator.service.counting.impl;

import com.kukuruznyak.testing.calculator.domain.ComplexObject;
import com.kukuruznyak.testing.calculator.service.counting.CountingService;

public class CountingServiceImpl implements CountingService {
    public ComplexObject add(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() + param2.getValueA());
        result.setValueB(param1.getValueB() + param2.getValueB());
        return result;
    }

    public ComplexObject subtract(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() - param2.getValueA());
        result.setValueB(param1.getValueB() - param2.getValueB());
        return result;
    }

    public ComplexObject divide(ComplexObject param1, ComplexObject param2) {
        if (param2.getValueA() == 0 || param2.getValueB() == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() / param2.getValueA());
        result.setValueB(param1.getValueB() / param2.getValueB());
        return result;
    }

    public ComplexObject multiply(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() * param2.getValueA());
        result.setValueB(param1.getValueB() * param2.getValueB());
        return result;
    }
}
