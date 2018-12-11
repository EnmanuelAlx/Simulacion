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
        int tiempoTotal = 0;
        ArrayList<Tiempo> tiemposLlegada = new ArrayList<Tiempo>();
        ArrayList<Tiempo> tiemposServicios = new ArrayList<Tiempo>();
        Scanner s = new Scanner(System.in);
        
        System.out.println("1.- Segundos");
        System.out.println("2.- Minutos");
        System.out.println("3.- Horas");
        System.out.println("4.- Días");
        System.out.println("5.- Semanas");
        System.out.println("6.- Meses");
        System.out.println("7.- Años");
        System.out.print("Seleccione la unidad de tiempo para la simulacion: ");
        tiempoSimulacion = s.nextInt();
       
        System.out.print("Tiempo total de la simulacion: ");
        tiempoTotal = s.nextInt();
        
        System.out.print("Clientes permitidos: ");
        cantClientes = s.nextInt();
        
//        System.out.println("Tiempo entre llegadas: Cantidad de valores");
//        cantValores = s.nextInt();
//        int min = 0;
//        int max = 0;
//        for (int i = 0; i < cantValores; i++) {
//            int valor = 0;
//            float probabilidad = 0;
//            System.out.println("Introduce el valor del tiempo de llegada: "+i);
//            valor = s.nextInt();
//            System.out.println("Introduce la probabilidad del tiempo de llegada: "+i);
//            probabilidad = s.nextFloat();
//            max += probabilidad*100;
//            Tiempo tiempoLlegada = new Tiempo(valor, probabilidad, min, max-1);
//            min +=probabilidad*100;
//            
//            tiemposLlegada.add(tiempoLlegada);
//        }
        tiemposLlegada.add(createTiempo(1, 0.3f, 0, 29));
        tiemposLlegada.add(createTiempo(2, 0.3f, 30, 59));
        tiemposLlegada.add(createTiempo(3, 0.4f, 60, 99));

        
        System.out.println("Cantidad de servidores: ");
        cantServidores = s.nextInt();
//        
//        System.out.println("Tiempos de servicio para cada servidor: Cantidad de valores");
//        cantValores = s.nextInt();
//        min = 0;
//        max = 0;
//        for (int i = 0; i < cantValores; i++) {
//            int valor = 0;
//            float probabilidad = 0;
//            System.out.println("Introduce el valor del tiempo de servicio: "+i);
//            valor = s.nextInt();
//            System.out.println("Introduce la probabilidad del tiempo de servicio: "+i);
//            probabilidad = s.nextFloat();
//            max += probabilidad*100;
//            Tiempo tiempoServicio = new Tiempo(valor, probabilidad, min, max-1);
//            min +=probabilidad*100;
//            tiemposServicios.add(tiempoServicio);
//        }
        
        tiemposServicios.add(createTiempo(1, 0.2f, 0, 19));
        tiemposServicios.add(createTiempo(2, 0.2f, 20, 39));
        tiemposServicios.add(createTiempo(3, 0.2f, 40, 59));
        tiemposServicios.add(createTiempo(4, 0.2f, 60, 79));
        tiemposServicios.add(createTiempo(5, 0.2f, 80, 99));

                        
        
        System.out.print("Costo de cada servidor: ");
        costoServidor = s.nextInt();
            
        System.out.print("Costo de espera de los clientes: ");
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
            cantServidores,
            false,
            tiempoTotal);
        
        simulacion.play();
        
        
    }
    
    public static Tiempo createTiempo(int valor, float probabilidad, int min, int max){
        Tiempo tiempo = new Tiempo(valor, probabilidad, min, max);
        return tiempo;
    }
    
}
