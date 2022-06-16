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

package _1nbetw33n._1NSIDE_STYX.SS22_Prog2_Exercises;

/*
 * Created by 0x1nbetw33n on 08/06/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SnakeMatrixIterator<T> implements Iterator<T> {
    
    private final T[][] snakeMatrix;
    private int j, i;

    public SnakeMatrixIterator(@NotNull T[][] snakeMatrix) {this.snakeMatrix = snakeMatrix;}

    public boolean hasNext() {return i < snakeMatrix[0].length;}

    public T next() {
        if (!hasNext()){throw new NoSuchElementException();}
        //EVEN ROWs
        if ((i % 2) == 0){
            //FIRST TO PENULTIMATE INDEX
            if (j < snakeMatrix.length - 1){return snakeMatrix[i][j++];}
            //LAST INDEX
            else {return snakeMatrix[i++][j];}
        }
        //ODD ROws
        else{
            //LAST INDEX TO SECOND INDEX
            if (j > 0){return snakeMatrix[i][j--];}
            //FIRST INDEX
            else{return snakeMatrix[i++][j];}
        }
    }

    public static void main(String[] args){
        Integer[][] snakeMatrix = new Integer[][]{
                                                                                {1, 2, 3},
                                                                                {4, 5, 6},
                                                                                {7, 8, 9}
                                                                                };
        SnakeMatrixIterator<Integer> snakeMatrixIterator = new SnakeMatrixIterator<>(snakeMatrix);
        while(snakeMatrixIterator.hasNext()){
            System.out.println(snakeMatrixIterator.next());
        }
    }

}



























