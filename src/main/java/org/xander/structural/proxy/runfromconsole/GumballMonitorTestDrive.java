package org.xander.structural.proxy.runfromconsole;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {
                "rmi://127.0.0.1/santafe.mightygumball.com/gumballmachine",
                "rmi://127.0.0.1/boulder.mightygumball.com/gumballmachine",
                "rmi://127.0.0.1/seattle.mightygumball.com/gumballmachine"
        };

        GumballMonitor[] gumballMonitor = new GumballMonitor[location.length];
        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
                gumballMonitor[i] = new GumballMonitor(gumballMachineRemote);
//                System.out.println(gumballMonitor[i]);
            } catch (RemoteException | MalformedURLException | NotBoundException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < gumballMonitor.length; i++) {
            gumballMonitor[i].report();
            System.out.println();
        }
    }
}
