
package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX9.NO4.CodeReviews.NO2;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class ParkplatzTest {

    Parkplatz parkplatz;
    Auto auto;

    @BeforeEach
    void setup() {
        parkplatz = new Parkplatz(3);            // erstellen einen Parkplatz mit 3 freie Plätze
        auto = new Auto(parkplatz);
    }


    @Test
    @DisplayName("Prueft ob es noch Platz gibt")
    void isVollTest() {
        auto.parken();
        auto.parken();
        auto.parken();
        assertTrue(parkplatz.isVoll());
    }


    @Test
    @DisplayName("zeigt die verfuegbare Platz im Parkplatz")
    void freiplatzTest() {
        auto.parken();
        auto.parken();
        assertEquals(1, parkplatz.freiplatz());
    }


}



