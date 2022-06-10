
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

package _1nbetw33n._1NSIDE_STYX.MISC;

/*
 * Created by 0x1nbetw33n on 10/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import java.util.Arrays;
import java.util.List;

public class LAMBDAS {

    static int ggT(int no1, int no2){
        int max = Math.max(no1, no2);
        int min = Math.min(no1, no2);
        int remainder = 0;
        while (min > 0 ){
            remainder = Math.max(min, max) % Math.min(min, max);
            max = Math.min(min, max);
            min = remainder;
        }
        return max;
    }

    static boolean isPrime(int possiblePrime){
        for (int i = 2; i < possiblePrime; i++) {
            if(ggT(possiblePrime, i) != 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        Integer[] ints = new Integer[1000000];
        for (int i = 0; i < ints.length; i++){
            ints[i] = i + 1;
        }
        List<Integer> intsList = Arrays.asList(ints);
        intsList.stream().filter(LAMBDAS::isPrime).forEach(System.out::println);
    }
}

