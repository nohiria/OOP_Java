/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ServicioNIF {
    private final NIF nif= new NIF();
    private final Scanner input= new Scanner(System.in);
    
    public void crearNIF(){
        System.out.println("Ingrese el número de documento");
        long dni= input.nextLong();
        while(dni>=99999999&&dni<=0){
            System.out.println("Ingrese un número válido");
            dni= input.nextLong();
        }
        nif.setDNI(dni); //Guarda el número de DNI
        nif.setLetra(devolverLetra(dni));
    }
    
    //Muestra DNI en formato "C-0000000"
    public void mostrarNIF(){
        String[] dni= new String[8];
        String numDni= String.valueOf(nif.getDNI()); //Se crea una cadena con los caracteres del dni
        Arrays.fill(dni, 0, 7, "0");//Se llena el arreglo dni con ceros
        
        for(int i=7; i>=0; i--){ //Se iteran los valores de dni
            if(i>=8-numDni.length()){ // Verifica si hay números disponibles para asignar
               dni[i]= String.valueOf(numDni.charAt(i-(8-numDni.length())));  //Ej: i=7   7-(8-5) 7-3=4 4 es el último dígito de la cadena de 5=0,1,2,3,4,5
            }
        }
        
        System.out.print(nif.getLetra()+"-");
        for (String dni1 : dni) {
            System.out.print(dni1);
        }
    }
    
    private char devolverLetra(long dni){
        char[] letra= {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int codigo= (int) (dni%23);
        
        return letra[codigo];
    }
}
