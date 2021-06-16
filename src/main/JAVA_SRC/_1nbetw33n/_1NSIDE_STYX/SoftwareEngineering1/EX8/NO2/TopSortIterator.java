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
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class TopSortIterator<E> implements Iterator<E> {

    private E[] elements;
    private Integer cursor;

    public TopSortIterator(final E[][] ELEMENTS)
    {
        this.elements = (E[]) Stream.of(ELEMENTS)
                                    .flatMap(Stream::of)
                                    .toArray(Object[]::new);
    }

    public boolean hasNext()
    {
        return this.elements.length < this.cursor;
    }


    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        } else {
            return this.elements[this.cursor++];
        }
    }


    public void remove() {
        Iterator.super.remove();
    }
}
