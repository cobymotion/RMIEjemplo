package servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author luiscobian
 */
public class Servidor {
    
    public static void main(String[] args) {
        System.out.println("Iniciando servidor");
        try {
            Registry registry = LocateRegistry.
                    createRegistry(5001);
            registry.rebind("ObjRemoto", 
                    new ImplementacionRemotaHolaMundo());
        } catch (Exception e) {
            System.out.println("Error al crear el servidor");
        }
    }
    
}
