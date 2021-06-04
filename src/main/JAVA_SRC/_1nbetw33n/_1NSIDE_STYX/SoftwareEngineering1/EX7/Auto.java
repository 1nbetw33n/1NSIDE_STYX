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

package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX7;

import java.util.List;

final public class Auto implements Autoable {

    protected boolean turbo;
    protected Kunde   kunde;
    protected int         parkdauer;

    public Auto() {}

    final public boolean hatTurbo() { return this.turbo;}

    final public Kunde kunde() {
        return this.kunde;
    }

    final public int parkdauer() {
        return this.parkdauer;
    }

}
