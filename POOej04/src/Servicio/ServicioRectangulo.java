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
    private Rectangulo r= new Rectangulo();
    
    //Crear rectángulo
    public Rectangulo crearRectangulo(){
        Scanner input= new Scanner(System.in);
        
        System.out.println("Ingrese la base");
        r.setBase(input.nextInt());
        System.out.println("Ingrese la altura");
        r.setAltura(input.nextInt());
        
        return r;
    }
    
    //Superficie rectángulo
    public int calcularSuperficie(){
        int superficie= r.getBase()*r.getAltura();
        return superficie;
    }
    
    //Perímetro rectángulo
    public int calcularPerimetro(){
        int perimetro= (r.getBase()+r.getAltura())*2;
        return perimetro;
    }
    
    //Dibujar rectángulo
    public void dibujarRectangulo(){
        for(int i=0; i<r.getAltura(); i++){
            for(int j=0; j<r.getBase(); j++){
                if(i==0||j==0||i==r.getAltura()-1||j==r.getBase()-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
