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

package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX6.NO3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Long counter;
    private String input;
    private Person unix;

    @BeforeEach
    void setUp() {
        this.counter = 0L;
        this.input = "Frau Dr. Eva Müller, Hochschule Bonn-Rhein-Sieg, Fachbereich Informatik, Grantham-Allee 20, 53757 Sankt Augustin";
        this.unix = new Person(input);
    }

    @AfterEach
    void tearDown() {
        this.counter = null;
        this.input = null;
        this.unix= null;
    }

    @Test
    void getSalutation() {
        assertEquals("Frau", this.unix.getSalutation(), "that's not working like intended. try smarter! - " + ++this.counter);
    }

    @Test
    void getTitle() {
        assertEquals("Dr.", this.unix.getTitle(), "that's not working like intended. try smarter! - " + ++this.counter);
    }

    @Test
    void getFirstName() {
        assertEquals("Eva", this.unix.getFirstName(), "that's not working like intended. try smarter! - " + ++this.counter);
    }

    @Test
    void getLastName() {
        assertEquals("Müller", this.unix.getLastName(), "that's not working like intended. try smarter! - " + ++this.counter);
    }

    @Test
    void getOrganisation() {
        assertEquals("Hochschule Bonn-Rhein-Sieg", this.unix.getOrganisation(), "thats not working like intended. try smarter! - " + ++this.counter);
    }

    @Test
    void getDepartment() {
        assertEquals("Fachbereich Informatik", this.unix.getDepartment(), "that's not working like intended. try smarter! - " + ++this.counter);
    }

    @Test
    void getStreet() {
        assertEquals("Grantham-Allee", this.unix.getStreet(), "that's not working like intended. try smarter! - " + ++this.counter);
    }

    @Test
    void getHouseNumber() {
        assertEquals("20", this.unix.getHouseNumber(), "that's not working like intended. try smarter! - " + ++this.counter);
    }

    @Test
    void getZIPCode() {
        assertEquals("53757", this.unix.getZIPCode(), "that's not working like intended. try smarter! - " + ++this.counter);
    }

    @Test
    void getTown() {
        assertEquals("Sankt Augustin", this.unix.getTown(), "that's not working like intended. try smarter! - " + ++this.counter);
    }
}