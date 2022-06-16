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

package _1nbetw33n._1NSIDE_STYX.AdventOfCode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Created by 0x1nbetw33n on 10/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class SubmarineTest {
    Submarine submarine;

    @BeforeEach
    void setup(){submarine = new Submarine();}

    @AfterEach
    void tearDown(){submarine = null;}

    @Test
    @DisplayName("tests if submarine methods moving the submarine like expected")
    void testSubmarineMoving() {
        submarine.forward(5);
        submarine.down(5);
        submarine.forward(8);
        submarine.up(3);
        submarine.down(8);
        submarine.forward(2);
        assertEquals(15, submarine.x);
        assertEquals(10, submarine.y);
        assertEquals(150, submarine.x * submarine.y);
    }

}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme