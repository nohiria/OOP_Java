/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejgrupal02;

import Entidad.Alquiler;
import Entidad.Pelicula;
import Servicio.ServicioAlquiler;
import Servicio.ServicioPelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class POOejgrupal02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        ServicioPelicula sp= new ServicioPelicula();
        ServicioAlquiler sa= new ServicioAlquiler();
        ArrayList<Pelicula> pelisDisponibles= new ArrayList<>();
        ArrayList<Alquiler> pelisAlquiladas= new ArrayList<>();
        
        int opcion=0;
        do{
            mostrarMenu();
            System.out.println("Seleccione una opción");
            opcion=input.nextInt();
        
            switch(opcion){
                case 1: 
                    pelisDisponibles.add(sp.crearPelicula());
                    break;
                case 2: 
                    pelisAlquiladas.add(sa.crearAlquiler(pelisDisponibles));
                    break;
                case 3:
                    sp.listarPeliculasDisponibles(pelisDisponibles);
                    break;
                case 4: 
                    sa.listarAlquileresDisponibles(pelisAlquiladas);
                    break;
                case 5:
                    sp.buscarPelisPorTitulo(pelisDisponibles);
                    break;
                case 6:
                    sp.buscarPelisGenero(pelisDisponibles);
                    break;
                case 7:
                    sa.buscarAlquilerPorFecha(pelisAlquiladas);
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            } 
        }while(opcion!=9);
        
    }
    
    public static void mostrarMenu(){
        System.out.println("\n\t\tMENÚ");
        System.out.println("1. Crear Película");
        System.out.println("2. Crear Alquiler");
        System.out.println("3. Listar todas las películas disponibles");
        System.out.println("4. Listar todas las películas alquiladas");
        System.out.println("5. Buscar una película por título");
        System.out.println("6. Buscar una película por género");
        System.out.println("7. Buscar un alquiler por fecha");
        System.out.println("8. Finalizar");
    }
}

