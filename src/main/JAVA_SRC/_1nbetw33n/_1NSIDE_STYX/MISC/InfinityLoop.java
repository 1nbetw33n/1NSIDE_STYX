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

package _1nbetw33n._1NSIDE_STYX.MISC;

public class InfinityLoop {

    @SuppressWarnings("InfiniteLoopStatement")
    static void initLoop(){
        long x = 1;
        while(true){
            x *= Math.pow(x, x);
            System.out.println(x);
        }
    }

    public static void main(String[] args){
        initLoop();
    }
}
