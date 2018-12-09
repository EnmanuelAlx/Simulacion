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
    float tiempo_servicio;
    float probabilidad;
    int costo;
    Cliente cliente;
    
    public Servidor(float tiempo_servicio, float probabilidad, int costo) {
        this.tiempo_servicio = tiempo_servicio;
        this.probabilidad = probabilidad;
        this.costo = costo;
    }

    public float getTiempo_servicio() {
        return tiempo_servicio;
    }

    public void setTiempo_servicio(float tiempo_servicio) {
        this.tiempo_servicio = tiempo_servicio;
    }

    public float getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(float probabilidad) {
        this.probabilidad = probabilidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
   
}
