/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ServicioCircunferencia {
    private final Circunferencia circulo= new Circunferencia();
    
    public void crearCircunferencia(){
        Scanner input= new Scanner(System.in);
        
        System.out.println("Ingrese el radio");
        circulo.setRadio(input.nextDouble());
    }
    
    public double area(){
        return Math.PI*Math.pow(circulo.getRadio(), 2); //pi*radio^2
    }
    
    public double perimetro(){
        return 2*Math.PI*circulo.getRadio(); //2*pi*radio
    }
}
