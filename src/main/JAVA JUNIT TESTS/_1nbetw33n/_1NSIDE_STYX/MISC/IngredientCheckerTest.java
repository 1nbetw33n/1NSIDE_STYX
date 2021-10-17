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
import java.util.Collections;
import java.util.List;

import static _1nbetw33n._1NSIDE_STYX.MISC.IngredientChecker.checkIfBlacklisted;
import static org.junit.jupiter.api.Assertions.*;

class IngredientCheckerTest {

    private String ingredients1;
    private String ingredients2;
    private List<String> reference;

    @SuppressWarnings({"unchecked", "rawtypes"})
    @BeforeEach
    void setUp() {
        this.ingredients1 = "/home/bella/Documents/private/PERSONAL/ingredients1.txt";
        this.ingredients2 = "/home/bella/Documents/private/PERSONAL/ingredients2.txt";
        this.reference = new ArrayList();
        this.reference.add("aplha");
        this.reference.add("beta");
        this.reference.add("gamma");
        this.reference.add("delat");
    }

    @AfterEach
    void tearDown() {
        this.ingredients1 = null;
        this.ingredients2 = null;
        this.reference = null;
    }

    @Test
    @DisplayName("checks if file content is converted correctly into a list ")
    void file2ListTest() throws IOException {
        assertEquals(this.reference, IngredientChecker.file2List(this.ingredients1));
    }

    @Test
    @DisplayName("positive checks if any ingredient is on the blacklist")
    void checkProductPositiveTest() throws IOException {
        assertEquals(checkIfBlacklisted(ingredients1), new ArrayList<>(Collections.singleton("beta")));
    }

    @Test
    @DisplayName("false checks if any ingredient is on the blacklist")
    void checkProductFalseTest() throws IOException {
        assertEquals(checkIfBlacklisted(ingredients2), new ArrayList<>(Collections.singleton("safe to use:)")));
    }

}