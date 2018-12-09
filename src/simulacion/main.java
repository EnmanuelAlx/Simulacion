/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Enmanuel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        int cant_clientes;
        int tiempo_simulacion;
        int cant_servidores = 0;
        boolean tabla_eventos;

        Scanner s = new Scanner(System.in);
        ArrayList<Cliente> Clientes =new ArrayList<Cliente>();
        ArrayList<Servidor> Servidores = new ArrayList<Servidor>();
        System.out.println("1.- Segundos");
        System.out.println("2.- Minutos");
        System.out.println("3.- Horas");
        System.out.println("4.- Días");
        System.out.println("5.- Semanas");
        System.out.println("6.- Meses");
        System.out.println("7.- Años");
        System.out.println("Seleccione la unidad de tiempo para la simulacion: ");
        tiempo_simulacion = s.nextInt();
        System.out.println("Clientes permitidos: ");
        cant_clientes = s.nextInt();
        
        for (int i = 0; i < cant_clientes; i++) {
            int tiempo_llegada = 0;
            float probabilidad = 0;
            int costo_espera = 0;
            System.out.println("Tiempo entre llegada del cliente "+i+": ");
            tiempo_llegada = s.nextInt();
            System.out.println("Probabilidad del cliente "+i+": ");
            probabilidad = s.nextFloat();
            System.out.println("Costo de espera del cliente "+i+": ");
            costo_espera = s.nextInt();
            Cliente C = new Cliente(tiempo_llegada, probabilidad, costo_espera);
            Clientes.add(C);
        }
        
        System.out.println("Cantidad de servidores: ");
        cant_servidores = s.nextInt();
        
        for (int i = 0; i < cant_servidores; i++) {
            int tiempo_llegada = 0;
            float probabilidad = 0;
            int costo = 0;
            System.out.println("Tiempo de servicio del servidor "+i+": ");
            tiempo_llegada = s.nextInt();
            System.out.println("Probabilidad del servidor "+i+": ");
            probabilidad = s.nextFloat();
            System.out.println("Costo del servidor "+i+": ");
            costo = s.nextInt();
            Servidor S = new Servidor(tiempo_llegada, probabilidad, costo);
            Servidores.add(S);
        }
        
        System.out.println("¿Desea visualizar la tabla de eventos?");
        tabla_eventos = s.nextBoolean();
        
        Simulacion simulacion = new Simulacion(tiempo_simulacion,
                cant_clientes,
                cant_servidores,
                tabla_eventos,
                Clientes,
                Servidores);
        
    }
    
}
