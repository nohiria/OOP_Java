/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;

/**
 *
 * @author nohyv
 */
public class ServicioRaices {
    public static double getDiscriminante(Raices raices){
        return Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC();
    }
    
    public static boolean tieneRaices(Raices raices){
        return getDiscriminante(raices) > 0;
    }
    
    public static boolean tieneRaiz(Raices raices){
        return getDiscriminante(raices) == 0;
    }
    
    public static void obtenerRaices(Raices raices){
        if(tieneRaices(raices)){
            double raiz1 = (-raices.getB() + Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
            double raiz2 = (-raices.getB() - Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
            System.out.println("Las raíces son: "+raiz1+" y "+raiz2);
        }
    }
    
    public static void obtenerRaiz(Raices raices){
        if(tieneRaiz(raices)){
            double raiz= -raices.getB()/(2*raices.getA());
            System.out.println("La raíz es "+ raiz);
        }
    }
    
    public static void calcular(Raices raices){
        if(tieneRaices(raices)){
            obtenerRaices(raices);
        }else if(tieneRaiz(raices)){
            obtenerRaiz(raices);
        }else{
            System.out.println("No existe solución real");
        }
    }
}
