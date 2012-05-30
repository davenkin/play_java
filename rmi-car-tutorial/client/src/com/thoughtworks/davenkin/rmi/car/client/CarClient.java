package com.thoughtworks.davenkin.rmi.car.client;

import com.thoughtworks.davenkin.rmi.car.server.CarFactory;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.util.Hashtable;

public class CarClient
{
    public static void main(String[] args) throws NamingException, RemoteException
    {
        if (System.getSecurityManager() == null)
        {
            System.setSecurityManager(new RMISecurityManager());
        }

        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");
        InitialContext context = new InitialContext(env);
        CarFactory carFactory = (CarFactory) context.lookup("/CarFactory");

        carFactory.createCar(123).run();

    }
}
