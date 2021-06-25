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

package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX10;



import java.util.List;
import java.util.Stack;

public class StateCalculator {

    private List<State> states = new Stack<>();
    protected State previousState,
                             currentState,
                             nextState;

    final protected void redo()
    {
        this.currentState = this.previousState;
    }

    final protected void undo()
    {
        this.currentState = this.previousState;
    }

    final protected void add(final Double NUMBER) { }

    final protected void subtract(final Double NUMBER) { }

    final protected void multiply(final Double NUMBER) { }

    final protected void divide(final Double NUMBER) { }


    protected class State {

        protected Double state;

        State(){}

        State(final State STATE){}

        final public String toString(){return "" + this.state;}

    }

}
