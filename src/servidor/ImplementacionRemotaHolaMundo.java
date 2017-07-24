package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author luiscobian
 */
public class ImplementacionRemotaHolaMundo 
extends UnicastRemoteObject implements 
        InterfaceRemotaHolaMundo{
    
    public ImplementacionRemotaHolaMundo() 
            throws RemoteException{
        super();
    }

    @Override
    public String getSaludo() throws RemoteException {
        return "Esto es una prueba con RMI";
    }
    
    
    
}






