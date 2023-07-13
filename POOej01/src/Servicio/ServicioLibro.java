/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ServicioLibro {
    
    private final Libro libro= new Libro();
    
    public void cargarLibro(){
        Scanner input= new Scanner(System.in);
        
        //Se piden los datos al usuario para cargarlos al objeto
        System.out.println("Ingrese ISBN");
        libro.setISBN(input.nextInt());
        input.nextLine();
        System.out.println("Ingrese Titulo");
        libro.setTitulo(input.nextLine());
        System.out.println("Ingrese Autor");
        libro.setAutor(input.nextLine());
        System.out.println("Ingrese número de páginas");
        libro.setNPaginas(input.nextInt());
    }
    
    public void mostrarLibro(){
        //Comprobar si los atributos del obejto están vacíos
        if(libro.getISBN()==0 && libro.getTitulo()==null && libro.getAutor()==null && libro.getNPaginas()==0){
            System.out.println("El objeto está vacío");
        }else{
            System.out.println(libro.toString());
        }
    }
    
}
