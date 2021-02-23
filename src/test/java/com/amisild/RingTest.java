package com.amisild;

import com.sun.org.apache.xerces.internal.impl.dv.InvalidDatatypeValueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RingTest {
    private Ring ring = new Ring();

    @Test
    void ringiArea_if_one() {
        double rArea = ring.ringiArea(1);
        assertEquals(Math.PI, rArea);
    }

    @Test
    void ringiArea_if_zero() {
        double rArea = ring.ringiArea(0);
        assertEquals(0, rArea);
    }

    @Test
    void ringiArea_if_negative() {
        double rArea = ring.ringiArea(-1);
        assertEquals(Math.PI, rArea);
    }

    @Test
        //akki lic kommenteerin valja
    void ringiArea_if_string() {
        double rArea = ring.ringiArea("kana");
        Throwable exception = assertThrows(InvalidDatatypeValueException.class, () -> {
            radius.ringiArea_if_string("Wrong")
        });
    }

    @Test
    void ringiPerimeter_if_one() {
        double rPerimeter = ring.ringiPerimeter(1);
        assertEquals(2 * Math.PI, rPerimeter);
    }

    @Test
    void ringiPerimeter_if_zero() {
        double rPerimeter = ring.ringiPerimeter(0);
        assertEquals(0, rPerimeter);
    }

    @Test
    void ringiPerimeter_if_negative() {
        double rPerimeter = ring.ringiPerimeter(-1);
        assertEquals(-2 * Math.PI, rPerimeter);
    }

    @Test
    void ringiPerimeter_if_string() {
        double rPerimeter = ring.ringiPerimeter("kana");
        Throwable exception = assertThrows(InvalidDatatypeValueException.class, () -> {
            radius.ringiPerimeter_if_string("Wrong")
        });
    }


}