/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ServicioPuntos {
    private final Puntos puntos= new Puntos();
    private final Scanner input= new Scanner(System.in);
    
    public void crearPuntos(){
        System.out.println("Punto 1");
        System.out.println("Ingrese x1");
        puntos.setX1(input.nextDouble());
        System.out.println("Ingrese y1");
        puntos.setY1(input.nextDouble());
        System.out.println("Punto 2");
        System.out.println("Ingrese x2");
        puntos.setX2(input.nextDouble());
        System.out.println("Ingrese y2");
        puntos.setY2(input.nextDouble());
    }
    
    public double calcularDistancia(){
        double x1= puntos.getX1();
        double x2= puntos.getX2();
        double y1= puntos.getY1();
        double y2= puntos.getY2();
        
        double distancia= Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        
        return distancia;
    }
}
