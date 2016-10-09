package org.xander.structural.Proxy.runFromConsole;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    State soldOutState;
    State noQarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    String location;

    State state = soldOutState;
    int count = 0;

    public GumballMachine() throws RemoteException {
    }

    public GumballMachine(String location, int numberOfBalls) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberOfBalls;
        this.location = location;

        if (numberOfBalls > 0) {
            state = noQarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    void refill(int numberOfBalls) {
        System.out.println("\n-----Refilling the machine with " + numberOfBalls + " balls");
        this.count = numberOfBalls;
        state = noQarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public String getLocation() {

        return location;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public String toString() {
        return "\nGumBall Machine Model #T1000"
                + "\nInventory: "
                + getCount()
                + " gumballs"
                + "\nMachine is waiting for quarter...";
    }
}
