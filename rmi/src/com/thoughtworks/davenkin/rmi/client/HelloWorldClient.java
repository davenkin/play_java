package com.thoughtworks.davenkin.rmi.client;

import com.thoughtworks.davenkin.rmi.server.HelloWorld;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.util.Hashtable;

public class HelloWorldClient
{
    public static void main(String[] args) throws NamingException, RemoteException
    {

        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");
        InitialContext context = new InitialContext(env);
        HelloWorld helloWorld = (HelloWorld) context.lookup("/HelloWorldService");

        System.out.println(helloWorld.sayHelloWorld());

    }
}
