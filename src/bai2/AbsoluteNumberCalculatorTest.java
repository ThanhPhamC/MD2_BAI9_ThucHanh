package bai2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberCalculatorTest {
    @Test
    void testFindAbsolute(){
            int number =-1;
            int expected=1;
            int result=AbsoluteNumberCalculator.findAbsolute(number);
            assertEquals(expected,result);
    }

}
