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
public class Tiempo {
    private int valor;
    private float probabilidad;
    private int min;
    private int max;

    public Tiempo(int valor, float probabilidad, int min, int max) {
        this.valor = valor;
        this.probabilidad = probabilidad;
        this.min = min;
        this.max = max;
    }
    //comentario qeu se debe eliminar
    public int getValor() {
        return valor;
    }
    
    public void vacio(){
        
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

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
