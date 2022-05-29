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

//
//created by 0x1nbetw33n on 29/05/2022
//

package _1nbetw33n._1NSIDE_STYX.MISC.Sägewerk3;

public abstract class Saege implements Bearbeiten{

    private String name;


    public void saegen(Baumstamm stamm, double laenge) {
        System.out.println(stamm.getName() + " " + laenge + " m " + "saegen mit " + this.getName());
        stamm.kuerzen(laenge);
    }

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

}
