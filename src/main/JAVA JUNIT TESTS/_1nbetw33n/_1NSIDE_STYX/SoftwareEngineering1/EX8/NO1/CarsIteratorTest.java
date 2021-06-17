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

package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX8.NO1;

import org.junit.jupiter.api.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class CarsIteratorTest {

    @SuppressWarnings("unused")
    private static final Long serialVersionUID = 1L;

    private Long counter;
    private String car0;
    private String car1;
    private String car2;
    private String car3;
    private String car4;
    private List<String> cars;
    private Iterator<String> evenIterator;
    private Iterator<String> unevenIterator;
    private Iterator<String > commonIterator;

    @BeforeEach
    void setUp() {
        this.counter = 0L;
        this.car0 = "Model S";
        this.car1 = "Model 3";
        this.car2 = "Model X";
        this.car3 = "Model Y";
        this.car4 = "Model Z";
        this.cars = Arrays.stream(new String[]{this.car0, this.car1, this.car2, this.car3, this.car4})
                            .collect(Collectors.toList());
        this.evenIterator = new EvenUnevenIterator<>(this.cars, true);
        this.unevenIterator = new EvenUnevenIterator<>(this.cars, false);
        this.commonIterator = new EvenUnevenIterator<>(this.cars);
    }

    @AfterEach
    void tearDown() {
        this.counter = null;
        this.car0 = null;
        this.car1 = null;
        this.car2 = null;
        this.car3 = null;
        this.car4 = null;
        this.cars = null;
        this.evenIterator = null;
        this.unevenIterator = null;
        this.commonIterator = null;
    }


    @Test
    @DisplayName("IteratorBehavior")
    void testIteratorBehaviour() {
        List<String> evenList = new ArrayList<>();
        List<String> unevenList = new ArrayList<>();
        List<String> commonList = new ArrayList<>();

        for (Iterator<String> e = this.evenIterator; e.hasNext();)
        {
            evenList.add(e.next());
        }
        for (Iterator<String> u = this.unevenIterator; u.hasNext();)
        {
            unevenList.add(u.next());
        }
        for (Iterator<String> c = this.commonIterator; c.hasNext();)
        {
            commonList.add(c.next());
        }
        assertEquals(Arrays.stream(new String[] {this.car0, this.car2, this.car4}).collect(Collectors.toList()), evenList, "That's not working like it should. Try again! " + ++this.counter);
        assertEquals(Arrays.stream(new String[] {this.car1, this.car3}).collect(Collectors.toList()), unevenList, "That's not working like it should. Try again! " + ++this.counter);
        assertEquals(Arrays.stream(new String[] {this.car0, this.car1, this.car2, this.car3, this.car4}).collect(Collectors.toList()), commonList, "That's not working like it should. Try again! " + ++this.counter);
    }



}