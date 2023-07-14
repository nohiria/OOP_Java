/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ServicioCadena {
    private final Scanner input= new Scanner(System.in);
    private final Cadena cadena= new Cadena();
    
    public void crearCadena(){
        System.out.println("Ingrese la frase o cadena");
        cadena.setFrase(input.nextLine());
    }
    
    public void mostrarVocales(){
        int cont=0;
        
        for(int i=0; i<cadena.getLongitud(); i++){
            String letra= cadena.getFrase().substring(i, i+1); //Separa las letras y si es una vocal la añade al contador
            if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
                cont++;
            }
        }
        System.out.println("La frase tiene "+cont+" vocales");
    }
    
    public void invertirFrase(){
        String fraseAlReves="";
        for(int i=cadena.getLongitud()-1;i>=0; i--){
            fraseAlReves += cadena.getFrase().charAt(i);
        }
        System.out.println(cadena.getFrase()+" al revés es "+fraseAlReves);
    }
    
    //Veces repetido
    public void vecesRepetido(String letra){
        int cont=0;
        
        for(int i=0; i<cadena.getLongitud(); i++){    
            String caracterPalabra= cadena.getFrase().substring(i, i+1);
            if(letra.equalsIgnoreCase(caracterPalabra)){
                cont++; //Se cuenta +1 si la letra ingresada por el usuario se encuentra en la palabra
            }
        }
        System.out.println(letra+" está repetida "+cont+" veces");
    }
    
    //Comparar longitud
    public void compararLongitud(String fraseComparacion){
        if(cadena.getLongitud()==fraseComparacion.length()){
            System.out.println("Frases tienen la misma longitud");
        }else{
            System.out.println("Frases tienen diferente longitud");
        }
    }
    
    //Unir frases
    public void unirFrases(String fraseAUnir){
        String nuevaFrase= cadena.getFrase().concat(fraseAUnir);
        System.out.println(nuevaFrase);
    }
    
    //Reemplazar letra
    public void reemplazar(String letra){
        String palabraNueva="";
        for(int i=0; i<cadena.getLongitud(); i++){
            String letraFrase= cadena.getFrase().substring(i, i+1);
            if(letraFrase.equalsIgnoreCase("a")){
                letraFrase= letra;
            }
            palabraNueva+=letraFrase;
        }
        System.out.println(palabraNueva);
    }
    
    //Buscar letra
    public boolean contiene(String letra){
        boolean letraContenida=false;
        for(int i=0; i<cadena.getLongitud(); i++){
            if(cadena.getFrase().substring(i,i+1).equalsIgnoreCase(letra)){
                letraContenida=true;
            }
        }
        return letraContenida;
    }
}
