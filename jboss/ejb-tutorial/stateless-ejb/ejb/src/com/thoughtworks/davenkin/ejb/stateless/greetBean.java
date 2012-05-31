package com.thoughtworks.davenkin.ejb.stateless;
import javax.ejb.*;
import java.rmi.*;
import javax.naming.*;

public class greetBean implements
SessionBean
        {
   public String greetme(String s)
        throws RemoteException
    {
        return "How are you?......."+s;
     }
        public void ejbCreate(){}
        public void ejbRemove(){}
        public void ejbActivate(){}
        public void ejbPassivate(){}
        public void setSessionContext
        (SessionContext sc ) {}
}
