/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author nohyv
 */
public class Arreglos {
    private double[] arrayA;
    private double[] arrayB;
    
    //Constructores
    public Arreglos() {
    }

    public Arreglos(double[] arrayA, double[] arrayB) {
        this.arrayA = arrayA;
        this.arrayB = arrayB;
    }
    
    //Getter&Setter
    public double[] getArrayA() {
        return arrayA;
    }

    public void setArrayA(double[] arrayA) {
        this.arrayA = arrayA;
    }

    public double[] getArrayB() {
        return arrayB;
    }

    public void setArrayB(double[] arrayB) {
        this.arrayB = arrayB;
    }
}
