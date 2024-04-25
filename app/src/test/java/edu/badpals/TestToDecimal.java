package edu.badpals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestToDecimal {

    @Test
    public void testDecimal1(){
        RomanNumber test1 = new RomanNumber("I");
        assertEquals(1, test1.romanCalculator());
    }
}
