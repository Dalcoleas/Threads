/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import Banco.*;


/**
 *
 * @author daniel
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        Cliente cliente3 = new Cliente("Cliente 3");
        
        Cajera cajero1 = new Cajera("Cajera 1");
        Cajera cajero2 = new Cajera("Cajera 2");
        Cajera cajero3 = new Cajera("Cajera 3");
        
        long initialTime = System.currentTimeMillis();
        
        String[] accion1 = new String[]{"Deposito 1", "Deposito 2", "Consulta de saldo"};
        String[] accion2 = new String[]{"Deposito 1", "Retiro 2", "Consulta de saldo"};
        
        Transaccion transaccion1 = new Transaccion(cajero1, cliente1, accion1, initialTime);
        Transaccion transaccion2 = new Transaccion(cajero2, cliente2, accion2, initialTime);
        Transaccion transaccion3 = new Transaccion(cajero3, cliente3, accion1, initialTime);
        

        
        transaccion1.start();
        transaccion2.start();
        transaccion3.start();

    }
    
}
