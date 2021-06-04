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

final class AutoTest {

    private Long counter;
    private Auto auto1;
    private Auto auto2;
    private Auto auto3;

    @BeforeEach
    void setUp() {
        this.counter = 0L;
        this.auto1    = new Auto();
        this.auto2    = new Auto();
        this.auto3    = new Auto();
    }

    @AfterEach
    void tearDown() {
        this.counter = null;
        this.auto1    = null;
        this.auto2    = null;
        this.auto3    = null;
    }

    @Test
    @DisplayName("tests Auto.hatTurbo()")
    /* tests, if this methods returns correctly if the specified car has a build in turbo*/
    void hatTurbo() {
        assertTrue( ,, "That's not working like it should. Try smarter!:) - " + ++this.counter);
    }

    @Test
    @DisplayName("tests Auto.kunde()")
    /* tests, if this methods returns correctly the associated customer (kunde) object. */
    void kunde() {
        assertEquals("","", "That's not working like it should. Try smarter!:) - " + ++this.counter);
    }

    @Test
    @DisplayName("tests Auto.parkdauer()")
    /* tests, if this method returns the correct parking time (parkdauer) field of the associated car (auto) */
    void parkdauer() {
        assertEquals("","", "That's not working like it should. Try smarter!:) - " + ++this.counter);
    }
}