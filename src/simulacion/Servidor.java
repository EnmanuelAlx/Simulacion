/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @author Enmanuel
 */
public class Servidor {
    int costo;
    Cliente cliente;
    private boolean vacio;
    private int salida;
    public Servidor(boolean vacio) {
        this.vacio = vacio;
        this.salida = 99999;
    }

    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getSalida() {
        return salida;
    }

    
}
