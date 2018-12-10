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
public class TiempoServicio {
    private int valor;
    private float probabilidad;
    private int min;
    private int max;

    public TiempoServicio(int valor, float probabilidad) {
        this.valor = valor;
        this.probabilidad = probabilidad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public float getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(float probabilidad) {
        this.probabilidad = probabilidad;
    }

    public int getProbAcumulada() {
        return probAcumulada;
    }

    public void setProbAcumulada(int probAcumulada) {
        this.probAcumulada = probAcumulada;
    }
    
    
    
}
