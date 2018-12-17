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
    private int tiempoEntrada;
    private int tiempoServicio;
    private int tiempoLlegadaSistema;
    public Cliente(int tiempoEntrada, int tiempoServicio, int tiempoLlegadaSistema,int tiempoLlegadaCola) {
        this.tiempoEntrada = tiempoEntrada;
        this.tiempoServicio = tiempoServicio;
        this.tiempoLlegadaSistema = tiempoLlegadaSistema;
    }

    public int getTiempoEntrada() {
        return tiempoEntrada;
    }

    public void setTiempoEntrada(int tiempoEntrada) {
        this.tiempoEntrada = tiempoEntrada;
    }

    public int getTiempoLlegadaSistema() {
        return tiempoLlegadaSistema;
    }

    public void setTiempoLlegadaSistema(int tiempoLlegadaSistema) {
        this.tiempoLlegadaSistema = tiempoLlegadaSistema;
    }

    public int getTiempoServicio() {
        return tiempoServicio;
    }

    public void setTiempoServicio(int tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }
    
    

}
