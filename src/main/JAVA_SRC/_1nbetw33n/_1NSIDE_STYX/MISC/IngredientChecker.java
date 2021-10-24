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
/*
1nbetw33n
15.Oct.2021
*/

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IngredientChecker {
    private static final long         serialVersionUID = 1L;
    private static       List<String> BLACKLIST;

    /*
    this block will always be executed before any method call
     */
    static {
        try {
            //blacklist.txt -> BLACKLIST as List<String>
            BLACKLIST = file2List("/home/bella/Documents/private/PERSONAL/BLACKLIST.txt")
                    .stream()
                    //removes the first 5 lines from the blacklist, since these are only comments
                    .skip(5)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    file -> stream -> lower casing each string -> list of strings
    */
    protected static List<String> file2List(@NotNull final String PATH) throws IOException {
        List<String> list = Files
                .lines(Paths.get(PATH))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        //removes empty lines
        list.removeAll(Collections.singleton(""));
        return list;
    }

    /*
    gets the path of the file, that contains the ingredients
    - then using file2List(@NotNull final String PATH)
    - then checks for each ingredient if the ingredient has a match on my blacklist
    IF ingredient is on my blacklist:
        adds the ingredient to list of matches
    RETURNS a list with all the ingredients that got a match OR a list containing only the string  'safe to use:)' if there are no matching ingredients
     */
    protected static List<String> showMatches(@NotNull final String INGREDIENTS) throws IOException {
        List<String> matches = new ArrayList<>();
        List<String> ingredients          = file2List(INGREDIENTS);
        for (String ingredient : ingredients) {
            if (BLACKLIST.stream().anyMatch(ingredient::contentEquals)){
               matches.add(ingredient);
            }
        }
        matches.forEach(System.out::println);
        return matches.isEmpty() ? new ArrayList<>(Collections.singleton("safe to use:)")) : matches;
    }


    public static void main(String[] args) throws IOException {
        System.out.println(showMatches("/home/bella/Documents/private/PERSONAL/INGREDIENTS.txt"));
        //BLACKLIST.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }





}
