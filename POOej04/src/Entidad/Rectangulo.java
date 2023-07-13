package Entidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nohyv
 */
public class Rectangulo {
    private int base;
    private int altura;
    
    //Constructores
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Getter&Setter
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
