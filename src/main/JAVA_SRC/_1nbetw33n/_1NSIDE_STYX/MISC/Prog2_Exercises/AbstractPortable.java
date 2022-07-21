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

package _1nbetw33n._1NSIDE_STYX.MISC.Prog2_Exercises;

/*
 * Created by 0x1nbetw33n on 02/07/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

public class AbstractPortable implements Portable{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public String toString() {
        return getClass().getSimpleName() + ": " + weight;
    }
}

class Pen extends AbstractPortable{ }

class Cup extends AbstractPortable{ }