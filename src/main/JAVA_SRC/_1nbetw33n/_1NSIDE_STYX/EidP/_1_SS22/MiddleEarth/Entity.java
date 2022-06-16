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

public abstract class Entity {

    private String name;
    private final int age;

    public Entity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract boolean alive();

    public abstract String greet();

    public abstract void getsWounded(int damage);

    public void status() {System.out.println(this + " | is alive: " +  alive());}

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public int getAge(){return age;}

    public abstract String toString();
}