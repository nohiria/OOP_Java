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
public class Cadena {
    private String frase;
    private int longitud;

    //Constructores
    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }
    
    //Getter&Setter
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud= frase.length();
    }

    public int getLongitud() {
        return longitud;
    }
    
}
