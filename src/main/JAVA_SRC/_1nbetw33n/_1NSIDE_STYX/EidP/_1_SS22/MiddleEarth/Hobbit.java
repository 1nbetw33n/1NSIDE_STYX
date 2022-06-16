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

package _1nbetw33n._1NSIDE_STYX.EidP._1_SS22.MiddleEarth;

/*
 * Created by 0x1nbetw33n on 07/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

public class Hobbit extends Entity{

    private int maxAge = 150;

    public Hobbit(String name, int age) {
        super(name, age);
    }

    public boolean alive() {return getAge() - getMaxAge() < 0;}

    public String greet() {return "Hallo!";}

    public void getsWounded(int damage) {
        setMaxAge(getMaxAge() - damage);
        if (getAge() < getMaxAge()){System.out.println("This damage just killed that hobbit!");}
        else {System.out.println("The remaining life expectancy is " + (getMaxAge() - getAge()));}
    }

    public int getMaxAge() {return maxAge;}
    public void setMaxAge(int age) {maxAge = age;}

    public void resetMaxAge() {maxAge = 150;}

    public String toString() {return getName() + " | " + getAge() + " | " + getMaxAge();}
}