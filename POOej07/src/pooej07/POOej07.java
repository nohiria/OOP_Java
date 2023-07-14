/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package pooej07;

import Servicio.ServicioPersona;

/**
 *
 * @author nohyv
 */
public class POOej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear servicio array de personas
        ServicioPersona[] grupoPersonas= new ServicioPersona[4];
        
        double personasBajoPeso=0;
        double personasPesoIdeal=0;
        double personasSobrepeso=0;
        double personasMayorEdad=0;
        double personasMenorEdad=0;
        
        //Bucle para instanciar a las personas en el array y calcular su IMC y edad
        for(int i=0; i<grupoPersonas.length; i++){
            System.out.println("Persona "+(i+1));
            //Se instancia la persona mediante el servicio
            ServicioPersona persona= new ServicioPersona();
            //Y se crea
            persona.crearPersona();
            
            System.out.println("Persona IMC "+ persona.calcularIMC());
            //¿Tiene peso ideal?
            switch (persona.calcularIMC()) {
                case -1:
                    System.out.println("Tiene bajo peso");
                    personasBajoPeso++; //Se clasifican las personas según su índice
                    break;
                case 0:
                    System.out.println("Tiene peso Ideal");
                    personasPesoIdeal++;
                    break;
                case 1:
                    System.out.println("Tiene sobrepeso");
                    personasSobrepeso++;
                    break;
            }
            
            //¿Es mayor de edad?
            if(persona.esMayor()){
                System.out.println("Es mayor de edad");
                personasMayorEdad++;
            }else{
                System.out.println("Es menor de edad");
                personasMenorEdad++;
            }
            System.out.println("");
        }
        
        //IMC porcentajes
        System.out.println("Porcentaje personas con bajo peso: "+personasBajoPeso/grupoPersonas.length*100+"%");
        System.out.println("Porcentaje personas con peso ideal: "+personasPesoIdeal/grupoPersonas.length*100+"%");
        System.out.println("Porcentaje personas con sobrepeso: "+personasSobrepeso/grupoPersonas.length*100+"%");
        
        //Edad porcentajes
        System.out.println("Porcentaje personas menores de edad: "+personasMenorEdad/grupoPersonas.length);
        System.out.println("Porcentaje personas mayores de edad: "+personasMayorEdad/grupoPersonas.length);
        
    }
    
}
