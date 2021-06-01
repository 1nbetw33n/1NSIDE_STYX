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

package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX6.NO2;

final public class RegExCheck {



    final public static boolean validateRegExZIP(final String EXPRESSION) {
        return EXPRESSION.matches("^[0-9]{1}[1-9]{4}$");
    }


    final public static boolean validateRegExPhoneNumber(final String EXPRESSION) {
        return false;
    }


    final public static boolean validateRegExLicensePlate(final String EXPRESSION) {
        return EXPRESSION.matches("^[A-Z]{1,3}\\s[A-Z]{1,2}\\s[1-9]{1}[0-9]{1,3}\\s[H]*");
    }


    final public static boolean validateRegExMailAddress(final String EXPRESSION) {
        return EXPRESSION.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}$");
    }


    final public static boolean validateRegExURL(final String EXPRESSION) {
        return false;
    }


    final public static boolean validateRegExJavaDevComment(final String EXPRESSION) {
        return EXPRESSION.matches("^/\\*(.|[\\r\\n])*?\\*/$");
    }


    final public static boolean validateRegExJavaClassName(final String EXPRESSION) {
        return false;
    }
}
