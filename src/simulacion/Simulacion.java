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
public class Simulacion {
    int tiempo_simulacion;
    int cant_clientes;
    int cant_servidores;
    boolean tabla_eventos;
    ArrayList<Cliente> Clientes;
    ArrayList<Servidor> Servidores;

    public Simulacion(int tiempo_simulacion,
            int cant_clientes,
            int cant_servidores,
            boolean tabla_eventos,
            ArrayList<Cliente> Clientes,
            ArrayList<Servidor> Servidores){
        this.tiempo_simulacion = tiempo_simulacion;
        this.cant_clientes = cant_clientes;
        this.cant_servidores = cant_servidores;
        this.tabla_eventos = tabla_eventos;
        this.Clientes = Clientes;
        this.Servidores = Servidores;
    }

    
    
}
