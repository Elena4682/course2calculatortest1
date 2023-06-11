package pro.sky.course2calculatortest1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ServiceImplTest {
    ServiceImpl service = new ServiceImpl();
    @Test

    void testPlus(){
        assertEquals(3, service.addition(1,2));
        assertEquals(-3, service.addition(-1,-2));
        assertEquals(1, service.addition(-1,2));
        assertEquals(-1, service.addition(1,-2));
        assertEquals(1, service.addition(1,0));
        assertEquals(1, service.addition(0,1));

    }
    @Test
    void testMinus(){
        assertEquals(-1, service.subtraction(1,2));
        assertEquals(-7, service.subtraction(-3,-4));
        assertEquals(-11, service.subtraction(-5,6));
        assertEquals(11, service.subtraction(5,-6));
        assertEquals(0, service.subtraction(0,0));
    }
    @Test
    void testMultiply(){
        assertEquals(2, service.multiplication(1,2));
        assertEquals(12, service.multiplication(-3,-4));
        assertEquals(-30, service.multiplication(-5,6));
        assertEquals(-30, service.multiplication(5,-6));
        assertEquals(0, service.multiplication(0,0));
    }
    @Test

    void testDivide(){
        assertEquals(2, service.division(2,1));
        assertEquals(1, service.division(-4,-4));
        assertEquals(-2, service.division(-12,6));
        assertEquals(-2, service.division(12,-6));
        assertEquals(IllegalArgumentException.class,service.division(6,0));
        try {
            service.division(6,0);
            fail();
        } catch (IllegalArgumentException ignored){}
    }
}
