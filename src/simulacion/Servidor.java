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
    float costo;
    Cliente cliente;
    private boolean vacio;
    private int salida;
    private int tiempoUtilizacion;
    private int cantVecesUsado;
    public Servidor(boolean vacio, float costo) {
        this.vacio = vacio;
        this.salida = 99999;
        this.tiempoUtilizacion = 0;
        this.costo = costo;
        this.cantVecesUsado = 0;
    }

    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public void setCliente(Cliente cliente) {
        if(cliente!=null){
            this.tiempoUtilizacion += cliente.getTiempoServicio();
            this.cantVecesUsado++;
        }
        this.cliente = cliente;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getTiempoUtilizacion() {
        return tiempoUtilizacion;
    }
    public int getSalida() {
        return salida;
    }

    public float getCosto() {
        return costo;
    }

    public int getCantVecesUsado() {
        return cantVecesUsado;
    }

    
}
