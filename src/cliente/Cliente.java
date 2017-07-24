package cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import servidor.InterfaceRemotaHolaMundo;

/**
 *
 * @author luiscobian
 */
public class Cliente {
    
    public static void main(String[] args) {
        System.out.println("Iniciando cliente");
        try {
            Registry reg  = LocateRegistry.
                     getRegistry("127.0.0.1",5001);
            InterfaceRemotaHolaMundo obj = 
                    (InterfaceRemotaHolaMundo) 
                    reg.lookup("ObjRemoto");
            String cadena  = obj.getSaludo(); 
            System.out.println(cadena);
        } catch (Exception e) {
            System.out.println("Error al conectar el cliente");
        }
    }
    
}





