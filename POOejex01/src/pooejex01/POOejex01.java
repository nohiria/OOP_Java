/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package pooejex01;

import Entidad.Cancion;

/**
 *
 * @author nohyv
 */
public class POOejex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion= new Cancion("Imagine", "John Lennon");
    }
    
}
