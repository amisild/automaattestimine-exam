package com.amisild;

import com.sun.org.apache.xerces.internal.impl.dv.InvalidDatatypeValueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KolmnurkTest {
    private Kolmnurk kolmnurk = new Kolmnurk();

    @Test
    void kolmnurgaArea_if_all_zeros() {
        double kArea = kolmnurk.kolmnurgaArea(0,0);
        assertEquals(0,kArea);
    }

    @Test
    void kolmnurgaArea_if_all_negative() {
        double kArea = kolmnurk.kolmnurgaArea(-1,-1);
        assertEquals(0.5, kArea);
    }

    @Test
    void kolmnurgaArea_if_one_string() {
        double kArea = kolmnurk.kolmnurgaArea(0,"kana");
        Throwable exception = assertThrows(InvalidDatatypeValueException.class, () ->{base.kolmnurgaArea_if_one_string("Wrong")});
    }

    @Test
    void kolmnurgaPerimeter_if_all_zeros() {
        double kPerimeter = kolmnurk.kolmnurgaPerimeter(0,0,0);
        assertEquals(0, kPerimeter);
    }

    @Test
    void kolmnurgaPerimeter_if_all_negative() {
        double kPerimeter = kolmnurk.kolmnurgaPerimeter(-1, -1, -1);
        assertEquals(-3, kPerimeter);
    }

    @Test
    void kolmnurgaPerimeter_if_one_string() {
        double kPerimeter = kolmnurk.kolmnurgaPerimeter(0, 0, "kana");
        Throwable exception = assertThrows(InvalidDatatypeValueException.class, () ->{otherSide.kolmnurgaPerimeter_if_one_string("Wrong")});
    }
}