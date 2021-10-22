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
import java.util.stream.Stream;

public class IngredientChecker {
    private static final    long              serialVersionUID = 1L;
    private static          List<String>      BLACKLIST;

    static {
        try {
            BLACKLIST = file2List("/home/bella/Documents/private/PERSONAL/blacklist.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    file -> stream -> list of strings -> lower cases each string
    */
    protected static List<String> file2List(@NotNull final String PATH) throws IOException {
        Stream<String> lines = Files.lines(Paths.get(PATH));
        return lines
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    /*
    - gets the path of the file, that contains the ingredients
    - then converting it into a list of lower cased strings
    - then checks if any ingredient is on the blacklist
    - IF NOTHING FOUND: adds a single entry to the list 'safe to use:)' and returns the list
    - ELSE: returns a list, containing the ingredients with a match
      */
   protected static List<String> checkIfBlacklisted(@NotNull final String INGREDIENTS) throws IOException {
       List<String> ingredients = file2List(INGREDIENTS);
       if (ingredients.stream().anyMatch(BLACKLIST::contains)){
           //returns the ingredients with a match on the blacklist
           return ingredients.stream()
                             .filter(BLACKLIST::contains)
                             .collect(Collectors.toList());
       }
       else{
           //adds a single string 'safe to use:)' to the former empty list
           return new ArrayList<>(Collections.singleton("safe to use:)"));
       }
   }

}
