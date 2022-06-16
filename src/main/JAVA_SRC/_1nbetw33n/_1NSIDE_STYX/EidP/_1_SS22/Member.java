/*
 *
 * copyright (c) 2022 1nbetw33n Labs
 * Virgo Supercluster, Milky Way - Earth A-6847
 * All rights reserved
 *
 * This software is the confidential and proprietary information of
 * 1nbetw33n Labs. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * 1nbetw33n Labs.
 *
 */

package _1nbetw33n._1NSIDE_STYX.EidP._1_SS22;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private static int memberNoCounter;
    private static double membershipFee = 90;
    private final String name;
    private final int memberNo;
    private final List<Kurs> kursList = new ArrayList<>();

    public Member(String name){
        this.name = name;
        this.memberNo = memberNoCounter++;
    }

    @SuppressWarnings("unused")
    protected void setMembershipFee(double membershipFee){Member.membershipFee = membershipFee;}

    @SuppressWarnings("unused")
    protected int getNoOfKurses(){return kursList.size();}

    @SuppressWarnings("unused")
    protected double getTotalFee(){return membershipFee + kursList.stream().mapToDouble(Kurs::getPrice).sum();}

    @SuppressWarnings("unused")
    protected void buchen(Kurs kurs){
        this.kursList.add(kurs);
        kurs.anmelden(this);
    }

    public String toString(){return this.name + " | " + this.memberNo;}

}
