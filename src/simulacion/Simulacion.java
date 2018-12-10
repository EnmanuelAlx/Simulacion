/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Enmanuel
 */
public class Simulacion {
    
    private int tiempoSimulacion;
    private int tiempoTotalSimulacion;
    private int cantMaxClientes;
    private ArrayList<Tiempo> tiemposLlegada;
    private ArrayList<Tiempo> tiempoServicios;
    private int costoServidor;
    private int costoEspera;
    private int tablaEventos;
    
    
    private int tiempoLlegada;
    private int tiempoSalida;
    private boolean statusServer;
    private int tiempoModelo;
    private int cantidadServidores;
    private int longitudCola;
    private boolean primera;
    private Queue<Cliente> colaClientes;
    private float SumCostoEspera;
    private boolean esFinito;
    private int TS;
    private int TE;
    
    
    public Simulacion(int tiempoSimulacion, int cantClientes, ArrayList<Tiempo> tiemposLlegada,
                      ArrayList<Tiempo> tiempoServicios, int costoServidor, int costoEspera,
                      int tablaEventos, int cantidadServidores, boolean esFinito, int tiempoTotal) {
        this.tiempoSimulacion = tiempoSimulacion;
        this.cantMaxClientes = cantClientes;
        this.tiemposLlegada = tiemposLlegada;
        this.tiempoServicios = tiempoServicios;
        this.costoServidor = costoServidor;
        this.costoEspera = costoEspera;
        this.tablaEventos = tablaEventos;
        this.cantidadServidores = cantidadServidores;
        this.esFinito = esFinito;
        this.tiempoTotalSimulacion = tiempoTotal;
        this.tiempoLlegada = 0;
        this.tiempoSalida = 9999999;
        this.longitudCola = 0;
        this.primera = true;
        this.statusServer = false;
        this.colaClientes = new LinkedList();
        this.SumCostoEspera = 0;
    }
    
   
    public void play(){
        for (int i = 0; i < this.tiempoTotalSimulacion; i++) {
            if(this.tiempoLlegada<this.tiempoSalida){
                llegadaCliente();
            }
            else{
                salidaCliente();
            }
            System.out.println("____________________________________________");
        }
    }
   
    public void llegadaCliente(){
        System.out.println("Llegadaaaaaaaaaaaaa");
        if(this.esFinito && this.longitudCola>=this.cantMaxClientes){
            incrementarCostoEspera();
            return;
        }
        setTMtoAT();
        if(!this.statusServer){
            this.statusServer = true;
            this.TS = generarTS();
            this.incrementDT(this.TS);
        }
        else{
            Cliente cliente = new Cliente(this.TE, this.TS);
            this.colaClientes.add(cliente);
        }
        this.TE = generarTE();
        this.incrementAT(this.TE);
        System.out.println("TM: "+this.tiempoModelo+" SS: "+this.statusServer+" WL: "+this.colaClientes.size()+" AT: "+this.tiempoLlegada+" DT: "+this.tiempoSalida);
    }
    
    public void salidaCliente(){
        System.out.println("Salidaaaaaaaaaaaaaa");

        setTMtoDT();
        if(!this.colaClientes.isEmpty()){
            Cliente cliente = this.colaClientes.poll();
            incrementDT(cliente.getTiempoServicio());
        }
        else{
            this.statusServer = false;
            this.tiempoSalida = 99999;
        }
        System.out.println("TM: "+this.tiempoModelo+" SS: "+this.statusServer+" WL: "+this.colaClientes.size()+" AT: "+this.tiempoLlegada+" DT: "+this.tiempoSalida);

    }
    
    public int generarTS(){
        Random rand = new Random();
        return getTiempo(rand.nextInt(100), this.tiempoServicios);
    }
    
    public int generarTE(){
        Random rand = new Random();
        return getTiempo(rand.nextInt(100), this.tiemposLlegada);
    }
    
    public void incrementAT(int tiempoEntrada){
        this.tiempoLlegada = this.tiempoModelo + tiempoEntrada;
    }
    
    public void incrementDT(int tiempoServicio){
        this.tiempoSalida = this.tiempoModelo + tiempoServicio;
    }
    
    
    public void setTMtoAT() {
        this.tiempoModelo = this.tiempoLlegada;
    }
    
    public void setTMtoDT(){
        this.tiempoModelo = this.tiempoSalida;
    }
  
    public Cliente generarCliente(int TE, int TS){
        Cliente cliente = new Cliente(TE, TS);
        return cliente;
    }
  
    private void incrementarCostoEspera(){
        this.SumCostoEspera += this.costoEspera;
    }
    
    private int getTiempo(int RandomNum, ArrayList tiempos){
        for (Iterator<Tiempo> i = tiempos.iterator(); i.hasNext();) {
            Tiempo item = i.next();
            if(RandomNum>=item.getMin() && RandomNum<=item.getMax()){
                return item.getValor();
            }
        }
        return -1;
    }

    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(int tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    public int getTiempoSalida() {
        return tiempoSalida;
    }

    public void setTiempoSalida(int tiempoSalida) {
        this.tiempoSalida = tiempoSalida;
    }

    
    public boolean isPrimera() {
        return primera;
    }

    public void setPrimera(boolean primera) {
        this.primera = primera;
    }
}
