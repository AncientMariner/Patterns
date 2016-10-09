package org.xander.behavioral.State;

public class GumballMachine {
    State soldOutState;
    State noQarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberOfBalls) {
        soldOutState = new SoldOutState(this);
        noQarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberOfBalls;

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

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        return "\nGumBall Machine Model #T1000"
                + "\nInventory: "
                + getCount()
                + " gumballs"
                + "\nMachine is waiting for quarter...";
    }
}
