
package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX9.NO4.CodeReviews.NO3;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class ParkplatzIFTest {

    private Parkplatz p1, p2;
    private Auto a1, a2;



    @BeforeEach
    void setUp() throws ParkplatzBelegtException {
        a1 = new Auto();
        a2 = new Auto();
        p1 = new Parkplatz();
        p2 = new Parkplatz();
        p2.einparken(a2);
    }



    @Test
    void istBelegt() {
        assertEquals(false, p1.istBelegt());
        assertEquals(true, p2.istBelegt());
    }



    @Test
    void getAuto() {
        assertEquals(a2, p2.getAuto());
        assertEquals(null, p1.getAuto());
    }



    @Test
    void einparken() throws ParkplatzBelegtException {
        p1.einparken(a1);
        assertThrows(ParkplatzBelegtException.class, () -> {
            p2.einparken(a1);
        });
        assertEquals(true, p1.istBelegt());
        assertEquals(a1, p1.getAuto());

    }



    @Test
    void ausparken() throws ParkplatzLeerException {
        p2.ausparken();
        assertEquals(null, p2.getAuto());
        assertEquals(false, p2.istBelegt());
        assertThrows(ParkplatzLeerException.class, () -> {
            p1.ausparken();
        });
    }
}
