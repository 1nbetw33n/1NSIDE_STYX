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
 * Created by 0x1nbetw33n on 18/07/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import java.util.Random;

public class BinaryChoice {

    private static final String[] binaryChoice = {"Frau", "Mann"};
    private static final Random random = new Random();

    private static String getRandomBinaryChoice() {
        return binaryChoice[random.nextInt(binaryChoice.length)];
    }

    public static void main(String[] args) {
        System.out.println(getRandomBinaryChoice());
    }
}