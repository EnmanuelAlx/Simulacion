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
public class Cliente {
    float tiempo_entre_llegada;
    float probabilidad;
    float costo_espera;

    public Cliente(float tiempo_entre_llegada, float probabilidad, float costo_espera) {
        this.tiempo_entre_llegada = tiempo_entre_llegada;
        this.probabilidad = probabilidad;
        this.costo_espera = costo_espera;
    }

    public float getTiempo_entre_llegada() {
        return tiempo_entre_llegada;
    }

    public void setTiempo_entre_llegada(float tiempo_entre_llegada) {
        this.tiempo_entre_llegada = tiempo_entre_llegada;
    }

    public float getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(float probabilidad) {
        this.probabilidad = probabilidad;
    }

    public float getCosto_espera() {
        return costo_espera;
    }

    public void setCosto_espera(float costo_espera) {
        this.costo_espera = costo_espera;
    }
    
    
}
