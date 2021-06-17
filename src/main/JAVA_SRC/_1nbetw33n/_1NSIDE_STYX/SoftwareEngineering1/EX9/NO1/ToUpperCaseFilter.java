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

import java.io.BufferedReader;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class ToUpperCaseFilter extends FilterInputStream {

    protected final String name;

    protected ToUpperCaseFilter(InputStream in)
    {
        super(in);
        this.name = new BufferedReader(new InputStreamReader(in))
                                .lines()
                                .parallel()
                                .collect(Collectors.toList())
                                .toString()
                                .replaceAll("\\[", "")
                                .replaceAll("]", "").toUpperCase();
    }

    public String operation() { return this.name.toUpperCase(); }

}
