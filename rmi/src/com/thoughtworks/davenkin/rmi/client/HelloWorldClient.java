package com.thoughtworks.davenkin.rmi.client;

import com.thoughtworks.davenkin.rmi.server.HelloWorld;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class HelloWorldClient
{
    public static void main(String[] args)
    {
        try{
           HelloWorld helloWorld = (HelloWorld) Naming.lookup("rmi://localhost:1099/HelloWorldService");
            System.out.println(helloWorld.sayHelloWorld());
        } catch (RemoteException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (MalformedURLException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NotBoundException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
