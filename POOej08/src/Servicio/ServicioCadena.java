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
    private Scanner input= new Scanner(System.in);
    
    public Cadena crearCadena(){
        System.out.println("Ingrese la frase o cadena");
        Cadena cadena= new Cadena(input.nextLine());
        return cadena;
    }
    
    public void mostrarVocales(Cadena cadena){
        int cont=0;
        
        for(int i=0; i<cadena.getLongitud(); i++){
            String letra= cadena.getFrase().substring(i, i+1);
            if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
                cont++;
            }
        }
        System.out.println("La frase tiene "+cont+" vocales");
    }
    
    public void invertirFrase(Cadena cadena){
        String fraseAlReves="";
        for(int i=cadena.getLongitud()-1;i>=0; i--){
            fraseAlReves += cadena.getFrase().charAt(i);
        }
        System.out.println(cadena.getFrase()+" al revés es "+fraseAlReves);
    }
    
    //Veces repetido
    public void vecesRepetido(Cadena cadena, String letra){
        int cont=0;
        
        for(int i=0; i<cadena.getLongitud(); i++){    
            String caracterPalabra= cadena.getFrase().substring(i, i+1);
            if(letra.equalsIgnoreCase(caracterPalabra)){
                cont++;
            }
        }
        System.out.println(letra+" está repetida "+cont+" veces");
    }
    
    //Comparar longitud
    public void compararLongitud(Cadena cadena, String fraseComparacion){
        if(cadena.getLongitud()==fraseComparacion.length()){
            System.out.println("Frases tienen la misma longitud");
        }else{
            System.out.println("Frases tienen diferente longitud");
        }
    }
    
    //Unir frases
    public void unirFrases(Cadena cadena, String fraseAUnir){
        String nuevaFrase= cadena.getFrase().concat(fraseAUnir);
        System.out.println(nuevaFrase);
    }
    
    //Reemplazar letra
    public void reemplazar(Cadena cadena, String letra){
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
    public boolean contiene(Cadena cadena, String letra){
        boolean letraContenida=false;
        for(int i=0; i<cadena.getLongitud(); i++){
            if(cadena.getFrase().substring(i,i+1).equalsIgnoreCase(letra)){
                letraContenida=true;
            }
        }
        return letraContenida;
    }
}
