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


import java.util.Stack;

public class StateCalculator {

    private final Stack<State> states = new Stack<>();
    protected     State        previousState,
                             currentState,
                             nextState;

    public StateCalculator()
    {
        this.previousState = new State();
        this.currentState = new State();
        this.nextState = new State();
    }


    final protected void redo() throws Exception {
        if (this.nextState == null){throw new Exception("Nothing to Redo. Undo Something first.");}
        this.previousState = new State(this.currentState);
        this.currentState = new State(this.nextState);
        this.states.add(this.nextState);
        this.nextState = null;
    }

    final protected void undo() throws Exception {
        if (this.previousState == null){throw new Exception("Nothing to Undo. Do something first ");}
        this.currentState = new State(this.previousState);
        this.previousState = new State(this.nextState);
        this.nextState = new State(this.states.pop());
    }

    final protected void add(final Double NUMBER)
    {
        this.currentState.state = this.currentState.state == null ? 0. : this.currentState.state;
        this.previousState = new State(this.currentState);
        this.currentState.state += NUMBER;
        this.states.add(new State(this.currentState));
    }

    final protected void subtract(final Double NUMBER)
    {
        this.currentState.state = this.currentState == null ? 0. : this.currentState.state;
        this.previousState = new State(this.currentState);
        this.currentState.state -= NUMBER;
        this.states.add(new State(this.currentState));
    }

    final protected void multiply(final Double NUMBER)
    {
        this.currentState.state = this.currentState == null ? 0. : this.currentState.state;
        this.previousState = new State(this.currentState);
        this.currentState.state *= NUMBER;
        this.states.add(new State(this.currentState));
    }

    final protected void divide(final Double NUMBER) throws Exception {
        if (NUMBER.equals(0.)){throw new Exception("Division by Zero is undefined. Define it first:)");}
        this.currentState.state = this.currentState == null ? 0. : this.currentState.state;
        this.previousState = new State(this.currentState);
        this.currentState.state /= NUMBER;
        this.states.add(new State(this.currentState));
    }


    protected class State {

        protected Double state;

        public State(){

        }

        public State(State STATE)
        {
            this.state = STATE.state;
        }

        final public String toString(){return "" + this.state;}
    }

}
