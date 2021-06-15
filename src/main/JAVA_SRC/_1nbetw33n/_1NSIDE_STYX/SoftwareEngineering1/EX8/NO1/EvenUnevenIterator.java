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

package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX8.NO1;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class EvenUnevenIterator<E> implements Iterator<E> {

    private  Integer cursor;
    private Boolean Switch;
    private E[] elements;


    public EvenUnevenIterator(final List<E> LIST)
    {
        this.elements = (E[]) LIST.toArray();
        this.cursor = 0;
    };

    public EvenUnevenIterator(final List<E> LIST, final Boolean SWITCH)
    {
        this.elements = (E[]) LIST.toArray();
        this.Switch = SWITCH;
        this.cursor = this.Switch ? 0 : 1;
    }

    public boolean hasNext() {return this.cursor < this.elements.length;}

    public E next()

    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        else
        {
            /*
            Explanation: Switch = true: even
                                 Switch = false: uneven
                                 Switch = null: default foreach
             */
            if (this.Switch == null)
            {
                return this.elements[this.cursor++];
            }
            else
            {
                Integer tmp = this.cursor;
                this.cursor +=2;
                return this.elements[tmp];
            }
        }
    }

}
