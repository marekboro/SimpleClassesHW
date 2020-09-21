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
        printer.print(2,5);
        assertEquals(190,printer.getSheetsRemaining());
    }

    @Test
    public void willNotPrintIfPrintRequestExceedsAvailablePaper(){
        printer.print(30,6);
        printer.print(11,2);
        assertEquals(20,printer.getSheetsRemaining());
        assertEquals("Give me more paper human!",printer.getErrorMessage());
    }




}



