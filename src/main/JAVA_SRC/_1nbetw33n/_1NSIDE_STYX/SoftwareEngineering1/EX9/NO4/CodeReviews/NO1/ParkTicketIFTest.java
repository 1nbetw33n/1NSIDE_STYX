
package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX9.NO4.CodeReviews.NO1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;


class ParkticketIFTest {

    private ParkticketIF parkticket1;
    private ParkticketIF parkticket2;
    private ParkticketIF parkticket3;
    private ParkticketIF parkticket4;
    private DateTimeFormatter dtf;

    @BeforeEach
    public void setUp() throws Exception {
        dtf = DateTimeFormatter.ofPattern("HH:mm");
        parkticket1 = new ParkticketIFImpl(1, LocalTime.now()
                                                       .format(dtf));
        parkticket2 = new ParkticketIFImpl(2, LocalTime.now()
                                                       .format(dtf));
        parkticket3 = new ParkticketIFImpl(3, LocalTime.now()
                                                       .format(dtf));
        parkticket4 = new ParkticketIFImpl(4, LocalTime.now()
                                                       .format(dtf));
    }


    @Test
    void getParkingLot() {
        assertEquals(1, parkticket1.getParkingLot());
        assertEquals(2, parkticket2.getParkingLot());
        assertEquals(3, parkticket3.getParkingLot());
        assertEquals(4, parkticket4.getParkingLot());
    }


    @Test
    void getBeginningTime() {
        assertEquals(LocalTime.now()
                              .format(dtf), parkticket1.getBeginningTime());
        assertEquals(LocalTime.now()
                              .format(dtf), parkticket2.getBeginningTime());
        assertEquals(LocalTime.now()
                              .format(dtf), parkticket3.getBeginningTime());
        assertEquals(LocalTime.now()
                              .format(dtf), parkticket4.getBeginningTime());
    }

}
