package com.kukuruznyak.testing.calculator.service.counting.impl;

import com.kukuruznyak.testing.calculator.domain.ComplexObject;
import com.kukuruznyak.testing.calculator.service.counting.CountingService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseCountingServiceImplTest {
    private CountingService service = new ReverseCountingServiceImpl();
    private ComplexObject complexObject1;
    private ComplexObject complexObject2;

    @Before
    public void init() {
        complexObject1 = new ComplexObject(3, 4);
        complexObject2 = new ComplexObject(1, 2);
    }

    @Test
    public void add() throws Exception {
        ComplexObject expectedComplexObject = new ComplexObject(5, 5);
        ComplexObject resultComplexObject = service.add(complexObject1, complexObject2);
        Assert.assertEquals(expectedComplexObject, resultComplexObject);
    }

    @Test
    public void subtract() throws Exception {
        ComplexObject expectedComplexObject = new ComplexObject(1, 3);
        ComplexObject resultComplexObject = service.subtract(complexObject1, complexObject2);
        Assert.assertEquals(expectedComplexObject, resultComplexObject);
    }

    @Test
    public void divide() throws Exception {
        ComplexObject expectedComplexObject = new ComplexObject(1, 4);
        ComplexObject resultComplexObject = service.divide(complexObject1, complexObject2);
        Assert.assertEquals(expectedComplexObject, resultComplexObject);
    }

    @Test
    public void multiply() throws Exception {
        ComplexObject expectedComplexObject = new ComplexObject(6, 4);
        ComplexObject resultComplexObject = service.multiply(complexObject1, complexObject2);
        Assert.assertEquals(expectedComplexObject, resultComplexObject);
    }

}