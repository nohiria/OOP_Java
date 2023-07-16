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
    private final Matematica matematica= new Matematica();
    
    public void asignarAleatorios(){
        matematica.setReal1(Math.random()*10);
        matematica.setReal2(Math.random()*10);
        System.out.println("Real 1: "+matematica.getReal1()+". Real 2: "+matematica.getReal2());
    }
    
    public double devolverMayor(){
        return Math.max(matematica.getReal1(),matematica.getReal2());
    }
    
    public double calcularPotencia(){
        double max= Math.max(matematica.getReal1(), matematica.getReal2());
        double min= Math.min(matematica.getReal1(), matematica.getReal2());
        return Math.pow(max,min);
    }
    
    public double calculaRaiz(){
        double valor= Math.abs(Math.min(matematica.getReal1(), matematica.getReal2()));
        return Math.sqrt(valor);
    }
}
