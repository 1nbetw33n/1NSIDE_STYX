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

package _1nbetw33n._1NSIDE_STYX.C.SS22.Exercise4;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class No1 {

    @Contract(pure = true)
    static int @NotNull [] createStaticArray(){
        int[] staticIntArray = new int[10];
        for (int i = 0; i < staticIntArray.length; i++){
            staticIntArray[i] = i +1;
        }
        return staticIntArray;
    }

    static void printIntArray(int @NotNull [] array){
        for(int integer : array){
            System.out.println(integer);
        }
    }

    static void testCreateStaticArray(){
        printIntArray(createStaticArray());
    }

    public static void main(String[] args){
        testCreateStaticArray();
    }

}
