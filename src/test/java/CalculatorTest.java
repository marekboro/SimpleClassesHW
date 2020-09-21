import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
        Calculator calc;

        @Before
        public void before(){
            calc = new Calculator();
        }
        @Test
        public void canAdd(){
            assertEquals(10, calc.add(3,7));
        }


}
