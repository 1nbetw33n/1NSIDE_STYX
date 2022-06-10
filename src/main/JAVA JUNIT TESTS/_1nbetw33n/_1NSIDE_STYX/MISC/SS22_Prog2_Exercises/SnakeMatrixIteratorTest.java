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

package _1nbetw33n._1NSIDE_STYX.MISC.SS22_Prog2_Exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 * Created by 0x1nbetw33n on 08/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */
class SnakeMatrixIteratorTest {

    private Integer[][] snakeMatrix;
    private SnakeMatrixIterator<Integer> snakeMatrixIterator;

    @BeforeEach
    private void setup() {
        snakeMatrix = new Integer[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        snakeMatrixIterator = new SnakeMatrixIterator<>(snakeMatrix);
    }

    @AfterEach
    private void tearDown(){
        snakeMatrix = null;
    }

    @Test
    void testHasNext() {
        for (int i = 1; i < 8; i++){
            assertTrue(snakeMatrixIterator.hasNext());
            snakeMatrixIterator.next();
        }
        assertFalse(snakeMatrixIterator.hasNext());
    }

    /*
    @Test
    void testNext() {
        Object result = snakeMatrixIterator.next();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
    */
}
//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme