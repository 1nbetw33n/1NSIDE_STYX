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
    private static final long serialVersionUID = 1L;

    /*
    file -> stream -> list
    */
    protected static List<String> file2List(@NotNull final String PATH) throws IOException {
        Stream<String> lines = Files.lines(Paths.get(PATH));
        return lines.collect(Collectors.toList());
    }


    /*
    - gets two file paths
    - converts each file line by line into string lists
    - checks for items from INGREDIENTS that are listed in BLACKLIST and adds them to a list
    - if nothing found: adds a single entry to the list 'safe to use:)' and returns the list
    -else: return list
      */
   protected static List<String> checkIfBlacklisted(@NotNull final String INGREDIENTS, @NotNull final String BLACKLIST) throws IOException {
       List<String> ingredients = file2List(INGREDIENTS);
       List<String> blacklist = file2List(BLACKLIST);
       if (ingredients.stream().anyMatch(blacklist::contains)){
           return ingredients.stream()
                   .filter(blacklist::contains)
                           .collect(Collectors.toList());
       }
       else{
           return new ArrayList<>(Collections.singleton("safe to use:)"));
       }
   }

}
