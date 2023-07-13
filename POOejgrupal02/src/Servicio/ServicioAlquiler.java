/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alquiler;
import Entidad.Pelicula;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ServicioAlquiler {
    private static Scanner input= new Scanner(System.in);
            

    public Alquiler crearAlquiler(List<Pelicula> peliculas){
        Alquiler alquiler= new Alquiler();
        alquiler.setPeliculaAlquilada(buscarPeliAIngresar(peliculas));
        System.out.println("Ingrese la fecha de inicio del alquiler");
        Date fechaInicio= ingresarFecha();
        System.out.println("Ingrese la fecha de finalización del alquiler");
        Date fechaFin= ingresarFecha();
        while(fechaFin.before(fechaInicio)){
            System.out.println("La fecha de finalización debe estar despues de "+ fechaInicio);
            System.out.println("Intente de nuevo");
            System.out.println("Fecha fin:");
            fechaFin= ingresarFecha();
        }
        alquiler.setFechaInicio(fechaInicio);
        alquiler.setFechaFin(fechaFin);
        System.out.println("Ingrese el precio por dia");
        double precioDia= input.nextDouble();
        input.nextLine();
        long diferenciaEnMilisegundos = fechaFin.getTime() - fechaInicio.getTime();
        long diferenciaEnDias = diferenciaEnMilisegundos / (1000 * 60 * 60 * 24);
        alquiler.setPrecio(precioDia*diferenciaEnDias);
        
        return alquiler;
    }
    
    private Pelicula buscarPeliAIngresar(List<Pelicula> peliculas){
        Pelicula peliculaEncontrada=null;
        boolean encontrado= false;
        
        while(!encontrado){
            System.out.println("Ingrese el título de la película que desea buscar");
            String titulo= input.nextLine();
            
            for (Pelicula pelicula : peliculas) {
                if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                    peliculaEncontrada= pelicula;
                    encontrado= true;
                    break;
                }
            }
            
            if(!encontrado){
                System.out.println("La película no se encuentra en la lista. Intente de nuevo.");
            }
        }
        
        return peliculaEncontrada;
    }
    
    public void listarAlquileresDisponibles(List<Alquiler> alquileres) {
        if (!alquileres.isEmpty()) {
            alquileres.forEach((alquiler) -> {
                System.out.println(alquiler.toString());
            });
        } else {
            System.out.println("No hay alquileres disponibles");
        }
    }
    
    public void buscarAlquilerPorFecha(List<Alquiler> alquileres){
        if (!alquileres.isEmpty()) {
            System.out.println("Ingrese la fecha a buscar");
            Date fecha= ingresarFecha();
        
            alquileres.stream().filter((alquiler) -> (fecha.equals(alquiler.getFechaInicio()) || fecha.equals(alquiler.getFechaFin()) ||
                    (fecha.after(alquiler.getFechaInicio()) && fecha.before(alquiler.getFechaFin())))).forEachOrdered((alquiler) -> {
                        System.out.println(alquiler.toString());
            });
        } else {
            System.out.println("No hay alquileres disponibles");
        }
    }

    private Date ingresarFecha(){
        // Solicita fecha de nacimiento y validarla
        boolean fechaValida = false;
        Date fecha = null;

        while (!fechaValida) {
            String fechaStr = input.nextLine();
            /*Se usa la conversion del formato DD/MM/AAAA a un objeto 
            tipo Date y se valida si el formato y las fechas son válidas*/
            fecha = convertirFecha(fechaStr);

            // Valida la fecha
            if (fecha != null) {
                fechaValida = true;
            } else {
                System.out.println("Fecha inválida. Vuelva a ingresarla.");
            }
        }
        return fecha;
    }
    
    private Date convertirFecha(String fechaString) {
        String[] partes = fechaString.split("/"); //Divide la cadena usando "/" como separador
            
        try {
            int day = Integer.parseInt(partes[0]);
            int month = Integer.parseInt(partes[1]) - 1;
            int year = Integer.parseInt(partes[2]) - 1900;
            
            if(year+1900<1990||month<0||month>11||day<0||day>diasDelMes(month,year)){
                return null;//Devuelve null si el año, el mes y el día no son válidos
            }else{
                Date fecha = new Date(year, month, day);
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

