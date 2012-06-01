package com.thoughtworks.davenkin.ejb.stateful;

import javax.ejb.*;
import java.rmi.*;
import java.util.*;

public interface CartRemote
        extends EJBObject
{
    public void addbooks(String s)
            throws RemoteException;

    public Vector getbooks()
            throws RemoteException;
}
