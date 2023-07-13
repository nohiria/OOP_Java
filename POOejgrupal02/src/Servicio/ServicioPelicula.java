/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ServicioPelicula {
    Scanner input= new Scanner(System.in);
    
    public Pelicula crearPelicula(){
        Pelicula pelicula= new Pelicula();
        
        System.out.println("Ingrese el título");
        pelicula.setTitulo(input.nextLine());
        System.out.println("Ingrese el género");
        pelicula.setGenero(input.nextLine());
        System.out.println("Ingrese el año");
        int anio= input.nextInt();
        pelicula.setAnio(new Date(anio-1900,1,1));
        System.out.println("Ingrese la duración");
        pelicula.setDuracion(input.nextInt());
        input.nextLine();
        
        return pelicula;
    }
    
    public void mostrarPelicula(Pelicula pelicula) {
        System.out.println(pelicula.toString());
    }
    
    public void listarPeliculasDisponibles(List<Pelicula> peliculas) {
        if (!peliculas.isEmpty()) {
            peliculas.forEach((pelicula) -> {
                System.out.println(pelicula.toString());
            });
        } else {
            System.out.println("No hay películas disponibles");
        }
    }

    public boolean buscarPelisPorTitulo(List<Pelicula> peliculas){
        boolean encontrado= false;
        
        System.out.println("Ingrese el título de la película que desea buscar");
        String titulo= input.nextLine();
        
        if (!peliculas.isEmpty()) {
            for (Pelicula pelicula : peliculas) {
                if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                    mostrarPelicula(pelicula);
                    encontrado = true;
                }
            }
        } else {
            System.out.println("No hay películas disponibles");
        }
        return encontrado;
    }
    
    public boolean buscarPelisGenero(List<Pelicula> peliculas){
        boolean encontrado= false;
        
        System.out.println("Ingrese el género de películas que desea buscar");
        String genero= input.nextLine();
        
        if (!peliculas.isEmpty()) {
            for (Pelicula pelicula : peliculas) {
                if (pelicula.getTitulo().equalsIgnoreCase(genero)) {
                    mostrarPelicula(pelicula);
                    encontrado = true;
                }
            }
        } else {
            System.out.println("No hay películas disponibles con ese género");
        }
        return encontrado;
    }
}
