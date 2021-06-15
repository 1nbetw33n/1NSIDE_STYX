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

package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX8.NO2;

import java.util.Iterator;

class PartialOrdering implements Iterable<String> {

    private String[][] order;

    public PartialOrdering(String[][] order){
        this.order = order;
    }

    public Iterator<String> iterator(){
        return new TopSortIterator( this.order );
    }

    public static PartialOrdering studentLife(){
        return new PartialOrdering(new String[][]{
                {"Aufstehen", "Frühstücken"},
                {"Aufstehen", "KaffeeTrinken"},
                {"Frühstücken", "Lernen"},
                {"KaffeeTrinken", "Lernen"}
        });
    }

    public static void main(String[] args) {
        for ( String step : studentLife() ) {
            System.out.println( step );
        }
    }
}

