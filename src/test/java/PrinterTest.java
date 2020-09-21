import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void has190PagesLeftAfter2PagesPrintedHaving5CopiesEach(){
        assertEquals(190,printer.print(2,5));
    }
}



