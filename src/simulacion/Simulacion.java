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
    
    
    private int AT;
    private int DT;
    private boolean statusServer;
    private int tiempoModelo;
    private int cantidadServidores;
    private boolean primera;
    private Queue<Cliente> colaClientes;
    private float SumCostoEspera;
    private boolean esFinito;
    
    
    ////////Cambiar por ts = tiempo salida y te = tiempo entrada
    private int TS; 
    private int TE;
    ///////////////////////////////////////////////////////////
    private ArrayList<Servidor> servidores;
    
    
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
        this.AT = 0;
        this.DT = 9999999;
        this.primera = true;
        this.statusServer = false;
        this.colaClientes = new LinkedList();
        this.SumCostoEspera = 0;
        this.servidores = new ArrayList<Servidor>();
        initServidores();
    }
    
   
    public void initServidores(){
        //Si tiene costos pasarlo por aqui cualquier cosa cambiar algo 
        for (int i = 0; i < this.cantidadServidores; i++) {
            Servidor server = new Servidor(true);
            this.servidores.add(server);
        }
    }
    
    public void limpiarServidores(){
        for (Servidor server : servidores) {
            if(!server.isVacio() && server.getSalida()==this.tiempoModelo){
                server.setVacio(true);
                server.setCliente(null);
                server.setSalida(99999);
            }
        }
    }
    
    public void play(){
        for (int i = 0; i < this.tiempoTotalSimulacion; i++) {
            limpiarServidores();
            if(this.AT<this.DT){
                llegadaCliente();
            }
            else{
                salidaCliente();
            }           
            System.out.println("____________________________________________");
        }
    }
    
    public void llegadaCliente(){
        System.out.println("Llegada!");
        boolean todosFull = true;
        setTMtoAT();
         
        for (Servidor server : servidores) {
            if(server.isVacio() && this.colaClientes.isEmpty()){
                server.setVacio(false);
                this.TS = generarTS();
                incrementDT(this.TS);
                Cliente cliente = new Cliente(this.TE, this.TS);
                server.setCliente(cliente);
                server.setSalida(this.DT);
                todosFull = false;
                break;
            }
            if(server.isVacio() && !this.colaClientes.isEmpty()){
                Cliente cliente = this.colaClientes.poll();
                incrementDT(cliente.getTiempoServicio());
                server.setVacio(false);
                server.setCliente(cliente);
                server.setSalida(this.DT);
                todosFull = false;
                break;
            }
        }           
        if(todosFull){
            Cliente cliente = new Cliente(this.TE, this.TS);
            this.colaClientes.add(cliente);
        }
        
        this.TE = generarTE();
        this.incrementAT(this.TE);
        
        System.out.println("TM: "+this.tiempoModelo+" WL: "+this.colaClientes.size()+" AT: "+this.AT+" DT: "+this.DT);
        for (Servidor server : servidores) {
            System.out.println("Server vacio: "+server.isVacio()+" Tiempo salida: "+server.getSalida());
        }
        System.out.println("TE: "+this.TE+ " TS: "+this.TS);
    }
    
   
    public void salidaCliente(){
        System.out.println("Salida!!");
        setTMtoDT();
        boolean existClientes = true;
        if(!this.colaClientes.isEmpty()){
            Cliente cliente = this.colaClientes.poll();
            for (Servidor server : servidores) {
                if(server.isVacio()){
                    server.setVacio(false);
                    this.TS = generarTS();
                    incrementDT(this.TS);
                    server.setCliente(cliente);
                    server.setSalida(this.DT);
                    break;
                }
            }
        }
        else{
            limpiarServidores();
            this.DT=99999;
        }
        
        
        System.out.println("TM: "+this.tiempoModelo+" WL: "+this.colaClientes.size()+" AT: "+this.AT+" DT: "+this.DT);
        for (Servidor server : servidores) {
            System.out.println("Server "+server.isVacio()+" Tiempo salida: "+server.getSalida());
        }
        System.out.println("TE: "+this.TE+ " TS: "+this.TS);
    }
    
    
//    public void llegadaCliente(){
//        int acum = 0;
//        System.out.println("Llegadaaaaaaaaaaaaa");
//        if(this.esFinito && this.colaClientes.size()>=this.cantMaxClientes){
//            incrementarCostoEspera();
//            return;
//        }
//        setTMtoAT();
////        if(!this.statusServer){
////            this.statusServer = true;
////            this.TS = generarTS();
////            this.incrementDT(this.TS);
////        }
//        if(this.colaClientes.isEmpty()){
//            for (Servidor server : servidores) {
//                if(!server.isStatus()){
//                    this.TS = generarTS();
//                    incrementDT(this.TS, server);
//                    asignarTiempoSalida();
//                    server.setStatus(true);
//                    
//                }else{
//                    acum++;
//                }        
//            }
//            if(acum == this.servidores.size()){
//                Cliente cliente = new Cliente(this.TE, this.TS);
//                this.colaClientes.add(cliente);
//            }
//        }      
//        else{
//            Cliente cliente = new Cliente(this.TE, this.TS);
//            this.colaClientes.add(cliente);
//        }
//        this.TE = generarTE();
//        this.incrementAT(this.TE);
//        System.out.println("TM: "+this.tiempoModelo+" SS: "+this.statusServer+" WL: "+this.colaClientes.size()+" AT: "+this.tiempoLlegada+" DT: "+this.tiempoSalida);
//        
//    }
    
   
    
//    public void salidaClienteDeLaCola(){
//        System.out.println("Salidaaaaaaaaaaaaaa");
//
//        setTMtoDT();
//        if(!this.colaClientes.isEmpty()){
//            Cliente cliente = this.colaClientes.poll();
//            for (Servidor server : servidores) {
//                if(server.getProximaSalida() == this.tiempoModelo){
//                    incrementDT(cliente.getTiempoServicio(), server);
//                    server.setStatus(true);
//                    asignarTiempoSalida();
//                }  
//            }
//        }
//        else{
//            for (Servidor server : servidores) {
//                if(server.getProximaSalida() == this.tiempoModelo){
//                    server.setProximaSalida(99999999);
//                    server.setStatus(false);
//                    asignarTiempoSalida();
//                } 
//                
//            }
////            this.statusServer = false;
////            this.tiempoSalida = 99999;
//        }
//        System.out.println("TM: "+this.tiempoModelo+" SS: "+this.statusServer+" WL: "+this.colaClientes.size()+" AT: "+this.tiempoLlegada+" DT: "+this.tiempoSalida);
//
//    }
    
    public int generarTS(){
        Random rand = new Random();
        return getTiempo(rand.nextInt(100), this.tiempoServicios);
    }
    
    public int generarTE(){
        Random rand = new Random();
        return getTiempo(rand.nextInt(100), this.tiemposLlegada);
    }
    
    public void incrementAT(int tiempoEntrada){
        this.AT = this.tiempoModelo + tiempoEntrada;
    }
    
    public void incrementDT(int tiempoServicio){
        this.DT = this.tiempoModelo + tiempoServicio;
    }
    
    
    

    public void setTMtoAT() {
        this.tiempoModelo = this.AT;
    }
    
    public void setTMtoDT(){
        this.tiempoModelo = this.DT;
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
        return AT;
    }

    public void setTiempoLlegada(int tiempoLlegada) {
        this.AT = tiempoLlegada;
    }

    public int getTiempoSalida() {
        return DT;
    }

    public void setTiempoSalida(int tiempoSalida) {
        this.DT = tiempoSalida;
    }

    
    public boolean isPrimera() {
        return primera;
    }

    public void setPrimera(boolean primera) {
        this.primera = primera;
    }
}
