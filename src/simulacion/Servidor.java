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
    private int proximaSalida;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public Servidor(int proximaSalida, boolean status) {
        this.proximaSalida = proximaSalida;
        this.status = status;
        
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getProximaSalida() {
        return proximaSalida;
    }

    public void setProximaSalida(int proximaSalida) {
        this.proximaSalida = proximaSalida;
    }

}
