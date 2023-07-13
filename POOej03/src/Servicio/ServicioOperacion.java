/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ServicioOperacion {
    private final Operacion op= new Operacion();
    
    //Crear "Operación"
    public void crearOperacion(){
        Scanner input= new Scanner(System.in);
        
        //Pedir números
        System.out.println("Ingrese el primer número");
        op.setNumero1(input.nextDouble());
        System.out.println("Ingrese el segundo número");
        op.setNumero2(input.nextDouble());
    }
    
    public double sumar(){
        return op.getNumero1()+op.getNumero2();
    }
    
    public double restar(){
        return op.getNumero1()-op.getNumero2();
    }
    
    public double multiplicar(){
        return op.getNumero1()*op.getNumero2();
    }
    
    public double dividir(){
        if(op.getNumero2()==0){
            System.out.println("Error, no se puede dividir por 0");
            return 0;
        }
        
        return op.getNumero1()/op.getNumero2();
    }
    
    public double mostrarNum1(){
        return op.getNumero1();
    }
    
    public double mostrarNum2(){
        return op.getNumero2();
    }
}
