package ch6;

import org.junit.Test;

import static org.junit.Assert.*;

public class Money_Test {
    @Test
    public void testEquality(){
        assertTrue(new dollar(5).equals(new dollar(5)));
        assertFalse(new dollar(5).equals(new dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
    }
}