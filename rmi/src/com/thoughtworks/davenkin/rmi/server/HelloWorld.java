package com.thoughtworks.davenkin.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloWorld extends Remote
{
    public String sayHelloWorld() throws RemoteException;
}
