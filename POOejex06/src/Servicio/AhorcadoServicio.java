/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class AhorcadoServicio {
    private final Ahorcado ahorcado= new Ahorcado();
    private final Scanner input= new Scanner(System.in);
    
    public void crearJuego(){
        System.out.println("Ingrese la palabra");
        String p= input.nextLine();
        System.out.println("Ingrese la cantidad de jugadas máxima. 1 al 10");
        int jugadas= Integer.parseInt(input.nextLine());
        while (jugadas<=0||jugadas>10){
            System.out.println("Ingrese un número válido.");
            jugadas= Integer.parseInt(input.nextLine());
        }
        ahorcado.setJugadasMaximas(jugadas);
        
        char[] palabra= new char[p.length()];
        for(int i=0; i<p.length(); i++){
            char letra= p.charAt(i);
            palabra[i]= letra;
        }
        ahorcado.setPalabra(palabra);
        ahorcado.setLetrasEncontradas(0);
        System.out.println("Juego creado");
    }
    
    public void longitud(){
        System.out.println("La longitud de la palabra es: "+ ahorcado.getPalabra().length);
    }
    
    /* Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.*/
    public void buscarLetra(){
        
    }
    
}
