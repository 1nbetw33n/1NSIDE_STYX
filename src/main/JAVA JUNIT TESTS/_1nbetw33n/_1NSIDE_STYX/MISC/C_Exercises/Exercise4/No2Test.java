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

package _1nbetw33n._1NSIDE_STYX.MISC.C_Exercises.Exercise4;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static _1nbetw33n._1NSIDE_STYX.MISC.C_Exercises.Exercise4.No2.toBinaryString;
import static _1nbetw33n._1NSIDE_STYX.MISC.C_Exercises.Exercise4.No2.toBinaryString2;
import static org.junit.jupiter.api.Assertions.*;

class No2Test {

    private int no1;
    private int no2;
    private int no3;
    private int no4;
    private int no5;
    private int[] binaryString1;
    private int[] binaryString2;
    private int[] binaryString3;
    private int[] binaryString4;
    private int[] binaryString5;
    private int[] intArray1;
    private int[] intArray2;
    private int[] intArray3;
    private int[] intArray4;
    private int[] intArray5;
    private String expectedValue1;
    private String expectedValue2;
    private String expectedValue3;
    private String expectedValue4;
    private String expectedValue5;



    @BeforeEach
    void setUp() throws Exception {
        no1 = 17;
        no2 = 8;
        no3 = 32;
        no4 = 56;
        no5 = 35;
        expectedValue1 = "10001";
        expectedValue2 = "1000";
        expectedValue3 = "100000";
        expectedValue4 = "111000";
        expectedValue5 = "100011";
        binaryString1 = toBinaryString(no1);
        binaryString2 = toBinaryString(no2);
        binaryString3 = toBinaryString(no3);
        binaryString4 = toBinaryString(no4);
        binaryString5 = toBinaryString(no5);
        intArray1 = toBinaryString2(no1);
        intArray2 = toBinaryString2(no2);
        intArray3 = toBinaryString2(no3);
        intArray4 = toBinaryString2(no4);
        intArray5 = toBinaryString2(no5);
    }

    @AfterEach
    void tearDown(){
        no1 = 0;
        no2 = 0;
        no3 = 0;
        no4 = 0;
        no5 = 0;
        expectedValue1 = null;
        expectedValue2 = null;
        expectedValue3 = null;
        expectedValue4 = null;
        expectedValue5 = null;
        binaryString1 = null;
        binaryString2 = null;
        binaryString3 = null;
        binaryString4 = null;
        binaryString5 = null;
        intArray1 = null;
        intArray2 = null;
        intArray3 = null;
        intArray4 = null;
        intArray5 = null;
    }

    @Test
    @DisplayName("checks if the array contains the expected number as binary number in the correct order")
    void testToBinaryString1() {
        assertEquals(Arrays.toString((expectedValue1).toCharArray()), Arrays.toString(binaryString1));
        assertEquals(Arrays.toString((expectedValue2).toCharArray()), Arrays.toString(binaryString2));
        assertEquals(Arrays.toString((expectedValue3).toCharArray()), Arrays.toString(binaryString3));
        assertEquals(Arrays.toString((expectedValue4).toCharArray()), Arrays.toString(binaryString4));
        assertEquals(Arrays.toString((expectedValue5).toCharArray()), Arrays.toString(binaryString5));
        assertEquals(Arrays.toString((expectedValue1).toCharArray()), Arrays.toString(intArray1));
        assertEquals(Arrays.toString((expectedValue2).toCharArray()), Arrays.toString(intArray2));
        assertEquals(Arrays.toString((expectedValue3).toCharArray()), Arrays.toString(intArray3));
        assertEquals(Arrays.toString((expectedValue4).toCharArray()), Arrays.toString(intArray4));
        assertEquals(Arrays.toString((expectedValue5).toCharArray()), Arrays.toString(intArray5));
    }

}
//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme