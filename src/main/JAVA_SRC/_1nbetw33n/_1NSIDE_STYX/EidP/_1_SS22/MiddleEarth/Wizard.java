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

public class Wizard extends Entity{

    public Wizard(String name, int age) {super(name, age);}

    public boolean alive() {return true;}

    public String greet() {return "Hail!";}

    public void getsWounded(int damage) {System.out.println("Wounding an immortal entity is pointless since they're immortal! ^.^");}

    public void heals(Hobbit hobbit){
        if (hobbit.alive()){hobbit.resetMaxAge();}
        else{throw new IllegalStateException("This Hobbit already died! Not even a wizard can resurrect them anymore.");}
    }

    public String toString() {return getName() + " | " + getAge() + " | lives forever";}

}