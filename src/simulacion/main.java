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
        int tiempoSimulacion;
        int cantClientes;
        int cantServidores = 0;
        int tablaEventos;
        int costoEspera = 0;
        int cantValores;
        int costoServidor = 0;
        ArrayList<TiempoLlegada> tiemposLlegada = new ArrayList<TiempoLlegada>();
        ArrayList<TiempoServicio> tiemposServicios = new ArrayList<TiempoServicio>();
        Scanner s = new Scanner(System.in);
        
        System.out.println("1.- Segundos");
        System.out.println("2.- Minutos");
        System.out.println("3.- Horas");
        System.out.println("4.- Días");
        System.out.println("5.- Semanas");
        System.out.println("6.- Meses");
        System.out.println("7.- Años");
        System.out.println("Seleccione la unidad de tiempo para la simulacion: ");
        tiempoSimulacion = s.nextInt();
       
        System.out.println("Clientes permitidos: ");
        cantClientes = s.nextInt();
        
        System.out.println("Tiempo entre llegadas: Cantidad de valores");
        cantValores = s.nextInt();
        int min = 0;
        int max = 0;
        for (int i = 0; i < cantValores; i++) {
            int valor = 0;
            float probabilidad = 0;
            System.out.println("Introduce el valor del tiempo de llegada: "+i);
            valor = s.nextInt();
            System.out.println("Introduce la probabilidad del tiempo de llegada: "+i);
            probabilidad = s.nextFloat();
            max += probabilidad*100;
            TiempoLlegada tiempoLlegada = new TiempoLlegada(valor, probabilidad, min, max-1);
            min +=probabilidad*100;
            System.out.println(tiempoLlegada.getMin());
            System.out.println(tiempoLlegada.getMax());
            tiemposLlegada.add(tiempoLlegada);
        }
      
        System.out.println("Cantidad de servidores: ");
        cantServidores = s.nextInt();
        
        System.out.println("Tiempos de servicio para cada servidor: Cantidad de valores");
        cantValores = s.nextInt();
        min = 0;
        max = 0;
        for (int i = 0; i < cantValores; i++) {
            int valor = 0;
            float probabilidad = 0;
            System.out.println("Introduce el valor del tiempo de servicio: "+i);
            valor = s.nextInt();
            System.out.println("Introduce la probabilidad del tiempo de servicio: "+i);
            probabilidad = s.nextFloat();
            max += probabilidad*100;
            TiempoServicio tiempoServicio = new TiempoServicio(valor, probabilidad, min, max-1);
            min +=probabilidad*100;
            tiemposServicios.add(tiempoServicio);
        }
     
        System.out.println("Costo de cada servidor");
        costoServidor = s.nextInt();
            
        System.out.println("Costo de espera de los clientes");
        costoEspera = s.nextInt();
        
        System.out.println("¿Desea visualizar la tabla de eventos?");
        System.out.println("1.- Si");
        System.out.println("2.- No");
        tablaEventos = s.nextInt();
        
        Simulacion simulacion = new Simulacion(
            tiempoSimulacion,
            cantClientes,
            tiemposLlegada,
            tiemposServicios,
            costoServidor,
            costoEspera,
            tablaEventos,
            cantServidores);
        
        simulacion.play();
        
        
    }
    
}
