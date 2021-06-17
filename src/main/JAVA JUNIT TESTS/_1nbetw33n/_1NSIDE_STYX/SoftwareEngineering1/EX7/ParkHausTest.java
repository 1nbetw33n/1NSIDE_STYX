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

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

final class ParkHausTest {

    private Long       counter;
    private Auto       auto1;
    private Auto       auto2;
    private Auto       auto3;
    private Auto       auto4;
    private Auto       auto5;
    private Auto[]     autos;
    private Kunde      kunde1;
    private Kunde      kunde2;
    private Kunde      kunde3;
    private Kunde      kunde4;
    private Kunde      kunde5;
    private ParkHaus   parkhaus;
    private Integer    autoListSum;
    private List<Auto> ListOfCarsParkingLongerThanOneDay;

    @BeforeEach
    void setUp() {
        this.counter = 0L;
        this.auto1 = new Auto();
        this.auto2 = new Auto();
        this.auto3 = new Auto();
        this.auto4 = new Auto();
        this.auto5 = new Auto();
        this.autos = new Auto[]{this.auto1, this.auto2, this.auto3, this.auto4, this.auto5};
        this.kunde1 = new Kunde();
        this.kunde2 = new Kunde();
        this.kunde3 = new Kunde();
        this.kunde4 = new Kunde();
        this.kunde5 = new Kunde();
        this.parkhaus = new ParkHaus();
        this.auto1.turbo = false;
        this.auto2.turbo = true;
        this.auto3.turbo = true;
        this.auto4.turbo = true;
        this.auto5.turbo = false;
        this.auto1.parkdauer = 10;
        this.auto2.parkdauer = 100;
        this.auto3.parkdauer = 1000;
        this.auto4.parkdauer = 10000;
        this.auto5.parkdauer = 100000;
        this.auto1.kunde = this.kunde1;
        this.auto2.kunde = this.kunde2;
        this.auto3.kunde = this.kunde3;
        this.auto4.kunde = this.kunde4;
        this.auto5.kunde = this.kunde5;
        this.kunde1.firma = false;
        this.kunde2.firma = false;
        this.kunde3.firma = true;
        this.kunde4.firma = true;
        this.kunde5.firma = true;
        this.parkhaus.gebühr = 13;
        this.autoListSum = Arrays.stream(this.autos)
                                 .filter(x -> ((x.hatTurbo()) && (x.kunde.istFirma())))
                                 .map(x -> (x.parkdauer * parkhaus.gebühr()))
                                 .reduce(0, Integer::sum);
        this.ListOfCarsParkingLongerThanOneDay = Arrays.stream(this.autos)
                                                       .filter(x -> ((x.kunde.istFirma()) && (x.parkdauer() > 1440)))
                                                       .collect(Collectors.toList());
    }

    @AfterEach
    void tearDown() {
        this.counter = null;
        this.auto1 = null;
        this.auto2 = null;
        this.auto3 = null;
        this.auto4 = null;
        this.auto5 = null;
        this.autos = null;
        this.kunde1 = null;
        this.kunde2 = null;
        this.kunde3 = null;
        this.kunde4 = null;
        this.kunde5 = null;
        this.parkhaus = null;
        this.autoListSum = null;
        this.ListOfCarsParkingLongerThanOneDay = null;
    }

    @SuppressWarnings("NonAsciiCharacters")
    @Test
    @DisplayName("tests sumGebühr")
    /* tests, if the following works correctly:
            filter out all Autos, whose customer is a company,
            and filter out all Auto without turbo,
            then do for every car (parking time * parking garage fee) and sum it up
     */
    void sumGebühr() {
        assertEquals(143000, this.autoListSum, "That's not working like it should! Try Again:) - " + ++this.counter);
    }

    @Test
    @DisplayName("tests listCompanies")
    /* tests if the following works correctly:
            filter out all cars associated to a company
            and with parking time <= 1day
     */
    void listCompanies() {
        assertEquals(Arrays.asList(this.auto4, this.auto5), this.ListOfCarsParkingLongerThanOneDay, "That's not working like it should! Try Again:) - " + ++this.counter);
    }


}