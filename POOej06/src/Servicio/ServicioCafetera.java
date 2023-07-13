/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;

/**
 *
 * @author nohyv
 */
public class ServicioCafetera {
    public Cafetera crearCafetera(int capacidad){
        Cafetera ca= new Cafetera(capacidad, 0);
        return ca;
    }
    
    //Llenar Cafetera
    public void llenarCafetera(Cafetera ca){
        ca.setCantidadActual(ca.getCapacidadMaxima());
    }
    
    //Servir Taza
    public void servirTaza(Cafetera ca, int taza){
        if(ca.getCantidadActual()<taza){
            System.out.println("La taza no se llenó, se sirvieron solo "+ca.getCantidadActual());
            ca.setCantidadActual(0);
        }else{
            ca.setCantidadActual(ca.getCantidadActual()-taza);
            System.out.println("La taza se llenó");
        }
    }
    
    //Vaciar Cafetera
    public void vaciarCafetera(Cafetera ca){
        ca.setCantidadActual(0);
    }
    
    //Agregar cafe
    public void agregarCafe(Cafetera ca, int cantidad){
        if(cantidad>ca.getCapacidadMaxima()){
            System.out.println("Sobrepasa la capacidad, cafetera llena");
            ca.setCantidadActual(ca.getCapacidadMaxima());
        }else{
            ca.setCantidadActual(cantidad);
        }
    }
}
