/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author nohyv
 */
public class MatematicaServicio {
    public Matematica asignarAleatorios(){
        Matematica objeto= new Matematica();
        double num1= Math.random()*10;
        double num2= Math.random()*10;
        objeto.setReal1(num1);
        objeto.setReal2(num2);
        System.out.println("Real 1: "+num1+". Real 2: "+num2);
        return objeto;
    }
    
    public static double devolverMayor(Matematica objeto){
        return Math.max(objeto.getReal1(),objeto.getReal2());
    }
    
    public static double calcularPotencia(Matematica objeto){
        double max= Math.max(objeto.getReal1(), objeto.getReal2());
        double min= Math.min(objeto.getReal1(), objeto.getReal2());
        return Math.pow(max,min);
    }
    
    public static double calculaRaiz(Matematica objeto){
        double valor= Math.abs(Math.min(objeto.getReal1(), objeto.getReal2()));
        return Math.sqrt(valor);
    }
}
