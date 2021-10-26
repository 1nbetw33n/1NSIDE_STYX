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

package _1nbetw33n._1NSIDE_STYX.MISC;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static _1nbetw33n._1NSIDE_STYX.MISC.IngredientChecker.showMatches;
import static org.junit.jupiter.api.Assertions.*;

class IngredientCheckerTest {

    private String ingredients0;
    private String ingredients1;
    private String ingredients2;
    private String olaplex5;
    private List<String> referenceList;

    @SuppressWarnings({"unchecked", "rawtypes", "SpellCheckingInspection"})
    @BeforeEach
    void setUp() {
        ingredients0 = "/home/bella/Documents/private/PERSONAL/ingredientsTest0_file2List.txt";
        ingredients1 = "/home/bella/Documents/private/PERSONAL/ingredientsTest1_file2List.txt";
        ingredients2 = "/home/bella/Documents/private/PERSONAL/ingredientsTest2_file2List.txt";
        olaplex5 = "/home/bella/Documents/private/PERSONAL/OLAPLEX5.txt";
        referenceList = new ArrayList();
        referenceList.add("aplha");
        referenceList.add("beta");
        referenceList.add("gamma");
        referenceList.add("delat");
    }

    @AfterEach
    void tearDown() {
        ingredients0 = null;
        ingredients1 = null;
        ingredients2 = null;
        olaplex5 = null;
        referenceList = null;
    }


    @Test
    @DisplayName("checks if file content is converted correctly into a list")
    void file2ListTest() throws IOException {
        assertEquals(referenceList, IngredientChecker.file2List(ingredients0));
    }

    @Test
    @DisplayName("positive checks if any ingredient is on the blacklist")
    void checkProductPositiveTest() throws IOException {
        //there should be hits for "methylparabene", "bisaminopropyl dimethicone","isopropanol"
        assertEquals(Arrays.asList("methylparabene", "bisaminopropyl dimethicone","isopropanol"), showMatches(ingredients1));
    }

    @Test
    @DisplayName("checks with a real product")
    void checkOlaplex5() throws IOException {
        //there should be hits for "cetyl esters", "isododecane", "quaternium-95", "peg-8", "c11-15 pareth-7", "amodimethicone", "c12-13 pareth-23", "c12-13 pareth-3", "laureth-9", "phenoxyethanol"
        assertEquals(Arrays.asList("cetyl esters", "isododecane", "quaternium-95", "peg-8", "c11-15 pareth-7", "amodimethicone", "c12-13 pareth-23", "c12-13 pareth-3", "laureth-9", "phenoxyethanol"), showMatches(olaplex5));
    }

    @Test
    @DisplayName("false checks if any ingredient is on the blacklist")
    void checkProductFalseTest() throws IOException {
        //there should be no hits -> only 'safe to use:)' should be in the list
        assertEquals(showMatches(ingredients2), new ArrayList<>(Collections.singleton("safe to use:)")));
    }

}