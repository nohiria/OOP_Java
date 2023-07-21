/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class AhorcadoServicio {
    private final Ahorcado ahorcado;
    private final Scanner input;
    private char[] palabraEncontrada;

    public AhorcadoServicio() {
        ahorcado= new Ahorcado();
        input= new Scanner(System.in);
    }
    
    public void crearJuego(){
        System.out.println("Bienvenido al juego del ahorcado");
        System.out.println("Ingrese la palabra");
        String p= input.nextLine().toUpperCase();
        System.out.println("Elija la dificultad");
        System.out.println("1.Fácil");
        System.out.println("2.Media");
        System.out.println("3.Difícil");
        int dificultad= Integer.parseInt(input.nextLine());
        while(dificultad<1||dificultad>3){
            System.out.println("Ingrese un número válido.");
            dificultad= Integer.parseInt(input.nextLine());
        }
        
        int jugadas=0;
        switch(dificultad){
            case 1: 
                jugadas= 6;
                break;
            case 2:
                jugadas= 4;
                break;
            case 3:
                jugadas= 2;
                break;
        }
        
        char[] palabra= new char[p.length()];
        palabraEncontrada= new char[p.length()];
        for(int i=0; i<p.length(); i++){
            char letra= p.charAt(i);
            palabra[i]= letra;
            palabraEncontrada[i]= '_';
        }
        
        ahorcado.setPalabra(palabra);
        ahorcado.setLetrasEncontradas(0);
        ahorcado.setJugadasMaximas(jugadas);
        System.out.println("Juego creado");
    }
    
    public void longitud(){
        System.out.println("La longitud de la palabra es: "+ ahorcado.getPalabra().length);
    }
 
    public void buscar(char letraIngresada){
        char[] palabra= ahorcado.getPalabra();
        boolean encontrada= false;
        if(encontradas(letraIngresada)){
            System.out.println("La letra ya había sido ingresada");
            ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas()-1);
        }else{
            for(int i=0; i<palabra.length; i++){
                if(palabra[i]==letraIngresada){
                    encontrada = true;
                    palabraEncontrada[i] = letraIngresada;
                }
            }
            
            if(encontrada){
                System.out.println("Letra encontrada");
            }else{
                System.out.println("Letra no encontrada");
                ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas()-1);
            }
        }
        
    }
    
    private boolean encontradas(char letra){
        for(int i=0; i<palabraEncontrada.length; i++){
            if(palabraEncontrada[i]==letra){
                return true;
            }
        }
        return false;
    }
    
    public void intentos(){
        System.out.println("Restan "+ahorcado.getJugadasMaximas()+" intentos");
    }
    
    public void juego(){
        crearJuego();
        longitud();
        while(ahorcado.getJugadasMaximas()>0&&!Arrays.equals(palabraEncontrada, ahorcado.getPalabra())){
            System.out.println(palabraEncontrada);
            System.out.println("Ingrese una letra a buscar");
            buscar(input.nextLine().toUpperCase().charAt(0));
            intentos();
        }
        System.out.println("Juego terminado");
    }
}
