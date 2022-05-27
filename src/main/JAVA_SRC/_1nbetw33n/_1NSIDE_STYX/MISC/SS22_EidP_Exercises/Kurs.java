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

package _1nbetw33n._1NSIDE_STYX.MISC.SS22_EidP_Exercises;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("FieldMayBeFinal")
public class Kurs {

    private String name;
    private double price;
    private List<Member> memberList = new ArrayList<>();
    private static double totalAmountOfAllKurses;

    public Kurs(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected int getNumberOfMembers() {return this.memberList.size();}

    public double getPrice() {return this.price;}

    protected static double getTotalAmountOfAllKurses(){return totalAmountOfAllKurses;}

    public String toString() {return this.name;}

    public void anmelden(Member member) {
        this.memberList.add(member);
        totalAmountOfAllKurses += this.price;
    }
}
