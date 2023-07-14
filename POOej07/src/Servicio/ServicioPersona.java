/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ServicioPersona {
    private final Persona persona= new Persona();
    
    //Crear persona
    public void crearPersona(){
        Scanner input= new Scanner(System.in);
        
        System.out.println("Ingrese nombre");
        persona.setNombre(input.nextLine());
        System.out.println("Ingrese edad");
        persona.setEdad(input.nextInt());
        input.nextLine();
        System.out.println("Ingrese sexo");
        String sexo=input.nextLine();
        while(!sexo.equalsIgnoreCase("H")&&!sexo.equalsIgnoreCase("M")&&!sexo.equalsIgnoreCase("O")){
            System.out.println("Error, ingrese un valor válido");
            sexo=input.nextLine();
        }
        persona.setSexo(sexo);
        System.out.println("Ingrese peso");
        persona.setPeso(input.nextDouble());
        System.out.println("Ingrese altura");
        persona.setAltura(input.nextDouble());
    }
    
    //Calcular IMC
    public int calcularIMC(){
        double imc= persona.getPeso()/Math.pow(persona.getAltura(), 2);
        
        if (imc<20){
            return -1;
        }else if(imc>=20&&imc<=25){
            return 0;
        }else{
            return 1;
        }
    }
    
    //¿Es mayor de edad?
    public boolean esMayor(){
        return persona.getEdad()>=18;
    }
}
