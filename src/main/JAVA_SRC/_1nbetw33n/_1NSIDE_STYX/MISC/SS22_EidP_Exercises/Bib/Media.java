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

package _1nbetw33n._1NSIDE_STYX.MISC.SS22_EidP_Exercises.Bib;

/*
 * Created by 0x1nbetw33n on 06/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

public abstract class Media {

    private static int objectCounter = 1;
    private String title;
    private int id;
    private User owner;

    public Media(String title){this.title = title;}

    public abstract String signature();

    public int getID(){return id;}
    public void setOwner(User owner) {this.owner = owner;}

    public User getOwner() {return this.owner;}

}