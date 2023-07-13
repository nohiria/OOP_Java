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
    
    private Libro libro= new Libro();
    
    public Libro crearLibro(){
        Scanner input= new Scanner(System.in);
        //Instancia del objeto
        libro= new Libro();
        
        System.out.println("Ingrese ISBN");
        libro.setISBN(input.nextInt());
        input.nextLine();
        System.out.println("Ingrese Titulo");
        libro.setTitulo(input.nextLine());
        System.out.println("Ingrese Autor");
        libro.setAutor(input.nextLine());
        System.out.println("Ingrese número de páginas");
        libro.setNpaginas(input.nextInt());
        
        return libro;
    }
    
    public void mostrarLibro(){
        if(libro==null){//Comprobar si el objeto ha sido instanciado
            System.out.println("No se ha instanciado ningún libro");
            
        }else if(libro.getISBN()==0 && libro.getTitulo()==null && libro.getAutor()==null && libro.getNpaginas()==0){//Comprobar si sus atributos están vacíos
            System.out.println("El libro ha sido instanciado pero los atributos están vacíos");
            
        }else{
            System.out.println("ISBN: "+libro.getISBN());
            System.out.println("Título: "+libro.getTitulo());
            System.out.println("Autor: "+libro.getAutor());
            System.out.println("Páginas: "+libro.getNpaginas());
        }
        
    }
    
}
