
package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX9.NO4.CodeReviews.NO1;

import java.time.LocalDate;

import java.time.LocalTime;



public class ParkticketIFImpl implements ParkticketIF {

    private int parkingLot = 1;
    private String beginnigTime;


    public ParkticketIFImpl(int parkingLot, String beginningTime) {
        this.parkingLot = parkingLot;
        this.beginnigTime = beginningTime;
    }

    @Override
    public int getParkingLot() {
        return parkingLot;
    }

    @Override
    public String getBeginningTime() {
        return beginnigTime;
    }

}
