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
        this.calculator.add(3.);
        this.calculator.multiply(2.);
        this.calculator.subtract(-10.);
        this.calculator.undo();
    }

    @AfterEach
    void tearDown() {
        this.counter = null;
    }

    @Test
    @DisplayName("Redo Tested Here")
    void redoTest(){
        this.calculator.redo();
        assertEquals(16., this.calculator.currentState.state, "Looks like this isn't working like its supposed to. Try again:) No." + ++this.counter);
    }

    @Test
    @DisplayName("Undo Tested Here")
    void undoTest()
    {
        this.calculator.undo();
        assertEquals(3., this.calculator.currentState.state, "Looks like this isn't working like its supposed to. Try again:) No." + ++this.counter);
    }

    @Test
    @DisplayName("Addition Tested Here")
    void addTest()
    {
        this.calculator.add(89.);
        assertEquals(95., this.calculator.currentState.state, "Looks like this isn't working like its supposed to. Try again:) No." + ++this.counter);

    }

    @Test
    @DisplayName("Subtraction Tested Here")
    void subtractTest()
    {
        this.calculator.subtract(5.);
        assertEquals(1., this.calculator.currentState.state, "Looks like this isn't working like its supposed to. Try again:) No." + ++this.counter);

    }

    @Test
    @DisplayName("Multiplication Tested Here")
    void multiplyTest()
    {
        this.calculator.multiply(10.);
        assertEquals(60., this.calculator.currentState.state, "Looks like this isn't working like its supposed to. Try again:) No." + ++this.counter);

    }

    @Test
    @DisplayName("Division Tested Here")
    void divideTest()
    {
        this.calculator.divide(3.);
        assertEquals(2., this.calculator.currentState.state, "Looks like this isn't working like its supposed to. Try again:) No." + ++this.counter);

    }

}