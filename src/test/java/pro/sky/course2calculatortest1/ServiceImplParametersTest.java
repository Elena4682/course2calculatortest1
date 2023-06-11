package pro.sky.course2calculatortest1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceImplParametersTest {
    ServiceImpl service = new ServiceImpl();
    private static Collection<Arguments> parameters(){
        return List.of(
                Arguments.of(1,2),
                Arguments.of(-3,-4),
                Arguments.of(-5,6),
                Arguments.of(5,-6));
    }
    @ParameterizedTest
    @MethodSource("parameters")
    void testPlus(int number1,int number2){
        var actual = service.addition(number1,number2);
        var expected = number1 + number2;
        assertEquals(actual,expected);
    }
    @ParameterizedTest
    @MethodSource("parameters")
    void testMinus(int number1,int number2){
        var actual = service.subtraction(number1,number2);
        var expected = number1 - number2;
        assertEquals(actual,expected);
    }
    @ParameterizedTest
    @MethodSource("parameters")
    void testMultiply(int number1,int number2){
        var actual = service.multiplication(number1,number2);
        var expected = number1 * number2;
        assertEquals(actual,expected);
    }
    @ParameterizedTest
    @MethodSource("parameters")
    void testDivide(int number1,int number2){
        var actual = service.division(number1,number2);
        var expected = number1 / number2;
        assertEquals(actual,expected);
    }
}
