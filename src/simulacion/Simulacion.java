/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Enmanuel
 */
public class Simulacion {
    
    private int tiempoSimulacion;
    private int cantClientes;
    private ArrayList<TiempoLlegada> tiemposLlegada;
    private ArrayList<TiempoServicio> tiempoServicios;
    private int costoServidor;
    private int costoEspera;
    private int tablaEventos;
    private int tiempoLlegada;
    private int tiempoSalida;
    private boolean statusServidor;
    private int cantidadServidores;
    private boolean primera = true;
    
    public Simulacion(int tiempoSimulacion, int cantClientes, ArrayList<TiempoLlegada> tiemposLlegada,
                      ArrayList<TiempoServicio> tiempoServicios, int costoServidor, int costoEspera, int tablaEventos, int cantidadServidores) {
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
        
    }
    
    public Cliente generarCliente(){
        Random rand = new Random();
        int tiempoEntrada = (int)rand.nextInt(cantClientes);
        int tiempoServicio = (int)rand.nextInt(cantClientes);
        float probabilidad = rand.nextFloat();
        if(isPrimera()){
            tiempoEntrada = 0;
            setPrimera(false);
        }
        Cliente cliente = new Cliente(tiempoEntrada, tiempoServicio, probabilidad);
        return cliente;
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

    public boolean isStatusServidor() {
        return statusServidor;
    }

    public void setStatusServidor(boolean statusServidor) {
        this.statusServidor = statusServidor;
    }

    public boolean isPrimera() {
        return primera;
    }

    public void setPrimera(boolean primera) {
        this.primera = primera;
    }
}
