package servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author luiscobian
 */
public interface InterfaceRemotaHolaMundo extends Remote{
    
    public String getSaludo() throws RemoteException;    
}






