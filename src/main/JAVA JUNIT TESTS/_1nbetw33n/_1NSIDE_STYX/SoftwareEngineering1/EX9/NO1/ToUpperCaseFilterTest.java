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
import java.io.FilterInputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Filter;

import static org.junit.jupiter.api.Assertions.*;

class ToUpperCaseFilterTest {

    private static final long     serialVersionUID = 1L;
    private Long                      counter;
    private ToUpperCaseFilter mixedCases;

    @BeforeEach
    void setUp()
    {
        this.counter = 0L;
        this.mixedCases =new ToUpperCaseFilter(new ByteArrayInputStream("HelloWorld".getBytes(StandardCharsets.UTF_8)));
    }

    @AfterEach
    void tearDown()
    {
        this.counter = null;
        this.mixedCases = null;
    }

    @Test
    @DisplayName("ToUppercase-Behaviour test")
    void operation()
    {
        assertEquals("HelloWorld", this.mixedCases.name, "That's not working like it should. Try again!:) " + ++this.counter);
        assertEquals("HELLOWORLD", this.mixedCases.operation(), "That's not working like it should. Try again!:) " + ++this.counter);
        assertNotEquals("helloworld", this.mixedCases.operation(), "That's not working like it should. Try again!:) " + ++this.counter);
    }



























}