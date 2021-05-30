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

package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX2.NO2;

public class time implements TimeCalculable{

    private int hours,
            minutes;


    public time(final int HOURS, final int MINUTES){
        this.hours = HOURS;
        this.minutes = MINUTES;
    }


    public String toString() {
        return this.hours + " : " + this.minutes;
    }


    public time calculate_time(final time TIME, final String OPERATOR) throws Exception{
        if (!(OPERATOR.equals("+")) || !(OPERATOR.equals("-"))){
            throw new Exception("illegal operation. only '+' and '-' permitted");
        } else {
            return OPERATOR.equals("-") ? new time(this.hours - TIME.hours, this.minutes - TIME.minutes) : new time(this.hours + TIME.hours, this.minutes + TIME.minutes);
        }
    }
}
