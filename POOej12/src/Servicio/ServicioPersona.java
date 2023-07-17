/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ServicioPersona {
    private final Scanner input= new Scanner(System.in);
    private final Persona persona= new Persona();
    
    public void crearPersona(){
        //Solicita nombre de la persona
        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(input.nextLine());
        
        // Solicita fecha de nacimiento y validarla
        boolean fechaValida = false;
        Date fechaDeNacimiento = null;

        while (!fechaValida) {
            System.out.println("Ingrese fecha de nacimiento: DD/MM/AAAA");
            String fechaDeNacimientoStr = input.nextLine();
            /*Se usa la conversion del formato DD/MM/AAAA a un objeto 
            tipo Date y se valida si el formato y las fechas son válidas*/
            fechaDeNacimiento = convertirFecha(fechaDeNacimientoStr);

            // Valida la fecha
            if (fechaDeNacimiento != null) {
                fechaValida = true;
            } else {
                System.out.println("Fecha de nacimiento inválida. Vuelva a ingresarla.");
            }
        }
        
        persona.setFechaDeNacimiento(fechaDeNacimiento);
    }
    
    public int calcularEdad(){ //Devuelve la edad en años
        Date fechaActual= new Date();
        
        int edad= fechaActual.getYear()-persona.getFechaDeNacimiento().getYear();
        return edad;
    }
    
    public boolean menorQue(int edad){ //Comprueba si la persona tiene una edad menor a la ingresada
        return edad>=calcularEdad();
    }
    
    public void mostrarPersona(){
        System.out.println("Nombre: "+persona.getNombre()+", Fecha de Nacimiento "+persona.getFechaDeNacimiento());
    }
    
    
    //Métodos privados
    private Date convertirFecha(String fechaString) {
        String[] partes = fechaString.split("/"); //Divide la cadena usando "/" como separador
            
        try {
            int day = Integer.parseInt(partes[0]);
            int month = Integer.parseInt(partes[1]) - 1;
            int year = Integer.parseInt(partes[2]) - 1900;
            
            //Crea una fecha actual según el momento de la ejecución
            Date fechaActual= new Date();
            
            if(year+1900<1900||month<0||month>11||day<0||day>diasDelMes(month,year)){
                return null;//Devuelve null si el año, el mes y el día no son válidos
            }else{
                Date fecha = new Date(year, month, day);
                if (fecha.after(fechaActual) || fecha.equals(fechaActual)) {
                    return null; //Devuelve null si la fecha es mayor que la fecha actual
                } 
                    return fecha;//Caso contrario devuelve el objeto Date creado
            }
        } catch (NumberFormatException e) {//Devuelve null si la conversión falla
            return null; 
        }
    }//Recibe la cadena "DD/MM/AAAA" comprueba el formato, devuelve null si es inválido,
    
    private int diasDelMes(int month, int year) { 
        int days=0;
        
        switch (month+1) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days =31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if(esBisiesto(year)){
                    days=29;
                }else{
                    days=28;
                }
        }
        return days;
    }
    
    private boolean esBisiesto(int año) { 
        if (año % 4 == 0) {
            return !(año % 100 == 0 && año % 400 != 0); 
        }
        return false;
    }
}
