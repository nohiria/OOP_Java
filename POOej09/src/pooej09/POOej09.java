/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package pooej09;

import Servicio.MatematicaServicio;

/**
 *
 * @author nohyv
 */
public class POOej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicaServicio operaciones= new MatematicaServicio();
        operaciones.asignarAleatorios();
        
        System.out.println("El mayor de los números es: "+operaciones.devolverMayor());
        System.out.println("La potencia del num mayor y el menor es "+operaciones.calcularPotencia());
        System.out.println("La raiz del num menor es "+operaciones.calculaRaiz());
    }
    
}
