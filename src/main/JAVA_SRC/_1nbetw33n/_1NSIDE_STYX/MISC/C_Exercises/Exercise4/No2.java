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

import java.util.*;

public class No2 {

    //EVERYTHING ALLOWED
    static int[] toBinaryString(int integer) throws Exception {
        if (integer < 0){
            throw new Exception("Outside of interval [0, infinity]");
        }
        int[] binaryString;
        LinkedList<Integer> bytes = new LinkedList<>();
        while(integer > 0){
            bytes.addFirst(integer % 2);
            integer /= 2;
        }
        binaryString = new int[bytes.size()];
        for (int i = 0; i < binaryString.length; i++){
            binaryString[i] = (bytes.removeFirst());
        }
        return binaryString;
    }

    //ARRAYS ONLY
    static int[] toBinaryString2(int integer) throws Exception {
        if (integer < 0){
            throw new Exception("Outside of interval [0, infinity]");
        }
        int[] bytes = new int[32];
        int[] binaryString;
        int zeroCounter;
        //DECIMAL -> BINARY (LEAST SIGNIFICANT BIT STORED AT LAST INDEX)
        for (int i = bytes.length - 1; true; i--){
            if(!(integer > 0)){
                zeroCounter = i +1;
                break;
            }
            bytes[i] = (integer % 2);
            integer /= 2;
        }
        binaryString = new int[bytes.length - zeroCounter];
        //REMOVING LEADING ZEROS
        for (int i = 0, j = zeroCounter; i < binaryString.length; i++, j++){
            binaryString[i] = bytes[j];
        }
        return binaryString;
    }

    static void testToBinaryString(int input) throws Exception {
        StringBuilder output = new StringBuilder();
        int[] binaryString= toBinaryString(input);
        for(int bit : binaryString){
           output.append(bit);
        }
       System.out.println(output);
    }

    static void testToBinaryString2(int input) throws Exception {
        StringBuilder output = new StringBuilder();
        int[] binaryString= toBinaryString2(input);
        for(int bit : binaryString){
            output.append(bit);
        }
        System.out.println(output);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int input = sc.nextInt();
        testToBinaryString(input);
        testToBinaryString2(input);
    }

}
