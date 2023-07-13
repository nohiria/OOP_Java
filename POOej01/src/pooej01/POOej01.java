/*
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
 * Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
 * constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
 * luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
 * numero de páginas.
 */
package pooej01;

import Entidad.Libro;
import Servicio.ServicioLibro;

/**
 *
 * @author nohyv
 */
public class POOej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Iniciar servicio
        ServicioLibro sl1= new ServicioLibro();
        sl1.crearLibro();
        sl1.mostrarLibro();
               
    }
    
}
