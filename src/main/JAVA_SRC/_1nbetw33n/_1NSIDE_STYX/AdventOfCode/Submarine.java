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

package _1nbetw33n._1NSIDE_STYX.AdventOfCode;

/*
 * Created by 0x1nbetw33n on 10/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

class Submarine {

    int x, y;

    Submarine(){
        this.x = 0;
        this.y = 0;
    }

    void forward(int x) {this.x += x;}

    void down(int y){this.y += y;}

    @SuppressWarnings("SameParameterValue")
    void up(int y){this.y -= y;}
}