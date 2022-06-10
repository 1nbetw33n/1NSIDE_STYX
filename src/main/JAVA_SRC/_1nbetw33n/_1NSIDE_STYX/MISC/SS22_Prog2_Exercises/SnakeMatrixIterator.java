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

package _1nbetw33n._1NSIDE_STYX.MISC.SS22_Prog2_Exercises;

/*
 * Created by 0x1nbetw33n on 08/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SnakeMatrixIterator<T> implements Iterator<T> {
    
    private T[][] snakeMatrix;
    private int i;
    private int j;

    public SnakeMatrixIterator(@NotNull T[][] snakeMatrix) {this.snakeMatrix = snakeMatrix;}

    public boolean hasNext() {
        if (!(j  < snakeMatrix[j].length)){return false;}
        return true;
    }

    public T next() {
        if (!hasNext()){throw new NoSuchElementException();}
        //EVEN ROWs
        if ((j % 2) == 0){
            //FIRST TO PENULTIMATE INDEX
            if (i < snakeMatrix.length - 1){return snakeMatrix[i++][j];}
            //LAST INDEX
            else {return snakeMatrix[i][j++];}
        }
        //ODD ROws
        else{
            //LAST INDEX TO SECOND INDEX
            if (i > 1){return snakeMatrix[i--][j];}
            //FIRST INDEX
            else{return snakeMatrix[i][j++];}
        }
    }

}



























