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
    private Circunferencia circulo= new Circunferencia();
    
    public Circunferencia crearCircunferencia(){
        Scanner input= new Scanner(System.in);
        
        //Se pide el atributo
        System.out.println("Ingrese el radio");
        circulo.setRadio(input.nextDouble());
        return circulo;
    }
    
    public double area(){
        double a= Math.PI*Math.pow(circulo.getRadio(), 2);
        return a;
    }
    
    public double perimetro(){
        double per= 2*Math.PI*circulo.getRadio();
        return per;
    }
}
