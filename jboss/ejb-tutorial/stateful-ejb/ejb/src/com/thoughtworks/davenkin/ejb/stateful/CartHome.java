package com.thoughtworks.davenkin.ejb.stateful;

import javax.ejb.*;
import java.rmi.*;

public interface CartHome extends EJBHome
{
    public CartRemote create(String ids)
            throws RemoteException, CreateException;
}
