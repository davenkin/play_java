package com.thoughtworks.davenkin.rmi.client;

import com.thoughtworks.davenkin.rmi.server.HelloWorld;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.util.Hashtable;

public class HelloWorldClient
{
    public static void main(String[] args) throws NamingException, RemoteException
    {
//        if (System.getSecurityManager() == null)
//        {
//            System.setSecurityManager   (new RMISecurityManager());
////            System.setSecurityManager (new RMISecurityManager() {
////                public void checkConnect (String host, int port) {}
////                public void checkConnect (String host, int port, Object context) {}
////            });
//        }

        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");
        InitialContext context = new InitialContext(env);
        HelloWorld helloWorld = (HelloWorld) context.lookup("/HelloWorldService");

        System.out.println(helloWorld.sayHelloWorld());

    }
}
