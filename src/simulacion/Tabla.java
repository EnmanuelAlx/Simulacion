/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.util.ArrayList;

/**
 *
 * @author Enmanuel
 */
public class Tabla {
    private ArrayList<String> tipo;
    private ArrayList<Integer> numCliente;
    private ArrayList<Integer> TM;
    private ArrayList<Boolean> SS;
    private ArrayList<Integer> WL;
    private ArrayList<Integer> AT;
    private ArrayList<Integer> DT;

    public Tabla() {
        tipo = new ArrayList();
        numCliente = new ArrayList();
        TM = new ArrayList();
        SS = new ArrayList();
        WL = new ArrayList();
        AT = new ArrayList();
        DT = new ArrayList();
    }

    public ArrayList<String> getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList<String> tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Integer> getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(ArrayList<Integer> numCliente) {
        this.numCliente = numCliente;
    }

    public ArrayList<Integer> getTM() {
        return TM;
    }

    public void setTM(ArrayList<Integer> TM) {
        this.TM = TM;
    }

    public ArrayList<Boolean> getSS() {
        return SS;
    }

    public void setSS(ArrayList<Boolean> SS) {
        this.SS = SS;
    }

    public ArrayList<Integer> getWL() {
        return WL;
    }

    public void setWL(ArrayList<Integer> WL) {
        this.WL = WL;
    }

    public ArrayList<Integer> getAT() {
        return AT;
    }

    public void setAT(ArrayList<Integer> AT) {
        this.AT = AT;
    }

    public ArrayList<Integer> getDT() {
        return DT;
    }

    public void setDT(ArrayList<Integer> DT) {
        this.DT = DT;
    }
    
}
