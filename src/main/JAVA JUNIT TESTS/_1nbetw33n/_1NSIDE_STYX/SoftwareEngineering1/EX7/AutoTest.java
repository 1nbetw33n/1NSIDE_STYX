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

package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    private Long counter;

    @BeforeEach
    void setUp() {
        this.counter = 0L;
    }

    @AfterEach
    void tearDown() {
        this.counter = null;
    }

    @Test
    @DisplayName("...")
    void hatTurbo() {
        assertEquals("","", "That's not working like it should. Try smarter!:) - " + ++this.counter);
    }

    @Test
    @DisplayName("...")
    void kunde() {
        assertEquals("","", "That's not working like it should. Try smarter!:) - " + ++this.counter);
    }

    @Test
    @DisplayName("...")
    void parkdauer() {
        assertEquals("","", "That's not working like it should. Try smarter!:) - " + ++this.counter);
    }
}