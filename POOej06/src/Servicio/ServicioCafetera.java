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
    Cafetera ca= new Cafetera();
    
    public void crearCafetera(int capacidad){
        ca.setCapacidadMaxima(capacidad);
    }
    
    //Llenar Cafetera
    public void llenarCafetera(){
        ca.setCantidadActual(ca.getCapacidadMaxima());
        System.out.println("Se llenó la cafetera. La cantidad actual es de: "+ca.getCantidadActual());
    }
    
    //Servir Taza
    public void servirTaza(int taza){
        if(ca.getCantidadActual()==0){
            System.out.println("La cafetera está vacía, no se puede servir la taza");
        }else if(ca.getCantidadActual()<taza){
            System.out.println("La taza de tamaño "+taza+" no se llenó, se sirvieron solo "+ca.getCantidadActual());
            ca.setCantidadActual(0);
        }else{
            ca.setCantidadActual(ca.getCantidadActual()-taza);
            System.out.println("La taza se llenó con "+taza+". Restan "+ca.getCantidadActual()+" en la cafetera");
        }
    }
    
    //Vaciar Cafetera
    public void vaciarCafetera(){
        System.out.println("Se vació la cafetera");
        ca.setCantidadActual(0);
    }
    
    //Agregar cafe
    public void agregarCafe(int cantidad){
        if(cantidad>ca.getCapacidadMaxima()){
            System.out.println(cantidad+ " sobrepasa la capacidad, cafetera llena");
            ca.setCantidadActual(ca.getCapacidadMaxima());
        }else{
            System.out.println("Se agregaron "+cantidad+" a la cafetera");
            ca.setCantidadActual(cantidad);
        }
    }
}
