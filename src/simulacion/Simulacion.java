/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/**
 *
 * @author Enmanuel
 */
public class Simulacion {
    
    private int tiempoSimulacion;
    private int cantClientes;
    private ArrayList<Tiempo> tiemposLlegada;
    private ArrayList<Tiempo> tiempoServicios;
    private int costoServidor;
    private int costoEspera;
    private int tablaEventos;
    private int tiempoLlegada = 0;
    private int tiempoSalida = 999999;
    private boolean serverOcupado = false;
    private int tiempoModelo;
    private int cantidadServidores;
    private int longitudCola = 0;
    private boolean primera = true;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Integer> AT = new ArrayList<>();
    private ArrayList<Integer> DT = new ArrayList<>();
    private ArrayList<Integer> TM = new ArrayList<>();
    private ArrayList<Integer> WL = new ArrayList<>();
    private ArrayList<Boolean> SS = new ArrayList<>();
    private ArrayList<String> tipo = new ArrayList<>();



    
    public Simulacion(int tiempoSimulacion, int cantClientes, ArrayList<Tiempo> tiemposLlegada,
                      ArrayList<Tiempo> tiempoServicios, int costoServidor, int costoEspera, int tablaEventos, int cantidadServidores) {
        this.tiempoSimulacion = tiempoSimulacion;
        this.cantClientes = cantClientes;
        this.tiemposLlegada = tiemposLlegada;
        this.tiempoServicios = tiempoServicios;
        this.costoServidor = costoServidor;
        this.costoEspera = costoEspera;
        this.tablaEventos = tablaEventos;
        this.cantidadServidores = cantidadServidores;
    }
    
    public void play(){
        for (int i = 0; i < cantClientes; i++) {
            Cliente cliente = generarCliente();
            this.clientes.add(cliente);
            if(this.tiempoLlegada<this.tiempoSalida){
                llegadaCliente(cliente);
            }else{
                salidaCliente(cliente);
            }
            
            System.out.println("------------------------------------------------------------------------------------");
        }
        
        for(Cliente cliente: this.clientes){
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Cliente.TE "+cliente.getTiempoEntrada());
            System.out.println("Cliente.TS "+cliente.getTiempoServicio());
            System.out.println("------------------------------------------------------------------------------------");

        }
        
    }
   
    public void llegadaCliente(Cliente cliente){
        System.out.println("LLEGADAAAAAAAAA");

        this.tipo.add("Llegada");
        this.tiempoModelo = this.tiempoLlegada;
        System.out.println("TM "+ this.tiempoModelo);

        this.TM.add(tiempoModelo);
        if(this.serverOcupado){
           this.longitudCola++;
           addLongitudCola();
           generarAT(cliente);
        }else{
           this.SS.add(serverOcupado);
           this.serverOcupado = true;
           generarAT(cliente);
           generarDT(cliente);
           addLongitudCola();
        }
    }
    
    public void salidaCliente(Cliente cliente){
        System.out.println("SALIDAAAAA");
        this.tipo.add("Salida");
        this.tiempoModelo = this.tiempoSalida;
        System.out.println("TM "+ this.tiempoModelo);

        this.TM.add(tiempoModelo);
        
        if(this.longitudCola==0){
            this.serverOcupado = false;
            this.tiempoSalida = 999999;
            this.SS.add(false);
            this.DT.add(this.tiempoSalida);
        }
        else{
            this.longitudCola--;
            generarDT(cliente);
            
        }
    }
    
    public void generarAT(Cliente cliente){
        this.tiempoLlegada = this.tiempoModelo + cliente.getTiempoEntrada();
        System.out.println("AT "+ this.tiempoLlegada);
        this.AT.add(this.tiempoLlegada);
    }
    
    public void generarDT(Cliente cliente){
        this.tiempoSalida = this.tiempoModelo + cliente.getTiempoServicio();
        System.out.println("DT "+ this.tiempoSalida);

        this.DT.add(this.tiempoSalida);
    }
    
    
    public void addLongitudCola(){
        this.WL.add(this.longitudCola);
    }
    
    public Cliente generarCliente(){
        Random rand = new Random();
        int tiempoEntrada = getTiempo(rand.nextInt(100), this.tiemposLlegada);
        int tiempoServicio = getTiempo(rand.nextInt(100), this.tiempoServicios);

//        if(isPrimera()){
//            tiempoEntrada = 0;
//            setPrimera(false);
//        }
        Cliente cliente = new Cliente(tiempoEntrada, tiempoServicio);
        return cliente;
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
