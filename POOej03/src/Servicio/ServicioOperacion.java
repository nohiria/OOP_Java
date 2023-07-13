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
    private Operacion op= new Operacion();
    
    //Crear "Operación"
    public Operacion crearOperacion(){
        Scanner input= new Scanner(System.in);
        
        //Pedir números
        System.out.println("Ingrese el primer número");
        op.setNumero1(input.nextDouble());
        System.out.println("Ingrese el segundo número");
        op.setNumero2(input.nextDouble());
        
        return op;
    }
    
    public int sumar(){
        int suma= (int) (op.getNumero1()+op.getNumero2());
        return suma;
    }
    
    public int restar(){
        int resta= (int) (op.getNumero1()-op.getNumero2());
        return resta;
    }
    
    public int multiplicar(){
        if(op.getNumero2()==0||op.getNumero1()==0){
            System.out.println("Error");
            return 0;
        }else{
            int multiplicacion= (int) (op.getNumero1()*op.getNumero2());
            return multiplicacion;
        }
    }
    
    public double dividir(){
        if(op.getNumero2()==0){
            System.out.println("Error");
            return 0;
        }else{
            double division= op.getNumero1()/op.getNumero2();
            return division;
        }
    }
    
    public double mostrarNum1(){
        return op.getNumero1();
    }
    
    public double mostrarNum2(){
        return op.getNumero2();
    }
}
