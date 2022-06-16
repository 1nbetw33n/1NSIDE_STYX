/*
 *
 * copyright (c) 2022 1nbetw33n Labs
 * Virgo Supercluster, Milky Way - Earth A-6847
 * All rights reserved
 *
 * This software is the confidential and proprietary information of
 * 1nbetw33n Labs. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * 1nbetw33n Labs.
 *
 */


package _1nbetw33n._1NSIDE_STYX.MISC.C_Exercises.Exercise4;

/*
 * Created by 0x1nbetw33n on 13/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class No5 {

    private static final List<? super Character> FILTER_LIST;
    private static final String filterString = "abcdefghijklmnopqrstuvwxyz0123456789";

    static{FILTER_LIST = filterString.chars().mapToObj(c -> (char) c).collect(Collectors.toList());}

    @SuppressWarnings("SameParameterValue")
    static void countOccurrences(@NotNull String text, List< ? super Character> filterList){
        int unknownCharactersCount = 0;
        HashMap<? super Character, ? super Integer> matches = new HashMap<>();
        List<? extends Character> textAsList = text.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    for (Character c : textAsList) {
        if (filterList.contains(c)) {
            if (matches.containsKey(c)) {matches.put(c, ((int) matches.get(c)) + 1);}
            else {matches.put(c, 1);}
        } else {if(c != ' '){unknownCharactersCount++;}}
    }
    matches.forEach((key, value) -> System.out.println(key + ": " + value + "\n"));
    System.out.println("unknown characters: " + unknownCharactersCount);
    }

    public static void main(String[] args) {
        String text1 = "Hello World!";
        countOccurrences(text1, FILTER_LIST);
    }

}