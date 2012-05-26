package com.thoughtworks.davenkin.rmi.server;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.util.Hashtable;

public class HelloWorldServer
{
    private final InitialContext context;

    public HelloWorldServer() throws NamingException
    {
        if (System.getSecurityManager() == null)
            System.setSecurityManager ( new
                    RMISecurityManager() );
//            System.setSecurityManager (new RMISecurityManager() {
//                public void checkConnect (String host, int port) {}
//                public void checkConnect (String host, int port, Object context) {}
//            });


        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");
        context = new InitialContext(env);

    }

    public void createBinding() throws RemoteException, NamingException
    {
        context.bind("/HelloWorldService", new HelloWorldImpl());
    }

    public static void main(String args[]) throws NamingException, RemoteException
    {
        HelloWorldServer helloWorldServer = new HelloWorldServer();
        helloWorldServer.createBinding();
    }
}
