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
        while(dificultad<1||dificultad>3){ //Validar input
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
        palabraEncontrada= new char[p.length()]; //Para validar las letras encontradas
        for(int i=0; i<p.length(); i++){
            char letra= p.charAt(i);
            palabra[i]= letra; //En la palabra se ingresa la letra
            palabraEncontrada[i]= '_'; //En las encontradas se crea el espacio '_'
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
        boolean letraEncontrada= false;
        if(encontradas(letraIngresada)){ //Comprueba si ha sido ingresada anteriormente
            System.out.println("La letra ya había sido ingresada");
            ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas()-1);
        }else{ //Sino se itera el vector para buscar la letra en la palabra
            for(int i=0; i<palabra.length; i++){
                if(palabra[i]==letraIngresada){ //Si coincide se ingresa al espacio correspondiente
                    letraEncontrada = true;
                    palabraEncontrada[i] = letraIngresada;
                }
            }
            
            if(letraEncontrada){
                System.out.println("Letra encontrada");
            }else{
                System.out.println("Letra no encontrada");
                ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas()-1);
            }
        }
        
    }
    
    //Itera el vector de letras encontradas en búsqueda de coincidencias
    private boolean encontradas(char letraIngresada){ 
        for(int i=0; i<palabraEncontrada.length; i++){
            if(palabraEncontrada[i]==letraIngresada){
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
