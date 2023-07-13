/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ServicioRectangulo {
    private final Rectangulo r= new Rectangulo();
    
    //Crear rectángulo
    public void crearRectangulo(){
        Scanner input= new Scanner(System.in);
        
        System.out.println("Ingrese la base");
        r.setBase(input.nextInt());
        System.out.println("Ingrese la altura");
        r.setAltura(input.nextInt());
    }
    
    //Superficie rectángulo
    public int calcularSuperficie(){
        return  r.getBase()*r.getAltura();
    }
    
    //Perímetro rectángulo
    public int calcularPerimetro(){
        return (r.getBase()+r.getAltura())*2;
    }
    
    //Dibujar rectángulo
    public void dibujarRectangulo(){
        for(int i=0; i<r.getAltura(); i++){ //altura
            for(int j=0; j<r.getBase(); j++){ //base
                if(i==0||j==0||i==r.getAltura()-1||j==r.getBase()-1){ //Si i o j corresponden a los bordes del rectángulo
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
