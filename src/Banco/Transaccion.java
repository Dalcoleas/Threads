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
public class Transaccion extends Thread {
    
    private Cajera cajera;
    private Cliente cliente;
    private String[] transaccion;
    private long timeStamp;

    public Transaccion(Cajera cajera, Cliente cliente, String[] transaccion, long initialTime) {
        this.cajera = cajera;
        this.cliente = cliente;
        this.transaccion = transaccion;
        this.timeStamp = initialTime;
    }

    public String[] getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String[] transaccion) {
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

    @Override
    public void run() {

            System.out.println("La cajera " + this.cajera.getNombre() + 
                            " COMIENZA A PROCESAR LAS TRANSACCIONEs  DEL CLIENTE " + cliente.getNombre() + 
                            " EN EL TIEMPO: " + (System.currentTimeMillis() - this.timeStamp) / 1000	+
                            "seg");

            for (int i = 0; i < this.transaccion.length; i++) { 
                this.esperarXsegundos(i); 
                System.out.println("Procesado la transaccion " + this.transaccion[i] +  
                " ->Tiempo: " + (System.currentTimeMillis() - this.timeStamp) / 1000 + 
                "seg");
            }

            System.out.println("La cajera " + this.cajera.getNombre() + " HA TERMINADO DE PROCESAR " + 
                            cliente.getNombre() + " EN EL TIEMPO: " + 
                            (System.currentTimeMillis() - this.timeStamp) / 1000 + "seg");

    }


    private void esperarXsegundos(int segundos) {
            try {
                    Thread.sleep(segundos * 1000);
            } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
            }
    }
    
    
}
