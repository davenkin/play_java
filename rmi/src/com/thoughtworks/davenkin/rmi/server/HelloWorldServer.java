package com.thoughtworks.davenkin.rmi.server;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class HelloWorldServer
{
    public HelloWorldServer() {
        try {
            HelloWorld c = new HelloWorldImpl();
            Naming.rebind("rmi://localhost:1099/HelloWorldService", c);
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

    public static void main(String args[]) {
        new HelloWorldServer();
    }
}
