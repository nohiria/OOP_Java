/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


/**
 *
 * @author nohyv
 */
public class Operacion {
    private double numero1;
    private double numero2;
    
    //Constructores
    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //Getter&Setter

    public double getNumero1() {
        return (double) numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return (double) numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}
