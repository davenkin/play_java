import javax.ejb.*;
import java.rmi.*;

    public interface greetRemote extends EJBObject{
        public String greetme(String s) throws RemoteException;
} 
