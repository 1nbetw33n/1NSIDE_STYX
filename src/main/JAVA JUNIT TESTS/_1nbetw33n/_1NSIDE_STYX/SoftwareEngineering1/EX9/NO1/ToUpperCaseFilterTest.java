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

package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX9.NO1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class ToUpperCaseFilterTest {

    @SuppressWarnings("unused")
    private static final long     serialVersionUID = 1L;
    private Long                      counter;
    private String                    mixedCases;
    private String                    allLowerCases;

    @BeforeEach
    void setUp() throws IOException {
        this.counter = 0L;
        this.mixedCases = "HelloWorld";
        this.allLowerCases = "helloworld";
    }

    @AfterEach
    void tearDown()
    {
        this.counter = null;
        this.mixedCases = null;
        this.allLowerCases = null;
    }

    @Test
    @DisplayName("ToUppercase-Behaviour test")
    void operation() throws IOException {
        assertEquals("HelloWorld", this.mixedCases, "That's not working like it should. Try again!:) " + ++this.counter);
        assertEquals("HELLOWORLD", ToUpperCaseFilter.asString(new ToUpperCaseFilter(new ByteArrayInputStream(this.mixedCases.getBytes(StandardCharsets.UTF_8)))), "That's not working like it should. Try again!:) " + ++this.counter);
        assertNotEquals("helloworld", ToUpperCaseFilter.asString(new ToUpperCaseFilter(new ByteArrayInputStream(this.allLowerCases.getBytes(StandardCharsets.UTF_8)))), "That's not working like it should. Try again!:) " + ++this.counter);
    }

}