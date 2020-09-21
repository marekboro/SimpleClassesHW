import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
        Calculator calc;

        @Before
        public void before(){
            calc = new Calculator("TX-100");
        }
        @Test
        public void canAddTwoInts(){
            assertEquals(10, calc.add(3,7));
        }

        @Test
        public void canSubtractSecondFromFirst(){
            assertEquals(2,calc.subtract(8,6));
        }

        @Test
        public void canMultiplyTwoInts(){
            assertEquals(20,calc.multiply(4,5));
        }
        @Test
        public void canDivideTwoInts(){
            assertEquals(20.00,calc.divide(100.00,5.00),0.01);
        }


}
