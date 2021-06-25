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

package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX10;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateCalculatorTest {

    @SuppressWarnings("unused")
    final private static Long serialVersionUID = 1L;
    private Long counter;
    private StateCalculator calculator;

    @BeforeEach
    void setUp() {
        this.counter = 0L;
        this.calculator = new StateCalculator();
    }

    @AfterEach
    void tearDown() {
        this.counter = null;
    }

    @Test
    @DisplayName("Redo Tested Here")
    void redoTest(){}

    @Test
    @DisplayName("Undo Tested Here")
    void undoTest(){}

    @Test
    @DisplayName("Addition Tested Here")
    void addTest() {}

    @Test
    @DisplayName("Subtraction Tested Here")
    void subtractTest(){}

    @Test
    @DisplayName("Multiplication Tested Here")
    void multiplyTest(){}

    @Test
    @DisplayName("Division Tested Here")
    void divideTest(){}

}