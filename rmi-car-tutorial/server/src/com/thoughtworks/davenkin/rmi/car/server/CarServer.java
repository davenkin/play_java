package com.thoughtworks.davenkin.rmi.car.server;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.util.Hashtable;

public class CarServer
{
    private final InitialContext context;

    public CarServer() throws NamingException, RemoteException
    {
        if (System.getSecurityManager() == null)
        {
            System.setSecurityManager(new RMISecurityManager());
        }

        Hashtable<String, String> env = new Hashtable<String, String>();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");
        context = new InitialContext(env);

    }

    public void createBinding() throws RemoteException, NamingException
    {
        context.bind("/CarFactory", new CarFactoryImpl());
    }

    public static void main(String args[]) throws NamingException, RemoteException, InterruptedException
    {
        CarServer carServer = new CarServer();
        carServer.createBinding();
    }
}
