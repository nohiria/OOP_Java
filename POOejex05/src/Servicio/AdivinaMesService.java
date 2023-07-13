/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.AdivinaMes;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class AdivinaMesService {
    private final AdivinaMes adivina= new AdivinaMes(); //Se inicializa por defecto 9= octubre
    private final Scanner input= new Scanner(System.in);
    
    public void adivinarMesSecreto(){ 
        boolean adivinado= false;
        int intentos= 3;
        
        while(adivinado==false&&intentos>=1){
            //Se pide mes al usuario
            System.out.println("Adivina el mes secreto. Ingresa el nombre del mes");
            System.out.println("Tienes "+intentos+" intentos");
            String respuesta = input.nextLine();

            if (respuesta.equalsIgnoreCase(adivina.getSecretMonth())) { //Si la respuesta es igual al mes se termina el ciclo
                System.out.println("Acertaste");
                adivinado = true;
            } else {
                intentos--; //Sino se restan los intentos
                System.out.println("Incorrecto");
            }
        }
        
        if(adivinado==false){ //Si se supera el número de intentos 
            System.out.println("Fallaste");
        }
    }
}
