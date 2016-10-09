package org.xander.behavioral.ChainOfResponsibility;

public class ATMDispenseChain {
    private DispenseChain dispenseChain;

    public ATMDispenseChain() {
        // initialize the chain
        this.dispenseChain = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        // set the chain of responsibility
        dispenseChain.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
//        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
//			Scanner input = new Scanner(System.in);
//			amount = input.nextInt();
            amount = 15880;
            System.out.println("Amount entered is " + amount);
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            atmDispenser.dispenseChain.dispense(new Currency(amount));
//        }
    }

}