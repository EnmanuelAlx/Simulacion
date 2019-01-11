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
import javax.swing.table.DefaultTableModel;
import vistas.EstadisticasVista;
import vistas.TablaEventosVista;
import static vistas.InicioVista.mainPanel;
/**
 *
 * @author Enmanuel
 */
public class Simulacion {
    
    private float tiempoSimulacion;
    private float tiempoTotalSimulacion;
    private int cantMaxClientes;
    private ArrayList<Tiempo> tiemposLlegada;
    private ArrayList<Tiempo> tiempoServicios;
    private float costoServidor;
    private float costoEspera;
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
    private int cantEventos;
    
    private int cantClientesNoEspera;
    private int cantClientesNoAtendidos;
    private float probEspera;
    private float cantPromedioClientesCola;
    private float cantPromedioClientesSistema;
    private int cantClientesSistema;
    private int tiempoPromedioClienteCola;
    private int tiempoPromedioClienteSistema;
    private int cantClienteCola;
    private int cantidadTotalTiempoClientesCola;
    ////////Cambiar por ts = tiempo salida y te = tiempo entrada
    private int TS; 
    private int TE;
    public static TablaEventosVista tablaEventosVista;
    public DefaultTableModel tablaEventosModel;
    ///////////////////////////////////////////////////////////
    private ArrayList<Servidor> servidores;
    
    
    public Simulacion(float tiempoSimulacion, int cantClientes, ArrayList<Tiempo> tiemposLlegada,
                      ArrayList<Tiempo> tiempoServicios, float costoServidor, float costoEspera,
                      int tablaEventos, int cantidadServidores, boolean esFinito, float tiempoTotal, ArrayList<Servidor> servidores) {
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
        this.servidores = servidores;
        this.cantEventos = 0;
        this.cantClientesNoEspera = 0;
        this.cantClientesNoAtendidos = 0;
        this.probEspera = 0;
        this.cantPromedioClientesCola = 0;
        this.cantClientesSistema=0;
        this.tiempoPromedioClienteCola=0;
        this.tiempoPromedioClienteSistema=0;
        this.cantPromedioClientesSistema=0;
        this.cantClienteCola= 0;
        this.cantidadTotalTiempoClientesCola = 0;
        this.tablaEventosVista = new TablaEventosVista();
        tablaEventosModel = (DefaultTableModel) tablaEventosVista.tablaEventos.getModel();
    }
    
    public int menorDT(){
        int menor = 9999999;
        for (Servidor server : servidores) {
            if(server.getSalida()<menor){
                menor = server.getSalida();
            }
        }
        return menor;
    }
    
    public void limpiarServidores(){
        for (Servidor server : servidores) {
            if(!server.isVacio() && server.getSalida()==this.tiempoModelo){
                Cliente cliente = server.getCliente();
                this.tiempoPromedioClienteSistema = this.tiempoModelo - cliente.getTiempoEntrada();
                server.setVacio(true);
                server.setCliente(null);
                server.setSalida(99999999);
            }
        }
    }
    
    public void play(){
//        for (int i = 0; i < this.tiempoTotalSimulacion; i++) {
            System.out.println("Unidad de tiempo es = "+ this.tiempoSimulacion);
            System.out.println("Tiempo total es = "+ this.tiempoTotalSimulacion);

            switch ((int)this.tiempoSimulacion) {
            case 2:
                System.out.println("Minutos");
                this.tiempoTotalSimulacion = (int)this.tiempoTotalSimulacion;
                break;
                
            case 3:  
                System.out.println("Horas");
                this.tiempoTotalSimulacion = 60 * (int)this.tiempoTotalSimulacion;
                break;
            case 4: 
                System.out.println("dias");
                //Zaqui gei
                this.tiempoTotalSimulacion = 210* (int)this.tiempoTotalSimulacion;
                break;
            case 5: 
                System.out.println("semanas");

                this.tiempoTotalSimulacion = 5 * (int)this.tiempoTotalSimulacion * 210;
                break;
            case 6: 
                System.out.println("meses");
                this.tiempoTotalSimulacion = 23 * (int)this.tiempoTotalSimulacion * 210;
                break;
            case 7: 
                System.out.println("años");
                
                this.tiempoTotalSimulacion = 276 * (int)this.tiempoTotalSimulacion * 210;
                break;
        }
            
            System.out.println("Tiempo total de simulacion!! "+this.tiempoTotalSimulacion);
            while (this.tiempoTotalSimulacion>=this.tiempoModelo) {
                this.cantEventos++;
                this.DT = menorDT();
                if(this.AT<this.DT){
                    llegadaCliente();
                }
                else{
                    salidaCliente();
                }      
                System.out.println("_________Clientes en cola_____________________");
                for (Cliente cliente : colaClientes) {
                    System.out.println("TE: "+cliente.getTiempoEntrada()+ " TS: " +cliente.getTiempoServicio());
                }
                this.cantPromedioClientesSistema+=this.cantClientesSistema*this.tiempoModelo;
                if(this.colaClientes.size()>0){
                    this.cantPromedioClientesCola+=this.cantClientesSistema * this.tiempoModelo;
                }
                
                System.out.println("____________________________________________");
            }
            MostrarEstadisticas();
//        }
    }
    
    public void MostrarEstadisticas(){
        cantPromedioClientes();
        EstadisticasVista estadisticasVista = new EstadisticasVista();
        System.out.println("Cantidad Cientes que no esperan: "+this.cantClientesNoEspera);
        estadisticasVista.cantClientesNoEsperaLabel.setText(""+this.cantClientesNoEspera);
        
        System.out.println("Cantidad Clientes que se van sin ser atendidos: "+this.cantClientesNoAtendidos);
        estadisticasVista.cantClientesNoAtendidosLabel.setText(""+this.cantClientesNoAtendidos);

        System.out.println("Probabilidad de esperar: "+probabilidadEspera());
        estadisticasVista.probEsperaLabel.setText(""+probabilidadEspera());

        System.out.println("Cantidad Promedio clientes en cola: "+cantPromedioClientesCola());
        estadisticasVista.cantPromedioClientesColaLabel.setText(""+cantPromedioClientesCola());

        System.out.println("Cantidad Promedio clientes en Sistema: "+cantPromedioClientesSistema());
        estadisticasVista.cantPromedioClientesSistemaLabel.setText(""+cantPromedioClientesSistema());
        

        int sumaTotalUsoServer= 0;
        
        for (Servidor server: servidores) {
            sumaTotalUsoServer+=server.getTiempoUtilizacion();
        }
        int i = 1;
        DefaultTableModel porcentajeUtilizacionTabla = (DefaultTableModel) estadisticasVista.porcentajeUtilizacionTabla.getModel();
        DefaultTableModel costoServidorTabla = (DefaultTableModel) estadisticasVista.costoServidorTabla.getModel();

        for (Servidor server: servidores) {
            System.out.println("Porcentaje de utilizacion de servidor: "+server+" es: "+((float)server.getTiempoUtilizacion()/(float)sumaTotalUsoServer)*100);
            porcentajeUtilizacionTabla.addRow(new Object[]{i, ((float)server.getTiempoUtilizacion()/(float)this.tiempoSimulacion)*100});
            i++;
        }
        
        System.out.println("Utilizacion general: "+(float)sumaTotalUsoServer/(float)servidores.size());
        estadisticasVista.utilizacionGeneralLabel.setText(""+(float)sumaTotalUsoServer/(float)servidores.size());
        

        
        System.out.println("Tiempo promedio de un cliente en cola: "+tiempoPromedioCola());
        estadisticasVista.tiempoPromClienteColaLabel.setText(""+tiempoPromedioCola());        
        
        System.out.println("Tiempo promedio de un cliente en el sistema: "+tiempoPromedioSistema());
        estadisticasVista.tiempoPromClienteSistema.setText(""+tiempoPromedioSistema());        

        
        System.out.println("Costo promedio de espera: "+tiempoPromedioCola()*this.costoEspera);
        estadisticasVista.costoPromEsperaLabel.setText(""+tiempoPromedioCola()*this.costoEspera);        

        
        if (cantClienteCola > 0){
            System.out.println("Tiempo promedio de espera del cliente que hace cola: "+this.tiempoPromedioClienteCola/cantClienteCola);
            estadisticasVista.clienteHaceColaLabel.setText(""+this.tiempoPromedioClienteCola/cantClienteCola);        
           
        }
        
        i=1;
        for (Servidor server: servidores) {
            System.out.println("Costo servidor: "+server+" es: "+(((float)server.getTiempoUtilizacion()/(float)server.getCantVecesUsado())*server.getCosto()));
            costoServidorTabla.addRow(new Object[]{i, (((float)server.getTiempoUtilizacion()/(float)server.getCantVecesUsado())*server.getCosto())});
            i++;
        }
        
        
        
        estadisticasVista.setSize(800,500);
        mainPanel.removeAll();
        mainPanel.add(estadisticasVista);
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    public float cantPromedioClientesCola(){
        return (float)this.cantidadTotalTiempoClientesCola/(float)this.tiempoModelo;
    }
    
    public float cantPromedioClientesSistema(){
        return this.cantPromedioClientesSistema/this.tiempoModelo;
    }
    
    public float probabilidadEspera(){
        return this.probEspera = (float)(this.cantClientesSistema - this.cantClientesNoEspera) / (float)this.cantClientesSistema;
    }
    
    public float tiempoPromedioCola(){
        return (float)this.tiempoPromedioClienteCola/this.cantClientesSistema;
    }
    
    public float tiempoPromedioSistema(){
        return (float)this.tiempoPromedioClienteSistema/this.cantClientesSistema;
    }
    
    public void cantPromedioClientes(){
        this.cantPromedioClientesCola = this.cantPromedioClientesCola/this.tiempoModelo;
        this.cantPromedioClientesSistema = this. cantPromedioClientesSistema/this.tiempoModelo;
    }
    
    public void cantPromeClientes(int TManterior){
        this.cantPromedioClientesCola+= this.colaClientes.size() * Math.abs(TManterior-this.tiempoModelo);
        this.cantPromedioClientesSistema+=this.cantClientesSistema * Math.abs(TManterior-this.tiempoModelo);
    }
    
    public void llegadaCliente(){
        System.out.println("Llegada!");
        this.cantClientesSistema++;
        int TMant = this.tiempoModelo;
        boolean todosFull = true;
        setTMtoAT();
         
        if(this.cantMaxClientes == this.colaClientes.size()){
            this.cantClientesNoAtendidos++;
            todosFull=false;
        }
        
        for (Servidor server : servidores) {
            if(server.isVacio() && this.colaClientes.isEmpty()){
                server.setVacio(false);
                this.TS = generarTS();
                incrementDT(this.TS);
                Cliente cliente = new Cliente(this.TE, this.TS, this.tiempoModelo, -1);
                server.setCliente(cliente);
                server.setSalida(this.DT);
                this.cantClientesNoEspera++;
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
            Cliente cliente = new Cliente(this.TE, this.TS, this.tiempoModelo, this.tiempoModelo);
            this.colaClientes.add(cliente);
        }
        
        this.TE = generarTE();
        this.incrementAT(this.TE);
        limpiarServidores();
        cantPromeClientes(TMant);
        System.out.println("TM: "+this.tiempoModelo+" WL: "+this.colaClientes.size()+" AT: "+this.AT+" DT: "+this.DT);
        for (Servidor server : servidores) {
            System.out.println("Server vacio: "+server.isVacio()+" Tiempo salida: "+server.getSalida());
        }
        System.out.println("TE: "+this.TE+ " TS: "+this.TS);
        
        
        
        tablaEventosModel.addRow(new Object[]{"Llegada",this.tiempoModelo,this.colaClientes.size(),"Por hacer",this.AT,this.DT});
    }
    
    public void salidaCliente(){
        System.out.println("Salida!!");
        int TMant = this.tiempoModelo;
        setTMtoDT();
        if(!this.colaClientes.isEmpty()){
            limpiarServidores();
            Cliente cliente = this.colaClientes.poll();
            cantClienteCola++;
            this.cantidadTotalTiempoClientesCola += (this.tiempoModelo - cliente.getTiempoLlegadaCola());
            this.tiempoPromedioClienteCola += (this.tiempoModelo - cliente.getTiempoLlegadaSistema());
            for (Servidor server : servidores) {
                if(server.isVacio()){
                    server.setVacio(false);
                    this.TS = cliente.getTiempoServicio();
                    incrementDT(this.TS);
                    server.setCliente(cliente);
                    server.setSalida(this.DT);
                    break;
                }
            }
        }
        else{
            limpiarServidores();
            this.DT=999999;
        }
        cantPromeClientes(TMant);
        System.out.println("TM: "+this.tiempoModelo+" WL: "+this.colaClientes.size()+" AT: "+this.AT+" DT: "+this.DT);
        for (Servidor server : servidores) {
            System.out.println("Server "+server.isVacio()+" Tiempo salida: "+server.getSalida());
        }
        System.out.println("TE: "+this.TE+ " TS: "+this.TS);
        tablaEventosModel.addRow(new Object[]{"Salida",this.tiempoModelo,this.colaClientes.size(),"Por hacer",this.AT,this.DT});

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
  
//    public Cliente generarCliente(int TE, int TS){
//        Cliente cliente = new Cliente(TE, TS, this.tiempoModelo);
//        return cliente;
//    }
  
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
