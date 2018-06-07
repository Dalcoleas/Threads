/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Alvaro García <alvarogarcia1010 at github.com>
 */
public class Transaccion {
    
    private Cajera cajera;
    private Cliente cliente;
    private String transaccion;

    public Transaccion(Cajera cajera, Cliente cliente, String transaccion) {
        this.cajera = cajera;
        this.cliente = cliente;
        this.transaccion = transaccion;
    }

    public Cajera getCajera() {
        return cajera;
    }

    public void setCajera(Cajera cajera) {
        this.cajera = cajera;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public void procesarTransaccion(long timeStamp) {

            System.out.println("La cajera " + this.cajera.getNombre() + 
                            " COMIENZA A PROCESAR LA TRANSACCION DEL CLIENTE " + cliente.getNombre() + 
                            " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000	+
                            "seg");
// PASAR A ARRAY LIST EN TRANSACCIONES
//            for (int i = 0; i < cliente.getCarroCompra().length; i++) { 
//                            this.esperarXsegundos(cliente.getCarroCompra()[i]); 
//                            System.out.println("Procesado el producto " + (i + 1) +  
//                            " ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
//                            "seg");
//            }

            System.out.println("La cajera " + this.cajera.getNombre() + " HA TERMINADO DE PROCESAR " + 
                            cliente.getNombre() + " EN EL TIEMPO: " + 
                            (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

    }


    private void esperarXsegundos(int segundos) {
            try {
                    Thread.sleep(segundos * 1000);
            } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
            }
    }
    
    
}
