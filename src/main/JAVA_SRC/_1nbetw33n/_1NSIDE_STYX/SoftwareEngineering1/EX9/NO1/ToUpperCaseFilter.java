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

package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX9.NO1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class ToUpperCaseFilter extends FilterInputStream {



    protected ToUpperCaseFilter(InputStream in) throws IOException {
        super(readToUpper(in));
    }

    final private static InputStream readToUpper(InputStream in)
    {
        return new ByteArrayInputStream(new BufferedReader(new InputStreamReader(in))
                .lines()
                .parallel()
                .collect(Collectors.toList())
                .toString()
                .replaceAll("\\[", "")
                .replaceAll("]", "")
                .toUpperCase()
                .getBytes(StandardCharsets.UTF_8)
        );
    }

    final protected static String asString(ToUpperCaseFilter in)
    {
        return new BufferedReader(new InputStreamReader(in))
                .lines()
                .parallel()
                .collect(Collectors.toList())
                .toString()
                .replaceAll("\\[", "")
                .replaceAll("]", "");
    }
}
