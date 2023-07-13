/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Arreglos;
import java.util.Arrays;

/**
 *
 * @author nohyv
 */
public class ArreglosServicio {
    public Arreglos crearArreglos(){
        //Inicializar arreglo de tipo real con 50 números
        double[] arrayA= new double[50];
        double[] arrayB= new double[20];
        
        Arreglos arreglos= new Arreglos(arrayA,arrayB);
        
        return arreglos;
    }
    
    public void inicializarArregloA(Arreglos arreglos){
        double[] arrayA= arreglos.getArrayA();
        
        for(int i=0; i<arrayA.length; i++){
            double numero = Math.random() * 10;
            double redondeado = Math.round(numero * 100.0) / 100.0;
            arrayA[i] = redondeado;
        }
        
        arreglos.setArrayA(arrayA);
    }
    
    public void ordenarArregloA(Arreglos arreglos){
        double[] arrayA= arreglos.getArrayA();
        Arrays.sort(arrayA);
        arreglos.setArrayA(arrayA);
    }
    
    public void copiarArregloA(Arreglos arreglos){
        double[] arrayA= arreglos.getArrayA();
        double[] arrayB= arreglos.getArrayB();
        
        System.arraycopy(arrayA, 0, arrayB, 0, arrayB.length-10);
        for(int i=10; i<20; i++){
            arrayB[i]=0.5;
        }
        
        arreglos.setArrayB(arrayB);
    }
    
    //Mostrar Arreglos
    public void mostrarArrayA(Arreglos arreglos) {
        System.out.println("Arreglo A: " + Arrays.toString(arreglos.getArrayA()));
    }

    public void mostrarArrayB(Arreglos arreglos) {
        System.out.println("Arreglo B: " + Arrays.toString(arreglos.getArrayB()));
    }
    
    public void mostrarArreglos(Arreglos arreglos) {
        System.out.println("Arreglo A: " + Arrays.toString(arreglos.getArrayA()));
        System.out.println("Arreglo B: " + Arrays.toString(arreglos.getArrayB()));
    }
}
