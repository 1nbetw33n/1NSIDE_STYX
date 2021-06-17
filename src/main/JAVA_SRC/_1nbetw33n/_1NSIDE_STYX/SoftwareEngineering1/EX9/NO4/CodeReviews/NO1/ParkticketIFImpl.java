/*
 *  copyright (c) 2021 1nbetw33n Labs.
 *  Planet Earth, Milky Way, Virgo Supercluster.
 *  All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * 1nbetw33n Labs. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * 1nbetw33n Labs.
 *
 */

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
