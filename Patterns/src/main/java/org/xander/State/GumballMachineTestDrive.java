package org.xander.State;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);
        //5 -1
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        //4 -1
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        //3 -1
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        //2 -1
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        //1 -1
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.refill(2);
        System.out.println(gumballMachine);

        //2 -1 + 1
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();

        //2 -1
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        //1 -1
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
