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

package _1nbetw33n._1NSIDE_STYX.Analysis;

/*
 * Created by 0x1nbetw33n on 02/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import java.util.function.Function;

@SuppressWarnings("unused")
public class ACAT4_3 {

    private static double nullstelle(Function<Double, Double> f, double a, double b) {
        double center = 0.;
        while (Math.abs(a - b) >= 1E-6) {
            center = (a + b) / 2;
            if (f.apply(center) == 0) {
                break;
            } else if (f.apply(a) * f.apply(center) < 0) {
                b = center;
            } else {
                a = center;
            }
        }
        return center;
    }

}