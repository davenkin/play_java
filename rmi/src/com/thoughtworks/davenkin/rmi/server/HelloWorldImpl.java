package com.thoughtworks.davenkin.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloWorldImpl extends UnicastRemoteObject implements HelloWorld
{
    protected HelloWorldImpl() throws RemoteException
    {
        super();
    }

    @Override
    public String sayHelloWorld()  throws RemoteException
    {
       return "Hello World!";
    }
}
