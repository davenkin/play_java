package com.thoughtworks.davenkin.ejb.stateful;

import javax.ejb.*;
import java.rmi.*;
import javax.naming.*;
import java.util.*;

public class CartBean implements
        SessionBean
{
    Vector vector1;

    public void addbooks(String s)
            throws RemoteException
    {
        vector1.addElement(s);
    }

    public Vector getbooks()
            throws RemoteException
    {
        return vector1;
    }

    public void ejbCreate(String s)
    {
        vector1 = new Vector();
    }

    public void ejbRemove()
    {
    }

    public void ejbActivate()
    {
    }

    public void ejbPassivate()
    {
    }

    public void setSessionContext
            (SessionContext sc)
    {
    }
}

