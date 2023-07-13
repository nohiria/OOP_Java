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
public class Matematica {
    double real1;
    double real2;
    
    //Constructores
    public Matematica() {
    }

    public Matematica(double real1, double real2) {
        this.real1 = real1;
        this.real2 = real2;
    }
    
    //Getter&Setter
    public double getReal1() {
        return real1;
    }

    public void setReal1(double real1) {
        this.real1 = real1;
    }

    public double getReal2() {
        return real2;
    }

    public void setReal2(double real2) {
        this.real2 = real2;
    }
}
