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

package _1nbetw33n._1NSIDE_STYX.Analysis;

public class ACAT2_2 {

    public static long n0(double eps) throws Exception {
        if(!(eps > 0 )){
            throw new Exception("0 outside of interval of [1, infinity)");
        }
        return (long) Math.ceil(1. / Math.pow(eps, 2));
    }

    public static void main(String[] args) throws Exception {
        System.out.println(n0(745674));
    }
}


